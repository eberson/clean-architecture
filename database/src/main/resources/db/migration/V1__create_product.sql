create table product(
    id bigint auto_increment not null primary key,
    uuid varchar(36) not null unique,
    name varchar(200) not null,
    unity enum('KILOGRAM', 'CANS'),
    quantity integer not null,
    created datetime not null,
    last_updated datetime not null,
    version integer not null
);

