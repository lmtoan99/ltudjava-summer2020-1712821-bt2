CREATE DATABASE IF NOT EXISTS quanlysinhvien;
use quanlysinhvien;

CREATE TABLE `sinhvien` (
  `STT` int DEFAULT NULL,
  `MSSV` varchar(7) NOT NULL,
  `HoTen` varchar(45) NOT NULL,
  `GioiTinh` int DEFAULT NULL,
  `CMND` varchar(9) DEFAULT NULL,
  `MaLop` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`MSSV`),
  UNIQUE KEY `CMND_UNIQUE` (`CMND`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `usersv` (
  `MSSV` varchar(7) NOT NULL,
  `Password` varchar(45) NOT NULL,
  PRIMARY KEY (`MSSV`),
  CONSTRAINT `fk_usersv_sv` FOREIGN KEY (`MSSV`) REFERENCES `sinhvien` (`MSSV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `usergiaovu` (
  `Username` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  PRIMARY KEY (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `monhoc` (
  `MaMon` varchar(10) NOT NULL,
  `TenMon` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`MaMon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `tkblop` (
  `STT` int NOT NULL,
  `MaMon` varchar(10) NOT NULL,
  `MaLop` varchar(5) NOT NULL,
  `PhongHoc` varchar(4) NOT NULL,
  PRIMARY KEY (`MaMon`,`MaLop`),
  KEY `fk_tkbsv_tkblop_idx` (`MaLop`,`MaMon`),
  CONSTRAINT `fk_tkblop_mon` FOREIGN KEY (`MaMon`) REFERENCES `monhoc` (`MaMon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `tkbsv` (
  `STT` int NOT NULL,
  `MSSV` varchar(7) NOT NULL,
  `MaLop` varchar(5) NOT NULL,
  `MaMon` varchar(10) NOT NULL,
  `DiemGK` float unsigned DEFAULT NULL,
  `DiemCK` float unsigned DEFAULT NULL,
  `DiemKhac` float unsigned DEFAULT NULL,
  `DiemTong` float unsigned DEFAULT NULL,
  PRIMARY KEY (`MSSV`,`MaLop`,`MaMon`),
  KEY `fk_tkbsv_tkblop_idx` (`MaLop`,`MaMon`) /*!80000 INVISIBLE */,
  CONSTRAINT `fk_tkbsv_sv` FOREIGN KEY (`MSSV`) REFERENCES `sinhvien` (`MSSV`),
  CONSTRAINT `fk_tkbsv_tkblop` FOREIGN KEY (`MaLop`, `MaMon`) REFERENCES `tkblop` (`MaLop`, `MaMon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;