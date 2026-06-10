# Write your MySQL query statement below
select request_at as Day,
    round(
        (sum(case when status = "cancelled_by_driver" or status = "cancelled_by_client" then 1 else 0 end) / count(status)), 2
    ) as "Cancellation Rate"
    from trips
    Join Users c on trips.client_id = c.users_id and c.banned = 'No'
    Join Users d on trips.driver_id = d.users_id and d.banned = 'No'
    where request_at Between '2013-10-01' AND '2013-10-03'
    group by request_at;
