drop database if exists ecommerce_db;
drop user if exists 'ecomm_user'@'localhost';

create database if not exists ecommerce_db;
create user 'ecomm_user'@'localhost' identified by 'Ecomm_123';
grant all privileges on ecommerce_db.* to 'ecomm_user'@'localhost';

flush privileges ;
