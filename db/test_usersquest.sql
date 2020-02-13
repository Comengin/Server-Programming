-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `usersquest`
--

DROP TABLE IF EXISTS `usersquest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usersquest` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `questions` varchar(45) NOT NULL,
  `answers` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usersquest`
--

LOCK TABLES `usersquest` WRITE;
/*!40000 ALTER TABLE `usersquest` DISABLE KEYS */;
INSERT INTO `usersquest` VALUES (1,'The capital city of Turkey','Ankara'),(2,'The most crowded city of Turkey','Istanbul'),(3,'The capital city of UK','London'),(4,'The capital city of USA','Washington'),(5,'The capital city of Germany','Berlin'),(6,'The capital city of France','Paris'),(7,'The capital city of Azerbaijan','Baku'),(8,'The capital city of Russia','Moscow'),(9,'The capital city of Japan','Tokio'),(10,'The capital city of Canada','Ottava'),(11,'The capital city of China','Pekin'),(12,'The capital city of South Korea','Seoul'),(13,'The capital city of Australia','Kanberra'),(14,'The capital city of Ireland','Dublin'),(15,'The capital city of New Zealand','Wellington'),(16,'The capital city of Italy','Roma'),(17,'The capital city of Spain','Madrid'),(18,'The capital city of Portugal','Lisbon'),(19,'The capital city of Georgia','Tbilisi'),(20,'The third big city in Turkey','Izmir');
/*!40000 ALTER TABLE `usersquest` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-19 23:45:41
