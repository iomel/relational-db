CREATE TABLE HOTEL (
ID NUMBER,
CONSTRAINT HOTELS_ID PRIMARY KEY (ID),
COUNTRY VARCHAR2(50) DEFAULT 'N\A',
CONSTRAINT COUNTRY_CHECK CHECK( COUNTRY NOT IN('Romania','Belgium','China','Ukraine')),
CITY VARCHAR2(50) NOT NULL,
STREET VARCHAR2(4000)
);