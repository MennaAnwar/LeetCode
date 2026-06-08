# Write your MySQL query statement below
SELECT score,
DENSE_RANK() over ( Order by score DESC ) as `rank`
from Scores;