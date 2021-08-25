create table intervals (
    id serial primary key ,
    start_time timestamp without time zone not null ,
    end_time timestamp without time zone not null ,
    groomer_id integer references users(id) on DELETE cascade,
    procedure_id integer references procedures(id)
)