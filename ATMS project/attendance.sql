# Host: localhost  (Version 5.1.73-community)
# Date: 2018-10-23 14:03:45
# Generator: MySQL-Front 6.1  (Build 1.21)


#
# Structure for table "attendance"
#

DROP TABLE IF EXISTS `attendance`;
CREATE TABLE `attendance` (
  `S_Name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `JoiningDate` varchar(255) DEFAULT NULL,
  `D1` varchar(255) DEFAULT 'A',
  `D2` varchar(255) DEFAULT 'A',
  `D3` varchar(255) DEFAULT 'A',
  `D4` varchar(255) DEFAULT 'A',
  `D5` varchar(255) DEFAULT 'A',
  `D6` varchar(255) DEFAULT 'A',
  `D7` varchar(255) DEFAULT 'A',
  `D8` varchar(255) DEFAULT 'A',
  `D9` varchar(255) DEFAULT 'A',
  `D10` varchar(255) DEFAULT 'A',
  `D11` varchar(255) DEFAULT 'A',
  `D12` varchar(255) DEFAULT 'A',
  `D13` varchar(255) DEFAULT 'A',
  `D14` varchar(255) DEFAULT 'A',
  `D15` varchar(255) DEFAULT 'A',
  `D16` varchar(255) DEFAULT 'A',
  `D17` varchar(255) DEFAULT 'A',
  `D18` varchar(255) DEFAULT 'A',
  `D19` varchar(255) DEFAULT 'A',
  `D20` varchar(255) DEFAULT 'A',
  `D21` varchar(255) DEFAULT 'A',
  `D22` varchar(255) DEFAULT 'A',
  `D23` varchar(255) DEFAULT 'A',
  `D24` varchar(255) DEFAULT 'A',
  `D25` varchar(255) DEFAULT 'A',
  `D26` varchar(255) DEFAULT 'A',
  `D27` varchar(255) DEFAULT 'A',
  `D28` varchar(255) DEFAULT 'A',
  `D29` varchar(255) DEFAULT 'A',
  `D30` varchar(255) DEFAULT 'A',
  `D31` varchar(255) DEFAULT 'A'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "attendance"
#

INSERT INTO `attendance` VALUES ('Rafiaan Shaikh','rafi@gmail.com','23-10-2018','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','P','A','A','A','A','A','A','A','A'),('Rafiaan Shaikh','rafi1@gmail.com','23-10-2018','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A'),('Rafiaan Shaikh','rafi112@gmail.com','23-10-2018','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A'),('Rafiaan Shaikh','bilal@gmail.com','23-10-2018','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A'),('Rafiaan Shaikh','bilal123@gmail.com','23-10-2018','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A'),('Bilal Zaveri','bilalzaveri1234@gmail.com','23-10-2018','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A'),('Bilal Zaveri','zaveri@gmail.com','23-10-2018','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A'),('Shehbaz','shehbaz@gmail.com','23-10-2018','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A'),('Shehbaz ansari','shehbaz-ansari@gmail.com','23-10-2018','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A');

#
# Structure for table "table1"
#

DROP TABLE IF EXISTS `table1`;
CREATE TABLE `table1` (
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) NOT NULL,
  UNIQUE KEY `lastname` (`lastname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "table1"
#

INSERT INTO `table1` VALUES ('bilal','123',''),('bilal','123','a@b.c');

#
# Structure for table "task"
#

DROP TABLE IF EXISTS `task`;
CREATE TABLE `task` (
  `Name` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Task` varchar(255) DEFAULT NULL,
  `Assigndate` varchar(255) DEFAULT NULL,
  `CompleteDate` varchar(255) DEFAULT NULL,
  `Grade` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "task"
#

INSERT INTO `task` VALUES ('Rafiaan Shaikh','rafi@gmail.com','Your Task will be assigned soon',NULL,NULL,NULL),('Rafiaan Shaikh','rafi@gmail.com','aaaaaaa','2018-10-23','2018-10-23',NULL),('Bilal Zaveri','bilalzaveri1234@gmail.com',NULL,NULL,NULL,NULL),('Bilal Zaveri','zaveri@gmail.com','Not yet Assigned','- - -','- - -',NULL),('Shehbaz','shehbaz@gmail.com','Not yet Assigned','- - -','- - -',NULL),('Shehbaz','shehbaz@gmail.com','hello java','2018-10-23','2018-10-23',NULL),('Shehbaz ansari','shehbaz-ansari@gmail.com','Not yet Assigned','0000-00-00','0000-00-00',NULL),('Shehbaz ansari','shehbaz-ansari@gmail.com','hello java','2018-10-23','2018-10-23',NULL);

#
# Structure for table "users"
#

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `Id` int(2) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) DEFAULT NULL,
  `Contact` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `JoiningDate` varchar(255) DEFAULT NULL,
  `Technology` varchar(255) DEFAULT NULL,
  `Location` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `Email` (`Email`)
) ENGINE=InnoDB AUTO_INCREMENT=140 DEFAULT CHARSET=latin1;

#
# Data for table "users"
#

INSERT INTO `users` VALUES (128,'Rafiaan Shaikh','9820313145','rafi@gmail.com','aaaa','23-10-2018','JAVA','MUMBAI'),(129,'Rafiaan Shaikh','9820313145','rafi1@gmail.com','aaaa','23-10-2018','JAVA','MUMBAI'),(130,'Rafiaan Shaikh','9820313145','rafi112@gmail.com','aaaa','23-10-2018','JAVA','MUMBAI'),(131,'Rafiaan Shaikh','9820313145','bilal@gmail.com','aaaa','23-10-2018','JAVA','MUMBAI'),(133,'Rafiaan Shaikh','9820313145','bilal123@gmail.com','aaa','23-10-2018','JAVA','MUMBAI'),(134,'Bilal Zaveri','1212121212','bilalzaveri1234@gmail.com','aaaa','23-10-2018','JAVA','KURLA'),(137,'Bilal Zaveri','1234567890','zaveri@gmail.com','aaaa','23-10-2018','JAVA','MUMBAI'),(138,'Shehbaz','1234567890','shehbaz@gmail.com','aaaa','23-10-2018','JAVA','MUMBAI'),(139,'Shehbaz ansari','1234567890','shehbaz-ansari@gmail.com','aaaa','23-10-2018','JAVA','MUMBAI');
