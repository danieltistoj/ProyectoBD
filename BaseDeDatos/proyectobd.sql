-- MySQL dump 10.17  Distrib 10.3.13-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: proyectobd3
-- ------------------------------------------------------
-- Server version	10.3.13-MariaDB

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `nit` varchar(30) NOT NULL,
  `telefono` varchar(30) DEFAULT NULL,
  `correo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (3,'cliente 3','apellido 3','333333','777777','correo 3'),(4,'cliente 4','apellido 4','4444444','888888','correo 4'),(5,'cliente5','apellido5','234','99990','algo@gmail'),(6,'cliente 4','apellido 4','900','41901588','cliente4@gmail.com'),(7,'jose','lopez','111','123432','joselopez@gmail.com'),(9,'cliente9','apellido 9','999999','1212121','cliente9@hotmail.com'),(10,'cliente10','apellido10','1452-7999','00001134','cliente10@gmail.com'),(11,'cliente11','apellido11','0000-9797','22221113','cliente11@hotmail.com');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER eliminarCliente

BEFORE DELETE ON cliente

FOR EACH ROW

BEGIN

DELETE FROM factura WHERE cliente_id = old.id;

DELETE FROM pago WHERE cliente_id = old.id;

END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `compra`
--

DROP TABLE IF EXISTS `compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `compra` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `total` float NOT NULL,
  `no_factura` varchar(70) DEFAULT NULL,
  `proveedor_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_compra_proveedor1_idx` (`proveedor_id`),
  CONSTRAINT `fk_compra_proveedor1` FOREIGN KEY (`proveedor_id`) REFERENCES `proveedor` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra`
--

LOCK TABLES `compra` WRITE;
/*!40000 ALTER TABLE `compra` DISABLE KEYS */;
INSERT INTO `compra` VALUES (1,'2020-04-04',3,'CC0001',1),(2,'2020-04-04',20,'CC0002',1),(5,'2020-04-09',19.5,'CC0005',1),(8,'2020-04-27',23,'CC0006',1),(9,'2020-05-05',30,'CC0007',4),(10,'2020-05-07',12,'CC0008',1),(11,'2020-05-07',10,'CC0009',1);
/*!40000 ALTER TABLE `compra` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER eliminarCompra

BEFORE DELETE ON compra

FOR EACH ROW

BEGIN

DELETE FROM detalle_compra WHERE compra_id = old.id;

DELETE FROM credito_has_compra WHERE compra_id = old.id;

END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `credito`
--

DROP TABLE IF EXISTS `credito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `credito` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `abono` float NOT NULL,
  `fecha` date DEFAULT NULL,
  `proveedor_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_credito_proveedor1_idx` (`proveedor_id`),
  CONSTRAINT `fk_credito_proveedor1` FOREIGN KEY (`proveedor_id`) REFERENCES `proveedor` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credito`
--

LOCK TABLES `credito` WRITE;
/*!40000 ALTER TABLE `credito` DISABLE KEYS */;
INSERT INTO `credito` VALUES (1,10,'2020-04-04',1),(4,5,'2020-04-05',1),(5,2,'2020-04-05',1),(6,3,'2020-04-05',1),(7,10,'2020-04-09',1),(8,5,'2020-04-09',1),(11,21,'2020-04-27',1),(12,2,'2020-04-27',1),(13,20,'2020-05-05',4),(14,2.5,'2020-05-05',1),(15,2,'2020-05-05',1),(16,6,'2020-05-07',1),(17,6,'2020-05-07',1),(18,10,'2020-05-07',1);
/*!40000 ALTER TABLE `credito` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER eliminarCredito

BEFORE DELETE ON credito

FOR EACH ROW

BEGIN

DELETE FROM credito_has_compra WHERE credito_id = old.id;

END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `credito_has_compra`
--

DROP TABLE IF EXISTS `credito_has_compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `credito_has_compra` (
  `credito_id` int(11) NOT NULL AUTO_INCREMENT,
  `compra_id` int(11) NOT NULL,
  PRIMARY KEY (`credito_id`,`compra_id`),
  KEY `fk_credito_has_compra_compra1_idx` (`compra_id`),
  KEY `fk_credito_has_compra_credito1_idx` (`credito_id`),
  CONSTRAINT `fk_credito_has_compra_compra1` FOREIGN KEY (`compra_id`) REFERENCES `compra` (`id`),
  CONSTRAINT `fk_credito_has_compra_credito1` FOREIGN KEY (`credito_id`) REFERENCES `credito` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credito_has_compra`
--

LOCK TABLES `credito_has_compra` WRITE;
/*!40000 ALTER TABLE `credito_has_compra` DISABLE KEYS */;
INSERT INTO `credito_has_compra` VALUES (1,2),(4,2),(5,2),(6,2),(7,5),(8,5),(11,8),(12,8),(13,9),(14,5),(15,5),(16,10),(17,10),(18,11);
/*!40000 ALTER TABLE `credito_has_compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_compra`
--

DROP TABLE IF EXISTS `detalle_compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalle_compra` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `precio` float NOT NULL,
  `cantidad` int(11) NOT NULL,
  `compra_id` int(11) NOT NULL,
  `material_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_detalle_compra_compra1_idx` (`compra_id`),
  KEY `fk_detalle_compra_material1_idx` (`material_id`),
  CONSTRAINT `fk_detalle_compra_compra1` FOREIGN KEY (`compra_id`) REFERENCES `compra` (`id`),
  CONSTRAINT `fk_detalle_compra_material1` FOREIGN KEY (`material_id`) REFERENCES `material` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_compra`
--

LOCK TABLES `detalle_compra` WRITE;
/*!40000 ALTER TABLE `detalle_compra` DISABLE KEYS */;
INSERT INTO `detalle_compra` VALUES (1,10,1,2,21),(2,5,2,2,16),(7,4,3,5,2),(8,2.5,3,5,3),(11,3,1,8,1),(12,4,5,8,2),(13,2.5,4,9,3),(14,10,2,9,21),(15,4,3,10,2),(16,5,2,11,16);
/*!40000 ALTER TABLE `detalle_compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_pro`
--

DROP TABLE IF EXISTS `detalle_pro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalle_pro` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` int(11) NOT NULL,
  `precio` float NOT NULL,
  `factura_id` int(11) NOT NULL,
  `producto_id` int(11) NOT NULL,
  `total` float DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_detalle_pro_factura1_idx` (`factura_id`),
  KEY `fk_detalle_pro_producto1_idx` (`producto_id`),
  CONSTRAINT `fk_detalle_pro_factura1` FOREIGN KEY (`factura_id`) REFERENCES `factura` (`id`),
  CONSTRAINT `fk_detalle_pro_producto1` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_pro`
--

LOCK TABLES `detalle_pro` WRITE;
/*!40000 ALTER TABLE `detalle_pro` DISABLE KEYS */;
INSERT INTO `detalle_pro` VALUES (7,1,5.6,7,4,5.6),(8,1,5.6,8,4,5.6),(9,3,6,8,9,18),(10,1,5.6,8,4,5.6),(12,3,6,8,9,18),(13,1,5.6,8,4,5.6),(14,1,6,8,9,6),(15,1,6,9,9,6),(19,2,10,13,1,20),(20,2,16,14,12,32),(23,1,16,16,12,16),(24,1,25,16,13,25),(25,3,10,17,1,30),(26,2,12,18,14,24),(27,3,16,19,11,48),(28,1,10,20,1,10);
/*!40000 ALTER TABLE `detalle_pro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `factura` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `total` float NOT NULL,
  `nit` varchar(30) NOT NULL,
  `numFactura` varchar(30) DEFAULT NULL,
  `cliente_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_factura_cliente1_idx` (`cliente_id`),
  CONSTRAINT `fk_factura_cliente1` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES (6,'2020-03-25',12,'234','CD0003',5),(7,'2020-03-25',5.6,'234','CD0004',5),(8,'2020-03-25',5.6,'234','CD0005',5),(9,'2020-03-26',6,'111','CD0006',7),(13,'2020-04-15',20,'234','CD0009',5),(14,'2020-04-15',37,'900','CD0010',6),(15,'2020-04-17',36,'900','CD0011',6),(16,'2020-04-18',41,'999999','CD0012',9),(17,'2020-04-22',30,'234','CD0013',5),(18,'2020-04-27',24,'111','CD0014',7),(19,'2020-05-05',48,'4444444','CD0015',4),(20,'2020-05-07',10,'111','CD0016',7);
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER eliminarFactura

BEFORE DELETE ON factura

FOR EACH ROW

BEGIN

DELETE FROM detalle_pro WHERE factura_id = old.id;

DELETE FROM factura_has_pago WHERE factura_id = old.id;

END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `factura_has_pago`
--

DROP TABLE IF EXISTS `factura_has_pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `factura_has_pago` (
  `factura_id` int(11) NOT NULL AUTO_INCREMENT,
  `pago_id` int(11) NOT NULL,
  PRIMARY KEY (`factura_id`,`pago_id`),
  KEY `fk_factura_has_pago_pago1_idx` (`pago_id`),
  KEY `fk_factura_has_pago_factura1_idx` (`factura_id`),
  CONSTRAINT `fk_factura_has_pago_factura1` FOREIGN KEY (`factura_id`) REFERENCES `factura` (`id`),
  CONSTRAINT `fk_factura_has_pago_pago1` FOREIGN KEY (`pago_id`) REFERENCES `pago` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura_has_pago`
--

LOCK TABLES `factura_has_pago` WRITE;
/*!40000 ALTER TABLE `factura_has_pago` DISABLE KEYS */;
INSERT INTO `factura_has_pago` VALUES (6,4),(7,5),(7,35),(8,6),(9,9),(9,24),(13,15),(13,19),(13,20),(13,21),(14,16),(14,22),(14,23),(14,33),(15,25),(16,26),(16,27),(16,28),(16,29),(17,30),(17,31),(18,32),(19,34),(20,36),(20,37);
/*!40000 ALTER TABLE `factura_has_pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `material`
--

DROP TABLE IF EXISTS `material`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `material` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) NOT NULL,
  `alto` float DEFAULT NULL,
  `ancho` float DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  `color` varchar(50) DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `costo` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `material`
--

LOCK TABLES `material` WRITE;
/*!40000 ALTER TABLE `material` DISABLE KEYS */;
INSERT INTO `material` VALUES (1,'Periodico',27.94,21.59,2,'Gris','Carta',3),(2,'Bond',27.94,21.59,8,'blanco','Carta',4),(3,'Cauche',33,21.64,4,'Blanco','Oficio',2.5),(4,'Bond color',27.94,21.59,6,'azul','Carta',1.2),(6,'adhesivo',33,21.64,5,'blanco','Oficio',0.5),(7,'Cartulina Manila',27.94,21.59,10,'','Carta',2.4),(8,'Cremy',33,21.64,10,'blanco','Oficio',2.6),(11,'Cartulina Opalina',33,21.64,7,'blanco','Oficio',1.3),(12,'Clip',NULL,NULL,10,'','NULL',0.01),(13,'Bond color 2',27.94,21.59,11,'morado','Carta',1.4),(14,'gancho',NULL,NULL,2,'','NULL',1),(16,'Papel sensibilizado ',NULL,NULL,2,'blanco ','NULL',5),(18,'Material 7',NULL,NULL,10,'','NULL',2.7),(21,'Material 8',27.94,21.59,3,'Negro','Carta',10);
/*!40000 ALTER TABLE `material` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER eliminarMaterial

BEFORE DELETE ON material

FOR EACH ROW

BEGIN

DELETE FROM producto_has_material WHERE material_id = old.id;

DELETE FROM detalle_compra WHERE material_id = old.id;

END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `pago`
--

DROP TABLE IF EXISTS `pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pago` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `abono` float NOT NULL,
  `cliente_id` int(11) NOT NULL,
  `numPago` varchar(50) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_pago_cliente_idx` (`cliente_id`),
  CONSTRAINT `fk_pago_cliente` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago`
--

LOCK TABLES `pago` WRITE;
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
INSERT INTO `pago` VALUES (4,12,5,'PD0003','2020-03-25'),(5,5,5,'PD0004','2020-03-25'),(6,5,5,'PD0005','2020-03-25'),(9,3,7,'PD0008','2020-03-26'),(15,10,5,'PD0014','2020-04-15'),(16,30,6,'PD0015','2020-04-15'),(19,5,5,'PD0016','2020-04-17'),(20,3.5,5,'PD0017','2020-04-17'),(21,1.5,5,'PD0018','2020-04-17'),(22,5,6,'PD0019','2020-04-17'),(23,1,6,'PD0020','2020-04-17'),(24,1,7,'PD0021','2020-04-17'),(25,27,6,'PD0022','2020-04-17'),(26,30,9,'PD0023','2020-04-18'),(27,5,9,'PD0024','2020-04-18'),(28,3,9,'PD0025','2020-04-18'),(29,1.5,9,'PD0026','2020-04-18'),(30,15,5,'PD0027','2020-04-22'),(31,2,5,'PD0028','2020-04-22'),(32,20,7,'PD0029','2020-04-27'),(33,1,6,'PD0030','2020-04-28'),(34,24,4,'PD0031','2020-05-05'),(35,0.6,5,'PD0032','2020-05-05'),(36,5,7,'PD0033','2020-05-07'),(37,5,7,'PD0034','2020-05-07');
/*!40000 ALTER TABLE `pago` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER eliminarPago

BEFORE DELETE ON pago

FOR EACH ROW

BEGIN

DELETE FROM factura_has_pago WHERE pago_id = old.id;

END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(400) DEFAULT NULL,
  `nombre` varchar(200) NOT NULL,
  `precio` float DEFAULT NULL,
  `costoProduccion` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'Descripcion Factura','Factura',10,5),(3,'Descripcion Notas de envio','Notas de envio',24,18),(4,'descripcion 4','Producto 4',18.7,15),(5,'descripcion','producto 5',5.8,4.8),(6,'desc6','producto 6',18,6.6),(7,'dsf','producto 7',12,4),(9,'Descripcion 9','Producto9',12,15.4),(10,'','producto8',13.9,11.6),(11,'descripcion 9','producto 9',16,0),(12,'descripcion 10','producto 10',16,14),(13,'descripcion 11','Producto 11',25,20),(14,'descripcion 12','Producto 12',12,10.3),(18,'descripcion ','producto15',5.5,2.7),(19,'descripcion16','producto16',8,6.7);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger eliminarProducto before delete

on producto

for each row

begin



delete from producto_has_material where producto_id = old.id;

delete from detalle_pro where producto_id = old.id;



end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `producto_has_material`
--

DROP TABLE IF EXISTS `producto_has_material`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto_has_material` (
  `producto_id` int(11) NOT NULL AUTO_INCREMENT,
  `material_id` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  PRIMARY KEY (`producto_id`,`material_id`),
  KEY `fk_producto_has_material_material1_idx` (`material_id`),
  KEY `fk_producto_has_material_producto1_idx` (`producto_id`),
  CONSTRAINT `fk_producto_has_material_material1` FOREIGN KEY (`material_id`) REFERENCES `material` (`id`),
  CONSTRAINT `fk_producto_has_material_producto1` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto_has_material`
--

LOCK TABLES `producto_has_material` WRITE;
/*!40000 ALTER TABLE `producto_has_material` DISABLE KEYS */;
INSERT INTO `producto_has_material` VALUES (1,16,1),(3,2,2),(3,16,2),(4,16,3),(6,11,2),(7,2,1),(9,16,2),(9,18,2),(10,2,2),(10,4,3),(12,1,2),(12,2,2),(13,16,2),(13,21,1),(14,3,2),(14,11,1),(14,14,4),(18,18,1),(19,2,1),(19,18,1);
/*!40000 ALTER TABLE `producto_has_material` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proveedor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(150) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `celular` varchar(30) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `correo` varchar(100) DEFAULT NULL,
  `num_cuenta` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES (1,'proveedor 1','77776666','11112222','direccion 1','correo1@gmail.com','9999-0000'),(3,'proveedor3','999998888','112222233','direccion3','proveedor3@gmail.com','11111-222'),(4,'proveedor4','44445555','87878909','direccion4','proveedor4@hotmail.com','1111-2222');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER eliminarProveedor

BEFORE DELETE ON proveedor

FOR EACH ROW

BEGIN

DELETE FROM compra WHERE proveedor_id = old.id;

DELETE FROM credito WHERE proveedor_id = old.id;

END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `tipo_usuario`
--

DROP TABLE IF EXISTS `tipo_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_usuario`
--

LOCK TABLES `tipo_usuario` WRITE;
/*!40000 ALTER TABLE `tipo_usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(45) NOT NULL,
  `password` varchar(100) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `dpi` varchar(45) DEFAULT NULL,
  `sueldo` float DEFAULT NULL,
  `tipo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Administrador','f33bc7f1e474e503cf8ff4b802bc3aff','daniel','daniel@gmail.com','11112222','99990000','',NULL,1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-19 22:12:03
