-- Insert data

insert into galaxy_type(name)
values
('Spiral'),
('Elliptical'),
('Irregular');

insert into species(name, civ_type)
values
('Home Sapien', 1),
('Tau', 2);

insert into galaxies(name, type_id)
values
('Milky Way', 1),
('Andromeda', 1);

insert into planets(name, weight, value, moon_number, galaxy_id)
values
('Earth', 500000, 10, 1, 1),
('Mars', 12310, 5, 2, 1),
('Xalo', 5234, 1, 1, 2);

insert into moons(name, planet_id)
values
('Luna', 1),
('Phobos', 2),
('Deimos', 2),
('Cheesy', 3);


insert into planet_species_bridge(planet_id, species_id)
values
(1, 1),
(2, 1),
(3, 2);


