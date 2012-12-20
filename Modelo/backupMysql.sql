CREATE DATABASE  IF NOT EXISTS `nardi` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `nardi`;
-- MySQL dump 10.13  Distrib 5.5.28, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: nardi
-- ------------------------------------------------------
-- Server version	5.5.28-0ubuntu0.12.10.2

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
-- Table structure for table `BasicData`
--

DROP TABLE IF EXISTS `BasicData`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BasicData` (
  `idBasic` int(11) NOT NULL AUTO_INCREMENT,
  `dataBaseName` varchar(50) NOT NULL,
  `name` varchar(150) NOT NULL,
  `field` varchar(300) NOT NULL,
  `editable` tinyint(1) NOT NULL,
  `priority` int(11) NOT NULL,
  `status` char(1) NOT NULL,
  PRIMARY KEY (`idBasic`)
) ENGINE=InnoDB AUTO_INCREMENT=129 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BasicData`
--

LOCK TABLES `BasicData` WRITE;
/*!40000 ALTER TABLE `BasicData` DISABLE KEYS */;
INSERT INTO `BasicData` VALUES (1,'BUDGET','RESIDENCIAL','BUILDING TYPE',0,1,'A'),(2,'BUDGET','COMERCIAL','BUILDING TYPE',0,2,'A'),(3,'BUDGET','EMPRESARIAL','BUILDING TYPE',0,3,'A'),(4,'BUDGET','HOSPITAL','BUILDING TYPE',0,4,'A'),(5,'BUDGET','HOTEL','BUILDING TYPE',0,5,'A'),(6,'BUDGET','INDUSTRIAL','BUILDING TYPE',0,6,'A'),(7,'BUDGET','PASAJERO','ELEVATOR TYPE',0,1,'A'),(8,'BUDGET','MONTA CAMILLA','ELEVATOR TYPE',0,2,'A'),(9,'BUDGET','PANORAMICO','ELEVATOR TYPE',0,3,'A'),(10,'BUDGET','CARGA','ELEVATOR TYPE',0,4,'A'),(11,'BUDGET','MONTA CARRO','ELEVATOR TYPE',0,5,'A'),(12,'BUDGET','MONTA PLATO','ELEVATOR TYPE',0,6,'A'),(13,'BUDGET','WINCHE','ELEVATOR TYPE',0,7,'A'),(14,'BUDGET','320 - 4','ELEVATOR CAPACITANCE',0,1,'A'),(15,'BUDGET','450 - 6','ELEVATOR CAPACITANCE',0,2,'A'),(16,'BUDGET','600 - 8','ELEVATOR CAPACITANCE',0,3,'A'),(17,'BUDGET','800 - 10','ELEVATOR CAPACITANCE',0,4,'A'),(18,'BUDGET','1000 - 13','ELEVATOR CAPACITANCE',0,5,'A'),(19,'BUDGET','1250 - 16','ELEVATOR CAPACITANCE',0,6,'A'),(20,'BUDGET','1500 - 19','ELEVATOR CAPACITANCE',0,7,'A'),(21,'BUDGET','2000 - 22','ELEVATOR CAPACITANCE',0,8,'A'),(22,'BUDGET','CON SALA DE MAQUINA 2V','MACHINE TYPE',0,1,'A'),(23,'BUDGET','CON SALA DE MAQUINA VVVF','MACHINE TYPE',0,2,'A'),(24,'BUDGET','SIN SALA DE MAQUINA MRL','MACHINE TYPE',0,3,'A'),(25,'BUDGET','HIDRAULICO','MACHINE TYPE',0,4,'A'),(26,'BUDGET','WINCHE','MACHINE TYPE',0,5,'A'),(27,'BUDGET','1 PUERTA','BUILDING EMBARQUE',0,1,'A'),(28,'BUDGET','2 PUERTAS (DOBLE ACCESO - 180)','BUILDING EMBARQUE',0,2,'A'),(29,'BUDGET','2 PUERTAS (DOBLE ACCESO - 90)','BUILDING EMBARQUE',0,3,'A'),(30,'BUDGET','2 PUERTAS (DOBLE ACCESO - 270)','BUILDING EMBARQUE',0,4,'A'),(31,'BUDGET','208V','ELECTRICITY TYPE',0,1,'A'),(32,'BUDGET','220V','ELECTRICITY TYPE',0,2,'A'),(33,'BUDGET','308V','ELECTRICITY TYPE',0,3,'A'),(34,'BUDGET','440V','ELECTRICITY TYPE',0,4,'A'),(35,'BUDGET','0.5','SPEED',0,1,'A'),(36,'BUDGET','1','SPEED',0,2,'A'),(37,'BUDGET','1.2','SPEED',0,3,'A'),(38,'BUDGET','1.6','SPEED',0,4,'A'),(39,'BUDGET','1.75','SPEED',0,5,'A'),(40,'BUDGET','2','SPEED',0,6,'A'),(41,'BUDGET','2.5','SPEED',0,7,'A'),(42,'BUDGET','60 HZ','FREQUENCY',0,1,'A'),(43,'BUDGET','50 HZ','FREQUENCY',0,2,'A'),(44,'BUDGET','110V','VOLTAGE LIGHTING',0,1,'A'),(45,'BUDGET','220V','VOLTAGE LIGHTING',0,2,'A'),(46,'BUDGET','180 HORAS (STANDARD)','HOUR MACHINE',0,1,'A'),(47,'BUDGET','240 HORAS (ALTO TRAFICO)','HOUR MACHINE',0,2,'A'),(48,'BUDGET','COLECTIVA EN BAJADA SIMPLEX (UN BOTON)','MANEUVER TYPE',0,1,'A'),(49,'BUDGET','COLECTIVA EN BAJADA DUPLEX (UN BOTON)','MANEUVER TYPE',0,2,'A'),(50,'BUDGET','COLECTIVA EN BAJADA TRIPLEX (UN BOTON)','MANEUVER TYPE',0,3,'A'),(51,'BUDGET','COLECTIVA EN BAJADA CUADRUPLEX (UN BOTON)','MANEUVER TYPE',0,4,'A'),(52,'BUDGET','COLECTIVA EN BAJADA SIMPLEX (DOS BOTONES)','MANEUVER TYPE',0,5,'A'),(53,'BUDGET','COLECTIVA EN BAJADA DUPLEX (DOS BOTONES)','MANEUVER TYPE',0,6,'A'),(54,'BUDGET','COLECTIVA EN BAJADA TRIPLEX (DOS BOTONES)','MANEUVER TYPE',0,7,'A'),(55,'BUDGET','COLECTIVA EN BAJADA CUADRUPLEX (DOS BOTONES)','MANEUVER TYPE',0,8,'A'),(56,'BUDGET','FORMICA','DESIGN 1357',0,1,'A'),(57,'BUDGET','ACERO INOXIDABLE','DESIGN 1357',0,2,'A'),(58,'BUDGET','FORMICA - HORIZONTAL','DESIGN P26',0,1,'A'),(59,'BUDGET','FORMICA - VERTICAL','DESIGN P26',0,2,'A'),(60,'BUDGET','ACERO INOX. - HORIZONTAL','DESIGN P26',0,3,'A'),(61,'BUDGET','ACERO INOX. - VERTICAL','DESIGN P26',0,4,'A'),(62,'BUDGET','PL-3','ROOF TYPE',0,1,'A'),(63,'BUDGET','PL-4','ROOF TYPE',0,2,'A'),(64,'BUDGET','PL-6','ROOF TYPE',0,3,'A'),(65,'BUDGET','PL-PERFORADO','ROOF TYPE',0,4,'A'),(66,'BUDGET','PL-MODULAR','ROOF TYPE',0,5,'A'),(67,'BUDGET','CORTA','BUTTON TYPE',0,1,'A'),(68,'BUDGET','PISO A TECHO','BUTTON TYPE',0,2,'A'),(69,'BUDGET','PISO A TECHO CON TELF','BUTTON TYPE',0,3,'A'),(70,'BUDGET','RECTO','RAILING',0,1,'A'),(71,'BUDGET','REDONDO','RAILING',0,2,'A'),(72,'BUDGET','DOBLE PASAMANO REDONDO','RAILING',0,3,'A'),(73,'BUDGET','ACERO TIPO ESPEJO','RAILING',0,1,'A'),(74,'BUDGET','POR CUENTA DEL CLIENTE','RAILING',0,2,'A'),(75,'BUDGET','VINIL','FLOOR TYPE',0,1,'A'),(76,'BUDGET','VULCA','FLOOR TYPE',0,2,'A'),(77,'BUDGET','GRANITO','FLOOR TYPE',0,3,'A'),(78,'BUDGET','GRANITO POR CUENTA DEL CLIENTE','FLOOR TYPE',0,4,'A'),(79,'BUDGET','OTROS','FLOOR TYPE',0,5,'A'),(80,'BUDGET','1 - 450 KG','FAN',0,1,'A'),(81,'BUDGET','1 - 600 KG','FAN',0,2,'A'),(82,'BUDGET','2 - 800 KG','FAN',0,3,'A'),(83,'BUDGET','2 - 1000 KG','FAN',0,4,'A'),(84,'BUDGET','2 - 1200 KG','FAN',0,5,'A'),(85,'BUDGET','2 - 1500 KG','FAN',0,6,'A'),(86,'BUDGET','APERTURA TELESCOPIO IZQUIERDO','DOOR TYPE',0,1,'A'),(87,'BUDGET','APERTURA TELESCOPIO DERECHA','DOOR TYPE',0,2,'A'),(88,'BUDGET','APERTURA TELESCOPIO CENTRAL','DOOR TYPE',0,3,'A'),(89,'BUDGET','APERTURA CENTRAL','DOOR TYPE',0,4,'A'),(90,'BUDGET','BATIENTE','DOOR TYPE',0,5,'A'),(91,'BUDGET','FERMATOR','DOOR SYSTEM',0,1,'A'),(92,'BUDGET','SELCON','DOOR SYSTEM',0,2,'A'),(93,'BUDGET','RECTO - 50X100','DOOR FRAME TYPE',0,1,'A'),(94,'BUDGET','RECTO - 30X150','DOOR FRAME TYPE',0,2,'A'),(95,'BUDGET','ABIERTO','DOOR FRAME TYPE',0,3,'A'),(96,'BUDGET','OCULTO','DOOR FRAME TYPE',0,4,'A'),(97,'BUDGET','700','FREE ADMISSION',0,1,'A'),(98,'BUDGET','800','FREE ADMISSION',0,2,'A'),(99,'BUDGET','900','FREE ADMISSION',0,3,'A'),(100,'BUDGET','1000','FREE ADMISSION',0,4,'A'),(101,'BUDGET','1100','FREE ADMISSION',0,5,'A'),(102,'BUDGET','1200','FREE ADMISSION',0,6,'A'),(103,'BUDGET','2000','HEIGHT',0,1,'A'),(104,'BUDGET','2100','HEIGHT',0,2,'A'),(105,'BUDGET','SISTEL','CONTROL TYPE',0,1,'A'),(106,'BUDGET','CF CONTROL','CONTROL TYPE',0,2,'A'),(107,'BUDGET','RELEMATICO','CONTROL TYPE',0,3,'A'),(108,'BUDGET','SISTEL TELEFONICA','BOOTH BUTTON',0,1,'A'),(109,'BUDGET','BOTON ACERO PLASTICO CON NOMENCLATURA Y BRAILLE DE 37mm','BOOTH BUTTON',0,2,'A'),(110,'BUDGET','BOTON DE ACERO INOX. ANTI - VANDALICO DE 30 mm','BOOTH BUTTON',0,3,'A'),(111,'BUDGET','SISTEL MATRIZ DE PUNTO PEQUENO','BOOTH DISPLAY',0,1,'A'),(112,'BUDGET','SISTEL MATRIZ DE PUNTO GRANDE','BOOTH DISPLAY',0,2,'A'),(113,'BUDGET','SISTEL MATRIZ DE PUNTO HORA Y GRADO','BOOTH DISPLAY',0,3,'A'),(114,'BUDGET','SISTEL LCD DE 7\'\'','BOOTH DISPLAY',0,4,'A'),(115,'BUDGET','SISTEL LCD AZUL','BOOTH DISPLAY',0,5,'A'),(116,'BUDGET','CF CONTROL MATRIZ DE PUNTO ROJO','BOOTH DISPLAY',0,6,'A'),(117,'BUDGET','CF CONTROL MATRIZ DE PUNTO AZUL','BOOTH DISPLAY',0,7,'A'),(118,'BUDGET','CF CONTROL LCD AZUL','BOOTH DISPLAY',0,8,'A'),(119,'BUDGET','SISTEL MATRIZ DE PUNTO PEQUENO','FLOOR DISPLAY',0,1,'A'),(120,'BUDGET','SISTEL MATRIZ DE PUNTO GRANDE','FLOOR DISPLAY',0,2,'A'),(121,'BUDGET','SISTEL MATRIZ DE PUNTO HORA Y GRADO','FLOOR DISPLAY',0,3,'A'),(122,'BUDGET','SISTEL LCD DE 7 \'\'','FLOOR DISPLAY',0,4,'A'),(123,'BUDGET','SISTEL LCD AZUL','FLOOR DISPLAY',0,5,'A'),(124,'BUDGET','CF CONTROL MATRIZ DE PUNTO ROJO','FLOOR DISPLAY',0,6,'A'),(125,'BUDGET','CF CONTROL MATRIZ DE PUNTO AZUL','FLOOR DISPLAY',0,7,'A'),(126,'BUDGET','CF CONTROL LCD AZUL','FLOOR DISPLAY',0,8,'A'),(127,'BUDGET','ACERO TIPO ESPEJO','MIRROR',0,1,'A'),(128,'BUDGET','POR CUENTA DEL CLIENTE','MIRROR',0,2,'A');
/*!40000 ALTER TABLE `BasicData` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Budget`
--

DROP TABLE IF EXISTS `Budget`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Budget` (
  `idBudget` int(11) NOT NULL AUTO_INCREMENT,
  `number` int(11) NOT NULL,
  `date` datetime NOT NULL,
  `partnerName` varchar(100) NOT NULL,
  `construction` varchar(100) NOT NULL,
  `constructionNumber` varchar(15) NOT NULL,
  `seller` varchar(100) NOT NULL,
  `constructionAddress` varchar(200) NOT NULL,
  `constructionCity` varchar(100) NOT NULL,
  `contactPhone` varchar(15) NOT NULL,
  `email` varchar(100) NOT NULL,
  `contactName` varchar(100) NOT NULL,
  `planeP` tinyint(1) DEFAULT NULL,
  `planeC` tinyint(1) DEFAULT NULL,
  `type` tinyint(1) NOT NULL,
  `buildingType` int(11) DEFAULT NULL,
  `elevatorType` int(11) DEFAULT NULL,
  `elevatorQuantity` int(11) DEFAULT NULL,
  `elevatorCapacitance` int(11) DEFAULT NULL,
  `motorQuantity` int(11) DEFAULT NULL,
  `motorTraction` varchar(10) DEFAULT NULL,
  `machineType` int(11) DEFAULT NULL,
  `embarque` int(11) DEFAULT NULL,
  `electricityType` int(11) DEFAULT NULL,
  `speed` int(11) DEFAULT NULL,
  `frequency` int(11) DEFAULT NULL,
  `voltageLighting` int(11) DEFAULT NULL,
  `hourMachine` int(11) DEFAULT NULL,
  `maneuverType` int(11) DEFAULT NULL,
  `stopNumber` int(11) DEFAULT NULL,
  `tour` int(11) DEFAULT NULL,
  `onTour` int(11) DEFAULT NULL,
  `widthHole` int(11) DEFAULT NULL,
  `fossa` int(11) DEFAULT NULL,
  `bottomHole` int(11) DEFAULT NULL,
  `design1357` int(11) DEFAULT NULL,
  `designP26` int(11) DEFAULT NULL,
  `designSpecial` tinyint(1) DEFAULT NULL,
  `designSpecialComment` varchar(300) DEFAULT NULL,
  `roofType` int(11) DEFAULT NULL,
  `buttonType` int(11) DEFAULT NULL,
  `railing` int(11) DEFAULT NULL,
  `mirror` int(11) DEFAULT NULL,
  `floorType` int(11) DEFAULT NULL,
  `fan` int(11) DEFAULT NULL,
  `doorOfNumber` int(11) DEFAULT NULL,
  `doorType` int(11) DEFAULT NULL,
  `doorSystem` int(11) DEFAULT NULL,
  `doorframeType` int(11) DEFAULT NULL,
  `height` int(11) DEFAULT NULL,
  `freeAdmission` int(11) DEFAULT NULL,
  `controlType` int(11) DEFAULT NULL,
  `boothButton` int(11) DEFAULT NULL,
  `hallButton` varchar(100) DEFAULT NULL,
  `boothDisplay` int(11) DEFAULT NULL,
  `floorDisplay` int(11) DEFAULT NULL,
  `lightCurtain` tinyint(1) DEFAULT NULL,
  `loadLimiter` tinyint(1) DEFAULT NULL,
  `speechSynthesizer` tinyint(1) DEFAULT NULL,
  `gomSystem` tinyint(1) DEFAULT NULL,
  `intercom` tinyint(1) DEFAULT NULL,
  `phone` tinyint(1) DEFAULT NULL,
  `accessSytem` tinyint(1) DEFAULT NULL,
  `firefighterKeychain` tinyint(1) DEFAULT NULL,
  `comment` varchar(300) DEFAULT NULL,
  `displayPlaceFloor` varchar(50) DEFAULT NULL,
  `stopSequenceContinuous` tinyint(1) DEFAULT NULL,
  `stopSequenceContinuousQ` varchar(50) DEFAULT NULL,
  `stopSequenceEven` tinyint(1) DEFAULT NULL,
  `stopSequenceEvenQ` varchar(50) DEFAULT NULL,
  `stopSequenceOdd` tinyint(1) DEFAULT NULL,
  `stopSequenceOddQ` varchar(50) DEFAULT NULL,
  `doorFrameGray` tinyint(1) DEFAULT NULL,
  `doorFrameGrayDescrip` varchar(50) DEFAULT NULL,
  `doorFrameBrown` tinyint(1) DEFAULT NULL,
  `doorFrameBrownDescrip` varchar(50) DEFAULT NULL,
  `doorFrameStainless` tinyint(1) DEFAULT NULL,
  `doorFrameStainlessDescrip` varchar(50) DEFAULT NULL,
  `sistelWDisplayPB` int(11) DEFAULT NULL,
  `sistelWDisplayFloor` int(11) DEFAULT NULL,
  `sistelWArrowPB` int(11) DEFAULT NULL,
  `sistelWArrowFloor` int(11) DEFAULT NULL,
  `braile37PB` int(11) NOT NULL,
  `braile37Floor` int(11) DEFAULT NULL,
  `antivandalismPB` int(11) DEFAULT NULL,
  `antivandalismFloor` int(11) NOT NULL,
  `status` char(1) NOT NULL,
  PRIMARY KEY (`idBudget`),
  KEY `basicdata_budget_fk1` (`buildingType`),
  KEY `basicdata_budget_fk2` (`elevatorType`),
  KEY `basicdata_budget_fk3` (`elevatorCapacitance`),
  KEY `basicdata_budget_fk5` (`machineType`),
  KEY `basicdata_budget_fk6` (`embarque`),
  KEY `basicdata_budget_fk7` (`electricityType`),
  KEY `basicdata_budget_fk` (`speed`),
  KEY `basicdata_budget_fk8` (`frequency`),
  KEY `basicdata_budget_fk9` (`voltageLighting`),
  KEY `basicdata_budget_fk10` (`hourMachine`),
  KEY `basicdata_budget_fk12` (`maneuverType`),
  KEY `basicdata_budget_fk13` (`design1357`),
  KEY `basicdata_budget_fk14` (`designP26`),
  KEY `basicdata_budget_fk15` (`roofType`),
  KEY `basicdata_budget_fk16` (`buttonType`),
  KEY `basicdata_budget_fk17` (`railing`),
  KEY `basicdata_budget_fk18` (`mirror`),
  KEY `basicdata_budget_fk19` (`floorType`),
  KEY `basicdata_budget_fk20` (`fan`),
  KEY `basicdata_budget_fk21` (`doorType`),
  KEY `basicdata_budget_fk22` (`doorSystem`),
  KEY `basicdata_budget_fk23` (`doorframeType`),
  KEY `basicdata_budget_fk24` (`controlType`),
  KEY `basicdata_budget_fk25` (`boothButton`),
  KEY `basicdata_budget_fk26` (`boothDisplay`),
  KEY `basicdata_budget_fk27` (`floorDisplay`),
  KEY `basicdata_budget_fk30` (`freeAdmission`),
  KEY `basicdata_budget_fk31` (`height`),
  CONSTRAINT `basicdata_budget_fk` FOREIGN KEY (`speed`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk1` FOREIGN KEY (`buildingType`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk10` FOREIGN KEY (`hourMachine`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk12` FOREIGN KEY (`maneuverType`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk13` FOREIGN KEY (`design1357`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk14` FOREIGN KEY (`designP26`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk15` FOREIGN KEY (`roofType`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk16` FOREIGN KEY (`buttonType`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk17` FOREIGN KEY (`railing`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk18` FOREIGN KEY (`mirror`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk19` FOREIGN KEY (`floorType`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk2` FOREIGN KEY (`elevatorType`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk20` FOREIGN KEY (`fan`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk21` FOREIGN KEY (`doorType`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk22` FOREIGN KEY (`doorSystem`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk23` FOREIGN KEY (`doorframeType`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk24` FOREIGN KEY (`controlType`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk25` FOREIGN KEY (`boothButton`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk26` FOREIGN KEY (`boothDisplay`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk27` FOREIGN KEY (`floorDisplay`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk3` FOREIGN KEY (`elevatorCapacitance`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk30` FOREIGN KEY (`freeAdmission`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk31` FOREIGN KEY (`height`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk5` FOREIGN KEY (`machineType`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk6` FOREIGN KEY (`embarque`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk7` FOREIGN KEY (`electricityType`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk8` FOREIGN KEY (`frequency`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk9` FOREIGN KEY (`voltageLighting`) REFERENCES `BasicData` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Budget`
--

LOCK TABLES `Budget` WRITE;
/*!40000 ALTER TABLE `Budget` DISABLE KEYS */;
INSERT INTO `Budget` VALUES (3,1,'2012-12-16 00:36:20','asdf','asdf','asdf','asdf','asdf','asdf','asdf','asdf@asdf.com','asdf',0,0,1,2,9,NULL,16,NULL,' ',23,NULL,32,NULL,42,NULL,46,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,' ',NULL,NULL,0,0,0,0,0,0,0,0,NULL,' ',0,NULL,0,NULL,0,NULL,0,NULL,0,NULL,0,NULL,0,0,0,0,0,0,0,0,'A'),(4,2,'2012-12-16 00:36:50','qwer','qwer','qwer','qwer','qwer','qwer','qwer','qwer@qwer.com','qwer',0,0,1,NULL,NULL,NULL,NULL,NULL,' ',NULL,27,NULL,36,NULL,45,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,' ',NULL,NULL,0,0,0,0,0,0,0,0,NULL,' ',0,NULL,0,NULL,0,NULL,0,NULL,0,NULL,0,NULL,0,0,0,0,0,0,0,0,'A'),(5,3,'2012-12-16 00:40:19','zxcv','zxcv','zxcv','zxcv','zxcv','zxcv','zxcv','zxcv@zxcv.com','zxcv',0,0,1,NULL,NULL,NULL,NULL,NULL,' ',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,56,59,1,'mire puess',63,67,73,128,75,81,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,' ',NULL,NULL,0,0,0,0,0,0,0,0,NULL,' ',0,NULL,0,NULL,0,NULL,0,NULL,0,NULL,0,NULL,0,0,0,0,0,0,0,0,'A'),(6,4,'2012-12-16 18:46:18','asdf','asdf','asdf','asdf','asdf','asdf','asdf','asdf@rewq.com','asdf',0,0,1,NULL,NULL,NULL,NULL,NULL,' ',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4,87,91,94,104,98,NULL,NULL,' ',NULL,NULL,0,0,0,0,0,0,0,0,NULL,' ',1,'123',1,'468',1,'579',0,NULL,0,NULL,0,NULL,0,0,0,0,0,0,0,0,'A'),(7,5,'2012-12-16 20:10:37','Leyner','Mi casa bien equipada','12','Jesus','Plaza Caribe','Barquisimeto','0251-2544738','leynercas@outlook.co','Leyner',1,0,1,2,9,1,16,1,' ',25,28,32,36,43,44,47,50,3,2,1,2,4,1,57,59,0,NULL,63,68,73,128,77,82,3,86,92,94,104,98,107,110,' ',113,122,0,0,1,0,0,1,0,1,'Prueba completa','Todos los pisos',0,NULL,0,NULL,0,NULL,0,NULL,0,NULL,0,NULL,2,0,0,3,0,3,0,3,'A');
/*!40000 ALTER TABLE `Budget` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'nardi'
--

--
-- Dumping routines for database 'nardi'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2012-12-17 22:53:33
