-- DDL (Data Definition Language) CREATE, DROP, ALTER
-- DML (Data Manipulation Language) INSERT, DELETE, UPDATE, TRUNCATE

alter table galaxy_type 
rename column "name"
to "type_name";

alter table galaxies 
add column "age" integer;

update galaxies 
set age = 100000000
where galaxy_id = 1;

update galaxies 
set age = 100000000
where galaxy_id = 2;

alter table galaxies
alter column age set not null;

alter table users 
add column balance integer default 0;

update users set balance = 1000000 where user_id = 1;

delete from galaxy_type where type_id = 1;