CREATE TABLE CUSTOMERS (
ID NUMBER,
CONSTRAINT CUSTOMER_ID PRIMARY KEY(ID),
CompanyName VARCHAR2(200) NOT NULL,
ContactName VARCHAR2(200),
ContactTitle VARCHAR2(200),
Address VARCHAR2(200),
City VARCHAR2(100),
Region VARCHAR2(100),
PostalCode NUMBER(10),
Country VARCHAR2(100),
Phone VARCHAR2(20),
Fax VARCHAR2(20)
);
