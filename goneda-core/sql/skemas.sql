CREATE SCHEMA `goneda_db` DEFAULT CHARACTER SET utf8 ;

create table restaurant (
                            id bigint not null auto_increment,
                            address varchar(255),
                            create_at datetime(6) not null,
                            grade varchar(255),
                            key_by_site bigint not null,
                            name varchar(255),
                            phone_number varchar(255),
                            site varchar(255) not null,
                            update_at datetime(6) not null,
                            primary key (id)
) engine=InnoDB
create table restaurant_menu (
                                 id bigint not null auto_increment,
                                 create_at datetime(6) not null,
                                 menu varchar(255) not null,
                                 price varchar(255) not null,
                                 update_at datetime(6) not null,
                                 restaurant_id bigint,
                                 primary key (id)
) engine=InnoDB

create table restaurant_review (
                                   id bigint not null auto_increment,
                                   create_at datetime(6) not null,
                                   grade varchar(255),
                                   is_user_actual_eat bit not null,
                                   review_content longtext not null,
                                   review_date varchar(255) not null,
                                   update_at datetime(6) not null,
                                   restaurant_id bigint,
                                   primary key (id)
) engine=InnoDB

alter table restaurant_menu
    add constraint FKcf3h9qggpuiewy6h21s2j4e1h
        foreign key (restaurant_id)
            references restaurant (id)

alter table restaurant_review
    add constraint FKo352m9nwf7xos1h8ru5o71msp
        foreign key (restaurant_id)
            references restaurant (id)