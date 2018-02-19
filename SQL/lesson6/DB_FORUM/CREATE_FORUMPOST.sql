CREATE TABLE FORUMPOSTS (
ID NUMBER,
CONSTRAINT POST_ID PRIMARY KEY (ID),
ID_SUBCATEGORY NUMBER,
CONSTRAINT SUBCATEGORY_FK FOREIGN KEY(ID_SUBCATEGORY)
REFERENCES FORUMSUBCATEGORIES(ID),
PARENTPOST NUMBER,
CONSTRAINT PARENTPOST_FK FOREIGN KEY(PARENTPOST)
REFERENCES FORUMPOSTS(ID),
TITLE VARCHAR2(90),
CONTENT VARCHAR2(4000),
ISPOLL VARCHAR2(5) CHECK (ISPOLL IN ('True','False')),
POST_DATE DATE,
IP VARCHAR2(20)
);