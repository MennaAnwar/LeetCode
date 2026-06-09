WITH RankedEmployees AS (
    SELECT 
        dept.name AS Department, 
        emp.name AS Employee, 
        emp.salary AS Salary,
        DENSE_RANK() OVER(PARTITION BY emp.departmentId ORDER BY emp.salary DESC) AS `rank`
    FROM Employee emp
    LEFT JOIN Department dept ON emp.departmentId = dept.id
)
SELECT Department, Employee, Salary
FROM RankedEmployees
WHERE `rank` <= 3;