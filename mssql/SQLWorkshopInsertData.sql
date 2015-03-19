use wathever;
insert into Address(zipcode, city) values ('9000','Aalborg');
insert into Address(zipcode, city) values ('9200','Aalborg Ost');
insert into Address(zipcode, city) values ('2100','Copenhagen Ø');
insert into Address(zipcode, city) values ('2200',' Copenhagen N');
insert into Address(zipcode, city) values ('2300','Copenhagen S');
insert into Address(zipcode, city) values ('2400','Copenhagen NV');
insert into Address(zipcode, city) values ('2500','Valby');
insert into Address(zipcode, city) values ('2600','Glostrup');
insert into Address(zipcode, city) values ('2630','Taastrup');
insert into Address(zipcode, city) values ('2640','Hedehusene');
insert into Address(zipcode, city) values ('2650','Hvidovre');
insert into Address(zipcode, city) values ('2000','Frederiksberg C');

insert into Customer(cpr,customerName,phNumber,customerType,customerStreet,id_Address) values ('2808952757','Adrian Frunza','91840063','club','Prinsensgade','1');
insert into Customer(cpr,customerName,phNumber,customerType,customerStreet,id_Address) values ('1002853657','John Potato','36578942','club','Osterogade','2');
insert into Customer(cpr,customerName,phNumber,customerType,customerStreet,id_Address) values ('0202945874','Monika Lime','12356985','private','Nytorv','3');
insert into Customer(cpr,customerName,phNumber,customerType,customerStreet,id_Address) values ('1906932100','Alex Smith','21458712','club','Gammeltrov','4');
insert into Customer(cpr,customerName,phNumber,customerType,customerStreet,id_Address) values ('1212871423','Kristupas Sakalius','20365210','private','Beddingen','5');
insert into Customer(cpr,customerName,phNumber,customerType,customerStreet,id_Address) values ('2011910254','Valentino Nagy','96857456','club','Danmarkgade','6');
insert into Customer(cpr,customerName,phNumber,customerType,customerStreet,id_Address) values ('1204872598','Richard Manamo','12035698','private','Osteragade','7');
insert into Customer(cpr,customerName,phNumber,customerType,customerStreet,id_Address) values ('1503954456','Morten Jesper','54781254','club','Cambridgegade','8');

insert into Supplier(supplierName,phoneNr, email, suplierStreet, id_Address) values ('SC Hats SRL','25698563','hats@clothes.com','Kennedy','9');
insert into Supplier(supplierName,phoneNr, email, suplierStreet, id_Address) values ('SC Star Clothes SRL','21458745','star@clothes.com','Kaspergade','10');
insert into Supplier(supplierName,phoneNr, email, suplierStreet, id_Address) values ('SC Magic Clothes SRL','23658965','magic@clothes.com','Anonimusgade','11');
insert into Supplier(supplierName,phoneNr, email, suplierStreet, id_Address) values ('SC Analitic Clothes SRL','21025410','analitic@clothes.com','Thegade','12');

insert into Invoice(invoiceDate, paymentDate) values ('17.03.2015','18.03.2015');
insert into Invoice(invoiceDate, paymentDate) values ('26.04.2015','27.04.2015');
insert into Invoice(invoiceDate, paymentDate) values ('29.03.2015','30.03.2015');
insert into Invoice(invoiceDate, paymentDate) values ('18.04.2015','19.04.2015');
insert into Invoice(invoiceDate, paymentDate) values ('05.03.2015','06.03.2015');
insert into Invoice(invoiceDate, paymentDate) values ('30.03.2015','01.04.2015');
insert into Invoice(invoiceDate, paymentDate) values ('05.03.2015','06.03.2015');
insert into Invoice(invoiceDate, paymentDate) values ('07.09.2015','08.09.2015');
insert into Invoice(invoiceDate, paymentDate) values ('05.01.2015','06.01.2015');
insert into Invoice(invoiceDate, paymentDate) values ('30.03.2015','01.04.2015');

insert into Equipment(equipmentType,equipmentDescription) values ('cawboy','modern cawboy');
insert into Equipment(equipmentType,equipmentDescription) values ('cawboy','old cawboy');
insert into Equipment (equipmentType,equipmentDescription) values ('military', 'old military');
insert into Equipment (equipmentType,equipmentDescription) values ('military', 'modern military');

insert into Clothing(size,colour) values ('38','red');
insert into Clothing(size,colour) values ('39','blue');
insert into Clothing (size,colour) values ('40', 'green');
insert into Clothing (size,colour) values ('40', 'purple');

insert into GunReplicas(fabric,calibre) values ('Colt','9');
insert into GunReplicas(fabric,calibre) values ('Fausti','9');
insert into GunReplicas(fabric,calibre) values ('Molot','9');

insert into Product(barcode,productName,purchasePrice,salesPrice,countryOfOrigin,minStock,currStock,productType) values ('2569854752','Modern Cowboy Equipment','100','150','DK','2','20','equipment');
insert into Product(barcode,productName,purchasePrice,salesPrice,countryOfOrigin,minStock,currStock,productType) values ('3658965423','Old Cowboy Equipment','100','150','RO','5','50','equipment');
insert into Product(barcode,productName,purchasePrice,salesPrice,countryOfOrigin,minStock,currStock,productType) values ('2015203620','Old Military Equipment','100','180','BU','10','100','equipment');
insert into Product(barcode,productName,purchasePrice,salesPrice,countryOfOrigin,minStock,currStock,productType) values ('2001523300','Modern Military Equipment','100','120','CH','14','140','equipment');
insert into Product(barcode,productName,purchasePrice,salesPrice,countryOfOrigin,minStock,currStock,productType) values ('5214123000','Red Blouse','100','150','GR','10','100','clothing');
insert into Product(barcode,productName,purchasePrice,salesPrice,countryOfOrigin,minStock,currStock,productType) values ('9180020140','Blue dress','100','200','TK','5','50','clothing');
insert into Product(barcode,productName,purchasePrice,salesPrice,countryOfOrigin,minStock,currStock,productType) values ('1020306050','Green shoes','100','170','SP','2','20','clothing');
insert into Product(barcode,productName,purchasePrice,salesPrice,countryOfOrigin,minStock,currStock,productType) values ('4856287480','Purple Belt','200','180','PO','6','60','clothing');
insert into Product(barcode,productName,purchasePrice,salesPrice,countryOfOrigin,minStock,currStock,productType) values ('6385469820','Colt 9 gun','300','360','IT','9','90','gunReplica');
insert into Product(barcode,productName,purchasePrice,salesPrice,countryOfOrigin,minStock,currStock,productType) values ('4785962300','Fausti 9 gun','500','600','DK','4','40','gunReplica');
insert into Product(barcode,productName,purchasePrice,salesPrice,countryOfOrigin,minStock,currStock,productType) values ('4785412560','Molot9 gun','800','850','RO','3','30','gunReplica');

insert into ProductSupplier(id_product,id_supplier) values ('1','4');
insert into ProductSupplier(id_product,id_supplier) values ('2','2');
insert into ProductSupplier(id_product,id_supplier) values ('3','1');
insert into ProductSupplier(id_product,id_supplier) values ('4','3');
insert into ProductSupplier(id_product,id_supplier) values ('5','3');
insert into ProductSupplier(id_product,id_supplier) values ('6','2');
insert into ProductSupplier(id_product,id_supplier) values ('7','4');
insert into ProductSupplier(id_product,id_supplier) values ('8','1');
insert into ProductSupplier(id_product,id_supplier) values ('9','2');
insert into ProductSupplier(id_product,id_supplier) values ('10','3');
insert into ProductSupplier(id_product,id_supplier) values ('11','4');

insert into SalesOrder(salesDate,deliveryStatus,deliveryDate, paid, deliveryStreet, id_Address, id_c, id_invoice) values ('17.03.2015','true','17.03.2015','false','Beddingen','2','2','9');
insert into SalesOrder(salesDate,deliveryStatus,deliveryDate, paid, deliveryStreet, id_Address, id_c, id_invoice) values ('17.03.2015','false','18.03.2015','false','Osterogade','1','4','8');
insert into SalesOrder(salesDate,deliveryStatus,deliveryDate, paid, deliveryStreet, id_Address, id_c, id_invoice) values ('18.03.2015','false','19.03.2015','true','Nytorv','7','6','7');
insert into SalesOrder(salesDate,deliveryStatus,deliveryDate, paid, deliveryStreet, id_Address, id_c, id_invoice) values ('19.03.2015','true','19.03.2015','true','Asterix','6','8','6');
insert into SalesOrder(salesDate,deliveryStatus,deliveryDate, paid, deliveryStreet, id_Address, id_c, id_invoice) values ('6.03.2015','false','7.03.2015','false','Nostreet','3','7','5');

insert into SaleLine(amount,price,id_product,id_SalesOrder) values ('2','100','1','1');
insert into SaleLine(amount,price,id_product,id_SalesOrder) values ('1','50','2','1');
insert into SaleLine(amount,price,id_product,id_SalesOrder) values ('3','60','3','2');
insert into SaleLine(amount,price,id_product,id_SalesOrder) values ('4','70','4','3');
insert into SaleLine(amount,price,id_product,id_SalesOrder) values ('1','80','5','3');
insert into SaleLine(amount,price,id_product,id_SalesOrder) values ('1','100','6','3');
insert into SaleLine(amount,price,id_product,id_SalesOrder) values ('5','90','7','4');
insert into SaleLine(amount,price,id_product,id_SalesOrder) values ('3','200','8','4');
insert into SaleLine(amount,price,id_product,id_SalesOrder) values ('4','150','7','5');
insert into SaleLine(amount,price,id_product,id_SalesOrder) values ('2','140','6','5');