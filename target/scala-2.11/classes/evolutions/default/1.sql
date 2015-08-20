# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table random (
  sequence                  varchar(255),
  lane                      varchar(255),
  seed                      varchar(255),
  name                      varchar(255),
  constraint uq_random_1 unique (seed,sequence,lane))
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists random;

SET REFERENTIAL_INTEGRITY TRUE;

