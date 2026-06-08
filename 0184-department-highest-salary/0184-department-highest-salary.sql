# Write your MySQL query statement below
select dept.name as Department, emp.name as Employee, Emp.salary as Salary
from Department dept, Employee emp
where emp.departmentId = dept.id 
AND (emp.departmentId , salary) IN (
    SELECT departmentId, MAX(salary) FROM Employee GROUP BY departmentId
);