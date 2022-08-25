create user basic;

create user basic2
	with password 'pass'
	valid until 'Jan 1 2023';
	
grant select on user to basic2;

grant update, delete, insert on user to basic2;