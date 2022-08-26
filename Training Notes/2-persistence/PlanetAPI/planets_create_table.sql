create table galaxy_type (
	type_id serial primary key,
	name varchar(50) unique not null
);


create table species (
	species_id serial primary key,
	name varchar(50) unique not null,
	civ_type integer not null
);

create table galaxies (
	galaxy_id serial primary key,
	name varchar(50) unique not null,
	type_id integer,
	constraint type_id
		foreign key(type_id)
			references galaxy_type(type_id)
);

create table planets (
	planet_id serial primary key,
	name varchar(50) not null,
	weight integer not null,
	value integer not null,
	moon_number integer not null,
	galaxy_id integer,
	constraint galaxy_id
		foreign key(galaxy_id)
			references galaxies(galaxy_id)
);


create table moons (
	moon_id serial primary key,
	name varchar(50) not null,
	planet_id integer,
	constraint planet_id
		foreign key(planet_id)
			references planets(planet_id)
);

create table planet_species_bridge (
	planet_id integer,
	species_id integer,
	constraint planet_id
		foreign key(planet_id)
			references planets(planet_id),
	constraint species_id
		foreign key(species_id)
			references species(species_id)
);

create table user_inventory (
	user_id integer,
	planet_id integer,
	constraint planet_id
		foreign key(planet_id)
			references planets(planet_id),
	constraint user_id
		foreign key(user_id)
			references users(user_id)
);

