# Write your MySQL query statement below
select activity_date as day, count(DISTINCT(user_id)) as active_users
from Activity
WHERE DATEDIFF('2019-07-27', activity_date) between 0 and 29
    And activity_type IN ('open_session', 'end_session', 'scroll_down', 'send_message')
group by activity_date;