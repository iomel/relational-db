CREATE TABLE EMPLOYEES (
ID NUMBER,
CONSTRAINT EMPLOYEE_ID PRIMARY KEY(ID),
LastName VARCHAR2(100) NOT NULL,
FirstName VARCHAR2(100) NOT NULL,
Title VARCHAR2(200),
TitleOfCourtesy VARCHAR2(200),
BirthDate DATE,
HireDate DATE,
Address VARCHAR2(200),
City VARCHAR2(100),
Region VARCHAR2(100),
PostalCode NUMBER(10),
Country VARCHAR2(100),
HomePhone VARCHAR2(20),
Extension VARCHAR2(20),
Photo VARCHAR2(1000),
Notes VARCHAR2(4000),
ReportsTo NUMBER
);
