CREATE DATABASE tienda_londono;

USE tienda_londono;

CREATE TABLE usuarios (
cedula_usuario BIGINT(20) PRIMARY KEY,
email_usuario VARCHAR (255) NOT NULL,
nombre_usuario VARCHAR (255) NOT NULL,
password VARCHAR(255) NOT NULL,
usuario VARCHAR(255) NOT NULL
);

INSERT INTO usuarios VALUES(00000000,'admin@tienda_londono.com','Administrador','admin','administrador');
INSERT INTO usuarios VALUES(55555555,'pablo.londono@tienda_londono.com','Pablo Londoño','123456','plondono');
INSERT INTO usuarios VALUES(11111111,'jesus.layton@tienda_londono.com','Jesus Layton','123456','jlayton');
INSERT INTO usuarios VALUES(22222222,'jennyfer.lopez@tienda_londono.com','Jennyfer Lopez','123456','jlopez');
INSERT INTO usuarios VALUES(33333333,'paula.londono@tienda_londono.com','Paula Londoño','123456','plondono');
INSERT INTO usuarios VALUES(44444444,'eduardo.londono@tienda_londono.com','Eduardo Londoño','123456','elondono');

CREATE UNIQUE INDEX unique_user ON users(user);

SELECT * FROM usuarios;