--  Write your MySQL query statement below
select visited_on,amount,average_amount
 from(
   select visited_on,
     sum(daily_amount)over(order by visited_on rows between 6 preceding  and  current row) as amount,

    round(avg(daily_amount)over( order by visited_on ROWS between 6 preceding and current row ),2) AS average_amount ,
    ROW_NUMBER() OVER (ORDER BY visited_on) as rn
     from
    (
        select visited_on, sum(amount)as daily_amount from Customer
        group by visited_on  
    )d 
 ) t 
 where rn >= 7   
order by visited_on asc;