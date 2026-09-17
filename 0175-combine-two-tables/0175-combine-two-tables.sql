# Write your MySQL query statement below
select p.firstname , p.lastname , address.city, address.state
from person p
left join address
on address.personid=p.personid;