USE workshop;

/* Drop all non-system stored procs */
DECLARE @name VARCHAR(128)
DECLARE @SQL VARCHAR(254)

SELECT @name = (SELECT TOP 1 [name] FROM sysobjects WHERE [type] = 'P' AND category = 0 ORDER BY [name])

WHILE @name is not null
BEGIN
    SELECT @SQL = 'DROP PROCEDURE [dbo].[' + RTRIM(@name) +']'
    EXEC (@SQL)
    PRINT 'Dropped Procedure: ' + @name
    SELECT @name = (SELECT TOP 1 [name] FROM sysobjects WHERE [type] = 'P' AND category = 0 AND [name] > @name ORDER BY [name])
END
GO

/* Drop all views */
DECLARE @name VARCHAR(128)
DECLARE @SQL VARCHAR(254)

SELECT @name = (SELECT TOP 1 [name] FROM sysobjects WHERE [type] = 'V' AND category = 0 ORDER BY [name])

WHILE @name IS NOT NULL
BEGIN
    SELECT @SQL = 'DROP VIEW [dbo].[' + RTRIM(@name) +']'
    EXEC (@SQL)
    PRINT 'Dropped View: ' + @name
    SELECT @name = (SELECT TOP 1 [name] FROM sysobjects WHERE [type] = 'V' AND category = 0 AND [name] > @name ORDER BY [name])
END
GO

/* Drop all functions */
DECLARE @name VARCHAR(128)
DECLARE @SQL VARCHAR(254)

SELECT @name = (SELECT TOP 1 [name] FROM sysobjects WHERE [type] IN (N'FN', N'IF', N'TF', N'FS', N'FT') AND category = 0 ORDER BY [name])

WHILE @name IS NOT NULL
BEGIN
    SELECT @SQL = 'DROP FUNCTION [dbo].[' + RTRIM(@name) +']'
    EXEC (@SQL)
    PRINT 'Dropped Function: ' + @name
    SELECT @name = (SELECT TOP 1 [name] FROM sysobjects WHERE [type] IN (N'FN', N'IF', N'TF', N'FS', N'FT') AND category = 0 AND [name] > @name ORDER BY [name])
END
GO

/* Drop all Foreign Key constraints */
DECLARE @name VARCHAR(128)
DECLARE @constraint VARCHAR(254)
DECLARE @SQL VARCHAR(254)

SELECT @name = (SELECT TOP 1 TABLE_NAME FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS WHERE constraint_catalog=DB_NAME() AND CONSTRAINT_TYPE = 'FOREIGN KEY' ORDER BY TABLE_NAME)

WHILE @name is not null
BEGIN
    SELECT @constraint = (SELECT TOP 1 CONSTRAINT_NAME FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS WHERE constraint_catalog=DB_NAME() AND CONSTRAINT_TYPE = 'FOREIGN KEY' AND TABLE_NAME = @name ORDER BY CONSTRAINT_NAME)
    WHILE @constraint IS NOT NULL
    BEGIN
        SELECT @SQL = 'ALTER TABLE [dbo].[' + RTRIM(@name) +'] DROP CONSTRAINT [' + RTRIM(@constraint) +']'
        EXEC (@SQL)
        PRINT 'Dropped FK Constraint: ' + @constraint + ' on ' + @name
        SELECT @constraint = (SELECT TOP 1 CONSTRAINT_NAME FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS WHERE constraint_catalog=DB_NAME() AND CONSTRAINT_TYPE = 'FOREIGN KEY' AND CONSTRAINT_NAME <> @constraint AND TABLE_NAME = @name ORDER BY CONSTRAINT_NAME)
    END
SELECT @name = (SELECT TOP 1 TABLE_NAME FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS WHERE constraint_catalog=DB_NAME() AND CONSTRAINT_TYPE = 'FOREIGN KEY' ORDER BY TABLE_NAME)
END
GO

/* Drop all Primary Key constraints */
DECLARE @name VARCHAR(128)
DECLARE @constraint VARCHAR(254)
DECLARE @SQL VARCHAR(254)

SELECT @name = (SELECT TOP 1 TABLE_NAME FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS WHERE constraint_catalog=DB_NAME() AND CONSTRAINT_TYPE = 'PRIMARY KEY' ORDER BY TABLE_NAME)

WHILE @name IS NOT NULL
BEGIN
    SELECT @constraint = (SELECT TOP 1 CONSTRAINT_NAME FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS WHERE constraint_catalog=DB_NAME() AND CONSTRAINT_TYPE = 'PRIMARY KEY' AND TABLE_NAME = @name ORDER BY CONSTRAINT_NAME)
    WHILE @constraint is not null
    BEGIN
        SELECT @SQL = 'ALTER TABLE [dbo].[' + RTRIM(@name) +'] DROP CONSTRAINT [' + RTRIM(@constraint)+']'
        EXEC (@SQL)
        PRINT 'Dropped PK Constraint: ' + @constraint + ' on ' + @name
        SELECT @constraint = (SELECT TOP 1 CONSTRAINT_NAME FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS WHERE constraint_catalog=DB_NAME() AND CONSTRAINT_TYPE = 'PRIMARY KEY' AND CONSTRAINT_NAME <> @constraint AND TABLE_NAME = @name ORDER BY CONSTRAINT_NAME)
    END
SELECT @name = (SELECT TOP 1 TABLE_NAME FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS WHERE constraint_catalog=DB_NAME() AND CONSTRAINT_TYPE = 'PRIMARY KEY' ORDER BY TABLE_NAME)
END
GO

/* Drop all tables */
DECLARE @name VARCHAR(128)
DECLARE @SQL VARCHAR(254)

SELECT @name = (SELECT TOP 1 [name] FROM sysobjects WHERE [type] = 'U' AND category = 0 ORDER BY [name])

WHILE @name IS NOT NULL
BEGIN
    SELECT @SQL = 'DROP TABLE [dbo].[' + RTRIM(@name) +']'
    EXEC (@SQL)
    PRINT 'Dropped Table: ' + @name
    SELECT @name = (SELECT TOP 1 [name] FROM sysobjects WHERE [type] = 'U' AND category = 0 AND [name] > @name ORDER BY [name])
END
GO

CREATE TABLE Product(
	id_product					int identity(1,1),
	barcode						int UNIQUE			NOT NULL,
	productName					nvarchar(128)		NOT NULL,
	purchasePrice				float,
	salesPrice					float,
	countryOfOrigin				nvarchar(64),
	minStock					int,
	currStock					int,
	productType					nvarchar(16)		NOT NULL,
	PRIMARY KEY (id_product)
);
GO

CREATE TABLE Equipment(
	id_equipment				int					NOT NULL,
	equipmentType				nvarchar(64),
	equipmentDescription		nvarchar(512),
	PRIMARY KEY (id_equipment),
	FOREIGN KEY (id_equipment) REFERENCES Product(id_product) ON DELETE NO ACTION ON UPDATE CASCADE
);
GO

CREATE TABLE Clothing(
	id_clothing					int					NOT NULL,
	size						float,
	colour						nvarchar(32),
	PRIMARY KEY (id_clothing),
	FOREIGN KEY (id_clothing) REFERENCES Product(id_product) ON DELETE NO ACTION ON UPDATE CASCADE
);
GO

CREATE TABLE GunReplicas(
	id_gunReplicas				int					NOT NULL,
	fabric						nvarchar(32),
	calibre						float,
	PRIMARY KEY (id_gunReplicas),
	FOREIGN KEY (id_gunReplicas) REFERENCES Product(id_product) ON DELETE NO ACTION ON UPDATE CASCADE
);
GO

CREATE TABLE Address(
	id_address				int identity(1,1),
	zipcode					int,
	city					nvarchar(256),
	PRIMARY KEY (id_address)
);
GO

CREATE TABLE Supplier(
	id_supplier					int identity(1,1),
	supplierName				nvarchar(64),
	phoneNr						nvarchar(16),
	email						nvarchar(256),
	suplierStreet				nvarchar(256),
	id_address					int					NOT NULL,
	PRIMARY KEY (id_supplier),
	FOREIGN KEY (id_address) REFERENCES Address(id_address) ON DELETE NO ACTION ON UPDATE CASCADE
);
GO

CREATE TABLE ProductSupplier(
	id_productSupplier			int	identity(1,1),
	id_product					int					NOT NULL,
	id_supplier					int					NOT NULL,
	PRIMARY KEY (id_productSupplier),
	FOREIGN KEY (id_product) REFERENCES Product(id_product) ON DELETE NO ACTION ON UPDATE CASCADE,
	FOREIGN KEY (id_supplier) REFERENCES Supplier(id_supplier) ON DELETE NO ACTION ON UPDATE CASCADE
);
GO

CREATE TABLE Invoice(
	id_invoice					int identity(1,1),
	invoiceDate					datetime DEFAULT getdate(),
	paymentDate					datetime,
	PRIMARY KEY (id_invoice)
);
GO

CREATE TABLE Customer(
	id_customer					int identity(1,1),
	cpr							int					NOT NULL,
	customerName				nvarchar(64)		NOT NULL,
	phNumber					nvarchar(16),
	customerType				nvarchar(16)		NOT NULL,
	custoemrStreet				nvarchar(256),
	id_address					int					NOT NULL,
	PRIMARY KEY (id_customer),
	FOREIGN KEY (id_address) REFERENCES Address(id_address) ON DELETE NO ACTION ON UPDATE NO ACTION,
	CONSTRAINT CPR_UNIQUE UNIQUE(cpr)
);
GO

CREATE TABLE SalesOrder(
	id_salesOrder				int identity(1,1),
	salesDate					datetime DEFAULT getdate() NOT NULL,
	deliveryStatus				nvarchar(32)		NOT NULL,
	deliveryDate				datetime DEFAULT getdate() NOT NULL,
	paid						BIT					NOT NULL,
	deliveryStreet				nvarchar(256)		NOT NULL,
	id_address					int					NOT NULL,
	id_c						int					NOT NULL,
	id_invoice					int					NOT NULL,
	PRIMARY KEY (id_salesOrder),
	FOREIGN KEY (id_address) REFERENCES Address(id_address) ON DELETE NO ACTION ON UPDATE CASCADE,
	FOREIGN KEY (id_c) REFERENCES Customer(id_customer) ON DELETE NO ACTION ON UPDATE CASCADE,
	FOREIGN KEY (id_invoice) REFERENCES Invoice(id_invoice) ON DELETE NO ACTION ON UPDATE CASCADE
);
GO

CREATE TABLE SaleLine(
	id_saleLine					int identity(1,1),
	amount						int					NOT NULL,
	price						float				NOT NULL,
	id_product					int					NOT NULL,
	id_salesOrder				int					NOT NULL,
	PRIMARY KEY (id_saleLine),
	FOREIGN KEY (id_product) REFERENCES Product(id_product) ON DELETE NO ACTION ON UPDATE CASCADE,
	FOREIGN KEY (id_salesOrder) REFERENCES SalesOrder(id_salesOrder) ON DELETE NO ACTION ON UPDATE CASCADE
);
GO