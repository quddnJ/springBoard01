create table tblBoard(
    id number(4,0) NOT NULL ENABLE, 
    name varchar2(20 BYTE),
    title varchar2(100 BYTE),
    content VARCHAR2(300 BYTE),
    regdate date DEFAULT SYSDATE,
    hit NUMBER(4,0),
    CONSTRAINT tblBoard_PK PRIMARY KEY(id)
);

create SEQUENCE tblBoardSeq;