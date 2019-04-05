CREATE TABLE catalogo
( 
  id int NOT NULL AUTO_INCREMENT,
  CONSTRAINT catalogo_pk PRIMARY KEY (id)
);

CREATE TABLE pedido
( 
  id int NOT NULL AUTO_INCREMENT,
  CONSTRAINT pedido_pk PRIMARY KEY (id)
);

CREATE TABLE articulo
( 
  id int NOT NULL AUTO_INCREMENT,
  catalogo_id int NOT null, 
  nombre VARCHAR(255) NOT NULL,
  CONSTRAINT articulo_pk PRIMARY KEY (id),
  FOREIGN KEY (catalogo_id)
        REFERENCES catalogo(id)
        ON DELETE CASCADE
);

CREATE TABLE pedido_articulo
( 
  pedido_id int NOT NULL,
  articulo_id int NOT NULL,
  CONSTRAINT pedido_fk FOREIGN KEY (pedido_id) REFERENCES pedido(id),
  CONSTRAINT articulo_fk FOREIGN KEY (articulo_id) REFERENCES articulo(id)
);

CREATE TABLE usuario
( 
  id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL
);