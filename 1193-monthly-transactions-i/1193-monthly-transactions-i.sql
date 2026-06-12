# Write your MySQL query statement below
select DATE_FORMAT(trans_date, '%Y-%m') AS `month`,
country,
count(trans_date) AS trans_count,
SUM(state = 'approved') AS approved_count,
sum(amount) AS trans_total_amount,
sum(CASE WHEN state = 'approved' THEN amount ELSE 0 END) AS approved_total_amount
from Transactions
group by `month`, country;