-- run under schema 1
create table Product (id integer not null, name varchar(255), price float(53) not null, primary key (id));

INSERT INTO PRODUCT VALUES(1, 'CPU', 124);
INSERT INTO PRODUCT VALUES(2, 'CPU1', 1241);

-- run under schema 2
create table user (id integer not null, name varchar(255), primary key (id));

INSERT INTO user VALUES(1, 'name');
INSERT INTO user VALUES(2, 'name1');