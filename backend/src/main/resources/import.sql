INSERT INTO tb_product(name, barcode, qtd_In_Stok, price, date_Validity) VALUES ('Cafe Floresta','1234567981025',1000,10.50,TIMESTAMP WITHOUT TIME ZONE '2023-05-15T10:00:00Z');
INSERT INTO tb_product(name, barcode, qtd_In_Stok, price, date_Validity) VALUES ('Leite Floresta','9874584472364',1000,7.50,TIMESTAMP WITHOUT TIME ZONE '2023-03-15T10:00:00Z');
INSERT INTO tb_product(name, barcode, qtd_In_Stok, price) VALUES ('Tricot Modal','3243815651521',50,45.70);
INSERT INTO tb_product(name, barcode, qtd_In_Stok, price) VALUES ('God of War','1113169725341',500,252.00);
INSERT INTO tb_product(name, barcode, qtd_In_Stok, price) VALUES ('Senhor dos Aneis','1431606108757',35,50.00);
INSERT INTO tb_product(name, barcode, qtd_In_Stok, price) VALUES ('Pc Gamer','4489522927155',100,3550.00);


INSERT INTO tb_category(name) VALUES('Book');
INSERT INTO tb_category(name) VALUES('Electronic');
INSERT INTO tb_category(name) VALUES('Food');
INSERT INTO tb_category(name) VALUES('Cosmetic');
INSERT INTO tb_category(name) VALUES('Sport');
INSERT INTO tb_category(name) VALUES('Clother');
INSERT INTO tb_category(name) VALUES('School');
INSERT INTO tb_category(name) VALUES('Shoes');
INSERT INTO tb_category(name) VALUES('Music');
INSERT INTO tb_category(name) VALUES('Games');

INSERT INTO tb_provider(corp_Name, fant_Name, social_Register, cnpj, email, tell, corp_Contact_Name, number_Of_Localizate, complements) VALUES ('IND E COM CAFE FLORESTA S/A','CAFE FLORESTA', '111.201.253.116','19.445.714/0001-31','wallace_smorais@cafefloresta.com',117335671,'Wallace Morais',55,'N/D');
INSERT INTO tb_provider(corp_Name, fant_Name, social_Register, cnpj, email, tell, corp_Contact_Name, number_Of_Localizate, complements) VALUES ('CASTELO ALIMENTOS S.A','CASTELO ALIMENTOS','123.111.525.114','08.426.574/0001-38','felipe@casteloalimentos.com.br',1122558741,'Felipe Sousa',44,'N/D'); 
INSERT INTO tb_provider(corp_Name, fant_Name, social_Register, cnpj, email, tell, corp_Contact_Name, number_Of_Localizate, complements) VALUES ('TECNOLOG PROD DE SOFTWARES LTDA','TECSOFT','321.551.000.545','86.448.280/0001-10','carlosPereira@tecsoft.com.br',1148448874,'Carla Pereira',33,'N/D'); 
INSERT INTO tb_provider(corp_Name, fant_Name, social_Register, cnpj, email, tell, corp_Contact_Name, number_Of_Localizate, complements) VALUES ('REIDOTRICOT CORP','REI DO TRICOT','151.114.111.558','95.541.254/0001-23','compras@reidotricot.com.br',1197887811,'Yan Felipe',32,'SHOPING TIERS LOJA 151'); 
INSERT INTO tb_provider(corp_Name, fant_Name, social_Register, cnpj, email, tell, corp_Contact_Name, number_Of_Localizate, complements) VALUES ('LIVRARIA INCORP PRODUC LTDA','LIVRARIA INCORPORADA','442.115.484.778','98.026.798/0001-45','contatoforn@producaoform.com.br', 1125252323,'Bruna Silva',22,'N/D'); 
INSERT INTO tb_provider(corp_Name, fant_Name, social_Register, cnpj, email, tell, corp_Contact_Name, number_Of_Localizate, complements) VALUES ('BOM SENSO DESCARTAVEIS DESCARTÁVEIS HOSPITALARES LTDA','BOM SENDO DESCARTAVEIS','158.152.153.454','84.135.701/0001-28','carbelrepre@terra.com.br',1125447755,'Renata Oliveira',10,'N/D'); 
INSERT INTO tb_provider(corp_Name, fant_Name, social_Register, cnpj, email, tell, corp_Contact_Name, number_Of_Localizate, complements) VALUES ('UNION SOFTWARES IND LTDA','UNION GAMES','213.121.541.151','61.303.275/0001-99','lucasP@uniongames.com.br',1124878797,'Luana Porto',78,'PROXIMO AO MERCADO VENCEDOR'); 
INSERT INTO tb_provider(corp_Name, fant_Name, social_Register, cnpj, email, tell, corp_Contact_Name, number_Of_Localizate, complements) VALUES ('INDUSTRIA DE CALCADOS BOM E MANEIRO LTDA','BOM E MANEIRO','083.761.110.722','03.025.905/0001-04','cauebryan@bomebarato.com.br',1138163059,'Cauê Bryan',56,'N/D'); 
INSERT INTO tb_provider(corp_Name, fant_Name, social_Register, cnpj, email, tell, corp_Contact_Name, number_Of_Localizate, complements) VALUES ('KAIQUE E ISABELLY ESPORTES ME','KAIEBELLY ESPORTES','521.570.627.183','39.004.405/0001-33','financeiro@kaiebellyesport.com.br',1125991347,'Kayque Bernardo',55,'N/D'); 
INSERT INTO tb_provider(corp_Name, fant_Name, social_Register, cnpj, email, tell, corp_Contact_Name, number_Of_Localizate, complements) VALUES ('DAVI E GERALDO INFORMÁTICA LTDA','DAVIGERA INFO','642.954.587.378','16.771.049/0001-88','compras@daviegerainform.com.br',1138696450,'Laura Golias',63,'N/D'); 

INSERT INTO tb_address (street_Name, district, city, state, cep, provider_id) VALUES ('R Cubatão', 'Vila Mariana', 'São Paulo','SP', '04013040',1);
INSERT INTO tb_address (street_Name, district, city, state, cep, provider_id) VALUES ('R Eusébio de Paula Marcondes','Jardim D Abril', 'São Paulo', 'SP', '05398020',2);
INSERT INTO tb_address (street_Name, district, city, state, cep, provider_id) VALUES ('R Benedita Dornellas Claro','Jardim Andaraí','São Paulo', 'SP','02168020',3);
INSERT INTO tb_address (street_Name, district, city, state, cep, provider_id) VALUES ('R Benedito Egídio Barbosa', 'Brasilândia', 'São Paulo', 'SP', '02846200',4);
INSERT INTO tb_address (street_Name, district, city, state, cep, provider_id) VALUES ('R Cássio de Almeida', 'Vila Guilherme','São Paulo','SP','02067060',5);
INSERT INTO tb_address (street_Name, district, city, state, cep, provider_id) VALUES ('R Pegmatito','Parque Central','São Paulo','SP','08420480',6);
INSERT INTO tb_address (street_Name, district, city, state, cep, provider_id) VALUES ('R Antônio Caldas','Jardim Catanduva', 'São Paulo','SP','05767300',7);
INSERT INTO tb_address (street_Name, district, city, state, cep, provider_id) VALUES ('R Feitiço da Vila', 'Chácara Santa Maria', 'São Paulo','SP','05879000',8);
INSERT INTO tb_address (street_Name, district, city, state, cep, provider_id) VALUES ('R Coronel Carlos Ambrogi', 'Jardim São José','São Paulo','SP','02969130',9);
INSERT INTO tb_address (street_Name, district, city, state, cep, provider_id) VALUES ('R Campevas','Perdizes','São Paulo','SP','05016010',10);

INSERT INTO tb_product_category(product_id,category_id) VALUES (1,3);
INSERT INTO tb_product_category(product_id,category_id) VALUES (2,3);
INSERT INTO tb_product_category(product_id,category_id) VALUES (3,6);
INSERT INTO tb_product_category(product_id,category_id) VALUES (4,10);
INSERT INTO tb_product_category(product_id,category_id) VALUES (5,1);
INSERT INTO tb_product_category(product_id,category_id) VALUES (6,2);
                                     
INSERT INTO tb_product_provider (product_id, provider_id) VALUES (1,1);
INSERT INTO tb_product_provider (product_id, provider_id) VALUES (2,1);
INSERT INTO tb_product_provider (product_id, provider_id) VALUES (3,4);
INSERT INTO tb_product_provider (product_id, provider_id) VALUES (4,3);
INSERT INTO tb_product_provider (product_id, provider_id) VALUES (5,5);
INSERT INTO tb_product_provider (product_id, provider_id) VALUES (6,3);