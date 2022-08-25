-- Lets say that we wanted to find all the information
-- concerning the planets table
-- We could use just the table and select all the data there


select * from planets p;

-- inner join
-- Joins two tables, returning records if there are no null
-- values in the column used in the join predicate

select * from planets p inner join galaxies g on p.galaxy_id = g.galaxy_id ;

select p.name, g.name from planets p inner join galaxies g on p.galaxy_id = g.galaxy_id ;


-- Outer Join
-- Can be written as "Full Outer Join" or "full join" in PSQL
-- Joins two tables, it is less restrictive than an inner join
-- An outer join will guarantee that every record from both tables is represented
-- Even if this means that nulls must be substituted for values that do not exist

select * from planets p full outer join galaxies g on p.galaxy_id = g.galaxy_id ;

select * from moons full outer join planets on moons.moon_id = planets.planet_id ;


-- Left join
-- Joins two tables, guarantees that every record from the left table is present
-- Even if nulls must be subsituted for non existent values on the the right 

select * from moons m left join planets p on m.moon_id = p.planet_id ;

-- Right join
-- same as left but for right table

select * from moons m right join planets p on m.moon_id = p.planet_id ;


-- Cross join
-- Joins two tables, returning the cartesian product of the reocrds on the tables
-- This means that every possible combination of records on Table A and B will
-- be returned

select * from moons cross join planets;

-- Self Join
-- Joining the same table to itself, in this case, aliases are required.
-- Note that all prevoius joins were equi joins, we used the = sign in those joins
-- this join will be a theta join
-- in sql, in order to do not equal, use double diamons <> it is not !=

select p1.name, p2.name, p1.value
from planets p1 inner join planets p2 on p1.moon_number <> p2.moon_number ;


select p1.name, p1.value, p2.name, p2.value
from planets p1 inner join planets p2 on p1.weight > p2.weight;


-- Multiple joins

select * from planet_species_bridge psb ;


select p."name" , p.value , s."name" , s.civ_type , g."name" , gt.type_name  from planet_species_bridge psb 
inner join planets p on psb.planet_id = p.planet_id 
inner join species s on psb.species_id = s.species_id 
inner join galaxies g on p.galaxy_id = g.galaxy_id 
inner join galaxy_type gt on g.type_id = gt.type_id ;

-- View

create view planet_total_info as
select p."name" as "planet_name" , p.value , s."name" as "species_name", s.civ_type , g."name" as "galaxy_name", gt.type_name  from planet_species_bridge psb 
inner join planets p on psb.planet_id = p.planet_id 
inner join species s on psb.species_id = s.species_id 
inner join galaxies g on p.galaxy_id = g.galaxy_id 
inner join galaxy_type gt on g.type_id = gt.type_id ;

select * from planet_total_info ;
drop view planet_total_info ;

-- Index
-- Indexes are used to improve performance when looking up records on a table 
-- They allow us to locate records faster
-- Primary keys are automatically indexed, with that siad, you can create your own
-- indexes on columns

create unique index custom_index on planets(value);


-- Set Operations
-- Used to combine the results of queries
-- Many dialects of SQL support sets, and as a general note, the number of columns 
-- and data types must match up in the different result sets when using set operations

/*
 * Union : Combines the results of queries, omitting duplicates
 * Union All : Combines the results of queries, keeping duplicates
 * Intersect : any records that are present in both result sets are returned
 * Except (called "minus" in some dialects) : returns any records that are present
 * in the first result set but not the second
 */

-- union 
select planets."name" from planets union
select moons."name" from moons;

-- Union All
select * from species s union all
select * from moons m ;

-- Intersect
select * from species s intersect
select * from moons m ;

-- Except
select * from species s except
select * from moons m ;


-- Properties of a Transaction: Our properties of a transaction describe what must be true about
-- a SQL transaction. SQL transactions are:
/*
 * Atomicity: "All or nothing"; all of the data will either be persisted or it won't
 * Consistency: All concurrent transactions must abide by the same DB constraints
 * Isolation: Assuming transactions are concurrent, the results of one transaction should not affect another transaction
 * Durability: All data that is committed is persisted
 */

/*
 * Honing in on Isolation: There are 4 isolation levels in SQL:
 * 
 * Read Uncomitted: BAD PRACTICE; allows for uncommitted data to be read during concurrent
 * 	transactions. Allows for "dirty reads".
 * 
 * Read Committed: prevents concurrent transactions from accessing data that is not yet
 * commited. Prevents "dirty reads" - reading uncommitted data.
 * 
 * Repeatable Reads: prevents concurrent transactions from modifying records that are being
 * used (e.g. selected, etc.). Prevents dirty reads and "non-repeatable reads".
 * 
 * Serializable: prevents concurrent transactions from modifying the number of records on a table
 * while its records are being accessed. Prevents "phantom reads" (and all of the other reads).
 */

-- Example of changing your isolation level; please never go below read committed. Note that
-- higher you go, the slower your transactions will be as higher levels place more read and
-- write locks on tables and records.

begin;
set transaction isolation level read committed;
commit;
