# Write your MySQL query statement below
select  Department,Employee , Salary
 from (
    select d.name as Department,e.name as Employee , salary as Salary , DENSE_RANK() OVER (PARTITION BY departmentId ORDER BY Salary DESC) as rnk
    from Employee e

 join Department d
 on e.departmentId = d.id
 ) t
 where rnk <=3 ;