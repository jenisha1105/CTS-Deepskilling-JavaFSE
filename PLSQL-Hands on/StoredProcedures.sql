SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE EmployeeDetails(
    emp_name IN VARCHAR2,
    emp_salary IN NUMBER
)
AS
BEGIN

    DBMS_OUTPUT.PUT_LINE('Employee Name : ' || emp_name);
    DBMS_OUTPUT.PUT_LINE('Employee Salary : ' || emp_salary);

END;
/
