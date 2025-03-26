create table member
(
    member_id   varchar(255) not null
        primary key,
    password    varchar(255),
    name        varchar(255),
    birthday    varchar(255),
    role        varchar(255)
        constraint member_role_check
            check ((role)::text = ANY
        ((ARRAY ['ADMIN'::character varying, 'NOT_ALLOW'::character varying, 'ADULT'::character varying, 'NOT_ADULT'::character varying])::text[])),
    create_by   varchar(255),
    update_by   varchar(255),
    create_date timestamp(6),
    update_date timestamp(6)
);

alter table member
    owner to streamo;


create table menu_entity
(
    menu_id     bigint not null
        primary key,
    priority    integer,
    name        varchar(255),
    role        varchar(255),
    path        varchar(255),
    create_by   varchar(255),
    update_by   varchar(255),
    create_date timestamp(6),
    update_date timestamp(6)
);

alter table menu_entity
    owner to streamo;

create table notice
(
    notice_id   bigint not null
        primary key,
    title       varchar(255),
    content     varchar(255),
    view        bigint,
    delete_yn   char,
    create_by   varchar(255),
    update_by   varchar(255),
    create_date timestamp(6),
    update_date timestamp(6)
);

alter table notice
    owner to streamo;

create table required_board
(
    require_board_id bigint not null
        primary key,
    member_id        varchar(255)
        constraint fkn0fhd9g2hep64uvld2u5jtx0r
            references member,
    title            varchar(255),
    content          varchar(255),
    view             bigint,
    delete_yn        char,
    create_by        varchar(255),
    update_by        varchar(255),
    create_date      timestamp(6),
    update_date      timestamp(6)
);

alter table required_board
    owner to streamo;

create table video_category
(
    video_category_id        bigint not null
        primary key,
    parent_video_category_id bigint
        constraint fkcopkeastchnsm2iy5jkmrn6rc
            references video_category,
    name                     varchar(255),
    delete_yn                char,
    create_by                varchar(255),
    update_by                varchar(255),
    create_date              timestamp(6),
    update_date              timestamp(6)
);

alter table video_category
    owner to streamo;

create table video
(
    video_id                   bigint not null
        primary key,
    category_video_category_id bigint
        constraint fka4is1qroy0vx4g5sk068pdutl
            references video_category,
    name                       varchar(255),
    delete_yn                  char,
    age_rating                 varchar(255)
        constraint video_age_rating_check
            check ((age_rating)::text = ANY
        ((ARRAY ['ALL'::character varying, 'GT7'::character varying, 'GT12'::character varying, 'GT15'::character varying, 'GT19'::character varying])::text[])),
    view                       bigint,
    poster_path                varchar(255),
    file_path                  varchar(255),
    create_by                  varchar(255),
    update_by                  varchar(255),
    create_date                timestamp(6),
    update_date                timestamp(6)
);

alter table video
    owner to streamo;

