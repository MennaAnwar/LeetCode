# Write your MySQL query statement below
select(
    Select distinct salary
from Employee 
Order by salary DESC limit 1 OFFSET 1
) as SecondHighestSalary;