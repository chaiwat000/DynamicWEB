# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table tbBoats (
  id                        varchar(10) not null,
  name                      varchar(255),
  year                      varchar(255),
  country                   varchar(255),
  price                     double,
  constraint pk_tbBoats primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table tbBoats;

SET FOREIGN_KEY_CHECKS=1;

