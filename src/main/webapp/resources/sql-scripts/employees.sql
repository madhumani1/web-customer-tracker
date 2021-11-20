CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employee` VALUES 
	(1,'Madhukar','Mani','Madhukar.Mani@gmail.com'),
	(2,'Priyanka','Bhadran','priyankab.madhukar@gmail.com'),
	(3,'Atharvi','Madhukar','Atharvi.Madhukar@gmail.com'),
	(4,'Satvika','Madhukar','Satvika.Madhukar@gmail.com'),
	(5,'Mani','CN','cnmani@gmail.com');

