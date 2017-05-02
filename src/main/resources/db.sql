-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: test_doctor
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doctor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `doctorName` varchar(50) NOT NULL,
  `specialization` varchar(200) NOT NULL,
  `mobile` varchar(50) NOT NULL,
  `experience` varchar(500) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `hospitalName` varchar(50) NOT NULL,
  `hospitalNumber` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor_apointment`
--

DROP TABLE IF EXISTS `doctor_apointment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doctor_apointment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `doctorId` int(11) NOT NULL,
  `patientId` int(11) NOT NULL,
  `apointmentDate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `doctorId` (`doctorId`),
  KEY `patientId` (`patientId`),
  CONSTRAINT `doctor_apointment_ibfk_1` FOREIGN KEY (`doctorId`) REFERENCES `doctor` (`id`),
  CONSTRAINT `doctor_apointment_ibfk_2` FOREIGN KEY (`patientId`) REFERENCES `woman` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor_apointment`
--

LOCK TABLES `doctor_apointment` WRITE;
/*!40000 ALTER TABLE `doctor_apointment` DISABLE KEYS */;
/*!40000 ALTER TABLE `doctor_apointment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `woman`
--

DROP TABLE IF EXISTS `woman`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `woman` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fullname` varchar(50) NOT NULL,
  `division` varchar(50) NOT NULL,
  `district` varchar(50) NOT NULL,
  `opazila` varchar(50) NOT NULL,
  `union` varchar(50) NOT NULL,
  `mobile` varchar(50) NOT NULL,
  `lmpDate` date DEFAULT NULL,
  `dueDate` date DEFAULT NULL,
  `cycledays` int(11) DEFAULT NULL,
  `height` float DEFAULT NULL,
  `weight` float DEFAULT NULL,
  `ovulationdays` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `woman`
--

LOCK TABLES `woman` WRITE;
/*!40000 ALTER TABLE `woman` DISABLE KEYS */;
/*!40000 ALTER TABLE `woman` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-02 19:57:53
