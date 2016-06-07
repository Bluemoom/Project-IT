--------------------------------------------------------
--  DDL for Table BACSI
--------------------------------------------------------

  CREATE TABLE "BACSI" 
   (	"BACSI_ID" NUMBER(10,0), 
	"HOTEN" VARCHAR2(50), 
	"NGAYSINH" DATE, 
	"GIOITINH" NUMBER(1,0), 
	"CMND" VARCHAR2(9), 
	"SDT" VARCHAR2(11), 
	"EMAIL" VARCHAR2(50), 
	"DIACHI" VARCHAR2(200), 
	"CHUYENMON" VARCHAR2(50)
   ) 
--------------------------------------------------------
--  DDL for Table BENHNHAN
--------------------------------------------------------

  CREATE TABLE "BENHNHAN" 
   (	"BENHNHAN_ID" NUMBER(10,0), 
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
--------------------------------------------------------
--  DDL for Table PHIEUDATLICH
--------------------------------------------------------

  CREATE TABLE "PHIEUDATLICH" 
   (	"PHIEUDATLICH_ID" NUMBER(10,0), 
	"PHONGKHAM_ID" NUMBER(10,0), 
	"BENHNHAN_ID" NUMBER(10,0), 
	"THOIGIANBATDAU" DATE, 
	"THOIGIANKETTHUC" DATE, 
	"CHIPHI" FLOAT(126) DEFAULT 0, 
	"KETLUAN" VARCHAR2(500), 
	"TRANGTHAI" NUMBER(1,0) DEFAULT 1
   ) 
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
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
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
--------------------------------------------------------
--  Constraints for Table PHONGKHAM
--------------------------------------------------------

  ALTER TABLE "PHONGKHAM" ADD CONSTRAINT "PHONGKHAM_PK" PRIMARY KEY ("PHONGKHAM_ID");
 
  ALTER TABLE "PHONGKHAM" MODIFY ("PHONGKHAM_ID" NOT NULL ENABLE);
 
  ALTER TABLE "PHONGKHAM" MODIFY ("DICHVU_ID" NOT NULL ENABLE);
 
  ALTER TABLE "PHONGKHAM" MODIFY ("TENPHONGKHAM" NOT NULL ENABLE);

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

  ALTER TABLE "CALAM" ADD CONSTRAINT "CALAM_PK" PRIMARY KEY ("LICHBIEU_ID");

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

  ALTER TABLE "BACSI" ADD CONSTRAINT "BACSI_TAIKHOAN_FK1" FOREIGN KEY ("BACSI_ID")
	  REFERENCES "TAIKHOAN" ("TAIKHOAN_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table BENHNHAN
--------------------------------------------------------

  ALTER TABLE "BENHNHAN" ADD CONSTRAINT "BENHNHAN_TAIKHOAN_FK1" FOREIGN KEY ("BENHNHAN_ID")
	  REFERENCES "TAIKHOAN" ("TAIKHOAN_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table CALAM
--------------------------------------------------------

  ALTER TABLE "CALAM" ADD CONSTRAINT "CALAM_LICHBIEU_FK1" FOREIGN KEY ("LICHBIEU_ID")
	  REFERENCES "LICHBIEU" ("LICHBIEU_ID") ENABLE;

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
 
  ALTER TABLE "PHIEUDATLICH" ADD CONSTRAINT "PHIEUDATLICH_PHIEUDATLICH_FK1" FOREIGN KEY ("PHIEUDATLICH_ID")
	  REFERENCES "PHIEUDATLICH" ("PHIEUDATLICH_ID") ENABLE;
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
