SET SERVEROUTPUT ON;

DECLARE
    marks NUMBER := 75;
BEGIN

    IF marks >= 50 THEN
        DBMS_OUTPUT.PUT_LINE('Result: PASS');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Result: FAIL');
    END IF;

    DBMS_OUTPUT.PUT_LINE('Numbers from 1 to 5');

    FOR i IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE(i);
    END LOOP;

END;
/
