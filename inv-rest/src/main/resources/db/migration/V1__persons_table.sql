CREATE schema IF NOT EXISTS public;

CREATE TABLE IF NOT EXISTS public.persons_table (
    id BIGSERIAL not null,
    firstname varchar(255) not null,
    lastname varchar(255) not null,
    age integer not null,
    unique(id)
);




