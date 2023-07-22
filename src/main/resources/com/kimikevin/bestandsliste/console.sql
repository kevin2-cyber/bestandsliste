create table PRODUCT(
    id int primary key,
    name varchar2(50) not null,
    price number(10,2)
);

INSERT INTO PRODUCT VALUES (1,'Kelvin Eduful',2.20);

select * from PRODUCT;
