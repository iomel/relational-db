CREATE TABLE FORUMPOLLSOPTIONS (
ID NUMBER,
CONSTRAINT FORUMPOST_ID PRIMARY KEY (ID),
ID_POST NUMBER,
CONSTRAINT POST_FK FOREIGN KEY(ID_POST) REFERENCES FORUMPOSTS(ID),
TITLE VARCHAR2(64),
OPTION_DATE DATE
);