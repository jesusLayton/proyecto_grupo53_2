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
INSERT INTO usuarios VALUES(66666666,'pablo.londono@tienda_londono.com','Pablo Londoño','123456','plondono2');
INSERT INTO usuarios VALUES(11111111,'jesus.layton@tienda_londono.com','Jesus Layton','123456','jlayton');
INSERT INTO usuarios VALUES(22222222,'jennyfer.lopez@tienda_londono.com','Jennyfer Lopez','123456','jlopez');
INSERT INTO usuarios VALUES(33333333,'paula.londono@tienda_londono.com','Paula Londoño','123456','plondono');
INSERT INTO usuarios VALUES(44444444,'eduardo.londono@tienda_londono.com','Eduardo Londoño','123456','elondono');

CREATE UNIQUE INDEX unique_user ON usuarios(cedula_usuario);

DELETE FROM usuarios WHERE cedula_usuario = 55555555

CREATE TABLE clientes (
cedula_cliente BIGINT(20) PRIMARY KEY,
direccion_cliente VARCHAR (255) NOT NULL,
email_cliente VARCHAR (255) NOT NULL,
nombre_cliente VARCHAR(255) NOT NULL,
telefono_cliente VARCHAR(255) NOT NULL
);

INSERT INTO clientes VALUES(100,'Av 1 # 2 -34','cliente1@cliente.com','Cliente 1','2345678');
INSERT INTO clientes VALUES(101,'Av 2 # 3 -45','cliente2@cliente.com','Cliente 2','6457894');
INSERT INTO clientes VALUES(102,'Av 9 # 8 -78','cliente3@cliente.com','Cliente 3','6585678');
INSERT INTO clientes VALUES(103,'Av 6 # 8 -25','cliente4@cliente.com','Cliente 4','2458678');
INSERT INTO clientes VALUES(104,'Cra 10 # 20 -340','cliente5@cliente.com','Cliente 5','6447515');


CREATE UNIQUE INDEX unique_user ON clientes(cedula_cliente);

CREATE TABLE ventas (
codigo_venta BIGINT(20) PRIMARY KEY,
cedula_cliente BIGINT(20) NOT NULL,
cedula_usuario BIGINT(20) NOT NULL,
ivaventa DOUBLE NOT NULL,
total_venta DOUBLE NOT NULL,
valor_venta DOUBLE NOT NULL
);

CREATE UNIQUE INDEX unique_user ON ventas(codigo_venta);

CREATE TABLE detalle_ventas (
codigo_detalle_venta BIGINT(20) PRIMARY KEY,
cantidad_producto INT(11) NOT NULL,
codigo_producto BIGINT(20) NOT NULL,
codigo_venta BIGINT NOT NULL,
valor_total DOUBLE NOT NULL,
valor_venta DOUBLE NOT NULL,
valor_iva DOUBLE NOT NULL
);

CREATE UNIQUE INDEX unique_user ON detalle_ventas(codigo_detalle_venta);

CREATE TABLE proveedores (
nitproveedor BIGINT(20) PRIMARY KEY,
ciudad_proveedor VARCHAR(255) NOT NULL,
direccion_proveedor VARCHAR(255) NOT NULL,
nombre_proveedor VARCHAR(255) NOT NULL,
telefono_proveedor VARCHAR(255) NOT NULL
);

CREATE UNIQUE INDEX unique_user ON proveedor(nitproveedor);

CREATE TABLE productos (
codigo_producto BIGINT(20) PRIMARY KEY,
iva_compra DOUBLE NOT NULL,
nitproveedor BIGINT(20) NOT NULL,
nombre_producto VARCHAR(255) NOT NULL,
precio_compra DOUBLE NOT NULL,
precio_venta DOUBLE NOT NULL
);

CREATE UNIQUE INDEX unique_user ON proveedor(nitproveedor);

SELECT * FROM usuarios;
SELECT * FROM clientes;
SELECT * FROM ventas;
SELECT * FROM detalle_ventas;
SELECT * FROM proveedores;
SELECT * FROM productos;

