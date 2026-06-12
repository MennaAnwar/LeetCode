(
    select u.name as results from Users u 
    JOIN MovieRating MR on u.user_id = MR.user_id
    group by u.name
    order by count(*) DESC, u.name ASC
    limit 1

)
UNION ALL
(
    select m.title as results from Movies m 
    JOIN MovieRating MR on m.movie_id = MR.movie_id
    WHERE mr.created_at BETWEEN '2020-02-01' AND '2020-02-29'
    group by m.title
    order by AVG(MR.rating) DESC, m.title ASC
    limit 1
)