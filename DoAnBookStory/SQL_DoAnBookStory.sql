CREATE DATABASE PROJECT_BOOKSTORE_LAST
GO

USE PROJECT_BOOKSTORE_LAST
GO

--TẠO BẢNG
-- TÀI KHOẢN
CREATE TABLE ACCOUNT 
(
	ACCOUNT VARCHAR(100) PRIMARY KEY,
	PASSWORD VARCHAR(100),
	POSITION NVARCHAR(100),
	DATECREATE varchar(50),
	STATE BIT,
)
GO

-- KHÁCH HÀNG
CREATE TABLE CUSTOMER
(
	ID VARCHAR(30) PRIMARY KEY,
	ACCOUNT VARCHAR(100) NOT NULL,
	NAME NVARCHAR(100),
	BIRTHDAY DATE,
	ADDRESS NVARCHAR(200),
	PHONE VARCHAR(10),
	SEX BIT,
	SCORES FLOAT,
	EMAIL VARCHAR(100),
	DATECREATE varchar(50),
	STATE BIT,
)
GO

-- NHÂN VIÊN
CREATE TABLE STAFF
(
	ID VARCHAR(30) PRIMARY KEY,
	ACCOUNT VARCHAR(100) NOT NULL,
	NAME NVARCHAR(100),
	SEX BIT,
	BIRTHDAY DATE,
	ADDRESS NVARCHAR(200),
	PHONE VARCHAR(10),
	BANK_ACCOUNT VARCHAR(20),
	NAME_BANKACCOUNT NVARCHAR(100),
	EMAIL VARCHAR(100),
	CCCD VARCHAR(100),
	SALARY FLOAT,
	BONUS FLOAT,
	DATECREATE varchar(50),
	STATE BIT
)
GO

-- HÓA ĐƠN
CREATE TABLE BILL
(
	ID VARCHAR(30) PRIMARY KEY ,
	ID_STAFF VARCHAR(30) NOT NULL,
	--ID_BILLDETAIL VARCHAR (30) NOT NULL,
	ID_CUSTOMER VARCHAR(30) NOT NULL,
	--DATE DATE,
	TOTAL FLOAT,
	DATECREATE VARCHAR(50),
	STATE BIT
)
GO

CREATE TABLE BILLHOMECUSTOMER
(
ID VARCHAR(30) PRIMARY KEY,
ID_BOOK VARCHAR(30),
IDCUSTOMER VARCHAR(30),
ADDRESS NVARCHAR(200),
QUANATY VARCHAR(100),
PRICE VARCHAR(100),
TOTAL VARCHAR(100),
DATECREATE VARCHAR(30),
STATE BIT
)
GO 

-- CT HÓA ĐƠN
CREATE TABLE BILLDETAIL
(
	ID VARCHAR(30) PRIMARY KEY,
	ID_BOOK VARCHAR(30) NOT NULL,
	ID_BILL VARCHAR(30) NOT NULL,
	QUANTITY INT,--SỐ LƯỢNG 
	PRICE VARCHAR(100),--GIÁ NOT NULL
	TOTAL FLOAT,
	DATECREATE varchar(50),
	STATE BIT
)
GO

CREATE TABLE BOOK
(
	ID VARCHAR(30) PRIMARY KEY ,
	NAME NVARCHAR(100),
	TYPE NVARCHAR(100),
	AUTHOR NVARCHAR(100),
	DATEOFCOMPOSITION DATE,
	PRICE VARCHAR(100),
	QUANATY VARCHAR(50),
	SOURCE_IMG VARCHAR(500),
	ID_SUPPLIER VARCHAR(30),
	DETAILS NVARCHAR(500),
	DATECREATE VARCHAR(50),
	STATE BIT
)
GO

CREATE TABLE SUPPLIER
(
	ID VARCHAR(30) PRIMARY KEY,
	NAME NVARCHAR(200),
	DATECREATE VARCHAR(50),
	ADDRESS NVARCHAR(200),
	PHONE VARCHAR(10),
	BANK_ACCOUNT VARCHAR(20),
	NAME_BANKACCOUNT NVARCHAR(100),
	STATE BIT,
)
GO


-- CREATE FOREIGN KEY

-- TẠO KHÓA NGOẠI GIỮA KHÁCH HÀNG VỚI TÀI KHOẢN
ALTER TABLE CUSTOMER
ADD CONSTRAINT FK_CUSTOMER_ACCOUNT 
FOREIGN KEY (ACCOUNT) REFERENCES ACCOUNT(ACCOUNT)
ON UPDATE CASCADE ON DELETE CASCADE

-- TẠO KHÓA NGOẠI GIỮA NHÂN VIÊN VỚI TÀI KHOẢN
ALTER TABLE STAFF 
ADD CONSTRAINT FK_STAFF_ACCOUNT
FOREIGN KEY (ACCOUNT) REFERENCES ACCOUNT (ACCOUNT)
ON UPDATE CASCADE ON DELETE CASCADE

-- TẠO KHÓA NGOẠI GIỮA SÁCH VÀ NHÀ CUNG CẤP
ALTER TABLE BOOK 
ADD CONSTRAINT FK_BOOK_IDSUPPLIER
FOREIGN KEY (ID_SUPPLIER) REFERENCES SUPPLIER(ID)
ON UPDATE CASCADE ON DELETE CASCADE

-- TẠO KHÓA NGOẠI GIỮA CTHD VÀ HD
ALTER TABLE BILLDETAIL
ADD CONSTRAINT FK_BILLDETAIL_IDBILL
FOREIGN KEY (ID_BILL) REFERENCES BILL(ID)
ON UPDATE CASCADE ON DELETE CASCADE

-- TẠO KHÓA NGOẠI GIỮA CTHD VÀ SÁCH
ALTER TABLE BILLDETAIL
ADD CONSTRAINT FK_BILLDETAIL_IDBOOK
FOREIGN KEY (ID_BOOK) REFERENCES BOOK(ID)
ON UPDATE CASCADE ON DELETE CASCADE

-- TẠO KHÓA NGOẠI GIỮA CTHD VÀ SÁCH THEO GIA
--ALTER TABLE BILLDETAIL
--ADD CONSTRAINT FK_BILLDETAIL_PRICE
--FOREIGN KEY (PRICE) REFERENCES BOOK(PRICE)
--ON UPDATE CASCADE ON DELETE CASCADE

-- TẠO KHÓA NGOẠI GIỮA HÓA ĐƠN VÀ NHÂN VIÊN
ALTER TABLE BILL
ADD CONSTRAINT FK_BILL_IDSTAFF
FOREIGN KEY (ID_STAFF) REFERENCES STAFF(ID)
ON UPDATE CASCADE ON DELETE CASCADE

-- TẠO KHÓA NGOẠI GIỮA HÓA ĐƠN VÀ KHÁCH HÀNG
--ALTER TABLE BILL
--ADD CONSTRAINT FK_BILL_IDCUSTOMER
--FOREIGN KEY (ID_CUSTOMER) REFERENCES CUSTOMER(ID)

ALTER TABLE BILLHOMECUSTOMER
ADD CONSTRAINT FK_ID_CUSTOMERBILL
FOREIGN KEY (IDCUSTOMER) REFERENCES DBO.CUSTOMER(ID);

ALTER TABLE BILLHOMECUSTOMER 
ADD CONSTRAINT FK_BOOK_XBILLCUSTOMER
FOREIGN KEY (ID_BOOK) REFERENCES DBO.BOOK(ID)



-- THÊM DỮ LIỆU
--ACCOUNT


INSERT INTO DBO.ACCOUNT 
VALUES('nguyencongduc15112003','01254339970Aa@','Manage','2023-04-14 11:49:08',1);
INSERT INTO DBO.ACCOUNT 
VALUES('quangtruong753','01254339970Aa@','Staff','2023-04-14 11:49:08',1);

INSERT INTO ACCOUNT (ACCOUNT, PASSWORD, POSITION, DATECREATE, STATE)
VALUES ('employee1', '123456', 'Staff', '2022-01-01', 1);
INSERT INTO ACCOUNT (ACCOUNT, PASSWORD, POSITION, DATECREATE, STATE)
VALUES ('employee2', '123456', 'Staff', '2022-01-01', 1);
INSERT INTO ACCOUNT (ACCOUNT, PASSWORD, POSITION, DATECREATE, STATE)
VALUES ('employee3', '123456', 'Staff', '2022-01-01', 1);
INSERT INTO ACCOUNT (ACCOUNT, PASSWORD, POSITION, DATECREATE, STATE)
VALUES ('employee4', '123456', 'Staff', '2022-01-01', 1);
INSERT INTO ACCOUNT (ACCOUNT, PASSWORD, POSITION, DATECREATE, STATE)
VALUES ('employee5', '123456', 'Staff', '2022-01-01', 1);

--ACCOUNT
INSERT INTO DBO.ACCOUNT 
VALUES('CS1001','Cs1001@','Customer','2023-04-14 11:49:08',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1002','Cs1002@','Customer','2023-04-15 10:12:30',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1003','Cs1003@','Customer','2023-04-17 09:20:15',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1004','Cs1004@','Customer','2023-04-18 15:30:22',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1005','Cs1005@','Customer','2023-04-18 17:10:05',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1006','Cs1006@','Customer','2023-04-20 09:32:59',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1007','Cs1007@','Customer','2023-04-20 10:05:35',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1008','Cs1008@','Customer','2023-04-20 16:17:42',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1009','Cs1009@','Customer','2023-04-25 13:49:02',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1010','Cs1010@','Customer','2023-04-25 15:30:09',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1011','Cs1011@','Customer','2023-04-26 10:10:27',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1012','Cs1012@','Customer','2023-04-26 11:29:15',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1013','Cs1013@','Customer','2023-04-26 16:21:53',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1014','Cs1014@','Customer','2023-04-27 09:17:46',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1015','Cs1015@','Customer','2023-05-01 08:32:19',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1016','Cs1016@','Customer','2023-05-02 10:12:37',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1017','Cs1017@','Customer','2023-05-02 14:20:42',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1018','Cs1018@','Customer','2023-05-03 16:31:02',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1019','Cs1019@','Customer','2023-05-04 13:21:30',1);
INSERT INTO DBO.ACCOUNT 
VALUES('CS1020','Cs1020@','Customer','2023-05-05 08:09:03',1);
go


--KHÁCH HÀNG
INSERT INTO CUSTOMER (ID, ACCOUNT, NAME, BIRTHDAY, ADDRESS, PHONE, SEX, SCORES, EMAIL, DATECREATE, STATE)
VALUES ('CS1001','CS1001',N'Nguyễn Hà Vi','2003-08-05',N'Hà Nội','0932065126',0,'0','havi@gmail.com','2023-04-14 11:49:08',1)
INSERT INTO DBO.CUSTOMER
VALUES ('CS1002','CS1002',N'Trần Khánh Băng','1995-01-15',N'Kiên Giang','0372044526',1,'15','tkbang@gmail.com','2023-04-15 10:12:30',1)
INSERT INTO DBO.CUSTOMER
VALUES ('CS1003','CS1003',N'Nguyễn Thị Bưới','2003-11-08',N'Đồng Nai','0902061909',0,'20','nguyenthibuoi@gmail.com','2023-04-17 09:20:15',1)
INSERT INTO DBO.CUSTOMER
VALUES ('CS1004','CS1004',N'Đoàn Văn Đông','2003-02-03',N'Đồng Nai','0913941483',1,'0','doandong@gmail.com','2023-04-18 15:30:22',1)
INSERT INTO DBO.CUSTOMER
VALUES ('CS1005','CS1005',N'Nguyễn Thị Minh Hường','2003-04-25',N'TP.Hồ Chí Minh','0908914566',0,'30','minhhuong.nt@gmail.com','2023-04-18 17:10:05',1)
INSERT INTO DBO.CUSTOMER
VALUES ('CS1006','CS1006',N'Mai Hồng Ngọc','2000-10-11',N'Lạng Sơn','0913524579',0,'50','ngocmai@gmail.com','2023-04-20 09:32:59',1)
INSERT INTO DBO.CUSTOMER
VALUES ('CS1007','CS1007',N'Lê Khánh Hòa','2001-01-16',N'Gia Lai','0903749769',1,'35','khanhhoa@gmail.com','2023-04-20 10:05:35',1)
INSERT INTO DBO.CUSTOMER
VALUES ('CS1008','CS1008',N'Ngô Ngọc Anh','2003-09-19',N'Khánh Hòa','0913858977',0,'0','anhngo@gmail.com','2023-04-20 16:17:42',1)
INSERT INTO DBO.CUSTOMER
VALUES ('CS1009','CS1009',N'Nguyễn Vũ Hoàng Quyên','2002-12-03',N'Đồng Tháp','0946265405',0,'15','nvhoangquyen@gmail.com','2023-04-25 13:49:02',1)
INSERT INTO CUSTOMER (ID, ACCOUNT, NAME, BIRTHDAY, ADDRESS, PHONE, SEX, SCORES, EMAIL, DATECREATE, STATE)
VALUES ('CS1010','CS1010',N'Nguyễn Thị Hàn Viên','2003-03-08',N'Bình Định','0932065198',0,'40','nthanvien0803@gmail.com','2023-04-25 15:30:09',1)
INSERT INTO DBO.CUSTOMER
VALUES ('CS1011','CS1011',N'Trần Dần','1993-04-30',N'TP.Hồ Chí Minh','0372046682',1,'35','tigertran@gmail.com','2023-04-26 10:10:27',1)
INSERT INTO DBO.CUSTOMER
VALUES ('CS1012','CS1012',N'Nguyễn Thị Tuyết Mai','2003-02-19',N'Đồng Nai','0901598347',0,'20','tomorownguyen@gmail.com','2023-04-26 11:29:15',1)
INSERT INTO DBO.CUSTOMER
VALUES ('CS1013','CS1013',N'Đoàn Nguyễn Gia Minh','2000-11-20',N'Đồng Nai','0913945681',1,'0','minhgia@gmail.com','2023-04-26 16:21:53',1)
INSERT INTO DBO.CUSTOMER
VALUES ('CS1014','CS1014',N'Nguyễn Thị Minh Tú','2002-09-17',N'TP.Hồ Chí Minh','0908914599',0,'35','ntminhtu@gmail.com','2023-04-27 09:17:46',1)
INSERT INTO DBO.CUSTOMER
VALUES ('CS1015','CS1015',N'Mai Hồ Ngọc Bích','1997-10-30',N'Lạng Sơn','0913535579',0,'50','maihongocbich@gmail.com','2023-05-01 08:32:19',1)
INSERT INTO DBO.CUSTOMER
VALUES ('CS1016','CS1016',N'Lê Hoàng Khánh Đăng','2001-05-11',N'Gia Lai','0903749649',1,'35','dangle@gmail.com','2023-05-02 10:12:37',1)
INSERT INTO DBO.CUSTOMER
VALUES ('CS1017','CS1017',N'Ngô Ngọc Ánh Thi','2002-09-17',N'Khánh Hòa','0913896547',0,'0','nnanhthi@gmail.com','2023-05-02 14:20:42',1)
INSERT INTO DBO.CUSTOMER
VALUES ('CS1018','CS1018',N'Nguyễn Vũ Hồng Linh','2001-01-20',N'Đồng Tháp','0946265405',0,'15','honglinhnguyenvu@gmail.com','2023-05-03 16:31:02',1)
INSERT INTO DBO.CUSTOMER
VALUES ('CS1019','CS1019',N'Nguyễn Mỹ Hoà','2003-09-27',N'Đồng Nai','0946256479',0,'30','ngmyhoa@gmail.com','2023-05-04 13:21:30',1)
INSERT INTO DBO.CUSTOMER
VALUES ('CS1020','CS1020',N'Lê Thị Ngọc Anh','2000-10-10',N'Đồng Tháp','0946269657',0,'15','ltngocanh@gmail.com','2023-05-05 08:09:03',1)
go
--NHÂN VIÊN
INSERT INTO STAFF (ID, ACCOUNT, NAME, SEX, BIRTHDAY, ADDRESS, PHONE, BANK_ACCOUNT, NAME_BANKACCOUNT, EMAIL, CCCD, SALARY, BONUS, DATECREATE, STATE)
VALUES('MNG1001','nguyencongduc15112003',N'Nguyễn Công Đức',1,'2003-11-15',N'Sóc trăng','0842061909','1019562241','Vietcombank','nguyencongduc@gmail.com','094203000970','20000000','1000000','2023-04-14 11:49:08',0);
INSERT INTO DBO.STAFF
VALUES('MNG1002','quangtruong753',N'Trần Quang Trường',1,'2003-11-11',N'TP.Hồ Chí Minh','0946266879','1019662234','Vietcombank','tranquangtruong@gmail.com','052203001925','20000000','1000000','2023-04-14 11:49:08',1);

INSERT INTO STAFF (ID, ACCOUNT, NAME, SEX, BIRTHDAY, ADDRESS, PHONE, BANK_ACCOUNT, NAME_BANKACCOUNT, EMAIL, CCCD, SALARY, BONUS, DATECREATE, STATE)
VALUES ('STA1001', 'employee5', N'Nguyễn Nhât Nga', 1, '2003-09-08', N'Bình Định', '0356860177', '1019871555', 'Vietcombank', 'quangdien0809@gmail.com', '052203002753', 10000000, 500000, '2023-04-15 20:14:09', 1);
INSERT INTO STAFF (ID, ACCOUNT, NAME, SEX, BIRTHDAY, ADDRESS, PHONE, BANK_ACCOUNT, NAME_BANKACCOUNT, EMAIL, CCCD, SALARY, BONUS, DATECREATE, STATE)
VALUES ('STA1002', 'employee4', N'Nguyễn Trần Yến Nhi', 1, '2003-09-20', N'Gia Lai', '0356863549', '1019562345', 'Vietcombank', 'yennhint@gmail.com', '052203009657', 10000000, 500000, '2023-04-15 20:14:09', 1);
INSERT INTO STAFF (ID, ACCOUNT, NAME, SEX, BIRTHDAY, ADDRESS, PHONE, BANK_ACCOUNT, NAME_BANKACCOUNT, EMAIL, CCCD, SALARY, BONUS, DATECREATE, STATE)
VALUES ('STA1003', 'employee3', N'Nguyễn Văn Khách', 1, '2003-09-22', N'Quảng Ngãi', '0356589574', '1019124785', 'Vietcombank', 'ninhnguyen@gmail.com', '052203007874', 10000000, 500000, '2023-04-15 20:14:09', 1);

INSERT INTO STAFF (ID, ACCOUNT, NAME, SEX, BIRTHDAY, ADDRESS, PHONE, BANK_ACCOUNT, NAME_BANKACCOUNT, EMAIL, CCCD, SALARY, BONUS, DATECREATE, STATE)
VALUES ('STA004', 'employee1', 'Nguyen Van B', 1, '1995-01-01', '123 Nguyen Van Linh, District 1, HCMC', '0901111111', '1234567890', 'Nguyen Van B', 'employee1@example.com', '123456789', 10000000, 0, '2022-01-01', 1);
INSERT INTO STAFF (ID, ACCOUNT, NAME, SEX, BIRTHDAY, ADDRESS, PHONE, BANK_ACCOUNT, NAME_BANKACCOUNT, EMAIL, CCCD, SALARY, BONUS, DATECREATE, STATE)
VALUES ('STA005', 'employee2', 'Tran Van C', 0, '1993-05-15', '456 Le Van Sy, District 3, HCMC', '0902222222', '1234567890', 'Tran Van C', 'employee2@example.com', '123456789', 15000000, 1000000, '2022-01-01', 1);

--NCC

INSERT INTO SUPPLIER (ID, NAME, DATECREATE, ADDRESS, PHONE, BANK_ACCOUNT, NAME_BANKACCOUNT, STATE)
VALUES
('SUP1001', N'Kim Đồng', '2023-04-14', N'Số 12 Nguyễn Du, Hà Nội', '0243941358', '1234554545', 'Vietcombank', 1),
('SUP1002', N'Phương Nam', '2023-04-14', N'03 Nguyễn Oanh, Phường 10, Quận Gò Vấp, TP.HCM', '0283989298', '2342365832', 'Techcombank', 1),
('SUP1003', N'Fahasa', '2023-04-15', N'Số 338 Xã Đàn, Đống Đa, Hà Nội', '0243851026', '1124115455', 'BIDV', 1),
('SUP1004', N'Tiền Phong', '2023-04-17', N'94 Hào Nam, Q.Đống Đa, Hà Nội', '0243851697', '1524272722', 'BIDV', 1),
('SUP1005', N'Cá Chép', '2023-04-20', N'Số 64A Trần Thái Tông, Hà Nội', '0242210330', '3635363555', 'Agribank', 1),
('SUP1006', N'Trẻ', '2023-04-20', N'Số 62 Nguyễn Thị Minh Khai, Q.1, TP.HCM', '0283824354', '1212221456', 'Agribank', 1),
('SUP1007', N'Tiki', '2023-04-20', N'Tầng 6, Tòa nhà e.town 2, 364 Cộng Hòa, P.13, Q.Tân Bình, TP.HCM', '0919006035', '1135113266', 'BIDV', 1),
('SUP1008', N'Nguyễn Văn Cừ', '2023-04-20', N'Số 60 Nguyễn Văn Cừ, Long Biên, Hà Nội', '0243827627', '4777255135', 'Viettinbank', 1),
('SUP1009', N'Văn Lang', '2023-04-22', N'Số 1 Nguyễn Văn Tráng, Đống Đa, Hà Nội', '0243923826', '2356222335', 'Vietcombank', 1),
('SUP1010', N'Thái Hà', '2023-04-22', N'Số 5 Thái Hà, Đống Đa, Hà Nội', '0243851808', '1656645556', 'Agribank', 1)

INSERT INTO BOOK (ID, NAME, TYPE, AUTHOR, DATEOFCOMPOSITION, PRICE, QUANATY, SOURCE_IMG, ID_SUPPLIER, DETAILS, DATECREATE, STATE)
VALUES
('BOO1001', N'Dế Mèn Phiêu Lưu Ký',N'Truyện ngắn', N'Tô Hoài', '1941-01-12', '120000', '5000', '/BiaSach/BOO1001.jpg', 'SUP1001', N'"Dế Mèn Phiêu Lưu Ký" của Tô Hoài là câu chuyện phiêu lưu thú vị của một chú dế mèn thông minh và tinh ranh.', '2023-04-14', 1),

('BOO1002', N'Cánh Đồng Bất Tận',N'Tiểu thuyết', N'Nguyễn Ngọc Thuần', '1957-12-12', '110000', '2500', '/BiaSach/BOO1002.jpg', 'SUP1001', N'"Cánh Đồng Bất Tận" của Nguyễn Ngọc Thuần kể về cuộc sống của những người nông dân Việt Nam và những khó khăn.', '2023-04-15', 1),

('BOO1003', N'Số Đỏ',N'Tiểu thuyết', N'Vũ Trọng Phụng', '1936-05-11', '90000', '2000', '/BiaSach/BOO1003.jpg', 'SUP1002', N'"Số Đỏ" của Vũ Trọng Phụng miêu tả cuộc sống và những tham nhũng, thù địch trong một phố thị ở Bắc Kỳ trong thời kỳ thuộc địa.', '2023-04-15', 1),

('BOO1004', N'Chiếc Lá Cuối Cùng',N'Truyện ngắn', N'Xuân Diệu', '1938-10-07', '125000', '1000', '/BiaSach/BOO1004.jpg', 'SUP1002', N'"Chiếc Lá Cuối Cùng" của O. Henry (dịch bởi Xuân Diệu) là tập truyện ngắn của nhà văn nổi tiếng O. Henry, được dịch sang tiếng Việt bởi nhà thơ Xuân Diệu.', '2023-04-15', 1),

('BOO1005', N'Cho Tôi Xin Một Vé Đi Tuổi Thơ',N'Tiểu thuyết', N'Nguyễn Nhật Ánh', '1994-03-15','100000' ,'7000', '/BiaSach/BOO1005.jpg', 'SUP1003', N'"Cho Tôi Xin Một Vé Đi Tuổi Thơ" của Nguyễn Nhật Ánh kể về những kỷ niệm tuổi thơ đáng nhớ của nhân vật chính - một cậu bé đang lớn lên ở miền quê Việt Nam.', '2023-04-15', 1),

('BOO1006', N'Truyện Kiều',N'Thơ', N'Nguyễn Du', '1820-03-12', '200000', '4000', '/BiaSach/BOO1006.jpg', 'SUP1006', N'"TruyenKieu" của Nguyễn Du là một tác phẩm thi ca kinh điển của văn học Việt Nam, kể về cuộc đời bi kịch của Kiều - một người con gái tài năng và kiên cường.', '2023-04-20', 1),

('BOO1007', N'Tắt Đèn',N'Tiểu thuyết', N'Ngô Tất Tố ', '1946-09-02', '130000', '7000', '/BiaSach/BOO1007.jpg', 'SUP1007', N'"TatĐèn" của Ngô Tất Tố kể về những câu chuyện đáng sợ và kỳ lạ liên quan đến một ngôi nhà cũ ở Hà Nội.', '2023-04-20', 1),

('BOO1008', N'Đất Rừng Phương Nam',N'Tiểu thuyết', N'Đoàn Giỏi', '1944-10-08', '170000', '8000', '/BiaSach/BOO1008.jpg', 'SUP1009', N'"Đất Rừng Phương Nam" của Đoàn Giỏi là câu chuyện về cuộc đời khó khăn và trăn trở của một người đàn ông từ miền quê lên Sài Gòn làm ăn.', '2023-04-22', 1),

('BOO1009', N'Những Cánh Vạc Xanh',N'Truyện ngắn', N'Tô Hoài', '1953-02-17', '150000', '2000', '/BiaSach/BOO1009.jpg', 'SUP1010', N'"Những Cánh Vạc Xanh" của Tô Hoài là tập truyện ngắn về những cuộc phiêu lưu và câu chuyện tình cảm trong cuộc sống đầy thăng trầm.', '2023-04-22', 1),

('BOO1010', N'Nhật Ký Đom Đóm',N'Tiểu thuyết', N'Cao Xuân Huy', '1992-11-19', '120000', '3000', '/BiaSach/BOO1010.jpg', 'SUP1010', N'"Nhật Ký Đom Đóm" của Cao Xuân Huy là câu chuyện tình yêu đẹp và đầy cảm xúc giữa hai nhân vật chính - một chàng trai và một cô gái - ở Sài Gòn những năm 70.', '2023-04-22', 1),

('BOO1011', N'Tôi thấy hoa vàng trên cỏ xanh',N'Tiểu thuyết', N'Nguyễn Nhật Ánh', '2000-02-20', '80000','5000', '/BiaSach/BOO1011.jpg', 'SUP1003', N'"Tôi thấy hoa vàng trên cỏ xanh" của Nguyễn Nhật Ánh: Cuốn tiểu thuyết kể về tuổi thơ và những kỷ niệm đáng nhớ của một chàng trai tại một vùng quê miền Trung Việt Nam.', '2023-04-22', 1),

('BOO1012', N'Tôi là Bêtô',N'Truyện ngắn', N'Nguyễn Nhật Ánh', '2011-02-20', '80000', '5000', '/BiaSach/BOO1012.jpg', 'SUP1003', N'"Tôi là Bêtô" của Nguyễn Nhật Ánh: xoay quanh tình bạn giữa Bêtô với Laica (cún con), Binô sống trong gia đình cô chủ Ni.', '2023-04-22', 1),

('BOO1013', N'Cô gái đến từ hôm qua',N'Truyện ngắn', N'Nguyễn Nhật Ánh', '1989-09-10', '100000', '2000', '/BiaSach/BOO1013.jpg', 'SUP1005', N'"Tôi là Bêtô" của Nguyễn Nhật Ánh: kể về mối tình thơ ngây tuổi học trò với hai nhân vật chính là Anh Thư và Tiểu Li', '2023-04-23', 1),

('BOO1014', N'Con chó nhỏ mang giỏ hoa hồng',N'Truyện ngắn', N'Nguyễn Nhật Ánh', '2016-01-20', '90000', '7000', '/BiaSach/BOO1014.jpg', 'SUP1004', N'"Con chó nhỏ mang giỏ hoa hồng" của Nguyễn Nhật Ánh: kể về về năm chú chó sống trong một gia đình. Câu chuyện về tình bạn giữa chúng với chị Ni, bố mẹ chị Ni và các vị khách đến nhà vẽ nên một thế giới trong trẻo, dễ thương.', '2023-04-23', 1),

('BOO1015', N'Có hai con mèo ngồi bên cửa sổ',N'Truyện ngắn', N'Nguyễn Nhật Ánh', '2012-05-27', '60000', '9000', '/BiaSach/BOO1015.jpg', 'SUP1007', N'"Có hai con mèo ngồi bên cửa sổ" của Nguyễn Nhật Ánh: kể về mối tình của thi sĩ mèo Gấu với nàng mèo Áo Hoa. Song song đó là tình bạn cảm động giữa mèo Gấu và chuột Tí Hon.', '2023-04-23', 1),

('BOO1016', N'Mắt biếc',N'Truyện ngắn', N'Nguyễn Nhật Ánh', '1990-07-07', '130000', '4000', '/BiaSach/BOO1016.jpg', 'SUP1010', N'"Mắt biếc" của Nguyễn Nhật Ánh: kể về câu chuyện xoay quanh chuyện tình cảm của đôi trẻ Ngạn - Lan. Hai người gắn bó với nhau từ thuở ấu thơ.', '2023-04-24', 1),

('BOO1017', N'Chúc một ngày tốt lành',N'Truyện ngắn', N'Nguyễn Nhật Ánh', '2014-12-02', '150000', '1000', '/BiaSach/BOO1017.jpg', 'SUP1009', N'"Chúc một ngày tốt lành" của Nguyễn Nhật Ánh: kể về hình ảnh khu vườn nhà bà Đỏ - nơi ghi dấu cặp tình bạn của heo Lọ Nồi, Đuôi Xoăn, cún Mõm Ngắn, đàn gà chíp.', '2023-04-24', 1),

('BOO1018', N'Ngồi khóc trên cây',N'Truyện ngắn', N'Nguyễn Nhật Ánh', '2013-04-22', '90000', '3000', '/BiaSach/BOO1018.jpg', 'SUP1004', N'"Ngồi khóc trên cây" của Nguyễn Nhật Ánh: kể về mối tình đầu của cô bé Rùa và chàng sinh viên ở quê đang theo học ở thành phố.', '2023-04-25', 1),

('BOO1019', N'Ngày xưa có một chuyện tình',N'Truyện ngắn', N'Nguyễn Nhật Ánh', '2016-07-11', '110000', '2000', '/BiaSach/BOO1019.jpg', 'SUP1004', N'"Ngày xưa có một chuyện tình" của Nguyễn Nhật Ánh: kể về cuộc đời các nhân vật Vinh, Phúc và Miền. Cả ba cùng lớn lên ở một thị trấn miền Trung.', '2023-04-25', 1),

('BOO1020', N'Ông già và biển cả',N'Tiểu thuyết', N'Ernest Hemingway', '1952-02-11', '70000', '3000', '/BiaSach/BOO1020.png', 'SUP1002', N'"Ông già và biển cả" của nhà văn Ernest Hemingway : kể về sự đối đầu của một ông lão đánh cá và cuộc chiến không cân sức giữa một con cá hung dữ ở trên biển. ', '2023-04-25', 1),

('BOO1021', N'Cuốn theo chiều gió',N'Tiểu thuyết', N'Margaret Mitchell', '1960-09-05', '150000', '1000', '/BiaSach/BOO1021.png', 'SUP1006', N'"Cuốn theo chiều gió" của nữ tác giả Margaret Mitchell: kể về một mối tình ngọt ngào trong cuộc nội chiến Nam - Bắc Mỹ.', '2023-04-26', 1),

('BOO1022', N'The godfather – Bố già',N'Tiểu thuyết', N'Mario Puzo', '1982-01-26', '170000', '2500', '/BiaSach/BOO1022.jpg', 'SUP1007', N'"The godfather – Bố già" của tác giả Mario Puzo: đã xây dựng nên thế giới Mafia Mỹ với một Bố Già là trùm Don Vito Corleone, người gốc Sicily.', '2023-04-26', 1),

('BOO1023', N'Watership Down - Đồi Thỏ',N'Tiểu thuyết', N'Richard Adams', '1972-11-16', '120000', '2700', '/BiaSach/BOO1023.jpg', 'SUP1004', N'"Watership Down - Đồi Thỏ" của tác giả Richard Adams: viết về hành trình đi tìm vùng đất mới của một nhóm các chú thỏ khi biết trước nơi chúng đang ở sẽ bị con người và máy móc phá hủy.', '2023-04-26', 1),

('BOO1024', N'Mỗi lần vấp ngã là một lần Trưởng Thành',N'Tự lực', N'Liêu Trí Phong', '2003-12-01', '90000', '4200', '/BiaSach/BOO1024.jpg', 'SUP1001', N'"Mỗi lần vấp ngã là một lần Trưởng Thành" của tác giả Liêu Trí Phong: với nội dung theo kiểu kể chuyện và phân tích. Những câu chuyện này như một dẫn chứng cụ thể và sống động trong cuộc sống thường ngày của mỗi chúng ta, trong đó có tôi và bạn đấy.', '2023-04-27', 1),

('BOO1025', N'A Short History of Nearly Everything - Lược sử vạn vật',N'Khoa học', N'Bill Bryson', '2005-03-17', '200000', '1500', '/BiaSach/BOO1025.jpg', 'SUP1008', N'"A Short History of Nearly Everything - Lược sử vạn vật" của tác giả Bill Bryson: mô tả một cách đơn giản và thô mộc mọi thứ từ kích thước và lịch sử của vũ trụ cho tới lịch sử của nhân loại.', '2023-04-27', 1),

('BOO1026', N'GEN: Lịch Sử Và Tương Lai Của Nhân Loại', N'Khoa học', N'Siddhartha Mukherjee', '2010-10-19', '180000', '2200', '/BiaSach/BOO1026.jpg', 'SUP1003', N'"GEN: Lịch Sử Và Tương Lai Của Nhân Loại" của tác giả Siddhartha Mukherjee: đã chắt lọc kết cấu phức tạp vô hạn về danh tính của loài người thành một câu chuyện cực kỳ dễ hiểu.', '2023-04-27', 1),

('BOO1027', N'Lịch Sử Khoa Học – Bách Khoa Thư Các Khám Phá Thay Đổi Thế Giới', N'Khoa học', N'DK', '2001-06-20', '160000', '4500', '/BiaSach/BOO1027.jpg', 'SUP1007', N'"Lịch Sử Khoa Học – Bách Khoa Thư Các Khám Phá Thay Đổi Thế Giới": Với nhiều hình ảnh sinh động và thông tin lý thú, Lịch sử Khoa học là hành trình hấp dẫn khám phá những phát kiến và phát minh khoa học quan trọng.', '2023-04-27', 1),

('BOO1028', N'Tri Thức Về Vạn Vật – Một Thế Giới Trực Quan Chưa Từng Thấy', N'Khoa học', N'DK', '2001-07-14', '190000', '5000', '/BiaSach/BOO1028.jpg', 'SUP1007', N'"Tri Thức Về Vạn Vật – Một Thế Giới Trực Quan Chưa Từng Thấy": Cuốn sách khoa học này sẽ cho bạn THẤY những điều bách khoa thư thông thường chỉ NÓI.', '2023-04-27', 1),

('BOO1029', N'Những Nhà Khám Phá – Lịch Sử Tri Kiến Vạn Vật Và Con Người', N'Khoa học', N'Daniel J. Boorstin', '2003-05-17', '130000', '4000', '/BiaSach/BOO1029.jpg', 'SUP1005', N'"Những Nhà Khám Phá – Lịch Sử Tri Kiến Vạn Vật Và Con Người" của tác giả Daniel J. Boorstin: Được coi như cuốn sách khoa học lớn nhất của một trong những sử gia lớn nhất thời hiện đại.', '2023-04-28', 1),

('BOO1030', N'Homo Deus: Lược Sử Tương Lai', N'Khoa học', N'Yuval Noah Harari', '2007-07-13', '195000', '6000', '/BiaSach/BOO1030.jpg', 'SUP1006', N'"Homo Deus: Lược Sử Tương Lai" của tác giả Yuval Noah Harari: phân tích 70.000 năm lịch sử loài người để đưa ra dự đoán về tương lai của chúng ta… và kết quả thật ảm đạm.', '2023-04-28', 1),

('BOO1031', N'Lược Sử Thời Gian', N'Khoa học', N'Stephen Hawking', '2009-01-15', '170000', '3000', '/BiaSach/BOO1031.jpg','SUP1008', N'"Lược Sử Thời Gian" của tác giả Stephen Hawking: Cuốn sách khoa học hay về vũ trụ học này giải thích các khái niệm phức tạp như không gian, thời gian và lỗ đen cho người dân theo quan điểm khoa học.', '2023-04-28', 1),

('BOO1032', N'Gen Vị Kỷ', N'Khoa học', N'Richard Dawkins', '1976-04-23', '110000', '7000', '/BiaSach/BOO1032.jpg', 'SUP1006', N'"Gen Vị Kỷ" của tác giả Richard Dawkins: Cuốn sách sử dụng rất tài tình hình ảnh so sánh và phép nhân cách hóa để giải thích khoa học.', '2023-04-28', 1),

('BOO1033', N'Thông Điệp Của Nước', N'Khoa học', N'Masaru Emoto', '2006-07-19', '90000', '4000', '/BiaSach/BOO1033.jpg', 'SUP1008', N'"Thông điệp của nước" của tác giả Masaru Emoto: có khả năng thay đổi một cách sâu sắc thế giới quan của bạn. ', '2023-04-28', 1),

('BOO1034', N'Sao Chúng Ta Lại Ngủ', N'Khoa học', N'Matthew Walker PhD', '1999-12-10', '140000', '6000', '/BiaSach/BOO1034.jpg', 'SUP1005', N'"Sao Chúng Ta Lại Ngủ" của tác giả Matthew Walker PhD: Là cuốn sách khoa học về giấc ngủ đầu tiên được viết bởi chính một chuyên gia khoa học hàng đầu.', '2023-04-29', 1),

('BOO1035', N'6 Phát Minh Làm Nên Thời Đại', N'Khoa học', N'Steven JohnsonD', '1850-01-09', '130000', '2000', '/BiaSach/BOO1035.jpg', 'SUP1007', N'"6 Phát Minh Làm Nên Thời Đại" của tác giả Steven Johnson: sáu công nghệ và khám phá các phân nhánh của chúng, cả mặt tốt lẫn không tốt.', '2023-04-29', 1),

('BOO1036', N'Kĩ thuật chế biến 300 Món Ăn Ngon', N'Nấu ăn', N'Nguyễn Thùy Linh', '2010-01-27', '80000', '7000', '/BiaSach/BOO1036.png','SUP1009', N'"Kĩ thuật chế biến 300 Món Ăn Ngon" của tác giả Nguyễn Thùy Linh: có đủ chi tiết về các phương pháp chế biến món ăn cho bữa cơm hàng ngày hay trong các dịp lễ tiết, tiệc tại gia.', '2023-04-29', 1),

('BOO1037', N'100 món ăn ngon rẻ', N'Nấu ăn', N'Thiên Kim', '2012-09-19', '100000', '6000', '/BiaSach/BOO1037.png', 'SUP1009', N'"100 món ăn ngon rẻ" của tác giả Thiên Kim: tổng hợp 100 món ăn gia đình đơn giản với những nguyên liệu phổ biến và rất dễ tìm mua.', '2023-04-29', 1),

('BOO1038', N'Hướng dẫn thực hành 400 món thông dụng', N'Nấu ăn', N'Huyền Trân', '2005-10-09', '50000', '3000', '/BiaSach/BOO1038.png', 'SUP1010', N'"Hướng dẫn thực hành 400 món thông dụng" của tác giả Huyền Trân: Hướng dẫn chuẩn bị nguyên vật liệu, chế biến 400 món ăn quen thuộc trong gia đình Việt Nam.', '2023-04-29', 1),

('BOO1039', N'500 món ăn thông dụng dễ nấu', N'Nấu ăn', N'Mai Anh', '2011-12-11', '140000', '5000', '/BiaSach/BOO1039.png', 'SUP1010', N'"500 món ngon thông dụng dễ nấu" của tác giả Mai Anh: tổng hợp khá công phu các món ăn truyền thống.', '2023-04-29', 1),

('BOO1040', N'Không Gia Đình', N'Tiểu thuyết', N'Hector Malot', '1850-01-25', '120000', '3000', '/BiaSach/BOO1040.jpg', 'SUP1007', N'"Không gia đình" của tác giả Hector Malot: Tác phẩm đã ca ngợi sự lao động bền bỉ, tinh thần tự lập, chịu đựng gian khó, khích lệ tình bạn chân chính.', '2023-04-30', 1),

('BOO1041', N'Túp lều bác Tom', N'Tiểu thuyết', N'Harriet Beecher Stowe', '1852-12-29', '180000', '2700', '/BiaSach/BOO1041.jpg', 'SUP1007', N'"Túp lều bác Tom" của tác giả Harriet Beecher Stowe: Bác Tom là một nô lệ da đen trung thực, ngay thẳng và trọng danh dự nhưng cuộc đời lại chịu nhiều đau đớn và tủi nhục.', '2023-04-30', 1),

('BOO1042', N'Anne tóc đỏ dưới chái nhà xanh', N'Tiểu thuyết', N'L.M. Montgomery', '1908-09-13', '190000', '1000', '/BiaSach/BOO1042.jpg','SUP1007', N'"Anne tóc đỏ dưới chái nhà xanh" của tác giả L.M. Montgomery: Anne, tóc đỏ, hay gây gổ và lãng mạn vô phương cứu chữa - cô đã xáo trộn cả Green Gable lẫn ngôi làng quanh đó.', '2023-05-01', 1),

('BOO1043', N'Lũ Trẻ Đường Ray', N'Tiểu thuyết', N'Edith Nesbit', '1906-02-19', '100000', '4000', '/BiaSach/BOO1043.jpg', 'SUP1007', N'"Lũ Trẻ Đường Ray" của tác giả Edith Nesbit: Tràn đầy những mô tả sinh động về cuộc sống thôn dã, cùng những mẩu chuyện cảm động về tình yêu thương, trách nhiệm và lòng can đảm.', '2023-05-01', 1),

('BOO1044', N'Totto - Chan bên cửa sổ', N'Tiểu thuyết', N'Tetsuko Kuroyanagi', '2001-11-21', '130000', '2000', '/BiaSach/BOO1044.jpg', 'SUP1007', N'"Totto - Chan bên cửa sổ " của tác giả Tetsuko Kuroyanagi: là cuốn sách gối đầu giường của nhiều thế hệ trẻ em trên toàn thế giới suốt ba mươi năm nay.', '2023-05-01', 1),

('BOO1045', N'Những tấm lòng cao cả', N'Tiểu thuyết', N'Edomondo De Amicis', '1886-10-18', '170000', '2500', '/BiaSach/BOO1045.jpg', 'SUP1007', N'"Những tấm lòng cao cả" của tác giả Edomondo De Amicis: Chuyện kể về cậu bé người Ý tên là En-ri-cô, cậu bé hằng ngày đều ghi lại những sự việc, cuộc sống xung quanh mình và cả những câu chuyện cảm động mà cậu đã được nghe, được thấy và có khi cậu là nhân vật chính vào cuốn nhật kí mà cậu bắt đầu viết từ năm lớp ba.', '2023-05-01', 1),


('BOO1047', N'Dạy con làm giàu', N'Khởi nghiệp', N'Robert T Kyosaki', '2000-01-20', '180000', '7000', '/BiaSach/BOO1047.jpg', 'SUP1009', N'"Dạy con làm giàu" của tác giả Robert T Kyosaki: Ông đã dùng chính những kinh nghiệm kiến thức và những thăng trầm trong cuộc sống để có thể ghi lại những nội dung trong đó.', '2023-05-02', 1),

('BOO1048', N'Bí quyết tay trắng trở thành Triệu Phú', N'Khởi nghiệp', N'Adam Khoo', '1997-12-09', '190000', '4000', '/BiaSach/BOO1048.jpg', 'SUP1006', N'"Cuốn sách Bí quyết tay trắng trở thành Triệu Phú" của tác giả Adam Khoo: chia sẻ với nhiều người về việc chỉ có 2 bàn tay trắng, không có tài sản kế thừa hay có nguồn tư nào đó.', '2023-05-02', 1),

('BOO1049', N'Khởi nghiệp tinh gọn', N'Khởi nghiệp', N'Eric Ries', '1993-07-23', '170000', '4200', '/BiaSach/BOO1049.jpg', 'SUP1005', N'"Khởi nghiệp tinh gọn" của tác giả Eric Ries: Cuốn sách này đánh vào thực tế và không mang lại cảm giác “dễ như ăn kẹo” đối với người khởi nghiệp.', '2023-05-02', 1),

('BOO1050', N'Khởi nghiệp với 100$', N'Khởi nghiệp', N'Chris Guillebeau', '1990-01-09', '170000', '2500', '/BiaSach/BOO1050.jpg', 'SUP1010', N'"Khởi nghiệp với 100$" của tác giả Chris Guillebeau: Một con số vốn cực ít nhưng lại có thể mang đến cho bạn thành công và lợi nhuận cực tốt.', '2023-05-02', 1)

delete from BILL
INSERT INTO BILL (ID, ID_STAFF, ID_CUSTOMER, TOTAL, DATECREATE, STATE)
VALUES
	('HD1001', 'MNG1002', 'CS1001', 150000, '2023-05-01', 1),
	  ('HD1002', 'STA1003', 'CS1002', 200000, '2023-05-02', 1),
	  ('HD1003', 'MNG1002', 'CS1001', 180000, '2023-05-03', 1),	
	  ('HD1004', 'STA1002', 'CS1002', 120000, '2023-05-04', 1),
	  ('HD1005', 'STA1002', 'CS1005', 90000, '2023-05-05', 1),
	  ('HD1006', 'MNG1002', 'CS1005', 180000, '2023-05-06', 1),
	  ('HD1007', 'STA005', 'CS1007', 250000, '2023-05-07', 1),
	  ('HD1008', 'STA005', 'CS1011', 300000, '2023-05-08', 1),
	  ('HD1009', 'MNG1002', 'CS1012', 150000, '2023-05-09', 1),
	  ('HD1010', 'STA1001', 'CS1010', 220000, '2023-05-10', 1),

	  ('HD1011', 'STA004', 'CS1004', 150000, '2023-05-10', 1),
	  ('HD1012', 'MNG1002', 'CS1012', 180000, '2023-06-10', 1),
	  ('HD1013', 'MNG1002', 'CS1013', 120000, '2023-07-10', 1),
	  ('HD1014', 'STA004', 'CS1014', 250000, '2023-08-10', 1),
	  ('HD1015', 'MNG1002', 'CS1002', 300000, '2023-09-10', 1),
	  ('HD1016', 'STA1001', 'CS1003', 200000,'2023-10-10', 1),
	  ('HD1017', 'MNG1002', 'CS1001', 150000, '2023-11-10', 1),
	  -- Thêm 33 dòng dữ liệu khác vào đây
	  ('HD1018', 'MNG1002', 'CS1018', 160000, '2023-04-10', 1),
	  ('HD1019', 'MNG1002', 'CS1019', 190000, '2023-03-10', 1),
	  ('HD1020', 'STA1001', 'CS1020', 230000, '2023-02-10', 1),
	  ('HD1021', 'MNG1002', 'CS1001', 170000, '2023-01-10', 1),
	  ('HD1022', 'STA004', 'CS1012', 120000, '2023-12-10', 1),
	  ('HD1023', 'MNG1002', 'CS1016', 280000, '2023-11-10' , 1),
	  ('HD1024', 'STA005', 'CS1004', 150000, '2023-10-10'  , 1),
	  ('HD1025', 'STA005', 'CS1005', 220000, '2023-09-10'  , 1),
	  ('HD1026', 'MNG1002', 'CS1016', 190000, '2023-08-10' , 1),
	  ('HD1027', 'MNG1002', 'CS1007', 200000, '2023-07-10'  , 1),
	  ('HD1028', 'STA004', 'CS1018', 180000, '2023-06-10'  , 1),
	  ('HD1029', 'MNG1002', 'CS1011', 150000, '2023-05-10'  , 1),
	  ('HD1030', 'STA1002', 'CS1001', 210000, '2023-05-10' , 1),

	  ('HD1031', 'MNG1002', 'CS1001', 130000, '2022-01-10'  , 1),
	  ('HD1032', 'MNG1002', 'CS1012', 240000, '2022-02-10' , 1),
	  ('HD1033', 'STA004', 'CS1012', 170000, '2022-03-10' , 1),
	  ('HD1034', 'MNG1002', 'CS1013', 190000, '2022-04-10'  , 1),
	  ('HD1035', 'STA004', 'CS1013', 150000, '2022-05-10'  , 1),
	  ('HD1036', 'MNG1002', 'CS1010', 220000, '2022-06-10' , 1),
	  ('HD1037', 'MNG1002', 'CS1010', 200000, '2022-07-10' , 1),
	  ('HD1038', 'STA1003', 'CS1019', 180000, '2022-08-10'  , 1),
	  ('HD1039', 'STA1003', 'CS1010', 160000, '2022-09-10'  , 1),
	  ('HD1040', 'MNG1002', 'CS1020', 190000, '2022-10-10'  , 1),

	  ('HD1041', 'MNG1002', 'CS1009', 230000, '2023-04-11'  , 1),
	  ('HD1042', 'MNG1002', 'CS1009', 170000, '2023-04-12' , 1),
	  ('HD1043', 'MNG1002', 'CS1006', 120000, '2023-04-13'  , 1),
	  ('HD1044', 'MNG1002', 'CS1006', 280000, '2023-04-14'  , 1),
	  ('HD1045', 'STA004', 'CS1010', 150000, '2023-04-15'  , 1),
	  ('HD1046', 'MNG1002', 'CS1018', 220000, '2023-04-16'  , 1),
	  ('HD1047', 'STA004', 'CS1001', 190000, '2023-04-17'  , 1),
	  ('HD1048', 'MNG1002', 'CS1001', 200000, '2023-04-18'  , 1),
	  ('HD1049', 'STA005', 'CS1018', 180000, '2023-04-19'  , 1),

	  ('HD1050', 'STA005', 'CS1015', 250000, '2023-05-10'  , 1),
	  ('HD1051', 'MNG1002', 'CS1016', 180000, '2023-04-20', 1),
	  ('HD1052', 'STA1002', 'CS1004', 220000, '2023-04-25', 1),
	  ('HD1053', 'MNG1002', 'CS1001', 150000, '2023-04-30', 1),
	  ('HD1054', 'STA1003', 'CS1007', 120000, '2023-05-05', 1),
	  ('HD1055', 'MNG1002', 'CS1014', 250000, '2023-05-10', 1),
	  ('HD1056', 'STA1003', 'CS1002', 300000, '2023-05-15', 1),
	  ('HD1057', 'STA005', 'CS1006', 200000, '2023-05-20', 1);


	  


INSERT INTO BILLDETAIL (ID, ID_BOOK, ID_BILL, QUANTITY, PRICE, TOTAL, DATECREATE, STATE)
VALUES
  ('CTHD1001', 'BOO1001', 'HD1001', 2, '125000', 150000, '2023-05-01', 1),
  ('CTHD1002', 'BOO1002', 'HD1001', 1, '50000', 50000, '2023-05-01', 1),
  ('CTHD1003', 'BOO1003', 'HD1002', 3, '60000', 180000, '2023-05-02', 1),
  ('CTHD1004', 'BOO1004', 'HD1004', 1, '120000', 120000, '2023-05-04', 1),
  ('CTHD1005', 'BOO1005', 'HD1005', 2, '45000', 90000, '2023-05-05', 1),
  ('CTHD1006', 'BOO1006', 'HD1006', 3, '60000', 180000, '2023-05-06', 1),
  ('CTHD1007', 'BOO1007', 'HD1007', 1, '250000', 250000, '2023-05-07', 1),
  ('CTHD1008', 'BOO1008', 'HD1008', 2, '150000', 300000, '2023-05-08', 1),
  ('CTHD1009', 'BOO1009', 'HD1009', 1, '150000', 150000, '2023-05-09', 1),
  ('CTHD1010', 'BOO1010', 'HD1010', 2, '110000', 220000, '2023-05-10', 1),

  ('CTHD1011', 'BOO1011', 'HD1011', 1, '150000', 150000, '2023-05-10', 1),
  ('CTHD1012', 'BOO1012', 'HD1012', 2, '90000', 180000, '2023-06-10', 1),
  ('CTHD1013', 'BOO1033', 'HD1013', 3, '40000', 120000, '2023-07-10', 1),
  ('CTHD1014', 'BOO1014', 'HD1014', 1, '250000', 250000, '2023-08-10', 1),
  ('CTHD1015', 'BOO1045', 'HD1015', 2, '150000', 300000, '2023-09-10', 1),
  ('CTHD1016', 'BOO1016', 'HD1016', 1, '200000', 200000, '2023-10-10', 1),
  ('CTHD1017', 'BOO1017', 'HD1017', 2, '75000', 150000, '2023-11-10', 1),
  	  -- Thêm 33 dòng dữ liệu khác vào đây
  ('CTHD1018', 'BOO1018', 'HD1018', 2, '80000', 160000, '2023-04-10', 1),
  ('CTHD1019', 'BOO1049', 'HD1019', 3, '63000', 189000, '2023-03-10', 1),
  ('CTHD1020', 'BOO1020', 'HD1020', 1, '230000', 230000, '2023-02-10', 1),
  ('CTHD1021', 'BOO1021', 'HD1021', 2, '85000', 170000, '2023-01-10', 1),
  ('CTHD1022', 'BOO1022', 'HD1022', 1, '120000', 120000, '2023-12-10', 1),
  ('CTHD1023', 'BOO1023', 'HD1023', 4, '70000', 280000, '2023-11-10', 1),
  ('CTHD1024', 'BOO1024', 'HD1024', 2, '75000', 150000, '2023-10-10', 1),
  ('CTHD1025', 'BOO1025', 'HD1025', 1, '220000', 220000, '2023-09-10', 1),
  ('CTHD1026', 'BOO1026', 'HD1026', 3, '63000', 189000, '2023-08-10', 1),
  ('CTHD1027', 'BOO1027', 'HD1027', 1, '170000', 170000, '2023-07-10'  , 1),
  ('CTHD1028', 'BOO1028', 'HD1028', 2, '95000', 190000, '2023-06-10'  , 1),
  ('CTHD1029', 'BOO1029', 'HD1029', 3, '70000', 210000, '2023-05-10' , 1),
  ('CTHD1030', 'BOO1033', 'HD1030', 1, '130000', 130000, '2023-05-10' , 1),


  ('CTHD1031', 'BOO1011', 'HD1031', 2, '85000', 170000, '2022-01-10'  , 1),
  ('CTHD1032', 'BOO1032', 'HD1032', 1, '180000', 180000, '2022-02-10'  , 1),
  ('CTHD1033', 'BOO1033', 'HD1033', 4, '70000', 280000, '2022-03-10'  , 1),
  ('CTHD1034', 'BOO1004', 'HD1034', 2, '75000', 150000, '2022-04-10'  , 1),
  ('CTHD1035', 'BOO1005', 'HD1035', 1, '200000', 200000, '2022-05-10'  , 1),
  ('CTHD1036', 'BOO1036', 'HD1036', 3, '63000', 189000, '2022-06-10' , 1),
  ('CTHD1037', 'BOO1037', 'HD1037', 1, '170000', 170000, '2022-07-10'  , 1),
  ('CTHD1038', 'BOO1038', 'HD1038', 2, '95000', 190000, '2022-08-10'  , 1),
  ('CTHD1039', 'BOO1039', 'HD1039', 3, '70000', 210000, '2022-09-10'  , 1),
  ('CTHD1040', 'BOO1040', 'HD1040', 1, '130000', 130000, '2022-10-10'  , 1),

  ('CTHD1041', 'BOO1041', 'HD1041', 2, '85000', 170000, '2023-04-11'  , 1),
  ('CTHD1042', 'BOO1012', 'HD1042', 1, '180000', 180000, '2023-04-12' , 1),
  ('CTHD1043', 'BOO1043', 'HD1043', 4, '70000', 280000, '2023-04-13'  , 1),
  ('CTHD1044', 'BOO1024', 'HD1044', 2, '75000', 150000, '2023-04-14'  , 1),
  ('CTHD1045', 'BOO1035', 'HD1045', 1, '200000', 200000, '2023-04-15'  , 1),
  ('CTHD1046', 'BOO1016', 'HD1046', 3, '63000', 189000, '2023-04-16'  , 1),
  ('CTHD1047', 'BOO1047', 'HD1047', 1, '170000', 170000, '2023-04-17'  , 1),
  ('CTHD1048', 'BOO1018', 'HD1048', 2, '95000', 190000, '2023-04-18' , 1),
  ('CTHD1049', 'BOO1049', 'HD1049', 3, '70000', 210000, '2023-04-19' , 1),

  ('CTHD1050', 'BOO1020', 'HD1050', 2, '100000', 200000, '2023-05-10', 1),
  ('CTHD1051', 'BOO1011', 'HD1051', 1, '180000', 180000, '2023-04-20', 1),
  ('CTHD1052', 'BOO1002', 'HD1052', 2, '110000', 220000, '2023-04-25', 1),
  ('CTHD1053', 'BOO1003', 'HD1053', 1, '150000', 150000, '2023-04-30', 1),
  ('CTHD1054', 'BOO1004', 'HD1054', 3, '40000', 120000, '2023-05-05', 1),
  ('CTHD1055', 'BOO1015', 'HD1055', 1, '250000', 250000, '2023-05-10', 1),
  ('CTHD1056', 'BOO1047', 'HD1056', 2, '150000', 300000, '2023-05-15', 1),
  ('CTHD1057', 'BOO1010', 'HD1057', 1, '200000', 200000, '2023-05-20', 1);

