CREATE DATABASE IF NOT EXISTS quanlysinhvien;
use quanlysinhvien;

CREATE TABLE `sinhvien` (
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
  `MaMon` varchar(10) NOT NULL,
  `MaLop` varchar(5) NOT NULL,
  `PhongHoc` varchar(4) NOT NULL,
  PRIMARY KEY (`MaMon`,`MaLop`),
  KEY `fk_tkbsv_tkblop_idx` (`MaLop`,`MaMon`),
  CONSTRAINT `fk_tkblop_mon` FOREIGN KEY (`MaMon`) REFERENCES `monhoc` (`MaMon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `tkbsv` (
  `MSSV` varchar(7) NOT NULL,
  `MaLop` varchar(5) NOT NULL,
  `MaMon` varchar(10) NOT NULL,
  `DiemGK` float DEFAULT NULL,
  `DiemCK` float DEFAULT NULL,
  `DiemKhac` float DEFAULT NULL,
  `DiemTong` float DEFAULT NULL,
  PRIMARY KEY (`MSSV`,`MaLop`,`MaMon`),
  KEY `fk_tkbsv_tkblop_idx` (`MaLop`,`MaMon`) /*!80000 INVISIBLE */,
  KEY `fk_donphuckhao_tkbsv_idx` (`MSSV`,`MaMon`) /*!80000 INVISIBLE */,
  CONSTRAINT `fk_tkbsv_sv` FOREIGN KEY (`MSSV`) REFERENCES `sinhvien` (`MSSV`),
  CONSTRAINT `fk_tkbsv_tkblop` FOREIGN KEY (`MaLop`, `MaMon`) REFERENCES `tkblop` (`MaLop`, `MaMon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `dotphuckhao` (
  `ngayBatDau` bigint NOT NULL,
  `ngayKetThuc` bigint NOT NULL,
  PRIMARY KEY (`ngayBatDau`,`ngayKetThuc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `donphuckhao` (
  `MSSV` varchar(7) NOT NULL,
  `MaMon` varchar(10) NOT NULL,
  `CotDiem` int NOT NULL,
  `DiemMongMuon` float DEFAULT NULL,
  `LyDo` varchar(45) DEFAULT NULL,
  `TrangThai` int DEFAULT NULL,
  PRIMARY KEY (`MSSV`,`MaMon`,`CotDiem`),
  KEY `fk_donphuckhao_tkbsv_idx` (`MSSV`,`MaMon`) /*!80000 INVISIBLE */,
  CONSTRAINT `fk_donphuckhao_tkbsv` FOREIGN KEY (`MSSV`,`MaMon`) REFERENCES `tkbsv` (`MSSV`,`MaMon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


