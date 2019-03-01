-- MySQL dump 10.17  Distrib 10.3.11-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: users
-- ------------------------------------------------------
-- Server version	10.3.11-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `utilisateur` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `numero` int(11) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `adresse` varchar(255) NOT NULL,
  `photo` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `numero` (`numero`),
  UNIQUE KEY `phone` (`phone`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utilisateur`
--

LOCK TABLES `utilisateur` WRITE;
/*!40000 ALTER TABLE `utilisateur` DISABLE KEYS */;
INSERT INTO `utilisateur` VALUES (4,'Savage','Tiger',278,'0474142587','tiger@hou.com','78, allee des anges 59862 CHATEAUROUX','https://d3iw72m71ie81c.cloudfront.net/male-27.jpg'),(5,'Dupont','Agnes',1457,'0654781029','annii74@hotmail.fr','45 rue des marshall 12458 CHARTRES','https://d3iw72m71ie81c.cloudfront.net/female-6.jpg'),(6,'Lemaire','Fabrice',478955,'0687967845','lemaire@gmail.com','478, rue de cervelat 78965 NANTES','https://d3iw72m71ie81c.cloudfront.net/male-19.jpg'),(7,'Hahn','Pamela',511618,'01 84 40 49 83','congue@estarcuac.edu','Ap #161-6232 Risus. Road','https://d3iw72m71ie81c.cloudfront.net/female-68.jpg'),(8,'Flynn','Russo',7276,'06 19 69 97 68','est.Mauris.eu@nonarcu.ca','P.O. Box 936, 3615 Donec St.','https://d3iw72m71ie81c.cloudfront.net/male-43.jpg'),(10,'Gloria','Nunez',650966,'09 34 59 87 53','Aliquam@nibh.ca','P.O. Box 831, 9858 Cras Rd.','https://d3iw72m71ie81c.cloudfront.net/female-105.jpg'),(11,'Coleman','Janine',543983,'03 07 34 81 01','lacus.vestibulum@sedfacilisis.net','822-1781 Libero. Rd.','https://d3iw72m71ie81c.cloudfront.net/female-12.jpg'),(12,'Libby','Moody',544540,'01 45 36 31 68','ac.libero.nec@scelerisquemollis.net','Ap #947-5368 Mauris St.','https://d3iw72m71ie81c.cloudfront.net/male-95.jpg'),(14,'Irwin','Nichole',177302,'09 53 00 72 76','ipsum@vulputatemaurissagittis.edu','9818 Ac Street','https://d3iw72m71ie81c.cloudfront.net/female-104.JPG'),(15,'Yeo','Walsh',345466,'07 60 71 94 26','cursus.luctus@In.net','P.O. Box 250, 531 Sapien Rd.','https://d3iw72m71ie81c.cloudfront.net/male-13.jpg'),(16,'Uta','Gibbs',620570,'07 50 13 96 36','convallis.ligula@duisemperet.com','836-5423 Phasellus Avenue','https://d3iw72m71ie81c.cloudfront.net/male-7.jpg'),(17,'Arden','Munoz',736013,'09 51 44 46 51','interdum.Sed@amet.ca','6764 Placerat. Rd.','https://d3iw72m71ie81c.cloudfront.net/male-104.jpg'),(18,'Mack','April',820046,'03 77 78 31 53','massa@felisadipiscing.co.uk','138-335 Sem Rd.','https://d3iw72m71ie81c.cloudfront.net/female-20.jpeg'),(27,'Moreno','Bianca',621637,'01 37 26 34 30','amet@vestibulum.com','P.O. Box 217, 3353 Tempor Avenue','https://d3iw72m71ie81c.cloudfront.net/jenn.png'),(28,'Cox','Courtney',419655,'08 00 81 55 98','magnis.dis.parturient@Aeneanegestas.co.uk','P.O. Box 693, 8357 Adipiscing Rd.','https://d3iw72m71ie81c.cloudfront.net/female-76.jpg'),(29,'Gibson','Georges',5868465,'574684','om@lille.fr','44 rue des carlier 87542 NANTES','https://d3iw72m71ie81c.cloudfront.net/male-95.jpg'),(45,'Cordie','Annie',47896,'0689745698','test@g.fr','14 rue tro','https://d3iw72m71ie81c.cloudfront.net/female-74.jpg'),(57,'Tapis','Bernard',154878,'0687459781','t.b@gmail.com','21, rue des chenes LENS','https://d3iw72m71ie81c.cloudfront.net/male-66.jpg'),(61,'Maizer','Matt',0,'0123457898','mattM@gmail.com','47, rue des canons LILLE','https://d3iw72m71ie81c.cloudfront.net/male-11.jpg'),(62,'Stefani','Gwen',78945,'14587','aga@g.fr','14 rue des babouins LILLE','https://d3iw72m71ie81c.cloudfront.net/female-16.jpeg');
/*!40000 ALTER TABLE `utilisateur` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-01 11:04:26
