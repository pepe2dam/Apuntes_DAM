Ejercicio: Con la siguiente vista:

CREATE OR REPLACE VIEW emplead AS
SELECT emp_no,apellido,oficio,dnombre,loc FROM emple,depart
WHERE emple.dept_no = depart.dept_no;


Crear un disparador para poder insertar, actualizar y borrar datos:

Bloque PLSQL:


	CREATE OR REPLACE TRIGGER t_ges_emplead INSTEAD OF
  	DELETE OR
  	INSERT OR
  	UPDATE ON emplead FOR EACH row DECLARE v_dept_no depart.dept_no%type;
  		BEGIN
    	IF deleting THEN
      		DELETE FROM emple WHERE emp_no = :old.emp_no;
    		elsif inserting THEN
      		SELECT dept_no
      		INTO v_dept_no
      		FROM depart
      		WHERE depart.dnombre = :new.dnombre
      		AND depart.loc       = :new.loc;
      		INSERT
     	 	INTO emple
        	(
          		emp_no,
          		apellido,
          		oficio,
          		dept_no
        	)
        	VALUES
        	(
          		:new.emp_no,
          		:new.apellido,
          		:new.oficio,
          		v_dept_no
        	);
    		elsif updating ('oficio') THEN
      			UPDATE emple SET oficio= :new.oficio WHERE emp_no = :old.emp_no;
    		elsif updating ('dnombre') THEN
      			SELECT dept_no INTO v_dept_no FROM depart WHERE dnombre = :new.dnombre;
      			UPDATE emple SET dept_no = v_dept_no WHERE emp_no = :old.emp_no;
    		ELSE
				/*Excepción que no funciona, RAISE_APPLICATION_ERROR(-20500,'Error en la actualización');*/
      			dbms_output.put_line('Error en la aplicación');
    		END IF;
  	END;

