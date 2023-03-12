create table page
(
    id      INT NOT NULL,
    title   VARCHAR(512),
    primary key (id)
);

create table link
(
    id      INT NOT NULL,
    title   VARCHAR(512),
    url     VARCHAR(1024),
    page_id INT NOT NULL,
    primary key (id)
);

alter table link add constraint pl_page_link foreign key (page_id) references page;

create sequence link_seq
    start 1
    increment 1
    NO MAXVALUE
    CACHE 1;
