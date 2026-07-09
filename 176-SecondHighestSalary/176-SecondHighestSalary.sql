-- Last updated: 7/9/2026, 10:24:41 AM
# Write your MySQL query statement below
SELECT 
    IFNULL(
        (SELECT DISTINCT salary 
         FROM Employee 
         ORDER BY salary DESC 
         LIMIT 1 OFFSET 1),
    NULL) AS SecondHighestSalary;
