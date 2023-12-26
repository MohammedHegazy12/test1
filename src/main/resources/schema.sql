CREATE  SCHEMA javatest;
use  javatest;
CREATE TABLE users(
id int NOT NULL auto_increment,
firstName varchar(90),
lastName varchar(90),
email varchar(90),
PRIMARY KEY (id)
);
INSERT INTO users values(null,"mohammed","hegazy","mohamme@gmail");
INSERT INTO users values(null,"samy","ali","samyali@gmail");
INSERT INTO users values(null,"rawda","emam","rawda@gmail");
INSERT INTO users values(null,"ahmed","samy","Ahmed@gmail");