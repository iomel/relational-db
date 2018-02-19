CREATE TABLE ORDER_DETAILS (
ORDER_ID NUMBER,
CONSTRAINT ORDER_FK FOREIGN KEY (ORDER_ID)
REFERENCES ORDERS(ID),
PRODUCT_ID NUMBER,
CONSTRAINT PRODUCT_FK FOREIGN KEY (PRODUCT_ID)
REFERENCES PRODUCTS(ID),
UnitPrice NUMBER(*,2) NOT NULL,
Quantity NUMBER NOT NULL,
Discount NUMBER NOT NULL
);