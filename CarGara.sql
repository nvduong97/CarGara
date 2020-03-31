IF EXISTS (SELECT name FROM sys.databases WHERE name = 'CarGara')
	DROP DATABASE CarGara;
GO

CREATE DATABASE CarGara;
GO

USE CarGara;
GO

CREATE TABLE Slot(
	slotID INT IDENTITY(1,1) PRIMARY KEY,
	slotName NVARCHAR(10),
	status NVARCHAR(6),
)

INSERT INTO Slot 
VALUES	
('12', N'Rảnh'),
('13', N'Rảnh'),
('14', N'Rảnh'),
('15', N'Rảnh'),
('16', N'Rảnh'),
('17', N'Rảnh'),
('18', N'Rảnh'),
('19', N'Rảnh'),
('20', N'Rảnh');
GO
UPDATE Slot SET status = N'Rảnh' WHERE status = N'Bận';

CREATE TABLE Manager(
	managerID VARCHAR(10) PRIMARY KEY,
	account NVARCHAR(40) NOT NULL,
	password NVARCHAR(40) NOT NULL,
	salary MONEY,
	fullName VARCHAR(50) NOT NULL,
	address	NVARCHAR(50),
	phone VARCHAR(20),
	birthDate DATE,
);

INSERT INTO Manager 
VALUES	('1', 'duongnv', 'duong1234', '20000000', 'Nguyen Van Duong', 'Ha Dong - Ha Noi','0976888999','04/02/1997');
GO
SELECT * FROM Manager WHERE account = 'duongnv' and password = 'duong1234'

CREATE TABLE Technician(
	technicianID NVARCHAR(10) PRIMARY KEY,
	status NVARCHAR(6) NOT NULL,
	salary MONEY NOT NULL,
	fullName NVARCHAR(50) NOT NULL,
	address	NVARCHAR(50) NOT NULL,
	phone VARCHAR(20),
	birthDate DATE NOT NULL
);

INSERT INTO Technician 
VALUES	('00001', N'Rảnh', '10000000', N'Nguyễn Trọng Anh', N'Hà Đông - Hà Nội','094634599','1/01/1997'),
		('00002', N'Rảnh', '14000000', N'Nguyễn Bình An', N'Thanh Xuân - Hà Nội','0916884329','2/09/1990'),
		('00003', N'Rảnh', '15000000', N'Lê Anh Đức', N'Hoàng Mai - Hà Nội','0977824321','7/02/1997'),
		('00004', N'Rảnh', '15000000', N'Võ Hoàng Thịnh', N'Cầu Giấy - Hà Nội','0974777999','12/02/1995'),
		('00005', N'Rảnh', '15000000', N'Đinh Văn Chiến', N'Từ Liêm - Hà Nội','0978153243','11/04/1996'),
		('00006', N'Rảnh', '17000000', N'Nguyễn Thế Hào', N'Hoàng Mai - Hà Nội','0975666554','4/06/1995'),
		('00007', N'Rảnh', '13000000', N'Phan Văn Tiến', N'Thanh Xuân - Hà Nội','0976888999','7/02/1991'),
		('00008', N'Rảnh', '13000000', N'Nguyễn Minh Vương', N'Đống Đa - Hà Nội','0972443999','6/15/1991'),
		('00009', N'Rảnh', '13000000', N'Nguyễn Thế Thắng', N'Tây Hồ - Hà Nội','0978886699','7/10/1990'),
		('00010', N'Rảnh', '13000000', N'Nguyễn Trọng Quản', N'Ba Đình - Hà Nội','0941823399','7/12/1992'),
		('00011', N'Rảnh', '13000000', N'Lê Duy Khánh', N'Thanh Xuân - Hà Nội','0978883299','9/11/1993'),
		('00012', N'Rảnh', '13000000', N'Hoàng Đức Thành', N'Hoàng Mai - Hà Nội','0911823229','12/25/1995'),
		('00013', N'Rảnh', '15000000', N'Trịnh Quang Trung', N'Đống Đa - Hà Nội','0977888912','11/30/1997'),
		('00014', N'Rảnh', '15000000', N'Lê Đinh Bá', N'Từ Liêm- Hà Nội','0912882211','10/31/1992'),
		('00015', N'Rảnh', '15000000', N'Hoàng Văn Hiệp', N'Thanh Xuân - Hà Nội','0914888922','10/15/1994'),
		('00016', N'Rảnh', '15000000', N'Đỗ Thanh Minh', N'Cầu Giấy - Hà Nội','0914554778','11/26/1994'),
		('00017', N'Rảnh', '15000000', N'Võ Thị Thúy', N'Hà Đông - Hà Nội','0946332115','5/22/1996'),
		('00018', N'Rảnh', '15000000', N'Hoàng Minh Đạt', N'Hà Đông - Hà Nội','0945732112','9/18/1996'),
		('00019', N'Rảnh', '15000000', N'Nguyễn Tiến Hòa', N'Thanh Xuân - Hà Nội','0978665332','9/01/1993'),
		('00020', N'Rảnh', '17000000', N'Nguyễn Bá Hoàng', N'Hoàng Mai - Hà Nội','0975443299','8/15/1994'),
		('00021', N'Rảnh', '17000000', N'Lê Văn Sơn', N'Thanh Xuân - Hà Nội','0978554399','10/14/1994'),
		('00022', N'Rảnh', '15000000', N'Đỗ Quang Huy', N'Hoàng Mai - Hà Nội','0944888999','10/02/1995');
GO
SELECT technicianID,status,fullName,phone FROM Technician WHERE status = N'Rảnh';
UPDATE Technician SET status = N'Rảnh' WHERE status = N'Bận';
CREATE TABLE Customer(
	customerID INT IDENTITY(1,1) PRIMARY KEY,
	fullName NVARCHAR(50) NOT NULL,
	birthDate DATE,
	address	NVARCHAR(50) NOT NULL,
	phone VARCHAR(20) NOT NULL,
	note VARCHAR(200),
);

INSERT INTO Customer 
VALUES	(N'Hoàng Ngọc Anh', '12/02/1997', N'Hà Đông', '0972335332', ''),
		(N'Hoàng Ngọc Anh', '03/04/1991', N'Hoàng Mai', '0884533123', ''),
		(N'Hoàng Ngọc Anh', '06/24/1990', N'Hoàng Mai', '087655453', ''),
		(N'Lê Quang Trung', '02/14/1999', N'Từ Liêm', '0889660000', ''),
		(N'Võ Đình Tuấn', '01/08/2000', N'Thanh Xuân', '0954444422', '');
GO

DELETE FROM Customer WHERE customerID='9';
CREATE TABLE Car(
	carID INT IDENTITY(1,1) PRIMARY KEY,
	license NVARCHAR(20) NOT NULL,
	model NVARCHAR(40) NOT NULL,
	maker NVARCHAR(40) NOT NULL,
	note VARCHAR(200),
	customerID INT,
	FOREIGN KEY(customerID) REFERENCES Customer(customerID),
)
GO

INSERT INTO Car 
VALUES	('29M4-12945', 'Lux 2.0', 'Vinfast', '', '5'),
		('38M1-88888', 'Camry 4.0', 'Toyota', '', '5'),
		('30C5-12433', 'Vios', 'Huyndai', '', '3'),
		('29T4-36544', 'Ranger', 'Ford', '', '1'),
		('29H1-10092', 'Morning 2.0', 'Kia', '', '4');
GO
INSERT INTO Car 
VALUES	('30M4-77567', 'Faldi', 'Vinfast', '', '2')
SELECT @@IDENTITY;
GO

SELECT * FROM Car WHERE customerID = '5'


CREATE TABLE Service(
	serviceID VARCHAR(10) PRIMARY KEY,
	serviceName	NVARCHAR(100) NOT NULL,
	servicePrice INT NOT NULL,
)
INSERT INTO Service 
VALUES	('DV00001', N'Rửa xe', '300000'),
		('DV00002', N'Phủ Ceramic', '3000000'),
		('DV00003', N'Phủ thuỷ tinh', '2500000'),
		('DV00004', N'Vệ sinh xe cao cấp', '2000000'),
		('DV00005', N'Phủ gầm chống ồn chống gỉ', '4000000'),
		('DV00006', N'Đánh bóng, hiệu chỉnh mặt sơn', '3300000'),
		('DV00007', N'Sơn công nghệ cao', '3500000'),
		('DV00008', N'Gò phục hồi thân vỏ', '1500000'),
		('DV00009', N'Bảo dưỡng định kỳ', '2500000'),
		('DV00010', N'Kiểm tra tình trạng xe', '500000'),
		('DV00011', N'Sửa chữa Động cơ – Hộp số', '3000000'),
		('DV00012', N'Sửa chữa gầm bệ', '6000000'),
		('DV00013', N'Sửa chữa hệ thống điện', '4000000'),
		('DV00014', N'Dán phim cách nhiệt', '2000000');
GO

CREATE TABLE Accessories(
	accessoriesID VARCHAR(10) PRIMARY KEY,
	accessoriesName	NVARCHAR(100) NOT NULL,
	accessoriesPrice INT NOT NULL
)
INSERT INTO Accessories 
VALUES	('LK00001', N'Dây curoa máy', '300000'),
		('LK00002', N'Dây curoa cam', '3000000'),
		('LK00003', N'Lọc gió điều hòa', '2500000'),
		('LK00004', N'Lọc gió động cơ', '2000000'),
		('LK00005', N'Lọc nhiên liệu', '4000000'),
		('LK00006', N'Lọc nhớt động cơ', '3300000'),
		('LK00007', N'Đĩa ly hợp ', '3500000'),
		('LK00008', N'Má phanh', '1500000'),
		('LK00009', N'Chổi gạt nước', '2500000'),
		('LK00010', N'Bugi', '500000'),
		('LK00011', N'Bộ khởi động', '3000000'),
		('LK00012', N'Máy nén', '6000000'),
		('LK00013', N'Bơm nhiên liệu', '4000000'),
		('LK00014', N'Đèn pha', '2000000'),
		('LK00015', N'Đèn xi nhan', '500000'),
		('LK00016', N'Đèn hậu', '3000000'),
		('LK00017', N'Đèn sương mù', '6000000'),
		('LK00018', N'Bơm nhiên liệu', '4000000');
GO

CREATE TABLE Bill(
	billID	INT IDENTITY(1,1) PRIMARY KEY,
	customerID INT,
	carID INT,
	totalMoney	INT,
	FOREIGN KEY(customerID) REFERENCES Customer(customerID),
)
GO

CREATE TABLE ServiceBill(
	billID INT,
	serviceID VARCHAR(10),
	amount INT,
	PRIMARY KEY(billID, serviceID),
	FOREIGN KEY(billID) REFERENCES Bill(billID),
	FOREIGN KEY(serviceID) REFERENCES Service(serviceID),
)
GO

CREATE TABLE AccessoriesBill(
	billID INT,
	accessoriesID VARCHAR(10),
	amount INT,
	PRIMARY KEY(billID, accessoriesID),
	FOREIGN KEY(billID) REFERENCES Bill(billID),
	FOREIGN KEY(accessoriesID) REFERENCES Accessories(accessoriesID),
)
GO
SELECT * FROM AccessoriesBill WHERE billID = 7
DELETE FROM Bill WHERE totalMoney = 0;
DELETE FROM Customer WHERE customerID = 52;
DELETE FROM Car WHERE carID = 12;
UPDATE AccessoriesBill SET amount = 9 WHERE accessoriesID = 'LK00010' AND billID = 7