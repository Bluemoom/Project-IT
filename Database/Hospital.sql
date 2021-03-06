------------------ CREATE TABLE
------------------ TABLE 
--------------------------------------------------------
--  DDL for Table BACSI
--------------------------------------------------------

  CREATE TABLE "BACSI" 
   (	
     BACSI_ID NUMBER(10,0),
     USERNAME VARCHAR(50),
     PASS_WORD VARCHAR(20),
     HOTEN VARCHAR2(50), 
     NGAYSINH DATE, 
     GIOITINH NUMBER(1,0) , 
     CMND VARCHAR2(10), 
     SDT VARCHAR2(12), 
     EMAIL VARCHAR2(50), 
     DIACHI VARCHAR2(200), 
     CHUYENMON VARCHAR2(50),
     CONSTRAINT PK_BACSI PRIMARY KEY (BACSI_ID),
     CONSTRAINT CK_BACSI_GIOITINH CHECK (GIOITINH  BETWEEN -1 AND 2)
   ) 
--------------------------------------------------------
--  DDL for Table BENHNHAN
--------------------------------------------------------

  CREATE TABLE "BENHNHAN" 
   (	
     "BENHNHAN_ID" NUMBER(10,0), 
     "HOTEN" VARCHAR2(50), 
     "NGAYSINH" DATE, 
     "GIOITINH" NUMBER(1,0), 
     "CMND" VARCHAR2(10), 
     "SDT" VARCHAR2(12), 
     "EMAIL" VARCHAR2(50), 
     "DIACHI" VARCHAR2(200),
     CONSTRAINT PK_BENHNHAN PRIMARY KEY (BENHNHAN_ID),
     CONSTRAINT CK_BENHNHAN_GIOITINH CHECK (GIOITINH  BETWEEN -1 AND 2)
   ) 


--------------------------------------------------------
--  DDL for Table DICHVU
--------------------------------------------------------

  CREATE TABLE "DICHVU" 
   (	"DICHVU_ID" VARCHAR2(6), 
      "TENDICHVU" VARCHAR2(200), 
      "MOTA" VARCHAR2(200), 
      "THOIGIANKHAM" NUMBER(3,0), 
      "CHIPHI" FLOAT,
      "TRANGTHAI" NUMBER(1,0) DEFAULT 1,
      CONSTRAINT PK_DICHVU PRIMARY KEY (DICHVU_ID),
      CONSTRAINT CK_DICHVU_TRANGTHAI CHECK (TRANGTHAI BETWEEN -1 AND 2)
   )
   
--------------------------------------------------------
--  DDL for Table PHONGKHAM
--------------------------------------------------------

  CREATE TABLE "PHONGKHAM" 
   (	"PHONGKHAM_ID" VARCHAR(6), 
      "DICHVU_ID" VARCHAR2(6), 
      "TENPHONGKHAM" VARCHAR2(50), 
      "DIADIEM" VARCHAR2(200), 
      "TRANGTHAI" NUMBER(1,0) DEFAULT 1,
      CONSTRAINT PK_PHONGKHAM PRIMARY KEY (PHONGKHAM_ID),
      CONSTRAINT FK_PHONGKHAM_DICHVU FOREIGN KEY(DICHVU_ID) REFERENCES DICHVU(DICHVU_ID),
      CONSTRAINT CK_PHONGKHAM_TRANGTHAI CHECK (TRANGTHAI BETWEEN -1 AND 2)
   )
   
   --------------------------------------------------------
   
   ---------------------------CREATE TABLE LICHBIEU
   
   CREATE TABLE "LICHBIEU"
   (
      "LICHBIEU_ID" NUMBER(10,0),
      "PHONGKHAM_ID" VARCHAR2(6),
      "BACSI_ID" NUMBER(10,0),
      "NGAYLAM" DATE,
      "BUOILAM" NUMBER(1,0),
      "TRANGTHAI" NUMBER(1,0),
      CONSTRAINT PK_LICHBIEU PRIMARY KEY (LICHBIEU_ID),
      CONSTRAINT FK_LICHBIEU_PHONGKHAM FOREIGN KEY (PHONGKHAM_ID) REFERENCES PHONGKHAM(PHONGKHAM_ID),
      CONSTRAINT FK_LICHBIEU_BACSI FOREIGN KEY (BACSI_ID) REFERENCES BACSI(BACSI_ID),
      CONSTRAINT CK_LICHBIEU_TRANGTHAI CHECK (TRANGTHAI  BETWEEN -1 AND 2)
   )
   

   
--------------------------------------------------------
--  DDL for Table CALAM
--------------------------------------------------------

  CREATE TABLE "CAKHAM" 
   (	"CAKHAM_ID" NUMBER(10,0),
      "LICHBIEU_ID" NUMBER(10,0), 
      "CA" NUMBER(3,0),
      "THOIGIANBATDAU" TIMESTAMP, 
      "THOIGIANKETTHUC" TIMESTAMP,
      "TRANGTHAI" NUMBER(1,0) DEFAULT 0,
      CONSTRAINT PK_CAKHAM PRIMARY KEY (CAKHAM_ID),
      CONSTRAINT FK_CAKHAM_LICHCBIEU FOREIGN KEY (LICHBIEU_ID) REFERENCES LICHBIEU(LICHBIEU_ID),
      CONSTRAINT CK_CAKHAM_TRANGTHAI CHECK (TRANGTHAI BETWEEN -1 AND 2)
   ) 
   

--------------------------------------------------------
--  DDL for Table PHIEUDATLICH
--------------------------------------------------------

  CREATE TABLE "PHIEUDATLICH" 
   (	"PHIEUDATLICH_ID" NUMBER(10,0), 
      "PHONGKHAM_ID" VARCHAR2(6), 
      "BENHNHAN_ID" NUMBER(10,0),
      "CAKHAM_ID" NUMBER(10,0),
      "PHIDATLICH" FLOAT DEFAULT 0, 
      "CHIPHI" FLOAT, 
      "HINHTHUCTHANHTOAN" VARCHAR2(50),
      "TRANGTHAI" NUMBER(1,0) DEFAULT 0,
      CONSTRAINT PK_PHIEUDATLICH PRIMARY KEY (PHIEUDATLICH_ID),
      CONSTRAINT FK_PHIEUDATLICH_PHONGKHAM FOREIGN KEY  (PHONGKHAM_ID) REFERENCES PHONGKHAM(PHONGKHAM_ID),
      CONSTRAINT FK_PHIEUDATLICH_CAKHAMM FOREIGN KEY  (CAKHAM_ID) REFERENCES CAKHAM(CAKHAM_ID),
      CONSTRAINT FK_PHIEUDATLICH_BENHNHAN FOREIGN KEY  (BENHNHAN_ID) REFERENCES BENHNHAN(BENHNHAN_ID),
      CONSTRAINT CK_PHIEUDATLICH_TRANGTHAI CHECK (TRANGTHAI BETWEEN -1 AND 4)
   )   
   --------------------------------------------
   -- DDL FOR TABLE PHIEUKETQUA
   --------------------------------------------
    
   CREATE TABLE PHIEUKETQUA
   (
      "PHIEUKETQUA_ID" NUMBER(10,0),
      "PHIEUDATLICH_ID" NUMBER(10,0),
      "LYDOKHAM" VARCHAR2(500),
      "TIENSUBENH" VARCHAR2(500),
      "QUATRINHBENHLY" VARCHAR2(500),
      "TOANTHAN" VARCHAR2(500),
      "CACBOPHAN" VARCHAR2(500),
      "MACH" VARCHAR(50),
      "NHIETDO" VARCHAR(50),
      "HUYETAP" VARCHAR(50),
      "NOIKHOA" VARCHAR2(500),
      "NGOAIKHOA" VARCHAR2(500),
      "SANPHUKHOA" VARCHAR2(500),
      "XETNGHIEMMAU" VARCHAR2(500),
      "XETNGHIEMNUOCTIEU" VARCHAR2(500),
      "TOMTATKETQUA" VARCHAR2(500),
      "HUONGXULY" VARCHAR2(500),
      "TRANGTHAI" NUMBER(1,0) DEFAULT 0,
      CONSTRAINT PK_PHIEUKETQUA PRIMARY KEY (PHIEUKETQUA_ID),
      CONSTRAINT FK_PHIEUKETQUA_PHIEUDATLICH FOREIGN KEY (PHIEUDATLICH_ID) REFERENCES PHIEUDATLICH(PHIEUDATLICH_ID),
      CONSTRAINT CK_PHIEUKETQUA_TRANGTHAI CHECK (TRANGTHAI BETWEEN -1 AND 2)
   )
   
-------------------------------------------------------------
----------------- SEQUENCE FOR TABLE TO INCREMENT ID
----------------

--------------------- SEQUENCE FOR BACSI
CREATE SEQUENCE sqBacSiId
START WITH 100000
INCREMENT BY 1
NOMAXVALUE;
-------------------- TRIGGER 
CREATE TRIGGER trgBacSiId
BEFORE INSERT ON BACSI
FOR EACH ROW
BEGIN
  SELECT sqBacSiId.NEXTVAL INTO :new.BACSI_ID FROM dual;
END;

--------------------- SEQUENCE FOR BENHNHAN
CREATE SEQUENCE sqBenhNhanId
START WITH 100000
INCREMENT BY 1
NOMAXVALUE;
-------------------- TRIGGER 
CREATE TRIGGER trgBenhNhanId
BEFORE INSERT ON BENHNHAN
FOR EACH ROW
BEGIN
  SELECT sqBenhNhanId.NEXTVAL INTO :new.BENHNHAN_ID FROM dual;
END;

--------------------- SEQUENCE FOR BENHNHAN
CREATE SEQUENCE sqLichBieuId
START WITH 1
INCREMENT BY 1
NOMAXVALUE;
-------------------- TRIGGER 
CREATE TRIGGER trgLichBieuId
BEFORE INSERT ON LICHBIEU
FOR EACH ROW
BEGIN
  SELECT sqLichBieuId.NEXTVAL INTO :new.LICHBIEU_ID FROM dual;
END;

--------------------- SEQUENCE FOR CAKHAM
CREATE SEQUENCE sqCaKhamId
START WITH 1
INCREMENT BY 1
NOMAXVALUE;
-------------------- TRIGGER 
CREATE TRIGGER trgCaKhamId
BEFORE INSERT ON CAKHAM
FOR EACH ROW
BEGIN
  SELECT sqCaKhamId.NEXTVAL INTO :new.CAKHAM_ID FROM dual;
END;

--------------------- SEQUENCE FOR PHIEUDATLICH
CREATE SEQUENCE sqPhieuDatLichId
START WITH 1000
INCREMENT BY 1
NOMAXVALUE;
-------------------- TRIGGER 
CREATE TRIGGER trgPhieuDatLichId
BEFORE INSERT ON PHIEUDATLICH
FOR EACH ROW
BEGIN
  SELECT sqPhieuDatLichId.NEXTVAL INTO :new.PHIEUDATLICH_ID FROM dual;
END;
   
--------------------- SEQUENCE FOR PHIEUKETQUA
CREATE SEQUENCE sqPhieuKetQuaId
START WITH 1000
INCREMENT BY 1
NOMAXVALUE;
-------------------- TRIGGER 
CREATE TRIGGER trgPhieuKetQuaId
BEFORE INSERT ON PHIEUKETQUA
FOR EACH ROW
BEGIN
  SELECT sqPhieuKetQuaId.NEXTVAL INTO :new.PHIEUKETQUA_ID FROM dual;
END;

----------------- INSERT INTO TABLE---------------------
---------------------------------------------------------


----------- INSERT INTO TABLE BACSI
INSERT INTO BACSI(USERNAME,PASS_WORD,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI,CHUYENMON)
VALUES('huongnguyen','123456','Nguy?n Th? H??ng',TO_DATE('1994/02/08', 'yyyy/mm/dd'),0,'12345678','01234567890','huongnguyen@gmail.com','Thanh H�a','N?i t?ng h?p');
INSERT INTO BACSI(USERNAME,PASS_WORD,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI,CHUYENMON)
VALUES('lannguyen','123456','Nguy?n Th? Lan',TO_DATE('1992/11/22', 'yyyy/mm/dd'),0,'12345678','01234567890','lannguyen@gmail.com','Thanh H�a','N?i t?ng h?p');
INSERT INTO BACSI(USERNAME,PASS_WORD,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI,CHUYENMON)
VALUES('datnguyen','123456','Nguy?n V?n ??t',TO_DATE('1994/02/08', 'yyyy/mm/dd'),1,'12345678','01234567890','datnguyen@gmail.com','H� N?i','Ngo?i t?ng h?p');
INSERT INTO BACSI(USERNAME,PASS_WORD,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI,CHUYENMON)
VALUES('thuanpham','123456','Ph?m H?ng Thu?n',TO_DATE('1994/02/08', 'yyyy/mm/dd'),1,'12345678','01234567890','thuanpham@gmail.com','Thanh H�a','Ngo?i t?ng h?p');
INSERT INTO BACSI(USERNAME,PASS_WORD,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI,CHUYENMON)
VALUES('namle','123456','L� V?n Nam',TO_DATE('1994/02/08', 'yyyy/mm/dd'),1,'12345678','01234567890','namle@gmail.com','H� N?i','X�t nghi?m');
INSERT INTO BACSI(USERNAME,PASS_WORD,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI,CHUYENMON)
VALUES('linhphan','123456','Phan V? Tu?n Linh',TO_DATE('1994/02/08', 'yyyy/mm/dd'),1,'12345678','01234567890','linhphan@gmail.com','H� N?i','X�t nghi?m');

---------- INSERT INTO TABLE BENHNHAN
INSERT INTO BENHNHAN(HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI) VALUES('L� Th? H?ng',TO_DATE('2016/02/08', 'yyyy/mm/dd'),0,'123456','01234567890','hongle@gmail.com','H� N?i');
INSERT INTO BENHNHAN(HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI) VALUES('L� V?n Ng?c',TO_DATE('2016/02/08', 'yyyy/mm/dd'),1,'123457','01234567890','ngocle@gmail.com','Thanh H�a');
INSERT INTO BENHNHAN(HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI) VALUES('Tr?n H?ng Ng?c',TO_DATE('2016/02/08', 'yyyy/mm/dd'),1,'123458','01234567890','hongngoc@gmail.com','Nam ??nh');
INSERT INTO BENHNHAN(HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI) VALUES('Nguy?n V?n Nam',TO_DATE('2016/02/08', 'yyyy/mm/dd'),1,'123456','01234567890','nguyenvannam@gmail.com','H� N?i');
INSERT INTO BENHNHAN(HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI) VALUES('Nguy?n ?�nh H�ng',TO_DATE('2016/02/08', 'yyyy/mm/dd'),1,'123457','01234567890','nguyendinhhung@gmail.com','Thanh H�a');
INSERT INTO BENHNHAN(HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI) VALUES('Tr?n V?n H�ng',TO_DATE('2016/02/08', 'yyyy/mm/dd'),1,'123458','01234567890','tranvanhung@gmail.com','Nam ??nh');
INSERT INTO BENHNHAN(HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI) VALUES('Nguy?n Nam C??ng',TO_DATE('2016/02/08', 'yyyy/mm/dd'),1,'123459','01234567890','nguyennamcuong@gmail.com','H� N?i');
INSERT INTO BENHNHAN(HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI) VALUES('T?ng V?n Ng?c',TO_DATE('2016/02/08', 'yyyy/mm/dd'),1,'123451','01234567890','tongvanngoc@gmail.com','H� N?i');
INSERT INTO BENHNHAN(HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI) VALUES('Nguy?n Th? D??ng',TO_DATE('2016/02/08', 'yyyy/mm/dd'),0,'123459','01234567890','nguyenthiduong@gmail.com','H� N?i');
INSERT INTO BENHNHAN(HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI) VALUES('T?ng Th? Ng?c',TO_DATE('2016/02/08', 'yyyy/mm/dd'),0,'123451','01234567890','tongthingoc@gmail.com','H� N?i');

--------------- INSERT INTO TABLE DICHVU
INSERT INTO DICHVU(DICHVU_ID,TENDICHVU,MOTA,THOIGIANKHAM,CHIPHI,TRANGTHAI) VALUES('DV001','X�t nghi?m','X�t nghi?m m�u v� c�c d?ch ch?t trong c? th? cho s?n ph?',45,1000000,1);
INSERT INTO DICHVU(DICHVU_ID,TENDICHVU,MOTA,THOIGIANKHAM,CHIPHI,TRANGTHAI) VALUES('DV002','N?i t?ng h?p','Ki?m tra s?c kh?e cho s?n ph? v� thai nhi',30,500000,1);
INSERT INTO DICHVU(DICHVU_ID,TENDICHVU,MOTA,THOIGIANKHAM,CHIPHI,TRANGTHAI) VALUES('DV003','Ngo?i t?ng h?p','Ki?m tra t�nh h�nh s?c kh?e chung cho s?n ph? v� thai nhi',20,300000,1);

------------------- INSERT INTO TABLE PHONGKHAM
INSERT INTO PHONGKHAM(PHONGKHAM_ID,DICHVU_ID,TENPHONGKHAM,DIADIEM,TRANGTHAI) VALUES('XN001','DV001','X�t nghi?m s? 1','Ph�nng s? 1, T?ng 1',1);
INSERT INTO PHONGKHAM(PHONGKHAM_ID,DICHVU_ID,TENPHONGKHAM,DIADIEM,TRANGTHAI) VALUES('NTH01','DV002','N?i t?ng h?p s? 1','Ph�ng s? 1, T?ng 2',1);
INSERT INTO PHONGKHAM(PHONGKHAM_ID,DICHVU_ID,TENPHONGKHAM,DIADIEM,TRANGTHAI) VALUES('NGTH01','DV003','Ngo?i t?ng h?p s? 1','Ph�ng s? 1, T?ng 3',1);

--------------- INSERT INTO TABLE LICHBIEU

INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('XN001',100004,TO_DATE('2016/06/01', 'yyyy/mm/dd'),0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('XN001',100004,TO_DATE('2016/06/01', 'yyyy/mm/dd'),1,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('XN001',100004,TO_DATE('2016/06/02', 'yyyy/mm/dd'),0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('XN001',100004,TO_DATE('2016/06/02', 'yyyy/mm/dd'),1,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('XN001',100005,TO_DATE('2016/06/03', 'yyyy/mm/dd'),0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('XN001',100005,TO_DATE('2016/06/03', 'yyyy/mm/dd'),1,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('XN001',100005,TO_DATE('2016/06/04', 'yyyy/mm/dd'),0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('XN001',100005,TO_DATE('2016/06/04', 'yyyy/mm/dd'),1,1);

INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('NTH01',100000,TO_DATE('2016/06/01', 'yyyy/mm/dd'),0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('NTH01',100000,TO_DATE('2016/06/01', 'yyyy/mm/dd'),1,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('NTH01',100000,TO_DATE('2016/06/02', 'yyyy/mm/dd'),0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('NTH01',100000,TO_DATE('2016/06/02', 'yyyy/mm/dd'),1,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('NTH01',100001,TO_DATE('2016/06/03', 'yyyy/mm/dd'),0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('NTH01',100001,TO_DATE('2016/06/03', 'yyyy/mm/dd'),1,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('NTH01',100001,TO_DATE('2016/06/04', 'yyyy/mm/dd'),0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('NTH01',100001,TO_DATE('2016/06/04', 'yyyy/mm/dd'),1,1);

INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('NGTH01',100002,TO_DATE('2016/06/01', 'yyyy/mm/dd'),0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('NGTH01',100002,TO_DATE('2016/06/01', 'yyyy/mm/dd'),1,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('NGTH01',100002,TO_DATE('2016/06/02', 'yyyy/mm/dd'),0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('NGTH01',100002,TO_DATE('2016/06/02', 'yyyy/mm/dd'),1,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('NGTH01',100003,TO_DATE('2016/06/03', 'yyyy/mm/dd'),0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('NGTH01',100003,TO_DATE('2016/06/03', 'yyyy/mm/dd'),1,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('NGTH01',100003,TO_DATE('2016/06/04', 'yyyy/mm/dd'),0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES('NGTH01',100003,TO_DATE('2016/06/04', 'yyyy/mm/dd'),1,1);

--------------- INSERT INTO TABLE CAKHAM
INSERT INTO CAKHAM(LICHBIEU_ID,CA,THOIGIANBATDAU,THOIGIANKETTHUC,TRANGTHAI)
VALUES(1,1,TO_TIMESTAMP('2016/06/01 08:00:00', 'YYYY/MM/DD HH:MI:SS'),TO_TIMESTAMP('2016/06/01 08:30:00','YYYY/MM/DD HH:MI:SS'),0);
INSERT INTO CAKHAM(LICHBIEU_ID,CA,THOIGIANBATDAU,THOIGIANKETTHUC,TRANGTHAI)
VALUES(1,2,TO_TIMESTAMP('2016/06/01 08:30:00', 'YYYY/MM/DD HH:MI:SS'),TO_TIMESTAMP('2016/06/01 09:00:00','YYYY/MM/DD HH:MI:SS'),0);
INSERT INTO CAKHAM(LICHBIEU_ID,CA,THOIGIANBATDAU,THOIGIANKETTHUC,TRANGTHAI)
VALUES(1,3,TO_TIMESTAMP('2016/06/01 09:00:00', 'YYYY/MM/DD HH:MI:SS'),TO_TIMESTAMP('2016/06/01 09:30:00','YYYY/MM/DD HH:MI:SS'),0);

INSERT INTO CAKHAM(LICHBIEU_ID,CA,THOIGIANBATDAU,THOIGIANKETTHUC,TRANGTHAI)
VALUES(9,1,TO_TIMESTAMP('2016/06/01 08:00:00', 'YYYY/MM/DD HH:MI:SS'),TO_TIMESTAMP('2016/06/01 08:20:00','YYYY/MM/DD HH:MI:SS'),0);
INSERT INTO CAKHAM(LICHBIEU_ID,CA,THOIGIANBATDAU,THOIGIANKETTHUC,TRANGTHAI)
VALUES(9,2,TO_TIMESTAMP('2016/06/01 08:20:00', 'YYYY/MM/DD HH:MI:SS'),TO_TIMESTAMP('2016/06/01 08:40:00','YYYY/MM/DD HH:MI:SS'),0);
INSERT INTO CAKHAM(LICHBIEU_ID,CA,THOIGIANBATDAU,THOIGIANKETTHUC,TRANGTHAI)
VALUES(9,3,TO_TIMESTAMP('2016/06/01 08:40:00', 'YYYY/MM/DD HH:MI:SS'),TO_TIMESTAMP('2016/06/01 09:00:00','YYYY/MM/DD HH:MI:SS'),0);

INSERT INTO CAKHAM(LICHBIEU_ID,CA,THOIGIANBATDAU,THOIGIANKETTHUC,TRANGTHAI)
VALUES(17,1,TO_TIMESTAMP('2016/06/01 08:00:00', 'YYYY/MM/DD HH:MI:SS'),TO_TIMESTAMP('2016/06/01 08:45:00','YYYY/MM/DD HH:MI:SS'),0);
INSERT INTO CAKHAM(LICHBIEU_ID,CA,THOIGIANBATDAU,THOIGIANKETTHUC,TRANGTHAI)
VALUES(17,2,TO_TIMESTAMP('2016/06/01 08:45:00', 'YYYY/MM/DD HH:MI:SS'),TO_TIMESTAMP('2016/06/01 09:30:00','YYYY/MM/DD HH:MI:SS'),0);
INSERT INTO CAKHAM(LICHBIEU_ID,CA,THOIGIANBATDAU,THOIGIANKETTHUC,TRANGTHAI)
VALUES(17,3,TO_TIMESTAMP('2016/06/01 09:30:00', 'YYYY/MM/DD HH:MI:SS'),TO_TIMESTAMP('2016/06/01 10:15:00','YYYY/MM/DD HH:MI:SS'),0);

 
------------- INSERT INTO TABLE PHIEUDATLICH
INSERT INTO PHIEUDATLICH(PHONGKHAM_ID,BENHNHAN_ID,CAKHAM_ID,PHIDATLICH,CHIPHI,HINHTHUCTHANHTOAN,TRANGTHAI)
VALUES('NTH01',100000,1,0,500000,'Tr?c ti?p',1);

INSERT INTO PHIEUDATLICH(PHONGKHAM_ID,BENHNHAN_ID,CAKHAM_ID,PHIDATLICH,CHIPHI,HINHTHUCTHANHTOAN,TRANGTHAI)
VALUES('NGTH01',100001,4,0,300000,'Tr?c ti?p',0);

INSERT INTO PHIEUDATLICH(PHONGKHAM_ID,BENHNHAN_ID,CAKHAM_ID,PHIDATLICH,CHIPHI,HINHTHUCTHANHTOAN,TRANGTHAI)
VALUES('XN001',100002,7,0,1000000,'Tr?c ti?p',0);



-------------- INSERT INTO TABLE PHIEUKETQUA
INSERT INTO PHIEUKETQUA(PHIEUDATLICH_ID,LYDOKHAM,TIENSUBENH,QUATRINHBENHLY,TOANTHAN,CACBOPHAN,MACH,NHIETDO,HUYETAP,NOIKHOA,NGOAIKHOA,SANPHUKHOA,XETNGHIEMMAU,XETNGHIEMNUOCTIEU,TOMTATKETQUA,HUONGXULY,TRANGTHAI)
VALUES(1000,'?au ? b?ng','Kh�ng c�','Kh�ng c�','B�nh th??ng','B�nh th??ng','60 l?n/ph�t','37,5 ?? C','75/120mmHg','B�nh th??ng','B�nh th??ng','Do ch?n ??ng m?nh','Kh�ng','Kh�ng','Do ch?n ??ng thai d?n t?i ?au b?ng','Gi? thai trong tr?ng th�i ?n ??nh, kh�ng n�n v?n ??ng qu� m?nh',1);
   


  