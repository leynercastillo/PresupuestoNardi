CREATE DATABASE  IF NOT EXISTS `nardi` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `nardi`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: nardi
-- ------------------------------------------------------
-- Server version	5.5.24-log

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
-- Table structure for table `basicdata`
--

DROP TABLE IF EXISTS `basicdata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `basicdata` (
  `idBasic` int(11) NOT NULL AUTO_INCREMENT,
  `dataBaseName` varchar(50) NOT NULL,
  `name` varchar(150) NOT NULL,
  `field` varchar(300) NOT NULL,
  `editable` tinyint(1) NOT NULL,
  `priority` int(11) NOT NULL,
  `status` char(1) NOT NULL,
  `Parent_idBasic` int(11) DEFAULT NULL,
  PRIMARY KEY (`idBasic`),
  KEY `basicdata_basicdata_fk` (`Parent_idBasic`),
  CONSTRAINT `basicdata_basicdata_fk` FOREIGN KEY (`Parent_idBasic`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=146 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `basicdata`
--

LOCK TABLES `basicdata` WRITE;
/*!40000 ALTER TABLE `basicdata` DISABLE KEYS */;
INSERT INTO `basicdata` VALUES (1,'BUDGET','RESIDENCIAL','BUILDING TYPE',0,1,'A',NULL),(2,'BUDGET','COMERCIAL','BUILDING TYPE',0,2,'A',NULL),(3,'BUDGET','EMPRESARIAL','BUILDING TYPE',0,3,'A',NULL),(4,'BUDGET','HOSPITAL','BUILDING TYPE',0,4,'A',NULL),(5,'BUDGET','HOTEL','BUILDING TYPE',0,5,'A',NULL),(6,'BUDGET','INDUSTRIAL','BUILDING TYPE',0,6,'A',NULL),(7,'BUDGET','PASAJERO','ELEVATOR TYPE',0,1,'A',NULL),(8,'BUDGET','MONTA CAMILLA','ELEVATOR TYPE',0,2,'A',NULL),(9,'BUDGET','PANORAMICO','ELEVATOR TYPE',0,3,'A',NULL),(10,'BUDGET','CARGA','ELEVATOR TYPE',0,4,'A',NULL),(11,'BUDGET','MONTA CARRO','ELEVATOR TYPE',0,5,'A',NULL),(12,'BUDGET','MONTA PLATO','ELEVATOR TYPE',0,6,'A',NULL),(13,'BUDGET','WINCHE','ELEVATOR TYPE',0,7,'A',NULL),(14,'BUDGET','320 - 4','ELEVATOR CAPACITANCE',0,1,'A',NULL),(15,'BUDGET','450 - 6','ELEVATOR CAPACITANCE',0,2,'A',NULL),(16,'BUDGET','600 - 8','ELEVATOR CAPACITANCE',0,3,'A',NULL),(17,'BUDGET','800 - 10','ELEVATOR CAPACITANCE',0,4,'A',NULL),(18,'BUDGET','1050 - 13','ELEVATOR CAPACITANCE',0,5,'A',NULL),(19,'BUDGET','1200 - 16','ELEVATOR CAPACITANCE',0,6,'A',NULL),(20,'BUDGET','1500 - 20','ELEVATOR CAPACITANCE',0,7,'A',NULL),(21,'BUDGET','2000 - 26','ELEVATOR CAPACITANCE',0,8,'A',NULL),(22,'BUDGET','CON SALA DE MAQUINA 2V','MACHINE TYPE',0,1,'A',NULL),(23,'BUDGET','CON SALA DE MAQUINA VVVF','MACHINE TYPE',0,2,'A',NULL),(24,'BUDGET','SIN SALA DE MAQUINA MRL','MACHINE TYPE',0,3,'A',NULL),(25,'BUDGET','HIDRAULICO','MACHINE TYPE',0,4,'A',NULL),(26,'BUDGET','WINCHE','MACHINE TYPE',0,5,'A',NULL),(27,'BUDGET','1 PUERTA','BUILDING EMBARQUE',0,1,'A',NULL),(28,'BUDGET','2 PUERTAS (DOBLE ACCESO - 180)','BUILDING EMBARQUE',0,2,'A',NULL),(29,'BUDGET','2 PUERTAS (DOBLE ACCESO - 90)','BUILDING EMBARQUE',0,3,'A',NULL),(30,'BUDGET','2 PUERTAS (DOBLE ACCESO - 270)','BUILDING EMBARQUE',0,4,'A',NULL),(31,'BUDGET','208V','ELECTRICITY TYPE',0,1,'A',NULL),(32,'BUDGET','220V','ELECTRICITY TYPE',0,2,'A',NULL),(33,'BUDGET','380V','ELECTRICITY TYPE',0,3,'A',NULL),(34,'BUDGET','440V','ELECTRICITY TYPE',0,4,'A',NULL),(35,'BUDGET','0.5','SPEED',0,1,'A',NULL),(36,'BUDGET','1','SPEED',0,2,'A',NULL),(37,'BUDGET','1.2','SPEED',0,3,'A',NULL),(38,'BUDGET','1.6','SPEED',0,4,'A',NULL),(39,'BUDGET','1.75','SPEED',0,5,'A',NULL),(40,'BUDGET','2','SPEED',0,6,'A',NULL),(41,'BUDGET','2.5','SPEED',0,7,'A',NULL),(42,'BUDGET','60 HZ','FREQUENCY',0,1,'A',NULL),(43,'BUDGET','50 HZ','FREQUENCY',0,2,'A',NULL),(44,'BUDGET','110V','VOLTAGE LIGHTING',0,1,'A',NULL),(45,'BUDGET','220V','VOLTAGE LIGHTING',0,2,'A',NULL),(46,'BUDGET','180 HORAS (STANDARD)','HOUR MACHINE',0,1,'A',NULL),(47,'BUDGET','240 HORAS (ALTO TRAFICO)','HOUR MACHINE',0,2,'A',NULL),(48,'BUDGET','COLECTIVA EN DESC SIMPLEX (UN BOTON)','MANEUVER TYPE',0,1,'A',NULL),(49,'BUDGET','COLECTIVA EN DESC DUPLEX (UN BOTON)','MANEUVER TYPE',0,2,'A',NULL),(50,'BUDGET','COLECTIVA EN DESC TRIPLEX (UN BOTON)','MANEUVER TYPE',0,3,'A',NULL),(51,'BUDGET','COLECTIVA EN DESC CUADRUPLEX (UN BOTON)','MANEUVER TYPE',0,4,'A',NULL),(52,'BUDGET','COLECTIVO EN ASC Y DESC SIMPLEX (DOS BOTONES)','MANEUVER TYPE',0,9,'A',NULL),(53,'BUDGET','COLECTIVO EN ASC Y DESC DUPLEX (DOS BOTONES)','MANEUVER TYPE',0,10,'A',NULL),(54,'BUDGET','COLECTIVO EN ASC Y DESC TRIPLEX (DOS BOTONES)','MANEUVER TYPE',0,11,'A',NULL),(55,'BUDGET','COLECTIVO EN ASC Y DESC CUADRUPLEX (DOS BOTONES)','MANEUVER TYPE',0,12,'A',NULL),(56,'BUDGET','DISENO 1357','CABIN MODEL',0,1,'A',NULL),(57,'BUDGET','DISENO P26','CABIN MODEL',0,2,'A',NULL),(58,'BUDGET','FORMICA - HORIZONTAL','DESIGN',0,1,'A',57),(59,'BUDGET','FORMICA - VERTICAL','DESIGN',0,2,'A',57),(60,'BUDGET','ACERO INOX. - HORIZONTAL','DESIGN',0,3,'A',57),(61,'BUDGET','ACERO INOX. - VERTICAL','DESIGN',0,4,'A',57),(62,'BUDGET','PL-3','ROOF TYPE',0,1,'A',NULL),(63,'BUDGET','PL-4','ROOF TYPE',0,2,'A',NULL),(64,'BUDGET','PL-6','ROOF TYPE',0,3,'A',NULL),(65,'BUDGET','PL-PERFORADO','ROOF TYPE',0,4,'A',NULL),(66,'BUDGET','PL-MODULAR','ROOF TYPE',0,5,'A',NULL),(67,'BUDGET','CORTA','BUTTON TYPE',0,1,'A',NULL),(68,'BUDGET','PISO A TECHO','BUTTON TYPE',0,2,'A',NULL),(69,'BUDGET','PISO A TECHO CON TELEFONO','BUTTON TYPE',0,3,'A',NULL),(70,'BUDGET','RECTO','RAILING',0,1,'A',NULL),(71,'BUDGET','REDONDO','RAILING',0,2,'A',NULL),(72,'BUDGET','DOBLE PASAMANO REDONDO','RAILING',0,3,'A',NULL),(73,'BUDGET','VINIL','FLOOR TYPE',0,1,'A',NULL),(74,'BUDGET','VULCA','FLOOR TYPE',0,2,'A',NULL),(75,'BUDGET','GRANITO POR CUENTA DEL CLIENTE','FLOOR TYPE',0,4,'A',NULL),(76,'BUDGET','OTROS','FLOOR TYPE',0,5,'A',NULL),(77,'BUDGET','1 - 450 KG','FAN',0,1,'A',NULL),(78,'BUDGET','1 - 600 KG','FAN',0,2,'A',NULL),(79,'BUDGET','2 - 800 KG','FAN',0,3,'A',NULL),(80,'BUDGET','2 - 1000 KG','FAN',0,4,'A',NULL),(81,'BUDGET','2 - 1200 KG','FAN',0,5,'A',NULL),(82,'BUDGET','2 - 1500 KG','FAN',0,6,'A',NULL),(83,'BUDGET','APERTURA TELESCOPICA IZQUIERDA','DOOR TYPE',0,1,'A',NULL),(84,'BUDGET','APERTURA TELESCOPICA DERECHA','DOOR TYPE',0,2,'A',NULL),(85,'BUDGET','APERTURA TELESCOPICA CENTRAL','DOOR TYPE',0,3,'A',NULL),(86,'BUDGET','APERTURA CENTRAL','DOOR TYPE',0,4,'A',NULL),(87,'BUDGET','BATIENTE IZQUIERDA','DOOR TYPE',0,5,'A',NULL),(88,'BUDGET','FERMATOR','DOOR SYSTEM',0,1,'A',NULL),(89,'BUDGET','SELCON','DOOR SYSTEM',0,2,'A',NULL),(90,'BUDGET','RECTO - 50X100','DOOR FRAME TYPE',0,1,'A',NULL),(91,'BUDGET','RECTO - 30X150','DOOR FRAME TYPE',0,2,'A',NULL),(92,'BUDGET','ABIERTO','DOOR FRAME TYPE',0,3,'A',NULL),(93,'BUDGET','OCULTO','DOOR FRAME TYPE',0,4,'A',NULL),(94,'BUDGET','700','FREE ADMISSION',0,1,'A',NULL),(95,'BUDGET','800','FREE ADMISSION',0,2,'A',NULL),(96,'BUDGET','900','FREE ADMISSION',0,3,'A',NULL),(97,'BUDGET','1000','FREE ADMISSION',0,4,'A',NULL),(98,'BUDGET','1100','FREE ADMISSION',0,5,'A',NULL),(99,'BUDGET','1200','FREE ADMISSION',0,6,'A',NULL),(100,'BUDGET','2000','HEIGHT',0,1,'A',NULL),(101,'BUDGET','2100','HEIGHT',0,2,'A',NULL),(102,'BUDGET','SISTEL','CONTROL TYPE',0,1,'A',NULL),(103,'BUDGET','CF CONTROL','CONTROL TYPE',0,2,'A',NULL),(104,'BUDGET','RELEMATICO','CONTROL TYPE',0,3,'A',NULL),(105,'BUDGET','SISTEL TELEFONICA','BOOTH BUTTON',0,1,'A',NULL),(106,'BUDGET','BOTON ACERO PLASTICO CON NOMENCLATURA Y BRAILLE DE 37mm','BOOTH BUTTON',0,2,'A',NULL),(107,'BUDGET','BOTON DE ACERO INOX. ANTI - VANDALICO DE 30 mm','BOOTH BUTTON',0,3,'A',NULL),(108,'BUDGET','SISTEL MATRIZ DE PUNTO PEQUENO','BOOTH DISPLAY',0,1,'A',NULL),(109,'BUDGET','SISTEL MATRIZ DE PUNTO GRANDE','BOOTH DISPLAY',0,2,'A',NULL),(110,'BUDGET','SISTEL MATRIZ DE PUNTO HORA Y GRADO','BOOTH DISPLAY',0,3,'A',NULL),(111,'BUDGET','SISTEL LCD DE 7\'\'','BOOTH DISPLAY',0,4,'A',NULL),(112,'BUDGET','SISTEL LCD AZUL','BOOTH DISPLAY',0,5,'A',NULL),(113,'BUDGET','CF CONTROL MATRIZ DE PUNTO ROJO','BOOTH DISPLAY',0,7,'A',NULL),(114,'BUDGET','CF CONTROL MATRIZ DE PUNTO AZUL','BOOTH DISPLAY',0,8,'A',NULL),(115,'BUDGET','CF CONTROL LCD AZUL PEQUENO','BOOTH DISPLAY',0,9,'A',NULL),(116,'BUDGET','SISTEL MATRIZ DE PUNTO PEQUENO','FLOOR DISPLAY',0,1,'A',NULL),(117,'BUDGET','SISTEL MATRIZ DE PUNTO GRANDE','FLOOR DISPLAY',0,2,'A',NULL),(118,'BUDGET','SISTEL MATRIZ DE PUNTO HORA Y GRADO','FLOOR DISPLAY',0,3,'A',NULL),(119,'BUDGET','SISTEL LCD DE 7 \'\'','FLOOR DISPLAY',0,4,'A',NULL),(120,'BUDGET','SISTEL LCD AZUL','FLOOR DISPLAY',0,5,'A',NULL),(121,'BUDGET','CF CONTROL MATRIZ DE PUNTO ROJO','FLOOR DISPLAY',0,6,'A',NULL),(122,'BUDGET','CF CONTROL MATRIZ DE PUNTO AZUL','FLOOR DISPLAY',0,7,'A',NULL),(123,'BUDGET','CF CONTROL LCD AZUL PEQUENO','FLOOR DISPLAY',0,8,'A',NULL),(124,'BUDGET','ACERO TIPO ESPEJO','MIRROR',0,1,'A',NULL),(125,'BUDGET','POR CUENTA DEL CLIENTE','MIRROR',0,2,'A',NULL),(126,'BUDGET','COLECTIVA EN ASC SIMPLEX (UN BOTON)','MANEUVER TYPE',0,5,'A',NULL),(127,'BUDGET','COLECTIVA EN ASC DUPLEX (UN BOTON)','MANEUVER TYPE',0,6,'A',NULL),(128,'BUDGET','COLECTIVA EN ASC TRIPLEX (UN BOTON)','MANEUVER TYPE',0,7,'A',NULL),(129,'BUDGET','COLECTIVA EN ASC CUADRUPLEX (UN BOTON)','MANEUVER TYPE',0,8,'A',NULL),(130,'BUDGET','BATIENTE DERECHA','DOOR TYPE',0,6,'A',NULL),(131,'BUDGET','GUILLOTINA','DOOR TYPE',0,7,'A',NULL),(132,'BUDGET','SANTA MARIA','DOOR TYPE',0,8,'A',NULL),(133,'BUDGET','SISTEL TFT DE 10\'\'','BOOTH DISPLAY',0,6,'A',NULL),(134,'BUDGET','CF CONTROL LCD AZUL GRANDE','BOOTH DISPLAY',0,10,'A',NULL),(135,'BUDGET','SISTEL TFT DE 10\'\'','FLOOR DISPLAY',0,6,'A',NULL),(136,'BUDGET','CF CONTROL LCD AZUL GRANDE','FLOOR DISPLAY',0,10,'A',NULL),(137,'BUDGET','FORMICA','DESIGN',0,1,'A',56),(138,'BUDGET','ACERO INOXIDABLE','DESIGN',0,2,'A',56),(139,'BUDGET','GRIS','DOOR FRAME HAMMERED',0,1,'A',NULL),(140,'BUDGET','MARRON','DOOR FRAME HAMMERED',0,2,'A',NULL),(141,'BUDGET','ESPECIAL','DOOR FRAME TYPE',0,5,'A',NULL),(142,'BUDGET','PLANA','HALL BUTTON TYPE',0,1,'A',NULL),(143,'BUDGET','CON DOBLÉ RECTO','HALL BUTTON TYPE',0,2,'A',NULL),(144,'BUDGET','BOTON ACERO PLASTICO CON NOMENCLATURA Y BRAILLE DE 37 mm','HALL BUTTON',0,1,'A',NULL),(145,'BUDGET','BOTON DE ACERO INOX. ANTI - VANDALICO DE 30 mm','HALL BUTTON',0,2,'A',NULL);
/*!40000 ALTER TABLE `basicdata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `budget`
--

DROP TABLE IF EXISTS `budget`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `budget` (
  `idBudget` int(11) NOT NULL AUTO_INCREMENT,
  `number` int(11) NOT NULL,
  `date` datetime NOT NULL,
  `partnerName` varchar(100) NOT NULL,
  `construction` varchar(100) NOT NULL,
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
  `access` int(11) DEFAULT NULL,
  `electricityType` int(11) DEFAULT NULL,
  `speed` int(11) DEFAULT NULL,
  `frequency` int(11) DEFAULT NULL,
  `voltageLighting` int(11) DEFAULT NULL,
  `hourMachine` int(11) DEFAULT NULL,
  `maneuverType` int(11) DEFAULT NULL,
  `stopNumber` int(11) DEFAULT NULL,
  `tour` double DEFAULT NULL,
  `onTour` double DEFAULT NULL,
  `widthHole` double DEFAULT NULL,
  `fossa` double DEFAULT NULL,
  `bottomHole` double DEFAULT NULL,
  `cabinDesign` int(11) DEFAULT NULL,
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
  `doorframeTypeComment` varchar(200) DEFAULT NULL,
  `height` int(11) DEFAULT NULL,
  `freeAdmission` int(11) DEFAULT NULL,
  `controlType` int(11) DEFAULT NULL,
  `boothButton` int(11) DEFAULT NULL,
  `hallButtonPlace` varchar(100) DEFAULT NULL,
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
  `doorFrameHammered` int(11) DEFAULT NULL,
  `doorFrameHammeredDesc` varchar(100) DEFAULT NULL,
  `doorFrameStainless` tinyint(1) DEFAULT NULL,
  `doorFrameStainlessDescrip` varchar(50) DEFAULT NULL,
  `sistelWDisplayPB` int(11) DEFAULT NULL,
  `sistelWDisplayFloor` int(11) DEFAULT NULL,
  `sistelWArrowPB` int(11) DEFAULT NULL,
  `sistelWArrowFloor` int(11) DEFAULT NULL,
  `hallButtonType` int(11) DEFAULT NULL,
  `hallButton` int(11) DEFAULT NULL,
  `status` char(1) NOT NULL,
  PRIMARY KEY (`idBudget`),
  KEY `basicdata_budget_fk1` (`buildingType`),
  KEY `basicdata_budget_fk2` (`elevatorType`),
  KEY `basicdata_budget_fk3` (`elevatorCapacitance`),
  KEY `basicdata_budget_fk5` (`machineType`),
  KEY `basicdata_budget_fk6` (`access`),
  KEY `basicdata_budget_fk7` (`electricityType`),
  KEY `basicdata_budget_fk` (`speed`),
  KEY `basicdata_budget_fk8` (`frequency`),
  KEY `basicdata_budget_fk9` (`voltageLighting`),
  KEY `basicdata_budget_fk10` (`hourMachine`),
  KEY `basicdata_budget_fk12` (`maneuverType`),
  KEY `basicdata_budget_fk13` (`cabinDesign`),
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
  KEY `basicdata_budget_fk4` (`doorFrameHammered`),
  KEY `basicdata_budget_fk14` (`hallButtonType`),
  KEY `basicdata_budget_fk11` (`hallButton`),
  CONSTRAINT `basicdata_budget_fk11` FOREIGN KEY (`hallButton`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk` FOREIGN KEY (`speed`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk1` FOREIGN KEY (`buildingType`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk10` FOREIGN KEY (`hourMachine`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk12` FOREIGN KEY (`maneuverType`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk13` FOREIGN KEY (`cabinDesign`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk14` FOREIGN KEY (`hallButtonType`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk15` FOREIGN KEY (`roofType`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk16` FOREIGN KEY (`buttonType`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk17` FOREIGN KEY (`railing`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk18` FOREIGN KEY (`mirror`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk19` FOREIGN KEY (`floorType`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk2` FOREIGN KEY (`elevatorType`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk20` FOREIGN KEY (`fan`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk21` FOREIGN KEY (`doorType`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk22` FOREIGN KEY (`doorSystem`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk23` FOREIGN KEY (`doorframeType`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk24` FOREIGN KEY (`controlType`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk25` FOREIGN KEY (`boothButton`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk26` FOREIGN KEY (`boothDisplay`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk27` FOREIGN KEY (`floorDisplay`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk3` FOREIGN KEY (`elevatorCapacitance`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk30` FOREIGN KEY (`freeAdmission`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk31` FOREIGN KEY (`height`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk4` FOREIGN KEY (`doorFrameHammered`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk5` FOREIGN KEY (`machineType`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk6` FOREIGN KEY (`access`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk7` FOREIGN KEY (`electricityType`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk8` FOREIGN KEY (`frequency`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk9` FOREIGN KEY (`voltageLighting`) REFERENCES `basicdata` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `budget`
--

LOCK TABLES `budget` WRITE;
/*!40000 ALTER TABLE `budget` DISABLE KEYS */;
/*!40000 ALTER TABLE `budget` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `group_user`
--

DROP TABLE IF EXISTS `group_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `group_user` (
  `id_security_user` int(11) NOT NULL,
  `id_security_group` int(11) NOT NULL,
  PRIMARY KEY (`id_security_user`,`id_security_group`),
  KEY `security_group_group_user_fk` (`id_security_group`),
  CONSTRAINT `security_user_group_user_fk` FOREIGN KEY (`id_security_user`) REFERENCES `security_user` (`id_security_user`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `security_group_group_user_fk` FOREIGN KEY (`id_security_group`) REFERENCES `security_group` (`id_security_group`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group_user`
--

LOCK TABLES `group_user` WRITE;
/*!40000 ALTER TABLE `group_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `group_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_group`
--

DROP TABLE IF EXISTS `role_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_group` (
  `id_security_group` int(11) NOT NULL,
  `id_security_role` int(11) NOT NULL,
  PRIMARY KEY (`id_security_group`,`id_security_role`),
  KEY `security_role_role_group_fk` (`id_security_role`),
  CONSTRAINT `security_group_role_group_fk` FOREIGN KEY (`id_security_group`) REFERENCES `security_group` (`id_security_group`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `security_role_role_group_fk` FOREIGN KEY (`id_security_role`) REFERENCES `security_role` (`id_security_role`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_group`
--

LOCK TABLES `role_group` WRITE;
/*!40000 ALTER TABLE `role_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `role_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `security_group`
--

DROP TABLE IF EXISTS `security_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `security_group` (
  `id_security_group` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `status` char(1) NOT NULL,
  PRIMARY KEY (`id_security_group`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `security_group`
--

LOCK TABLES `security_group` WRITE;
/*!40000 ALTER TABLE `security_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `security_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `security_role`
--

DROP TABLE IF EXISTS `security_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `security_role` (
  `id_security_role` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `status` char(1) NOT NULL,
  PRIMARY KEY (`id_security_role`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `security_role`
--

LOCK TABLES `security_role` WRITE;
/*!40000 ALTER TABLE `security_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `security_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `security_user`
--

DROP TABLE IF EXISTS `security_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `security_user` (
  `id_security_user` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(50) NOT NULL,
  `status` tinyint(4) NOT NULL,
  PRIMARY KEY (`id_security_user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `security_user`
--

LOCK TABLES `security_user` WRITE;
/*!40000 ALTER TABLE `security_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `security_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-01-29 15:26:06
