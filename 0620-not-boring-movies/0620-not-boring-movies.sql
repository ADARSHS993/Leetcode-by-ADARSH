# Write your MySQL query statement below
select * From Cinema where id % 2 = 1 AND description != 'boring' order by rating desc;