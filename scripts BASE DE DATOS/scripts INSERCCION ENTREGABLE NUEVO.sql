INSERT INTO categoria VALUES (01,'Carnes','Deliciosas carnes');
INSERT INTO categoria VALUES (02,'Pescados','Deliciosos pescados');
INSERT INTO categoria VALUES (03,'Verduras','Deliciosas verduras');
INSERT INTO categoria VALUES (04,'Postres','Deliciosos postres');
INSERT INTO categoria VALUES (05,'Bebidas','Deliciosas bebidas');

INSERT INTO producto VALUES (06,'cachopo',10,01,22);
INSERT INTO producto VALUES (07,'filete de ternera',8,01,18);
INSERT INTO producto VALUES (08,'dorada',10,02,19);
INSERT INTO producto VALUES (09,'lubina',20,02,21);
INSERT INTO producto VALUES (010,'yogur',18,04,2.5);
INSERT INTO producto VALUES (011,'helado',17,04,5.25);
INSERT INTO producto VALUES (012,'coca-cola',10,05,1.75);
INSERT INTO producto VALUES (013,'fanta-naranja',10,05,1.75);

INSERT INTO pedido VALUES (100,'2 personas');
INSERT INTO pedido VALUES (101,'3 personas');
INSERT INTO pedido VALUES (102,'4 personas');
INSERT INTO pedido VALUES (103,'5 personas');
INSERT INTO pedido VALUES (104,'2 personas');

INSERT INTO clientes VALUES (1,'cachopo');
INSERT INTO clientes VALUES (2,'filete de ternera');
INSERT INTO clientes VALUES (3,'dorada');
INSERT INTO clientes VALUES (4,'lubina');
INSERT INTO clientes VALUES (5,'fanta-naranja');

INSERT INTO tener VALUES ('cachopo','1.5 KG',06,100);
INSERT INTO tener VALUES ('lubina','1.5 KG',09,103);
INSERT INTO tener VALUES ('dorada','1.5 KG',08,102);
INSERT INTO tener VALUES ('filete de ternera','1.5 KG',07,101);

INSERT INTO pedir VALUES ('2 cachopos','cachopo',1,100);
INSERT INTO pedir VALUES ('2 fantas-naranja','fanta-naranja',1,100);
INSERT INTO pedir VALUES ('2 yogures','fanta-naranja',1,100);
INSERT INTO pedir VALUES ('3 lubinas','lubinas',2,101);
INSERT INTO pedir VALUES ('2 coca-cola','coca-cola',2,101);
INSERT INTO pedir VALUES ('1 fantas-naranja','fanta-naranja',2,101);
INSERT INTO pedir VALUES ('3 helados','helado',2,101);
INSERT INTO pedir VALUES ('2 filetes de ternera','filetes de ternera',3,102);
INSERT INTO pedir VALUES ('2 cachopo','cachopo',3,102);
INSERT INTO pedir VALUES ('4 fantas-naranja','fanta-naranja',3,103);
INSERT INTO pedir VALUES ('5 doradas','doradas',4,103);
INSERT INTO pedir VALUES ('5 coca-cola','coca-cola',4,103);
INSERT INTO pedir VALUES ('2 filetes de ternera','filetes de ternera',5,104);
INSERT INTO pedir VALUES ('2 yogur','cachopo',5,104);

INSERT INTO tomarse VALUES (1,06,'cachopo',10,'cachopo');
INSERT INTO tomarse VALUES (1,06,'cachopo',10,'cachopo');
INSERT INTO tomarse VALUES (1,013,'fanta-naranja',10,'fanta-naranja');
INSERT INTO tomarse VALUES (1,013,'fanta-naranja',10,'fanta-naranja');
INSERT INTO tomarse VALUES (1,010,'yogur',18,'yogur');
INSERT INTO tomarse VALUES (1,010,'yogur',18,'yogur');
INSERT INTO tomarse VALUES (2,09,'lubina',20,'lubina');
INSERT INTO tomarse VALUES (2,09,'lubina',20,'lubina');
INSERT INTO tomarse VALUES (2,09,'lubina',20,'lubina');
INSERT INTO tomarse VALUES (2,012,'coca-cola',10,'coca-cola');
INSERT INTO tomarse VALUES (2,012,'coca-cola',10,'coca-cola');
INSERT INTO tomarse VALUES (3,013,'fanta-naranja',10,'fanta-naranja');
INSERT INTO tomarse VALUES (3,013,'fanta-naranja',10,'fanta-naranja');
INSERT INTO tomarse VALUES (3,013,'fanta-naranja',10,'fanta-naranja');
INSERT INTO tomarse VALUES (3,013,'fanta-naranja',10,'fanta-naranja');
INSERT INTO tomarse VALUES (2,011,'helado',17,'helado');
INSERT INTO tomarse VALUES (2,011,'helado',17,'helado');
INSERT INTO tomarse VALUES (2,011,'helado',17,'helado');
INSERT INTO tomarse VALUES (2,07,'filete de ternera',8,'filete de ternera');
INSERT INTO tomarse VALUES (2,07,'filete de ternera',8,'filete de ternera');
INSERT INTO tomarse VALUES (1,06,'cachopo',10,'cachopo');
INSERT INTO tomarse VALUES (1,06,'cachopo',10,'cachopo');







