--------------------------------------------------------
--  DDL for Table BACSI
--------------------------------------------------------

  CREATE TABLE "BACSI" 
   (	
   BACSI_ID NUMBER(10,0), 
	 HOTEN VARCHAR2(50), 
	 NGAYSINH DATE, 
	 GIOITINH NUMBER(1,0), 
	 CMND VARCHAR2(9), 
	 SDT VARCHAR2(11), 
	 EMAIL VARCHAR2(50), 
	 DIACHI VARCHAR2(200), 
	 CHUYENMON VARCHAR2(50)
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
	 "CMND" VARCHAR2(9), 
	 "SDT" VARCHAR2(11), 
   "EMAIL" VARCHAR2(50), 
	 "DIACHI" VARCHAR2(200)
   ) 
--------------------------------------------------------
--  DDL for Table CALAM
--------------------------------------------------------

  CREATE TABLE "CALAM" 
   (	"LICHBIEU_ID" NUMBER(10,0), 
	"PHIEUDATLICH_ID" NUMBER(10,0), 
	"CA" NUMBER(3,0)
   ) 
--------------------------------------------------------
--  DDL for Table DICHVU
--------------------------------------------------------

  CREATE TABLE "DICHVU" 
   (	"DICHVU_ID" NUMBER(10,0), 
	"TENDICHVU" VARCHAR2(50), 
	"MOTA" VARCHAR2(200), 
	"THOIGIANKHAM" NUMBER(3,0), 
	"TRANGTHAI" NUMBER(1,0)
   )
   
   ALTER TABLE DICHVU ADD CHIPHI FLOAT;
   
   
--------------------------------------------------------
--  DDL for Table PHIEUDATLICH
--------------------------------------------------------

  CREATE TABLE "PHIEUDATLICH" 
   (	"PHIEUDATLICH_ID" NUMBER(10,0), 
	"PHONGKHAM_ID" NUMBER(10,0), 
	"BENHNHAN_ID" NUMBER(10,0), 
	"THOIGIANBATDAU" TIMESTAMP, 
	"THOIGIANKETTHUC" TIMESTAMP, 
	"CHIPHI" FLOAT(126) DEFAULT 0, 
	"KETLUAN" VARCHAR2(500), 
	"TRANGTHAI" NUMBER(1,0) DEFAULT 1
   ) 
   
   ALTER TABLE PHIEUDATLICH ADD PHIDATLICH FLOAT(126);
   
--   alter table 
--   PHIEUDATLICH
--    modify 
--    ( 
--      THOIGIANKETTHUC   TIMESTAMP
--    );
--------------------------------------------------------
--  DDL for Table PHONGKHAM
--------------------------------------------------------

  CREATE TABLE "PHONGKHAM" 
   (	"PHONGKHAM_ID" NUMBER(10,0), 
	"DICHVU_ID" NUMBER(10,0), 
	"TENPHONGKHAM" VARCHAR2(50), 
	"DIADIEM" VARCHAR2(200), 
	"TRANGTHAI" NUMBER(1,0)
   )
--------------------------------------------------------
--  DDL for Table TAIKHOAN
--------------------------------------------------------

  CREATE TABLE "TAIKHOAN" 
   (	"TAIKHOAN_ID" NUMBER(10,0), 
	"TENDANGNHAP" VARCHAR2(20), 
	"MATKHAU" VARCHAR2(20), 
	"QUYEN" NUMBER(1,0), 
	"TRANGTHAI" NUMBER(1,0)
   )
--------------------------------------------------------
--  DDL for Table THUNGAN
--------------------------------------------------------

  CREATE TABLE "THUNGAN" 
   (	"THUNGAN_ID" NUMBER(10,0), 
	"HOTEN" VARCHAR2(50), 
	"NGAYSINH" DATE, 
	"GIOITINH" NUMBER(1,0), 
	"SDT" VARCHAR2(11), 
	"EMAIL" VARCHAR2(50), 
	"DIACHI" VARCHAR2(200)
   ) 
   
   CREATE TABLE "LICHBIEU"
   (
      "LICHBIEU_ID" NUMBER(10,0),
      "PHONGKHAM_ID" NUMBER(10,0),
      "BACSI_ID" NUMBER(10,0),
      "NGAYLAM" DATE,
      "BUOILAM" NUMBER(1,0),
      "TRANGTHAI" NUMBER(1,0)
   )
   
--------------------------------------------------------
--  Constraints for Table PHONGKHAM
--------------------------------------------------------

  ALTER TABLE "PHONGKHAM" ADD CONSTRAINT "PHONGKHAM_PK" PRIMARY KEY ("PHONGKHAM_ID");
 
  ALTER TABLE "PHONGKHAM" MODIFY ("PHONGKHAM_ID" NOT NULL ENABLE);
 
  ALTER TABLE "PHONGKHAM" MODIFY ("DICHVU_ID" NOT NULL ENABLE);
 
  ALTER TABLE "PHONGKHAM" MODIFY ("TENPHONGKHAM" NOT NULL ENABLE);
  
  
-------------------------------------------------------
-- Constraint for table LICHBIEU
--------------------------------------------------------
ALTER TABLE "LICHBIEU" ADD CONSTRAINT "LICHBIEU_PK" PRIMARY KEY ("LICHBIEU_ID");

--------------------------------------------------------
--  Constraints for Table BACSI
--------------------------------------------------------

  ALTER TABLE "BACSI" ADD CONSTRAINT "BACSI_PK" PRIMARY KEY ("BACSI_ID");

--------------------------------------------------------
--  Constraints for Table DICHVU
--------------------------------------------------------

  ALTER TABLE "DICHVU" ADD CONSTRAINT "DICHVU_PK" PRIMARY KEY ("DICHVU_ID");

 
  ALTER TABLE "DICHVU" MODIFY ("DICHVU_ID" NOT NULL ENABLE);


--------------------------------------------------------
--  Constraints for Table CALAM
--------------------------------------------------------

  ALTER TABLE "CALAM" ADD CONSTRAINT "CALAM_PK" PRIMARY KEY (LICHBIEU_ID,PHIEUDATLICH_ID);
  
  ALTER TABLE CALAM
  DROP CONSTRAINT CALAM_PK;

  ALTER TABLE "CALAM" MODIFY ("LICHBIEU_ID" NOT NULL ENABLE);

--------------------------------------------------------
--  Constraints for Table PHIEUDATLICH
--------------------------------------------------------

  ALTER TABLE "PHIEUDATLICH" ADD CONSTRAINT "PHIEUDATLICH_PK" PRIMARY KEY ("PHIEUDATLICH_ID");

  ALTER TABLE "PHIEUDATLICH" MODIFY ("PHIEUDATLICH_ID" NOT NULL ENABLE);
 
  ALTER TABLE "PHIEUDATLICH" MODIFY ("PHONGKHAM_ID" NOT NULL ENABLE);
 
  ALTER TABLE "PHIEUDATLICH" MODIFY ("BENHNHAN_ID" NOT NULL ENABLE);

--------------------------------------------------------
--  Constraints for Table BENHNHAN
--------------------------------------------------------

  ALTER TABLE "BENHNHAN" ADD CONSTRAINT "BENHNHAN_PK" PRIMARY KEY ("BENHNHAN_ID");

  ALTER TABLE "BENHNHAN" MODIFY ("BENHNHAN_ID" NOT NULL ENABLE);
 
  ALTER TABLE "BENHNHAN" MODIFY ("HOTEN" NOT NULL ENABLE);

--------------------------------------------------------
--  Constraints for Table THUNGAN
--------------------------------------------------------

  ALTER TABLE "THUNGAN" MODIFY ("THUNGAN_ID" NOT NULL ENABLE);
 
  ALTER TABLE "THUNGAN" ADD CONSTRAINT "THUNGAN_PK" PRIMARY KEY ("THUNGAN_ID");
 --------------------------------------------------------
--  Constraints for Table TAIKHOAN
--------------------------------------------------------

  ALTER TABLE "TAIKHOAN" MODIFY ("TAIKHOAN_ID" NOT NULL ENABLE);
 
  ALTER TABLE "TAIKHOAN" ADD CONSTRAINT "TAIKHOAN_PK" PRIMARY KEY ("TAIKHOAN_ID");
--------------------------------------------------------
--  Constraints for Table LICHBIEU
--------------------------------------------------------

  ALTER TABLE "LICHBIEU" ADD CONSTRAINT "LICHBIEU_PK" PRIMARY KEY ("LICHBIEU_ID");

  ALTER TABLE "LICHBIEU" MODIFY ("LICHBIEU_ID" NOT NULL ENABLE);
 
  ALTER TABLE "LICHBIEU" MODIFY ("PHONGKHAM_ID" NOT NULL ENABLE);
 
  ALTER TABLE "LICHBIEU" MODIFY ("BACSI_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table REPCAT$_PRIORITY_GROUP
--------------------------------------------------------
--------------------------------------------------------
--  Ref Constraints for Table BACSI
--------------------------------------------------------

--  ALTER TABLE "TAIKHOAN" ADD CONSTRAINT "TAIKHOAN_BACSI_FK1" FOREIGN KEY ("TAIKHOAN_ID")
--	  REFERENCES "BACSI" ("BACSI_ID") ENABLE;
--    
--    ALTER TABLE "TAIKHOAN" ADD CONSTRAINT "TAIKHOAN_BENHNHAN_FK1" FOREIGN KEY ("TAIKHOAN_ID")
--	  REFERENCES "BENHNHAN" ("BENHNHAN_ID") ENABLE;
--    
--    ALTER TABLE "TAIKHOAN" ADD CONSTRAINT "TAIKHOAN_THUNGAN_FK1" FOREIGN KEY ("TAIKHOAN_ID")
--	  REFERENCES "THUNGAN" ("THUNGAN_ID") ENABLE;
--    
--  Alter table BACSI
--  drop CONSTRAINT  BACSI_TAIKHOAN_FK1;
--  
--   Alter table BENHNHAN
--  drop CONSTRAINT  BENHNHAN_TAIKHOAN_FK1;
--  
--   Alter table THUNGAN
--  drop CONSTRAINT  THUNGAN_TAIKHOAN_FK1;

Alter table TAIKHOAN DROP CONSTRAINT TAIKHOAN_BENHNHAN_FK1;

 ALTER TABLE "BACSI" ADD CONSTRAINT "BACSI_TAIKHOAN_FK1" FOREIGN KEY ("BACSI_ID")
	  REFERENCES "TAIKHOAN" ("TAIKHOAN_ID") ENABLE;


--------------------------------------------------------
--  Ref Constraints for Table BENHNHAN
--------------------------------------------------------

  ALTER TABLE "BENHNHAN" ADD CONSTRAINT "BENHNHAN_TAIKHOAN_FK1" FOREIGN KEY ("BENHNHAN_ID")
	  REFERENCES "TAIKHOAN" ("TAIKHOAN_ID") ENABLE;
    
     ALTER TABLE "THUNGAN" ADD CONSTRAINT "THUNGAN_TAIKHOAN_FK1" FOREIGN KEY ("THUNGAN_ID")
	  REFERENCES "TAIKHOAN" ("TAIKHOAN_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table CALAM
--------------------------------------------------------

  ALTER TABLE "CALAM" ADD CONSTRAINT "CALAM_LICHBIEU_FK1" FOREIGN KEY ("LICHBIEU_ID")
	  REFERENCES "LICHBIEU" ("LICHBIEU_ID") ENABLE;
    
      ALTER TABLE "CALAM" ADD CONSTRAINT "CALAM_PHIEUDATLICH_FK1" FOREIGN KEY ("PHIEUDATLICH_ID")
	  REFERENCES "PHIEUDATLICH" ("PHIEUDATLICH_ID") ENABLE;

--------------------------------------------------------
--  Ref Constraints for Table LICHBIEU
--------------------------------------------------------

  ALTER TABLE "LICHBIEU" ADD CONSTRAINT "LICHBIEU_BACSI_FK1" FOREIGN KEY ("BACSI_ID")
	  REFERENCES "BACSI" ("BACSI_ID") ENABLE;
 
  ALTER TABLE "LICHBIEU" ADD CONSTRAINT "LICHBIEU_PHONGKHAM_FK1" FOREIGN KEY ("PHONGKHAM_ID")
	  REFERENCES "PHONGKHAM" ("PHONGKHAM_ID") ENABLE;


--------------------------------------------------------
--  Ref Constraints for Table PHIEUDATLICH
--------------------------------------------------------

  ALTER TABLE "PHIEUDATLICH" ADD CONSTRAINT "PHIEUDATLICH_BENHNHAN_FK1" FOREIGN KEY ("BENHNHAN_ID")
	  REFERENCES "BENHNHAN" ("BENHNHAN_ID") ENABLE;
 
  ALTER TABLE "PHIEUDATLICH" ADD CONSTRAINT "PHIEUDATLICH_PHONGKHAM_FK1" FOREIGN KEY ("PHONGKHAM_ID")
	  REFERENCES "PHONGKHAM" ("PHONGKHAM_ID") ENABLE;
    
--    ALTER TABLE PHIEUDATLICH
--    DROP CONSTRAINT PHIEUDATLICH_PHIEUDATLICH_FK1;
--------------------------------------------------------
--  Ref Constraints for Table PHONGKHAM
--------------------------------------------------------

  ALTER TABLE "PHONGKHAM" ADD CONSTRAINT "PHONGKHAM_DICHVU_FK1" FOREIGN KEY ("DICHVU_ID")
	  REFERENCES "DICHVU" ("DICHVU_ID") ENABLE;

--------------------------------------------------------
--  Ref Constraints for Table THUNGAN
--------------------------------------------------------

  ALTER TABLE "THUNGAN" ADD CONSTRAINT "THUNGAN_TAIKHOAN_FK1" FOREIGN KEY ("THUNGAN_ID")
	  REFERENCES "TAIKHOAN" ("TAIKHOAN_ID") ENABLE;
    
----------------- Tao ma tu tang vao cac bang

-- sequence for BACSI, BENHNHAN, THUNGAN (dung chung sequence thi cac table nay khong bi trung id voi nhau)


create sequence taikhoanid
start with 1 
increment by 1 
nomaxvalue; 

----- trigger ma tu tang cho table bacsi

--create trigger genBacSiid
--before insert on BACSI
--for each row
--begin
--	select taikhoanid.nextval into :new.BACSI_ID from dual;
--end;
--
--drop trigger genBenhNhanid;

-- drop trigger trig_id_bacsi;

--create user huong IDENTIFIED BY huong;
--
--grant create session, create table to huong;

-- drop trigger trig_id_bacsi;



----- trigger ma tu tang cho table benhnhan
--create trigger genBenhNhanId
--before insert on BENHNHAN
--for each row
--begin
--	select taikhoanid.nextval into :new.BENHNHAN_ID from dual;
--end;

----- trigger ma tu tang cho table thungan
--create trigger genThuNganId
--before insert on THUNGAN
--for each row
--begin
--	select taikhoanid.nextval into :new.THUNGANID from dual;
--end;


-- sequence for DICHVU
create sequence dichVuId
start with 1
increment by 1
nomaxvalue;

----- trigger ma tu tang cho table Dichvu
create trigger genDichVuId
before insert on DICHVU
for each row
begin
  select dichVuId.nextval into :new.DICHVU_ID from dual;
end;

--sequence for LICHBIEU
create sequence lichBieuId
start with 1
increment by 1
nomaxvalue;

----- trigger ma tu tang cho table LichBieu
create trigger genLichBieuId
before insert on LICHBIEU
for each row
begin
  select lichBieuId.nextval into :new.LICHBIEU_ID from dual;
end;

-- sequence for PHONGKHAM
create sequence phongKhamId
start with 1
increment by 1
nomaxvalue;

----- trigger ma tu tang cho table phongkham
create trigger genPhongKhamId
before insert on PHONGKHAM
for each row
begin
  select phongKhamId.nextval into :new.PHONGKHAM_ID from dual;
end;

-- sequence for PHIEUDATLICH
create sequence phieuDatLichId
start with 1
increment by 1
nomaxvalue;

----- trigger ma tu tang cho table PhieuDatLich
create trigger genPhieuDatLichId
before insert on PHIEUDATLICH
for each row
begin
  select phieuDatLichId.nextval into :new.PHIEUDATLICH_ID from dual;
end;

--Trigger genidtaikhoan
create sequence accountid
start with 1
increment by 1
nomaxvalue;


create trigger genaccountid
before insert on TAIKHOAN
for each row
begin
  select accountid.nextval into :new.TAIKHOAN_ID from dual;
end;


---------------------------- Insert data for table taikhoan

---- TAIKHOAN for BENHNHAN:1

INSERT INTO TAIKHOAN(TENDANGNHAP,MATKHAU,QUYEN,TRANGTHAI) VALUES('nguyenvannam','12345678',1,1);  
INSERT INTO TAIKHOAN(TENDANGNHAP,MATKHAU,QUYEN,TRANGTHAI) VALUES('nguyendinhhung','12345678',1,1);
INSERT INTO TAIKHOAN(TENDANGNHAP,MATKHAU,QUYEN,TRANGTHAI) VALUES('tranvanhung','12345678',1,1);
INSERT INTO TAIKHOAN(TENDANGNHAP,MATKHAU,QUYEN,TRANGTHAI) VALUES('nguyennamcuong','12345678',1,1);  
INSERT INTO TAIKHOAN(TENDANGNHAP,MATKHAU,QUYEN,TRANGTHAI) VALUES('tongvanngoc','12345678',1,1);

------- TAIKHOAN for BACSI:2

INSERT INTO TAIKHOAN(TENDANGNHAP,MATKHAU,QUYEN,TRANGTHAI) VALUES('nguyenthihuong','12345678',2,1);
INSERT INTO TAIKHOAN(TENDANGNHAP,MATKHAU,QUYEN,TRANGTHAI) VALUES('nguyenvandat','12345678',2,1);
INSERT INTO TAIKHOAN(TENDANGNHAP,MATKHAU,QUYEN,TRANGTHAI) VALUES('lethiha','12345678',2,1);
INSERT INTO TAIKHOAN(TENDANGNHAP,MATKHAU,QUYEN,TRANGTHAI) VALUES('nguyenvanthuan','12345678',2,1);
INSERT INTO TAIKHOAN(TENDANGNHAP,MATKHAU,QUYEN,TRANGTHAI) VALUES('truongthihien','12345678',2,1);

------- TAIKHOAN for THUNGAN:3

INSERT INTO TAIKHOAN(TENDANGNHAP,MATKHAU,QUYEN,TRANGTHAI) VALUES('nguyenthilan','12345678',3,1);
INSERT INTO TAIKHOAN(TENDANGNHAP,MATKHAU,QUYEN,TRANGTHAI) VALUES('nguyenthihong','12345678',3,1);

--------------- Insert data for BACSI

INSERT INTO BACSI(BACSI_ID,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI,CHUYENMON) VALUES(9,'Nguyen Thi Huong','08-feb-1994',0,'1234567','01234567890','nguyenthihuong@gmail.com','Thanh Hoa','Khoa phau thuat');
INSERT INTO BACSI(BACSI_ID,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI,CHUYENMON) VALUES(10,'Nguyen VanDat','08-feb-1994',1,'1234567','01234567890','nguyenvandat@gmail.com','Ha Noi','Kham benh');
INSERT INTO BACSI(BACSI_ID,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI,CHUYENMON) VALUES(11,'Le Thi Ha','08-feb-1994',0,'1234567','01234567890','lethiha@gmail.com','Ha Tinh','Noi tong hop');
INSERT INTO BACSI(BACSI_ID,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI,CHUYENMON) VALUES(12,'Nguyen Van Thuan','08-feb-1994',1,'1234567','01234567890','nguyenvanthuan@gmail.com','Thanh Hoa','Ngoai tong hop');
INSERT INTO BACSI(BACSI_ID,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI,CHUYENMON) VALUES(13,'Nguyen Thi Lan','08-feb-1994',0,'1234567','01234567890','nguyenthilan@gmail.com','Thanh Hoa','Xet nghiem');


---------------- Insert data for ThuNgan
INSERT INTO THUNGAN(THUNGAN_ID,HOTEN,NGAYSINH,GIOITINH,SDT,EMAIL,DIACHI) VALUES(14,'Nguyen Thi Lan','08-feb-1994',0,'01234567890','nguyenthilan@gmail.com','Thanh Hoa');
INSERT INTO THUNGAN(THUNGAN_ID,HOTEN,NGAYSINH,GIOITINH,SDT,EMAIL,DIACHI) VALUES(15,'Nguyen Thi Hong','08-feb-1994',0,'01234567890','nguyenthilan@gmail.com','Thanh Hoa');


SELECT * FROM BACSI;

SELECT * FROM TAIKHOAN;


--------------------------------------------------------
-- Insert data into Table
select * from taikhoan
---------------------------------------------------------
-- Insert data into table BENHNHAN
INSERT INTO BENHNHAN(BENHNHAN_ID,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI) VALUES(1,'Bluemoon','08-feb-2016',1,'123456','01234567890','sunnymarch@gmail.com','Ha Noi');
INSERT INTO BENHNHAN(BENHNHAN_ID,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI) VALUES(2,'Bluemoon1','08-feb-2016',1,'123457','01234567890','sunnymarch@gmail.com','Thanh Hoa');
INSERT INTO BENHNHAN(BENHNHAN_ID,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI) VALUES(3,'Bluemoon2','08-feb-2016',1,'123458','01234567890','sunnymarch@gmail.com','Nam Dinh');
INSERT INTO BENHNHAN(BENHNHAN_ID,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI) VALUES(4,'Nguyen Van Nam','08-feb-2016',1,'123456','01234567890','nguyenvannam@gmail.com','Ha Noi');
INSERT INTO BENHNHAN(BENHNHAN_ID,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI) VALUES(5,'Nguyen Dinh Hung','08-feb-2016',1,'123457','01234567890','nguyendinhhung@gmail.com','Thanh Hoa');
INSERT INTO BENHNHAN(BENHNHAN_ID,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI) VALUES(6,'Tran Van Hung','08-feb-2016',1,'123458','01234567890','tranvanhung@gmail.com','Nam Dinh');
INSERT INTO BENHNHAN(BENHNHAN_ID,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI) VALUES(7,'Nguyen Nam Cuong','08-feb-2016',1,'123459','01234567890','nguyennamcuong@gmail.com','Ha Noi');
INSERT INTO BENHNHAN(BENHNHAN_ID,HOTEN,NGAYSINH,GIOITINH,CMND,SDT,EMAIL,DIACHI) VALUES(8,'Tong Van Ngoc','08-feb-2016',1,'123451','01234567890','tongvanngoc@gmail.com','Ha Noi');


-- Insert data into table DICHVU
INSERT INTO DICHVU(TENDICHVU,MOTA,THOIGIANKHAM,TRANGTHAI) VALUES('Xét nghi?m','Xét nghi?m máu và các d?ch ch?t trong c? th? cho s?n ph?',45,1);
INSERT INTO DICHVU(TENDICHVU,MOTA,THOIGIANKHAM,TRANGTHAI) VALUES('Khám s?n khoa','Ki?m tra s?c kh?e cho s?n ph? và thai nhi',30,1);
INSERT INTO DICHVU(TENDICHVU,MOTA,THOIGIANKHAM,TRANGTHAI) VALUES('Ngo?i t?ng h?p','Ki?m tra tình hình s?c kh?e chung cho s?n ph? và thai nhi',20,1);

--- Insert data into table PHONGKHAM
INSERT INTO PHONGKHAM(DICHVU_ID,TENPHONGKHAM,DIADIEM,TRANGTHAI) VALUES(1,'Xét nghi?m s? 1','Phòng s? 1, T?ng 2',1);
INSERT INTO PHONGKHAM(DICHVU_ID,TENPHONGKHAM,DIADIEM,TRANGTHAI) VALUES(2,'Khám s?n khoa s? 1','Phòng s? 2, T?ng 2',1);
INSERT INTO PHONGKHAM(DICHVU_ID,TENPHONGKHAM,DIADIEM,TRANGTHAI) VALUES(3,'Ngo?i t?ng h?p s? 1','Phòng s? 3, T?ng 2',1);

---- Insert data into table LICHBIEU
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(1,13,'01-june-2016',0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(1,13,'01-june-2016',1,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(1,13,'02-june-2016',0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(1,13,'02-june-2016',1,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(1,13,'03-june-2016',0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(1,13,'03-june-2016',1,1);

INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(2,10,'01-june-2016',0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(2,10,'01-june-2016',1,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(2,10,'02-june-2016',0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(2,10,'02-june-2016',1,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(2,11,'03-june-2016',0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(2,11,'03-june-2016',1,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(2,11,'04-june-2016',0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(2,11,'04-june-2016',1,1);

INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(3,9,'01-june-2016',0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(3,9,'01-june-2016',1,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(3,9,'02-june-2016',0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(3,9,'02-june-2016',1,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(3,12,'03-june-2016',0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(3,12,'03-june-2016',1,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(3,12,'04-june-2016',0,1);
INSERT INTO LICHBIEU(PHONGKHAM_ID,BACSI_ID,NGAYLAM,BUOILAM,TRANGTHAI) VALUES(2,12,'04-june-2016',1,1);


--- Insert data into table PHIEUDATLICH
INSERT INTO PHIEUDATLICH(PHONGKHAM_ID,BENHNHAN_ID,THOIGIANBATDAU,THOIGIANKETTHUC,CHIPHI,KETLUAN,TRANGTHAI,PHIDATLICH)
VALUES(1,1,'01-JUN-16 08.00.00 AM','01-JUN-16 08.45.00 AM',1000000,'Các d?ch ch?t và s?c t? ?n ??nh. C?n duy trì ch? ?? ?n u?ng h?p lý',1,100000);
INSERT INTO PHIEUDATLICH(PHONGKHAM_ID,BENHNHAN_ID,THOIGIANBATDAU,THOIGIANKETTHUC,CHIPHI,KETLUAN,TRANGTHAI,PHIDATLICH)
VALUES(1,2,'01-JUN-16 08.45.00 AM','01-JUN-16 09.30.00 AM',1000000,'Các d?ch ch?t và s?c t? ?n ??nh. C?n duy trì ch? ?? ?n u?ng h?p lý',1,100000);
INSERT INTO PHIEUDATLICH(PHONGKHAM_ID,BENHNHAN_ID,THOIGIANBATDAU,THOIGIANKETTHUC,CHIPHI,KETLUAN,TRANGTHAI,PHIDATLICH)
VALUES(1,3,'01-JUN-16 09.30.00 AM','01-JUN-16 10.15.00 AM',1000000,'Các d?ch ch?t và s?c t? ?n ??nh. C?n duy trì ch? ?? ?n u?ng h?p lý',1,100000);

INSERT INTO PHIEUDATLICH(PHONGKHAM_ID,BENHNHAN_ID,THOIGIANBATDAU,THOIGIANKETTHUC,CHIPHI,KETLUAN,TRANGTHAI,PHIDATLICH)
VALUES(2,4,'01-JUN-16 08.00.00 AM','01-JUN-16 08.30.00 AM',500000,'S?c kh?e c?a s?n ph? và thai nhi ?n ??nh. C?n duy trì ch? ?? ?n u?ng h?p lý',1,100000);
INSERT INTO PHIEUDATLICH(PHONGKHAM_ID,BENHNHAN_ID,THOIGIANBATDAU,THOIGIANKETTHUC,CHIPHI,KETLUAN,TRANGTHAI,PHIDATLICH)
VALUES(2,5,'01-JUN-16 08.30.00 AM','01-JUN-16 09.00.00 AM',500000,'S?c kh?e c?a s?n ph? và thai nhi ?n ??nh. C?n duy trì ch? ?? ?n u?ng h?p lý',1,100000);
INSERT INTO PHIEUDATLICH(PHONGKHAM_ID,BENHNHAN_ID,THOIGIANBATDAU,THOIGIANKETTHUC,CHIPHI,KETLUAN,TRANGTHAI,PHIDATLICH)
VALUES(2,6,'01-JUN-16 09.00.00 AM','01-JUN-16 09.30.00 AM',500000,'S?c kh?e c?a s?n ph? và thai nhi ?n ??nh. C?n duy trì ch? ?? ?n u?ng h?p lý',1,100000);

INSERT INTO PHIEUDATLICH(PHONGKHAM_ID,BENHNHAN_ID,THOIGIANBATDAU,THOIGIANKETTHUC,CHIPHI,KETLUAN,TRANGTHAI,PHIDATLICH)
VALUES(3,7,'01-JUN-16 08.00.00 AM','01-JUN-16 08.20.00 AM',300000,'Tình hình ?n ??nh. C?n duy trì ch? ?? ?n u?ng h?p lý',1,100000);
INSERT INTO PHIEUDATLICH(PHONGKHAM_ID,BENHNHAN_ID,THOIGIANBATDAU,THOIGIANKETTHUC,CHIPHI,KETLUAN,TRANGTHAI,PHIDATLICH)
VALUES(3,8,'01-JUN-16 08.20.00 AM','01-JUN-16 08.40.00 AM',300000,'Tình hình ?n ??nh. C?n duy trì ch? ?? ?n u?ng h?p lý',1,100000);

--- Insert data into table CALAM
INSERT INTO CALAM(LICHBIEU_ID,PHIEUDATLICH_ID,CA) VALUES(1,1,1);
INSERT INTO CALAM(LICHBIEU_ID,PHIEUDATLICH_ID,CA) VALUES(1,2,2);
INSERT INTO CALAM(LICHBIEU_ID,PHIEUDATLICH_ID,CA) VALUES(1,3,3);

INSERT INTO CALAM(LICHBIEU_ID,PHIEUDATLICH_ID,CA) VALUES(7,4,1);
INSERT INTO CALAM(LICHBIEU_ID,PHIEUDATLICH_ID,CA) VALUES(7,5,2);
INSERT INTO CALAM(LICHBIEU_ID,PHIEUDATLICH_ID,CA) VALUES(7,6,3);

INSERT INTO CALAM(LICHBIEU_ID,PHIEUDATLICH_ID,CA) VALUES(15,7,1);
INSERT INTO CALAM(LICHBIEU_ID,PHIEUDATLICH_ID,CA) VALUES(15,8,2);

