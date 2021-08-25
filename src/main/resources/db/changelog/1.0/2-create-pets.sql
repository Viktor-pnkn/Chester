create table pets (
    id serial primary key,
    name varchar(100) not null,
    breed varchar(100) not null,
    age integer not null,
    category integer not null,
    owner_id integer references users (id) on delete cascade not null
);