Drop database QLBan_PC;
Create database QLBan_PC;

-- Tạo bảng khách hàng
CREATE TABLE khachHang (
  maKh INT PRIMARY KEY,
  tenKh VARCHAR(255) NOT NULL,
  email VARCHAR(255) UNIQUE NOT NULL,
  diaChi VARCHAR(255) NOT NULL,
  soDienThoai VARCHAR(15) NOT NULL
);

-- Tạo bảng tài khoản
CREATE TABLE taiKhoan (
  maTk INT PRIMARY KEY,
  tenDangNhap VARCHAR(255) UNIQUE NOT NULL,
  matKhau VARCHAR(255) NOT NULL,
  maKh INT,
  FOREIGN KEY (maKh) REFERENCES khachHang(maKh)
);

-- Tạo bảng đơn hàng
CREATE TABLE donHang (
  maDh INT PRIMARY KEY,
  maTk INT NOT NULL,
  ngayDat DATE NOT NULL,
  tongTien DECIMAL(15,2) NOT NULL,
  FOREIGN KEY (maTk) REFERENCES taiKhoan(maTk)
);

-- Tạo bảng loại sản phẩm
CREATE TABLE loaiSanPham (
  maLoai INT PRIMARY KEY,
  tenLoai VARCHAR(255) NOT NULL
);

-- Tạo bảng sản phẩm
CREATE TABLE sanPham (
  maSp INT PRIMARY KEY,
  tenSp VARCHAR(255) NOT NULL,
  giaSp DECIMAL(15,2) NOT NULL,
  moTaSp TEXT,
  soLuong INT NOT NULL,
  maLoai INT,
  anhSp VARCHAR(255),
  FOREIGN KEY (maLoai) REFERENCES loaiSanPham(maLoai)
);

-- Tạo bảng chi tiết đơn hàng
CREATE TABLE chiTietDh (
  maDh INT NOT NULL,
  maSp INT NOT NULL,
  soLuong INT NOT NULL,
  donGia DECIMAL(15,2) NOT NULL,
  thanhTien DECIMAL(15,2) NOT NULL,
  PRIMARY KEY (maDh, maSp),
  FOREIGN KEY (maDh) REFERENCES donHang(maDh),
  FOREIGN KEY (maSp) REFERENCES sanPham(maSp)
);

-- Tạo bảng giỏ hàng
CREATE TABLE gioHang (
  maGh INT PRIMARY KEY,
  maTk INT,
  FOREIGN KEY (maTk) REFERENCES taiKhoan(maTk)
);

-- Tạo bảng chi tiết giỏ hàng
CREATE TABLE chiTietGh (
  maGh INT NOT NULL,
  maSp INT NOT NULL,
  soLuong INT NOT NULL,
  PRIMARY KEY (maGh, maSp),
  FOREIGN KEY (maGh) REFERENCES gioHang(maGh),
  FOREIGN KEY (maSp) REFERENCES sanPham(maSp)
);

-- Tạo bảng thanh toán
CREATE TABLE thanhToan (
  maTt INT PRIMARY KEY,
  maDh INT NOT NULL,
  ngayTt DATE NOT NULL,
  soTien DECIMAL(15,2) NOT NULL,
  phuongThuc VARCHAR(255) NOT NULL,
  FOREIGN KEY (maDh) REFERENCES donHang(maDh)
);




select * from khachHang

INSERT INTO khachHang (tenKh, email, diaChi, soDienThoai)
VALUES
	('Khanh', 'dk123@gmial.com', 'Go Vap', '113'),
	('Dat', 'ld123@gmial.com', 'Thu Duc', '114');


select * from taiKhoan

INSERT INTO taiKhoan (tenDangNhap, matKhau, maKh)
VALUES
	('Khanh', '123' , 1),
	('Dat', '123' , 1),
	('Dat', '123' , 3),
	('Thanh', '123' , 4);

INSERT INTO gioHang (maTk)
VALUES
	(1),
	(2);

select * from loaiSanPham

INSERT INTO loaiSanPham (maLoai, tenLoai)
VALUES
	('CPU'),
	('Ram'),
	('VGA'),
	('SSD'),
	('PSU'),
	('Mainboard');

INSERT INTO sanPham ( tenSp,  giaSp,  moTaSp, soLuong, maLoai, anhSp)
VALUES
	('i7 14700K', 400.00, 'Products with electrical plugs are designed for use in the US. Outlets and voltage differ internationally and this product may require an adapter or converter for use in your destination. Please check compatibility before purchasing.', 10, 1, 'https://product.hstatic.net/200000722513/product/n22417_png_918003a24b06431e848c39ffe676341c_grande.png'),
	('i5 13600K', 300.00, 'Products with electrical plugs are designed for use in the US. Outlets and voltage differ internationally and this product may require an adapter or converter for use in your destination. Please check compatibility before purchasing.', 10, 1, 'https://product.hstatic.net/200000722513/product/3th-right-transparent_1080x1080pixels_14fa9d16ab6e4316a06b9566f7243b51_56ae70652fbe4f08b9d09e4f939de85f_grande.png'),
	('Corsair Dominator 64GB', 200.00, 'Products with electrical plugs are designed for use in the US. Outlets and voltage differ internationally and this product may require an adapter or converter for use in your destination. Please check compatibility before purchasing.', 10, 2, 'https://product.hstatic.net/200000722513/product/dominator_rgb_platinum_wht_ddr5_01_36b7fdaea9d6428cbc4eacdf390a0e64_07e116092eb94e3b9dc3f3418cb38feb_grande.png'),
	('Trident Z5 32GB', 200.00, 'Products with electrical plugs are designed for use in the US. Outlets and voltage differ internationally and this product may require an adapter or converter for use in your destination. Please check compatibility before purchasing.', 10, 2, 'https://product.hstatic.net/200000722513/product/t-z5-rgb-32gb-2x16gb-5600-ddr5-silver_127969cd4ae24b288cd6aefbd8e5d9e3_0745f4da09da450aac57f829f4f71dd4_1024x1024.jpg'),
	('Rtx 3060Ti', 500.00, 'Products with electrical plugs are designed for use in the US. Outlets and voltage differ internationally and this product may require an adapter or converter for use in your destination. Please check compatibility before purchasing.', 10, 3, 'https://product.hstatic.net/200000722513/product/8_a754b5430b7a4a82976a957c44b09795_5dd063f7d40642219ea5207bd142627d_grande.png'),
	('Rtx 4060Ti', 450.00, 'Products with electrical plugs are designed for use in the US. Outlets and voltage differ internationally and this product may require an adapter or converter for use in your destination. Please check compatibility before purchasing.', 10, 3, 'https://product.hstatic.net/200000722513/product/fwebp__7__a9afa4bf1d7a412b8461b84498384d1e_grande.png'),
	('MP600 CORE XT 1TB', 150.00, 'Products with electrical plugs are designed for use in the US. Outlets and voltage differ internationally and this product may require an adapter or converter for use in your destination. Please check compatibility before purchasing.', 10, 4, 'https://product.hstatic.net/200000722513/product/mp600_core_xt_21_b185c78c017944cfa72685e3898fc03e_grande.png'),
	('AORUS P1200W', 1500.00, 'Products with electrical plugs are designed for use in the US. Outlets and voltage differ internationally and this product may require an adapter or converter for use in your destination. Please check compatibility before purchasing.', 10, 5, 'https://product.hstatic.net/200000722513/product/aorus_p1200w_80__platinum_modular-14_2b11f7620b6b4069a102cbc8dc68a715_836d651fb7f349afa21b4b35600ed4f9_grande.png'),
	('X299 Steel Legend', 400.00, 'Products with electrical plugs are designed for use in the US. Outlets and voltage differ internationally and this product may require an adapter or converter for use in your destination. Please check compatibility before purchasing.', 10, 6, 'https://product.hstatic.net/200000722513/product/gearvn-x299-steel-legend-2_173be5e1e2d94e389e9b68fb7d3fb3fe_14fedd66ae3d4cc0a85d12945baffc7e_grande.png'),
	('MAG B760M MORTAR', 300.00, 'Products with electrical plugs are designed for use in the US. Outlets and voltage differ internationally and this product may require an adapter or converter for use in your destination. Please check compatibility before purchasing.', 10, 6, 'https://product.hstatic.net/200000722513/product/j1_f2e57f40229345d5bd56aab5273c17f6_812a5cf6f4ad487a9dc0a724966e3695_grande.jpg');

