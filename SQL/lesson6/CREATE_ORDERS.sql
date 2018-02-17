CREATE TABLE ORDERS (
ID NUMBER,
CONSTRAINT ORDER_ID PRIMARY KEY(ID),
CUSTOMER_ID NUMBER,
CONSTRAINT CUSTOMER_FK FOREIGN KEY (CUSTOMER_ID)
REFERENCES CUSTOMERS(ID),
EMPLOYEE_ID NUMBER,
CONSTRAINT EMPLOYEE_FK FOREIGN KEY (EMPLOYEE_ID)
REFERENCES EMPLOYEES(ID),
OrderDate DATE,
RequiredDate DATE,
ShippedDate DATE,
ShipVia NUMBER,
CONSTRAINT SHIPPER_FK FOREIGN KEY (ShipVia)
REFERENCES SHIPPERS(ID),
FREIGHT VARCHAR2(200),
ShipName VARCHAR2(200),
ShipAddress VARCHAR2(200),
ShipCity VARCHAR2(100),
ShipRegion VARCHAR2(100),
ShipPostalCode NUMBER(10),
ShipCountry VARCHAR2(100)
);