select  * from EMPLOYEES;

select * from EMPLOYEES
where JOB_ID in ('IT_PROG','MK_MAN');

select * from EMPLOYEES
where Department_id is null;


select * from EMPLOYEES
order by salary desc ;

-- order by 3rd column desc order
-- in this case is last name will start from z to a
select * from EMPLOYEES
order by 3 desc ;


--IQ -->  display all information from employees and order them based firstname asc and based on lastname desc
select * from  EMPLOYEES
order by FIRST_NAME,LAST_NAME DESC;
-- in this case first order by first name by asc then
--is has some same names will order last name desc

-- Task 1:display any job title information endswith Manager from jobs table
select * from jobs
where JOB_TITLE like '%Manager';


-- How many locations we have ?
select count(*) from locations;


