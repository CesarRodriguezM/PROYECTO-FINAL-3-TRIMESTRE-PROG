DROP TABLE categoria CASCADE CONSTRAINT; 
DROP TABLE producto CASCADE CONSTRAINT; 
DROP TABLE tener CASCADE CONSTRAINT; 
DROP TABLE pedido CASCADE CONSTRAINT; 
DROP TABLE pedir CASCADE CONSTRAINT; 
DROP TABLE clientes CASCADE CONSTRAINT; 
DROP TABLE tomarse CASCADE CONSTRAINT;

CREATE TABLE categoria(id_categoria NUMBER(15) CONSTRAINT categoria_pk PRIMARY KEY,
    nom_categoria VARCHAR2(25),
    descripcion VARCHAR2(25));
 

CREATE TABLE producto (id_producto NUMBER(15) CONSTRAINT producto_pk PRIMARY KEY,
    nombre_producto VARCHAR2(25),
    stock NUMBER (25),
    id_categoria NUMBER (25),
    precio NUMBER(25),
    FOREIGN KEY(id_categoria) REFERENCES categoria);

CREATE TABLE pedido (id_pedido NUMBER(15) CONSTRAINT pedido_pk PRIMARY KEY,
    cantidad_pedido VARCHAR2(25));

CREATE TABLE clientes (id_cliente NUMBER(15) CONSTRAINT clientes_pk PRIMARY KEY,
    pedido_cliente VARCHAR2(25));

CREATE TABLE tener (nombre_producto VARCHAR2(25),
    cantidad_pedido VARCHAR2(25),
    id_producto NUMBER (15),
    id_pedido NUMBER(15),
    FOREIGN KEY(id_pedido) REFERENCES pedido,
    FOREIGN KEY(id_producto) REFERENCES producto);

CREATE TABLE pedir (cantidad_pedido VARCHAR2(25),
    pedido_cliente VARCHAR2(25),
    id_cliente NUMBER(15),
    id_pedido NUMBER(15),
    FOREIGN KEY(id_cliente) REFERENCES clientes,
    FOREIGN KEY(id_pedido) REFERENCES pedido);

CREATE TABLE tomarse (id_cliente NUMBER(15),
    id_producto NUMBER (15),
    nombre_producto VARCHAR2(25),
    stock NUMBER (25),
    pedido_cliente VARCHAR2(25),
    FOREIGN KEY(id_cliente) REFERENCES clientes,
    FOREIGN KEY(id_producto) REFERENCES producto);
    
    


