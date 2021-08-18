create table users (
    id serial primary key,
    type varchar(1) not null,
    name varchar(100) not null,
    email varchar(100) not null,
    phone varchar(18) not null,
    salon_id integer references salons (id)
);