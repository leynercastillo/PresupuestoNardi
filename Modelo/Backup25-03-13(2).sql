CREATE DATABASE  IF NOT EXISTS `ascensor_nardi` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ascensor_nardi`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: 192.168.10.125    Database: ascensor_nardi
-- ------------------------------------------------------
-- Server version	5.5.29-0ubuntu0.12.04.2

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
-- Table structure for table `basic_data`
--

DROP TABLE IF EXISTS `basic_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `basic_data` (
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
  CONSTRAINT `basicdata_basicdata_fk` FOREIGN KEY (`Parent_idBasic`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=177 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `basic_data`
--

LOCK TABLES `basic_data` WRITE;
/*!40000 ALTER TABLE `basic_data` DISABLE KEYS */;
INSERT INTO `basic_data` VALUES (1,'BUDGET','RESIDENCIAL','BUILDING TYPE',0,1,'A',NULL),(2,'BUDGET','COMERCIAL','BUILDING TYPE',0,2,'A',NULL),(3,'BUDGET','EMPRESARIAL','BUILDING TYPE',0,3,'A',NULL),(4,'BUDGET','HOSPITAL','BUILDING TYPE',0,4,'A',NULL),(5,'BUDGET','HOTEL','BUILDING TYPE',0,5,'A',NULL),(6,'BUDGET','INDUSTRIAL','BUILDING TYPE',0,6,'A',NULL),(7,'BUDGET','PASAJERO','ELEVATOR TYPE',0,1,'A',NULL),(8,'BUDGET','MONTA CAMILLA','ELEVATOR TYPE',0,2,'A',NULL),(9,'BUDGET','PANORAMICO','ELEVATOR TYPE',0,3,'A',NULL),(10,'BUDGET','CARGA','ELEVATOR TYPE',0,4,'A',NULL),(11,'BUDGET','MONTA CARRO','ELEVATOR TYPE',0,5,'A',NULL),(12,'BUDGET','MONTA PLATO','ELEVATOR TYPE',0,6,'A',NULL),(13,'BUDGET','WINCHE','ELEVATOR TYPE',0,7,'A',NULL),(14,'BUDGET','320 - 4','ELEVATOR CAPACITANCE',0,1,'A',NULL),(15,'BUDGET','450 - 6','ELEVATOR CAPACITANCE',0,2,'A',NULL),(16,'BUDGET','600 - 8','ELEVATOR CAPACITANCE',0,3,'A',NULL),(17,'BUDGET','800 - 10','ELEVATOR CAPACITANCE',0,4,'A',NULL),(18,'BUDGET','1050 - 13','ELEVATOR CAPACITANCE',0,5,'A',NULL),(19,'BUDGET','1200 - 16','ELEVATOR CAPACITANCE',0,6,'A',NULL),(20,'BUDGET','1500 - 20','ELEVATOR CAPACITANCE',0,7,'A',NULL),(21,'BUDGET','2000 - 26','ELEVATOR CAPACITANCE',0,8,'A',NULL),(22,'BUDGET','CON SALA DE MAQUINA 2V','MACHINE TYPE',0,1,'A',NULL),(23,'BUDGET','CON SALA DE MAQUINA VVVF','MACHINE TYPE',0,2,'A',NULL),(24,'BUDGET','SIN SALA DE MAQUINA MRL','MACHINE TYPE',0,3,'A',NULL),(25,'BUDGET','HIDRAULICO','MACHINE TYPE',0,4,'A',NULL),(26,'BUDGET','WINCHE','MACHINE TYPE',0,5,'A',NULL),(27,'BUDGET','1 PUERTA','BUILDING EMBARQUE',0,1,'A',NULL),(28,'BUDGET','2 PUERTAS (DOBLE ACCESO - 180)','BUILDING EMBARQUE',0,2,'A',NULL),(29,'BUDGET','2 PUERTAS (DOBLE ACCESO - 90)','BUILDING EMBARQUE',0,3,'A',NULL),(30,'BUDGET','2 PUERTAS (DOBLE ACCESO - 270)','BUILDING EMBARQUE',0,4,'A',NULL),(31,'BUDGET','208V','ELECTRICITY TYPE',0,1,'A',NULL),(32,'BUDGET','220V','ELECTRICITY TYPE',0,2,'A',NULL),(33,'BUDGET','380V','ELECTRICITY TYPE',0,3,'A',NULL),(34,'BUDGET','440V','ELECTRICITY TYPE',0,4,'A',NULL),(35,'BUDGET','0.5','SPEED',0,1,'A',NULL),(36,'BUDGET','1','SPEED',0,2,'A',NULL),(37,'BUDGET','1.2','SPEED',0,3,'A',NULL),(38,'BUDGET','1.6','SPEED',0,5,'A',NULL),(39,'BUDGET','1.75','SPEED',0,6,'A',NULL),(40,'BUDGET','2','SPEED',0,7,'A',NULL),(41,'BUDGET','2.5','SPEED',0,8,'A',NULL),(42,'BUDGET','60 HZ','FREQUENCY',0,1,'A',NULL),(43,'BUDGET','50 HZ','FREQUENCY',0,2,'A',NULL),(44,'BUDGET','110V','VOLTAGE LIGHTING',0,1,'A',NULL),(45,'BUDGET','220V','VOLTAGE LIGHTING',0,2,'A',NULL),(46,'BUDGET','180 HORAS (STANDARD)','HOUR MACHINE',0,1,'A',NULL),(47,'BUDGET','240 HORAS (ALTO TRAFICO)','HOUR MACHINE',0,2,'A',NULL),(48,'BUDGET','COLECTIVA EN DESC SIMPLEX (UN BOTON)','MANEUVER TYPE',0,1,'A',NULL),(49,'BUDGET','COLECTIVA EN DESC DUPLEX (UN BOTON)','MANEUVER TYPE',0,2,'A',NULL),(50,'BUDGET','COLECTIVA EN DESC TRIPLEX (UN BOTON)','MANEUVER TYPE',0,3,'A',NULL),(51,'BUDGET','COLECTIVA EN DESC CUADRUPLEX (UN BOTON)','MANEUVER TYPE',0,4,'A',NULL),(52,'BUDGET','COLECTIVO EN ASC Y DESC SIMPLEX (DOS BOTONES)','MANEUVER TYPE',0,9,'A',NULL),(53,'BUDGET','COLECTIVO EN ASC Y DESC DUPLEX (DOS BOTONES)','MANEUVER TYPE',0,10,'A',NULL),(54,'BUDGET','COLECTIVO EN ASC Y DESC TRIPLEX (DOS BOTONES)','MANEUVER TYPE',0,11,'A',NULL),(55,'BUDGET','COLECTIVO EN ASC Y DESC CUADRUPLEX (DOS BOTONES)','MANEUVER TYPE',0,12,'A',NULL),(56,'BUDGET','DISENO 1357','CABIN MODEL',0,1,'A',NULL),(57,'BUDGET','DISENO P26','CABIN MODEL',0,2,'A',NULL),(58,'BUDGET','FORMICA - VERTICAL','DESIGN',0,1,'A',57),(59,'BUDGET','ACERO INOX. 304-4 - VERTICAL','DESIGN',0,2,'A',57),(60,'BUDGET','ACERO INOX. 630 - VERTICAL','DESIGN',0,3,'A',57),(61,'BUDGET','ACERO INOX. ESPEJO - VERTICAL','DESIGN',0,4,'A',57),(62,'BUDGET','PL-3','ROOF TYPE',0,1,'A',14),(63,'BUDGET','PL-3','ROOF TYPE',0,1,'A',15),(64,'BUDGET','PL-4','ROOF TYPE',0,2,'A',15),(65,'BUDGET','PL-PERFORADO','ROOF TYPE',0,3,'A',15),(66,'BUDGET','PL-MODULAR','ROOF TYPE',0,4,'A',15),(67,'BUDGET','CORTA','BUTTON TYPE',0,1,'A',NULL),(68,'BUDGET','PISO A TECHO','BUTTON TYPE',0,2,'A',NULL),(69,'BUDGET','PISO A TECHO CON TELEFONO','BUTTON TYPE',0,3,'A',NULL),(70,'BUDGET','RECTO','RAILING',0,1,'A',NULL),(71,'BUDGET','REDONDO','RAILING',0,2,'A',NULL),(72,'BUDGET','DOBLE PASAMANO REDONDO','RAILING',0,3,'A',NULL),(73,'BUDGET','VINIL','FLOOR TYPE',0,1,'A',NULL),(74,'BUDGET','VULCA','FLOOR TYPE',0,2,'A',NULL),(75,'BUDGET','GRANITO POR CUENTA DEL CLIENTE','FLOOR TYPE',0,4,'A',NULL),(76,'BUDGET','OTROS','FLOOR TYPE',0,5,'A',NULL),(77,'BUDGET','1 - 450 KG','FAN 1',0,1,'A',NULL),(78,'BUDGET','1 - 600 KG','FAN 1',0,2,'A',NULL),(79,'BUDGET','2 - 800 KG','FAN 2',0,3,'A',NULL),(80,'BUDGET','2 - 1000 KG','FAN 2',0,4,'A',NULL),(81,'BUDGET','2 - 1200 KG','FAN 2',0,5,'A',NULL),(82,'BUDGET','2 - 1500 KG','FAN 2',0,6,'A',NULL),(83,'BUDGET','APERTURA TELESCOPICA IZQUIERDA','DOOR TYPE',0,1,'A',NULL),(84,'BUDGET','APERTURA TELESCOPICA DERECHA','DOOR TYPE',0,2,'A',NULL),(85,'BUDGET','APERTURA TELESCOPICA CENTRAL','DOOR TYPE',0,3,'A',NULL),(86,'BUDGET','APERTURA CENTRAL','DOOR TYPE',0,4,'A',NULL),(87,'BUDGET','BATIENTE IZQUIERDA','DOOR TYPE',0,5,'A',NULL),(88,'BUDGET','FERMATOR','DOOR SYSTEM',0,1,'A',NULL),(89,'BUDGET','SELCOM','DOOR SYSTEM',0,2,'A',NULL),(90,'BUDGET','RECTO - 50X100','DOOR FRAME TYPE',0,1,'A',NULL),(91,'BUDGET','RECTO - 30X150','DOOR FRAME TYPE',0,2,'A',NULL),(92,'BUDGET','ABIERTO','DOOR FRAME TYPE',0,3,'A',NULL),(93,'BUDGET','OCULTO','DOOR FRAME TYPE',0,4,'A',NULL),(94,'BUDGET','700','FREE ADMISSION',0,1,'A',NULL),(95,'BUDGET','800','FREE ADMISSION',0,2,'A',NULL),(96,'BUDGET','900','FREE ADMISSION',0,3,'A',NULL),(97,'BUDGET','1000','FREE ADMISSION',0,4,'A',NULL),(98,'BUDGET','1100','FREE ADMISSION',0,5,'A',NULL),(99,'BUDGET','1200','FREE ADMISSION',0,6,'A',NULL),(100,'BUDGET','2000','HEIGHT',0,1,'A',NULL),(101,'BUDGET','2100','HEIGHT',0,2,'A',NULL),(102,'BUDGET','SISTEL (ELECTRONICO INTELIGENTE CON MICROPROCESADOR Y DETECTOR DE AVERIAS)','CONTROL TYPE',0,2,'A',NULL),(103,'BUDGET','CF CONTROL (ELECTRONICO INTELIGENTE CON MICROPROCESADOR Y DETECTOR DE AVERIAS)','CONTROL TYPE',0,2,'A',NULL),(104,'BUDGET','RELEMATICO (CONTACTORES Y RELE DE AVERIAS)','CONTROL TYPE',0,3,'A',NULL),(105,'BUDGET','SISTEL TELEFONICA','BOOTH BUTTON',0,1,'A',NULL),(106,'BUDGET','BOTON ACERO PLASTICO CON NOMENCLATURA Y BRAILLE DE 37mm','BOOTH BUTTON',0,2,'A',NULL),(107,'BUDGET','BOTON DE ACERO INOX. ANTI - VANDALICO DE 30 mm','BOOTH BUTTON',0,3,'A',NULL),(108,'BUDGET','SISTEL MATRIZ DE PUNTO PEQUENO','BOOTH DISPLAY SISTEL',0,1,'A',NULL),(109,'BUDGET','SISTEL MATRIZ DE PUNTO GRANDE','BOOTH DISPLAY SISTEL',0,2,'A',NULL),(110,'BUDGET','SISTEL MATRIZ DE PUNTO HORA Y GRADO','BOOTH DISPLAY SISTEL',0,3,'A',NULL),(111,'BUDGET','SISTEL LCD DE 7\'\' (CON SINTETIZADOR DE VOZ)','BOOTH DISPLAY SISTEL',0,4,'A',NULL),(112,'BUDGET','SISTEL LCD AZUL','BOOTH DISPLAY SISTEL',0,5,'A',NULL),(113,'BUDGET','CF CONTROL MATRIZ DE PUNTO ROJO','BOOTH DISPLAY CF',0,7,'A',NULL),(114,'BUDGET','CF CONTROL MATRIZ DE PUNTO AZUL','BOOTH DISPLAY CF',0,8,'A',NULL),(115,'BUDGET','CF CONTROL LCD AZUL PEQUENO','BOOTH DISPLAY CF',0,9,'A',NULL),(116,'BUDGET','SISTEL MATRIZ DE PUNTO PEQUENO','FLOOR DISPLAY SISTEL',0,1,'A',NULL),(117,'BUDGET','SISTEL MATRIZ DE PUNTO GRANDE','FLOOR DISPLAY SISTEL',0,2,'A',NULL),(118,'BUDGET','SISTEL MATRIZ DE PUNTO HORA Y GRADO','FLOOR DISPLAY SISTEL',0,3,'A',NULL),(119,'BUDGET','SISTEL LCD DE 7\'\' (CON SINTETIZADOR DE VOZ)','FLOOR DISPLAY SISTEL',0,4,'A',NULL),(120,'BUDGET','SISTEL LCD AZUL','FLOOR DISPLAY SISTEL',0,5,'A',NULL),(121,'BUDGET','CF CONTROL MATRIZ DE PUNTO ROJO','FLOOR DISPLAY CF',0,6,'A',NULL),(122,'BUDGET','CF CONTROL MATRIZ DE PUNTO AZUL','FLOOR DISPLAY CF',0,7,'A',NULL),(123,'BUDGET','CF CONTROL LCD AZUL PEQUENO','FLOOR DISPLAY CF',0,8,'A',NULL),(124,'BUDGET','ACERO TIPO ESPEJO','MIRROR',0,1,'A',NULL),(125,'BUDGET','POR CUENTA DEL CLIENTE','MIRROR',0,2,'A',NULL),(126,'BUDGET','COLECTIVA EN ASC SIMPLEX (UN BOTON)','MANEUVER TYPE',0,5,'A',NULL),(127,'BUDGET','COLECTIVA EN ASC DUPLEX (UN BOTON)','MANEUVER TYPE',0,6,'A',NULL),(128,'BUDGET','COLECTIVA EN ASC TRIPLEX (UN BOTON)','MANEUVER TYPE',0,7,'A',NULL),(129,'BUDGET','COLECTIVA EN ASC CUADRUPLEX (UN BOTON)','MANEUVER TYPE',0,8,'A',NULL),(130,'BUDGET','BATIENTE DERECHA','DOOR TYPE',0,6,'A',NULL),(131,'BUDGET','GUILLOTINA','DOOR TYPE',0,7,'A',NULL),(132,'BUDGET','SANTA MARIA','DOOR TYPE',0,8,'A',NULL),(133,'BUDGET','SISTEL TFT DE 10\'\'','BOOTH DISPLAY SISTEL',0,6,'A',NULL),(134,'BUDGET','CF CONTROL LCD AZUL GRANDE','BOOTH DISPLAY CF',0,10,'A',NULL),(135,'BUDGET','SISTEL TFT DE 10\'\'','FLOOR DISPLAY SISTEL',0,6,'A',NULL),(136,'BUDGET','CF CONTROL LCD AZUL GRANDE','FLOOR DISPLAY CF',0,10,'A',NULL),(137,'BUDGET','FORMICA','DESIGN',0,1,'A',56),(138,'BUDGET','ACERO INOXIDABLE 304-4','DESIGN',0,2,'A',56),(139,'BUDGET','GRIS','DOOR FRAME HAMMERED',0,1,'A',NULL),(140,'BUDGET','MARRON','DOOR FRAME HAMMERED',0,2,'A',NULL),(141,'BUDGET','ESPECIAL','DOOR FRAME TYPE',0,5,'A',NULL),(142,'BUDGET','PLANA','HALL BUTTON TYPE',0,1,'A',NULL),(143,'BUDGET','CON DOBLÉ RECTO','HALL BUTTON TYPE',0,2,'A',NULL),(144,'BUDGET','BOTON ACERO PLASTICO CON NOMENCLATURA Y BRAILLE DE 37 mm','HALL BUTTON',0,1,'A',NULL),(145,'BUDGET','BOTON DE ACERO INOX. ANTI - VANDALICO DE 30 mm','HALL BUTTON',0,2,'A',NULL),(146,'BUDGET','1.5','SPEED',0,4,'A',NULL),(147,'BUDGET','DISENO P26 H','CABIN MODEL',0,3,'A',NULL),(148,'BUDGET','FORMICA HORIZONTAL CON ESQUINERO EN ACERO INOX.','DESIGN',0,1,'A',147),(149,'BUDGET','ACERO INOX. 304-4 HORIZONTAL CON ESQUINERO EN ACERO INOX.','DESIGN',0,2,'A',147),(150,'BUDGET','ACRILICO CON PERFIL DE ALUMINIO','ROOF TYPE',0,5,'A',15),(151,'BUDGET','PL-4','ROOF TYPE',0,1,'A',16),(152,'BUDGET','PL-PERFORADO','ROOF TYPE',0,2,'A',16),(153,'BUDGET','PL-MODULAR','ROOF TYPE',0,3,'A',16),(154,'BUDGET','PL-4','ROOF TYPE',0,1,'A',17),(155,'BUDGET','PL-6','ROOF TYPE',0,2,'A',17),(156,'BUDGET','PL-MODULAR','ROOF TYPE',0,3,'A',17),(157,'BUDGET','PL-6','ROOF TYPE',0,1,'A',18),(158,'BUDGET','PL-PERFORADO','ROOF TYPE',0,2,'A',18),(159,'BUDGET','PL-MODULAR','ROOF TYPE',0,3,'A',18),(160,'BUDGET','PLAFON DE ACRILICO CON MARCO DE ALUMINIO','ROOF TYPE',0,4,'A',18),(161,'BUDGET','PL-6','ROOF TYPE',0,1,'A',19),(162,'BUDGET','PLAFON DE ACRILICO CON MARCO DE ALUMINIO','ROOF TYPE',0,2,'A',19),(163,'BUDGET','PL-6','ROOF TYPE',0,1,'A',20),(164,'BUDGET','PLAFON DE ACRILICO CON MARCO DE ALUMINIO','ROOF TYPE',0,2,'A',20),(165,'BUDGET','PL-6','ROOF TYPE',0,1,'A',21),(166,'BUDGET','SISTEL','HALL BUTTON TYPE',0,3,'A',NULL),(167,'BUDGET','ACERO INOXIDABLE 430','DESIGN',0,3,'A',56),(168,'BUDGET','ACERO INOXIDABLE ESPEJO','DESIGN',0,4,'A',56),(169,'BUDGET','ACERO INOX. 430 HORIZONTAL CON ESQUINERO EN ACERO INOX.','DESIGN',0,3,'A',147),(170,'BUDGET','ACERO INOX. ESPEJO HORIZONTAL CON ESQUINERO EN ACERO INOX.','DESIGN',0,4,'A',147),(171,'BUSINESS PARTNER','J','RIF TYPE',0,1,'A',NULL),(172,'BUSINESS PARTNER','V','RIF TYPE',0,2,'A',NULL),(173,'BUSINESS PARTNER','E','RIF TYPE',0,3,'A',NULL),(174,'BUDGET','ESTANDAR SEGUN MODELO','MACHINE BASE',0,1,'A',NULL),(175,'BUDGET','ESPECIAL','MACHINE BASE',0,2,'A',NULL),(176,'BUDGET','OTRA','ELEVATOR CAPACITANCE',0,9,'A',NULL);
/*!40000 ALTER TABLE `basic_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `budget`
--

DROP TABLE IF EXISTS `budget`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `budget` (
  `idBudget` int(11) NOT NULL AUTO_INCREMENT,
  `id_business_partner` int(11) NOT NULL,
  `number` int(11) NOT NULL,
  `date` datetime NOT NULL,
  `rif_type` char(1) NOT NULL,
  `rif_partner` varchar(15) NOT NULL,
  `partnerName` varchar(100) NOT NULL,
  `construction` varchar(100) NOT NULL,
  `id_security_user` int(11) NOT NULL,
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
  `machineBase` int(11) DEFAULT NULL,
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
  `displayPlaceFloor` varchar(50) DEFAULT NULL,
  `stopSequenceContinuous` tinyint(1) DEFAULT NULL,
  `stopSequenceContinuousQ` varchar(50) DEFAULT NULL,
  `stopSequenceContinuousNumber` int(11) DEFAULT NULL,
  `stopSequenceEven` tinyint(1) DEFAULT NULL,
  `stopSequenceEvenQ` varchar(50) DEFAULT NULL,
  `stopSequenceEvenNumber` int(11) DEFAULT NULL,
  `stopSequenceOdd` tinyint(1) DEFAULT NULL,
  `stopSequenceOddQ` varchar(50) DEFAULT NULL,
  `stopSequenceOddNumber` int(11) DEFAULT NULL,
  `doorFrameHammered` int(11) DEFAULT NULL,
  `doorFrameHammeredDesc` varchar(100) DEFAULT NULL,
  `doorFrameStainless` tinyint(1) DEFAULT NULL,
  `doorFrameStainlessDescrip` varchar(50) DEFAULT NULL,
  `sistelWDisplayPB` tinyint(1) DEFAULT NULL,
  `sistelWDisplayFloor` int(11) DEFAULT NULL,
  `sistelWArrowPB` tinyint(1) DEFAULT NULL,
  `sistelWArrowFloor` int(11) DEFAULT NULL,
  `hallButtonType` int(11) DEFAULT NULL,
  `hallButton` int(11) DEFAULT NULL,
  `comment` varchar(700) DEFAULT NULL,
  `status` char(1) NOT NULL,
  PRIMARY KEY (`idBudget`),
  KEY `security_user_budget_fk` (`id_security_user`),
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
  KEY `basic_data_budget_fk` (`machineBase`),
  KEY `business_partner_budget_fk` (`id_business_partner`),
  CONSTRAINT `basicdata_budget_fk` FOREIGN KEY (`speed`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk1` FOREIGN KEY (`buildingType`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk10` FOREIGN KEY (`hourMachine`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk11` FOREIGN KEY (`hallButton`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk12` FOREIGN KEY (`maneuverType`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk13` FOREIGN KEY (`cabinDesign`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk14` FOREIGN KEY (`hallButtonType`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk15` FOREIGN KEY (`roofType`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk16` FOREIGN KEY (`buttonType`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk17` FOREIGN KEY (`railing`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk18` FOREIGN KEY (`mirror`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk19` FOREIGN KEY (`floorType`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk2` FOREIGN KEY (`elevatorType`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk20` FOREIGN KEY (`fan`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk21` FOREIGN KEY (`doorType`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk22` FOREIGN KEY (`doorSystem`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk23` FOREIGN KEY (`doorframeType`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk24` FOREIGN KEY (`controlType`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk25` FOREIGN KEY (`boothButton`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk26` FOREIGN KEY (`boothDisplay`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk27` FOREIGN KEY (`floorDisplay`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk3` FOREIGN KEY (`elevatorCapacitance`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk30` FOREIGN KEY (`freeAdmission`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk31` FOREIGN KEY (`height`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk4` FOREIGN KEY (`doorFrameHammered`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk5` FOREIGN KEY (`machineType`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk6` FOREIGN KEY (`access`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk7` FOREIGN KEY (`electricityType`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk8` FOREIGN KEY (`frequency`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basicdata_budget_fk9` FOREIGN KEY (`voltageLighting`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `basic_data_budget_fk` FOREIGN KEY (`machineBase`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `business_partner_budget_fk` FOREIGN KEY (`id_business_partner`) REFERENCES `business_partner` (`id_business_partner`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `security_user_budget_fk` FOREIGN KEY (`id_security_user`) REFERENCES `security_user` (`id_security_user`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `budget`
--

LOCK TABLES `budget` WRITE;
/*!40000 ALTER TABLE `budget` DISABLE KEYS */;
INSERT INTO `budget` VALUES (1,1,1,'2013-03-22 11:53:28','J','123456','MOLINA Y CIA.','LA MARCONA',3,'Mauricio Moretti','CARRETERA PANAMERICANA KM 18 CARRIZAL','CARACAS','ninguno','ninguno@ninguno.com','ING° FERNANDO CAVANILLA',0,0,1,6,10,1,176,1,'2:1',25,174,NULL,NULL,35,NULL,NULL,NULL,48,2,3.75,2.13,NULL,1.5,NULL,59,0,' ',NULL,NULL,NULL,NULL,NULL,NULL,NULL,87,89,90,' ',101,NULL,103,107,'PARED',NULL,NULL,0,0,0,0,0,0,0,0,' ',1,'PB,1',2,0,'',0,0,'',0,NULL,NULL,1,'PB, 1',1,2,0,0,166,145,'1.- CAPACIDAD 2500 KG\n2.- ENTRADA LIBRE 1800\n3.- POZO DE 2,00 MTS DE ANCHO X 2,00 MTS DE FONDO, Y CABINA CON ALTURA INTERNA DE 2,20 MTS.\n4.- INCLUIR MIRILLA DE SEGURIDAD EN HOJAS DE PUERTA\n5.- INCLUIR REJA EN CABINA, A MEDIA ALTURA, Y QUICIO REFORZADO (HIERRO PREFERIBLEMENTE)\n6.- INCLUIR BOTONES DE RENIVELACIÓN EN BOTONERA DE CABINA\n7.- SUMINISTRAR PLANO DE DISPOSICIÓN CON DIMENSIONES MÍNIMAS DE SOBRERECORRIDO Y DIMENSIÓN INTERNA DE CABINA','A'),(2,2,2,'2013-03-22 13:34:50','J','111111','CAROCCHI CONSTRUCCIONES','CONJUNTO RESIDENCIAL SAN OMERO',4,'Cesar Molina','CALABOZO - EDO GUARICO','CALABOZO - EDO GUARICO','0414- 4886842','ninguno@ninguno.com','GERARDO CIAROCCHI',0,0,1,1,9,1,15,1,'1:1',23,174,NULL,NULL,36,NULL,NULL,NULL,48,4,12,NULL,NULL,NULL,NULL,58,1,'FORMICA NO DETALLADO',NULL,NULL,71,NULL,73,NULL,NULL,86,NULL,NULL,NULL,100,95,NULL,NULL,' ',NULL,NULL,0,0,0,0,0,0,0,0,' ',1,'PB,1,2,3',4,0,'',0,0,'',0,139,'No especificado el color',0,NULL,0,0,0,0,NULL,NULL,'1.- PANORAMICO RECTO	','A'),(3,3,3,'2013-03-22 14:03:01','J','222222','ASOCIACION CIVIL RES EL PORTAL TORRE D','EL PORTAL TORRE D',4,'Cesar Molina','RES EL PORTAL TORRE D CALLE FERBUS AL LADO DEL CC REGIONAL TURMERO - ARAGUA','TURMERO - ARAGUA','0424 3666015','ninguno@ninguno.com','  DAICYS REYES',0,0,0,1,7,2,15,2,'1:1',23,174,NULL,NULL,36,NULL,NULL,NULL,48,13,NULL,NULL,NULL,NULL,NULL,NULL,1,' VENDEDOR NO ESPECIFICO DISEÑO',65,NULL,NULL,NULL,73,NULL,NULL,86,NULL,NULL,NULL,100,95,NULL,NULL,' ',NULL,NULL,0,0,0,0,0,0,0,0,' ',0,NULL,0,1,'PB,2,4,6,8,10,12',7,1,'PB,1,3,5,7,9,11',11,139,'Color no especificado por el vendedor',0,NULL,0,0,0,0,NULL,NULL,'1.- MODERNIZACION	','A'),(4,4,4,'2013-03-22 14:09:04','J','333333','DISTRIBUIDORA OLRUCA, C.A.','HOTEL ORINOCO (VENETUR)',3,'Mauricio Moretti','PUERTO ORDAZ','PUERTO ORDAZ','ninguno','ninguno@ninguno.com','ALFREDO MORALES',0,0,0,5,7,2,19,2,'1:1',23,174,NULL,31,146,NULL,NULL,NULL,52,8,25.65,5.05,NULL,3,NULL,149,0,' ',162,NULL,NULL,NULL,73,NULL,NULL,86,89,NULL,NULL,101,98,102,107,'PARED',NULL,NULL,1,0,1,0,0,0,0,1,' ',1,'S, PB, 2, 3, 4, 5,6, 7',8,0,'',0,0,'',0,139,'Resto de los pisos',1,'PB, 7',1,8,0,0,166,NULL,'0.- Ascensor no para en nivel 1.\n1.- POZO 2540 mm de ancho x 1915 mm de fondo, cada uno; pozos adyacentes con viga de separación de 90 mm\n2.- Cabina de 1993 mm de ancho x 1272 mm de fondo x 2214 mm de alto hasta el plafón interno\n3.- Botonera de cabina debe incluir llaves y controles para Servicio de ascensorista, Reservación, fuera de servicio\nluz de emergencia, indicación visual y sonora de sobrecarga, alarma e intercomunicador\n4.- SE CONSERVAN RIELES, MARCOS DE PUERTAS, MARCO DE CONTRAPESO Y PESAS, Y BASTIDOR DE CABINA\n5.- CONSIDERAR AMORTIGUADORES HIDRAULICOS EN FOSO','A'),(5,5,5,'2013-03-22 14:21:12','J','444444','INVERSIONES SALUSGA, C.A.','CENTRO EMPRESARIAL ROCA',3,'Mauricio Moretti','AV. ORINOCO SUR , LAS MERCEDES, FRENTE A LA UE','CARACAS','ninguno','ninguno@ninguno.com','DR. NELSON SANSIVERIO Y DR. ABEL GALARRAGA',0,0,0,2,7,2,16,2,'1:1',23,174,NULL,NULL,38,NULL,NULL,NULL,53,6,18.6,6.3,NULL,1.8,NULL,149,0,' ',152,NULL,71,NULL,73,NULL,NULL,86,89,NULL,NULL,100,96,102,107,'PARED',NULL,NULL,1,0,0,0,0,0,0,1,' ',1,' S1,PB,1,2,3,PH',6,0,'',0,0,'',0,139,'Resto de los pisos.',1,'PB',1,6,0,0,166,NULL,'1.- Pozo de 2,00 mts de ancho x 1,80 mts de fondo\n2.- Cabina de 1,45 mts de ancho x 0,96 mts de fondo x 2,20 mts de alto\n3.- Incluir \" Reservación\" en botonera de cabina y botonera doble en piso con display de posición, dirección y gongs, \nen todos los pisos\n4.- Se conservan marcos de puerta, marco de contrapeso y pesas, rieles, bastidor de cabina y amortiguadores hidraulicos','A'),(6,6,6,'2013-03-22 14:33:39','J','555555','GEOMETRICO CONSORCIO TURISTICO AMBIENTAL','PUERTO MORROCOY',4,'Cesar Molina','TUCACAS - FALCON','TUCACAS - FALCON','ninguno','ninguno@ninguno.com','SR LUIS RADA',0,0,1,1,9,3,15,3,'1:1',23,174,NULL,NULL,NULL,NULL,NULL,NULL,48,6,NULL,NULL,NULL,NULL,NULL,59,0,' ',65,NULL,71,NULL,73,NULL,NULL,86,NULL,NULL,NULL,101,96,102,NULL,' ',NULL,NULL,1,0,0,0,0,0,0,0,' ',1,' PB,1,2,3,4',5,0,'',0,0,'',0,NULL,NULL,1,'TODOS LOS PISOS?',0,0,0,0,NULL,NULL,'1.- PANORAMICO DE LUJO (TUCACAS)','A'),(7,7,7,'2013-03-22 14:38:29','J','666666','HCL C.A','CONJUNTO RESIDENCIAL EL PARQUE',4,'Cesar Molina','CHICHIRIVICHE - FALCON','CHICHIRIVICHE - FALCON','NINGUNO','NIGUNO@NINGUNO.COM','SR FRANCISCO SALAS',0,0,1,1,7,1,19,1,'1:1',23,174,NULL,NULL,37,NULL,NULL,NULL,48,6,NULL,NULL,NULL,NULL,NULL,58,1,'1.- CABINA ESTANDAR LUJO',162,NULL,71,NULL,73,NULL,NULL,86,NULL,NULL,NULL,100,97,NULL,NULL,' ',NULL,NULL,1,0,0,0,0,0,0,0,' ',1,'PB,1,2,3,4,5',6,0,'',0,0,'',0,NULL,NULL,1,'Todos los pisos.',0,0,0,0,NULL,NULL,'','A'),(8,8,8,'2013-03-22 15:56:40','J','777777','MADERERA CORINSA C.A','EDIF RESIDENCIAL',4,'Cesar Molina','CAGUA - ARAGUA','CAGUA - ARAGUA','ninguno','ninguno@ninguno.com','SR GIOVANNI ARPAIA',0,0,1,1,7,1,15,1,'1:1',23,174,NULL,NULL,36,NULL,NULL,NULL,48,4,NULL,NULL,NULL,NULL,NULL,58,1,'No comentado por el vendedor.',65,NULL,71,NULL,73,NULL,NULL,83,NULL,NULL,NULL,100,95,NULL,NULL,' ',NULL,NULL,1,0,0,0,0,0,0,0,' ',1,'PB,1,2,3',4,0,'',0,0,'',0,139,'No comentado por el vendedor.',0,NULL,0,0,0,0,NULL,NULL,'1.- PORFA HAZ UNO ESTANDAR Y OTRO LUJO','A'),(9,9,9,'2013-03-22 16:00:37','J','888888','CONTRUCCIONES PALACE C.A','PLATINUM PALACE ',4,'Cesar Molina','CALLE LOS SAUCES  URB EL BOSQUE PARCELA 32','MARACAY EDO ARAGUA','NINGUNO','NINGUNO@NINGUNO.COM','ING EDGAR HASKUR',0,0,1,1,7,2,15,2,'1:1',23,174,NULL,NULL,36,NULL,NULL,NULL,48,10,NULL,NULL,NULL,NULL,NULL,58,1,'nada',66,NULL,71,NULL,73,NULL,NULL,86,NULL,NULL,NULL,100,95,NULL,NULL,' ',NULL,NULL,1,0,0,0,0,0,0,0,' ',0,NULL,0,1,'S1,PB,2,4,6,8',6,1,'S1,PB,1,3,5,7,8',7,139,'S1, y resto de los pisos.',1,'PB',0,0,0,0,NULL,NULL,'3.- MARCO DE 200 mm ( 5% + QUE EL COMUN)','A'),(10,10,10,'2013-03-22 17:09:55','J','00031531-0','Alfonzo Rivas & CIA','Edf. Mamber, sede de McCormick',3,'Mauricio Moretti','Av. Chicago con calle Boston, Urb. La California Sur, Caracas','CARACAS','NO','NO@NO.COM','Ing° Abraham Lasser',0,0,0,6,10,1,20,1,'2:1',22,174,NULL,NULL,35,NULL,NULL,NULL,53,4,12,3.5,NULL,1.8,NULL,137,1,'Cabina de acero pintada (No se especifica color).\nAcabado de piso Lamina acero estriada',164,NULL,NULL,NULL,76,NULL,NULL,131,NULL,NULL,NULL,101,99,104,107,'PARED',NULL,NULL,0,0,0,0,0,0,0,0,' ',1,' PB,1,2,3',4,0,'',0,0,'',0,139,'No se especifica color.',0,NULL,0,0,0,0,NULL,145,'- PB ABRE AL FRENTE\n- 1,2,3 ABRE OPUESTO\n- CONSERVAR TZ (CAIDA DE GUAYAS = 510 mm)\n- INCLUIR BOTONES DE RENIVELACIÓN EN AMBOS EXTREMOS DE LA CABINA, AL LADO DE LA BOTONERA\n- INCLUIR 2 BOTONERAS EN CABINA, cada una con botones de llamada, boton de alarma e indicador de posición\n- INCLUIR SISTEMA DE CONTACTO EN PUERTAS\n- Puertas de piso con mirilla\n- Se conservan rieles y soportes, marco de contrapeso y pesas, marcos de puerta de piso y bastidor de cabina (según su\ncondición ==> nuevo si está deteriorado o restaurado (lijado y pintado) si es reutilizable.\n- Se conservan amortiguadores pero se deben restaurar (eliminar óxido y y pintar de nuevo)','A'),(11,11,11,'2013-03-22 17:18:23','J','30909470-0','CONSTRUCTORA 2066, C.A.','LA CAMPIÑA',3,'Mauricio Moretti','LA CAMPIÑA','CARACAS','ninguno','ninguno@ninguno.com','INGº FELICE DENTE',1,1,1,1,7,2,15,2,'1:1',23,174,NULL,NULL,36,NULL,NULL,NULL,48,13,36,4.4,NULL,1.5,NULL,149,0,' ',66,NULL,NULL,NULL,75,NULL,NULL,84,89,NULL,NULL,100,96,102,107,'PARED',NULL,NULL,1,0,0,0,0,0,1,1,' ',0,NULL,0,1,'SS,PB,MZ,2,4,6,8,PH',8,1,'SS,PB,MZ,1,3,5,7,9,PH',9,139,'RESTO DE LOS PISOS',1,'PB',1,16,0,0,166,145,'- Llave magnetica\n1.- POZO: 1,80 mts ancho x 1,75 mts de fondo\n2.- Cabina con piso acabado por cuenta del cliente, con espesor de 23 mm (piso sintético) incluyendo pega\n','A'),(12,12,12,'2013-03-25 15:26:47','J','30549498-3','HOTELES CUMBERLAND, C. A.','HOTELES CUMBERLAND, C. A.',3,'Mauricio Moretti','2a. Av. Las Delicias de Sabana Grande','Caracas','ninguno','ninguno@ninguno.com','Mariano De Alba',0,0,0,5,7,2,15,2,'1:1',23,175,NULL,NULL,38,NULL,NULL,NULL,53,20,57,4.5,NULL,1.9,NULL,149,0,' ',66,NULL,71,NULL,73,NULL,NULL,86,89,NULL,NULL,100,95,102,107,'PARED',NULL,NULL,0,0,0,0,0,0,1,1,' ',1,'S,PB,1-17,PH',20,0,'',0,0,'',0,139,'RESTO DE LOS PISOS. NO SE INDICO COLOR',1,'PB',0,20,0,0,166,145,'- LLAVE PARA NIVEL SOTANO EN CABINA.\n- INCLUIR ESPEJO\n- REVESTIR MARCOS DE ACERO INOX EN PB (LOBBY) (tipo abiertos)\n- INCLUIR ESPEJO\n- INCLUIR INDICADOR DE POSICIÓN Y DE DIRECCIÓN + GONGS, EN TODOS LOS PISOS\n- Incluir llave de reservación en botonera de cabina\n-Incluir llave de privado para nivel sotano, en cabina (Medeco o comercial)\n','A'),(13,13,13,'2013-03-25 15:41:02','J','999999','MIRAMAR SUITES','MIRAMAR SUITES',3,'Mauricio Moretti','PLAYA GRANDE, Av 1','Caracas','ninguno','ninguno@ninguno.com','BRUNO DI ROCCO',0,0,0,5,7,1,15,1,'1:1',23,174,NULL,NULL,36,NULL,NULL,NULL,52,10,30,4,NULL,1.5,NULL,149,0,' ',66,NULL,71,NULL,73,NULL,NULL,86,89,NULL,NULL,100,95,102,107,'PARED',NULL,NULL,1,0,0,0,1,0,0,1,' ',1,'PB, 1- 9',10,0,'',0,0,'',0,139,'RESTO DE LOS PISOS. No se especifico color.',1,'PB',0,10,0,0,166,145,'- Pesacargas.\n- Cliente realiza estructura metálica y cerramiento de pozo, ya que es externo a la edificación actual','A'),(14,14,14,'2013-03-25 15:53:31','J','1111111','CENTRO PORTUGUEZ DE GUAYANA','CENTRO PORTUGUEZ DE GUAYANA',3,'Mauricio Moretti','Puerto Ordaz, Edo. Bolivar','Puerto Ordaz, Edo. Bolivar','ninguno','ninguno@ninguno.com','Arq° Omar Perdomo',0,0,1,2,7,1,17,1,'2:1',23,174,NULL,NULL,36,NULL,NULL,NULL,53,4,12,4,NULL,1.5,NULL,149,0,' ',156,NULL,71,NULL,73,NULL,NULL,86,89,NULL,NULL,101,96,102,107,'MARCO',NULL,NULL,1,1,0,0,1,0,0,0,' ',1,'PB,1,2,3',4,0,'',0,0,'',0,139,'RESTO. COLOR NO INDICADO',1,'PB',0,4,0,0,166,145,'- Pozo de 2,10 mts de ancho x 2,20 mts de fondo\n- Cabina de 1,40 mts de ancho x 1,40 mts de fondo x 2,30 mts de alto','A');
/*!40000 ALTER TABLE `budget` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `business_partner`
--

DROP TABLE IF EXISTS `business_partner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `business_partner` (
  `id_business_partner` int(11) NOT NULL AUTO_INCREMENT,
  `rif` varchar(15) NOT NULL,
  `rif_type` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `address` varchar(200) DEFAULT NULL,
  `status` char(1) NOT NULL,
  PRIMARY KEY (`id_business_partner`),
  KEY `basic_data_business_partner_fk` (`rif_type`),
  CONSTRAINT `basic_data_business_partner_fk` FOREIGN KEY (`rif_type`) REFERENCES `basic_data` (`idBasic`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `business_partner`
--

LOCK TABLES `business_partner` WRITE;
/*!40000 ALTER TABLE `business_partner` DISABLE KEYS */;
INSERT INTO `business_partner` VALUES (1,'123456',171,'MOLINA Y CIA.',NULL,'A'),(2,'111111',171,'CAROCCHI CONSTRUCCIONES',NULL,'A'),(3,'222222',171,'ASOCIACION CIVIL RES EL PORTAL TORRE D',NULL,'A'),(4,'333333',171,'DISTRIBUIDORA OLRUCA, C.A.',NULL,'A'),(5,'444444',171,'INVERSIONES SALUSGA, C.A.',NULL,'A'),(6,'555555',171,'GEOMETRICO CONSORCIO TURISTICO AMBIENTAL',NULL,'A'),(7,'666666',171,'HCL C.A',NULL,'A'),(8,'777777',171,'MADERERA CORINSA C.A',NULL,'A'),(9,'888888',171,'CONTRUCCIONES PALACE C.A',NULL,'A'),(10,'00031531-0',171,'Alfonzo Rivas & CIA',NULL,'A'),(11,'30909470-0',171,'CONSTRUCTORA 2066, C.A.',NULL,'A'),(12,'30549498-3',171,'HOTELES CUMBERLAND, C. A.',NULL,'A'),(13,'999999',171,'MIRAMAR SUITES',NULL,'A'),(14,'1111111',171,'CENTRO PORTUGUEZ DE GUAYANA',NULL,'A');
/*!40000 ALTER TABLE `business_partner` ENABLE KEYS */;
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
  CONSTRAINT `security_group_group_user_fk` FOREIGN KEY (`id_security_group`) REFERENCES `security_group` (`id_security_group`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `security_user_group_user_fk` FOREIGN KEY (`id_security_user`) REFERENCES `security_user` (`id_security_user`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group_user`
--

LOCK TABLES `group_user` WRITE;
/*!40000 ALTER TABLE `group_user` DISABLE KEYS */;
INSERT INTO `group_user` VALUES (1,1),(2,1),(3,1),(4,1),(5,1),(6,1),(7,1),(8,2);
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
INSERT INTO `role_group` VALUES (1,1),(2,1),(1,2),(2,2),(2,3),(1,4),(2,4),(1,5),(2,5),(1,6),(2,6),(1,7),(2,7),(2,8);
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `security_group`
--

LOCK TABLES `security_group` WRITE;
/*!40000 ALTER TABLE `security_group` DISABLE KEYS */;
INSERT INTO `security_group` VALUES (1,'SELLER','A'),(2,'ADMIN','A');
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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `security_role`
--

LOCK TABLES `security_role` WRITE;
/*!40000 ALTER TABLE `security_role` DISABLE KEYS */;
INSERT INTO `security_role` VALUES (1,'ROLE_USER','A'),(2,'ROLE_SECURITY_PROFILE','A'),(3,'ROLE_SECURITY_GROUPS','A'),(4,'ROLE_BUDGET','A'),(5,'ROLE_MENU','A'),(6,'ROLE_REPORT','A'),(7,'ROLE_WINDOW_BUDGETS','A'),(8,'ROLE_SECURITY_USERS_MASTER','A');
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
  `password` varchar(100) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `status` char(1) NOT NULL,
  PRIMARY KEY (`id_security_user`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `security_user`
--

LOCK TABLES `security_user` WRITE;
/*!40000 ALTER TABLE `security_user` DISABLE KEYS */;
INSERT INTO `security_user` VALUES (1,'Roberto Nardi','robertonardi@hotmail.com','8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92','0414-5119212','A'),(2,'Juan C. Villaverde','jcvillaverde@ascensoresnardi.com','8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92','0251-2544738','A'),(3,'Mauricio Moretti','moretti@ascensoresnardi.com','8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92','5555555','A'),(4,'Cesar Molina','cesarmolina@ascensoresnardi.com','8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92','5555555','A'),(5,'Raul Colmenarez','raulcolmenares@ascensoresnardi.com','8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92','5555555','A'),(6,'Jerry de Sousa','jerrydesousa@ascensoresnardi.com','8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92','5555555','A'),(7,'Maurizio Nardi','maurizionardi@ascensoresnardi.com	','8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92','0424-5019904','A'),(8,'Administrador','sistemas@ascensoresnardi.com','67cb5c15db4909600cd6d485e7aad4305d3d9f85efdf598f5435736a8efa37fe','0414-3534887','A');
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

-- Dump completed on 2013-03-25 16:18:10
