/*使用mysql数据库*/


CREATE SCHEMA `bomoda` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE `Biz` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Source database incremental id',
  `Biz_ID` varchar(64) NOT NULL COMMENT 'Biz account unique id',
  `Biz_Name` varchar(512) DEFAULT NULL COMMENT 'Account name shown on the platform',
  `Biz_Code` varchar(512) DEFAULT NULL COMMENT 'Account registered name',
  `Biz_Description` varchar(512) DEFAULT NULL COMMENT 'Description of account',
  `QRcode` varchar(512) DEFAULT NULL COMMENT 'Account’s QR code',
  `Timestamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time of record creation',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `Biz_ID_UNIQUE` (`Biz_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

CREATE TABLE `Page` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Source database incremental id',
  `URL` varchar(512) DEFAULT NULL COMMENT 'URL for page content',
  `Title` varchar(512) DEFAULT NULL COMMENT 'Page title',
  `Content` varchar(1024) DEFAULT NULL COMMENT 'Page raw html content',
  `Timestamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time of record creation',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `Click` (
  `ID` int(11)  NOT NULL AUTO_INCREMENT  COMMENT 'Source database incremental id',
  `URL` varchar(512) DEFAULT NULL COMMENT 'Corresponding page URL',
  `Title` varchar(512) DEFAULT NULL COMMENT 'Corresponding page title',
  `Read_Number` int(11) DEFAULT NULL COMMENT 'Page’s read number',
  `Like_Number` int(11) DEFAULT NULL COMMENT 'Page’s like number',
  `Timestamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time of record creation',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
