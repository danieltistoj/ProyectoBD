-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.3.13-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para proyectobd3
CREATE DATABASE IF NOT EXISTS `proyectobd3` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `proyectobd3`;

-- Volcando estructura para tabla proyectobd3.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `nit` varchar(30) NOT NULL,
  `telefono` varchar(30) DEFAULT NULL,
  `correo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla proyectobd3.compra
CREATE TABLE IF NOT EXISTS `compra` (
  `id` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `total` float NOT NULL,
  `no_factura` varchar(70) DEFAULT NULL,
  `proveedor_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_compra_proveedor1_idx` (`proveedor_id`),
  CONSTRAINT `fk_compra_proveedor1` FOREIGN KEY (`proveedor_id`) REFERENCES `proveedor` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla proyectobd3.credito
CREATE TABLE IF NOT EXISTS `credito` (
  `id` int(11) NOT NULL,
  `saldo` float NOT NULL,
  `abono` float NOT NULL,
  `cargo` float NOT NULL,
  `fecha` date DEFAULT NULL,
  `proveedor_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_credito_proveedor1_idx` (`proveedor_id`),
  CONSTRAINT `fk_credito_proveedor1` FOREIGN KEY (`proveedor_id`) REFERENCES `proveedor` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla proyectobd3.credito_has_compra
CREATE TABLE IF NOT EXISTS `credito_has_compra` (
  `credito_id` int(11) NOT NULL,
  `compra_id` int(11) NOT NULL,
  PRIMARY KEY (`credito_id`,`compra_id`),
  KEY `fk_credito_has_compra_compra1_idx` (`compra_id`),
  KEY `fk_credito_has_compra_credito1_idx` (`credito_id`),
  CONSTRAINT `fk_credito_has_compra_compra1` FOREIGN KEY (`compra_id`) REFERENCES `compra` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_credito_has_compra_credito1` FOREIGN KEY (`credito_id`) REFERENCES `credito` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla proyectobd3.detalle_compra
CREATE TABLE IF NOT EXISTS `detalle_compra` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `precio` float NOT NULL,
  `cantidad` int(11) NOT NULL,
  `compra_id` int(11) NOT NULL,
  `material_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_detalle_compra_compra1_idx` (`compra_id`),
  KEY `fk_detalle_compra_material1_idx` (`material_id`),
  CONSTRAINT `fk_detalle_compra_compra1` FOREIGN KEY (`compra_id`) REFERENCES `compra` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_detalle_compra_material1` FOREIGN KEY (`material_id`) REFERENCES `material` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla proyectobd3.detalle_pro
CREATE TABLE IF NOT EXISTS `detalle_pro` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` int(11) NOT NULL,
  `precio` float NOT NULL,
  `factura_id` int(11) NOT NULL,
  `producto_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_detalle_pro_factura1_idx` (`factura_id`),
  KEY `fk_detalle_pro_producto1_idx` (`producto_id`),
  CONSTRAINT `fk_detalle_pro_factura1` FOREIGN KEY (`factura_id`) REFERENCES `factura` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_detalle_pro_producto1` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla proyectobd3.factura
CREATE TABLE IF NOT EXISTS `factura` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `total` float NOT NULL,
  `nit` varchar(30) NOT NULL,
  `cliente_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_factura_cliente1_idx` (`cliente_id`),
  CONSTRAINT `fk_factura_cliente1` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla proyectobd3.factura_has_pago
CREATE TABLE IF NOT EXISTS `factura_has_pago` (
  `factura_id` int(11) NOT NULL,
  `pago_id` int(11) NOT NULL,
  PRIMARY KEY (`factura_id`,`pago_id`),
  KEY `fk_factura_has_pago_pago1_idx` (`pago_id`),
  KEY `fk_factura_has_pago_factura1_idx` (`factura_id`),
  CONSTRAINT `fk_factura_has_pago_factura1` FOREIGN KEY (`factura_id`) REFERENCES `factura` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_factura_has_pago_pago1` FOREIGN KEY (`pago_id`) REFERENCES `pago` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla proyectobd3.material
CREATE TABLE IF NOT EXISTS `material` (
  `id` int(11) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `alto` float DEFAULT NULL,
  `ancho` float DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  `color` varchar(50) DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla proyectobd3.pago
CREATE TABLE IF NOT EXISTS `pago` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cargo` float NOT NULL,
  `abono` float NOT NULL,
  `cliente_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_pago_cliente_idx` (`cliente_id`),
  CONSTRAINT `fk_pago_cliente` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla proyectobd3.producto
CREATE TABLE IF NOT EXISTS `producto` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(400) DEFAULT NULL,
  `nombre` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla proyectobd3.producto_has_material
CREATE TABLE IF NOT EXISTS `producto_has_material` (
  `producto_id` int(11) NOT NULL,
  `material_id` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  PRIMARY KEY (`producto_id`,`material_id`),
  KEY `fk_producto_has_material_material1_idx` (`material_id`),
  KEY `fk_producto_has_material_producto1_idx` (`producto_id`),
  CONSTRAINT `fk_producto_has_material_material1` FOREIGN KEY (`material_id`) REFERENCES `material` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_producto_has_material_producto1` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla proyectobd3.proveedor
CREATE TABLE IF NOT EXISTS `proveedor` (
  `id` int(11) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `nit` varchar(30) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `correo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla proyectobd3.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `Passwar` varchar(45) NOT NULL,
  `Accesibilidad` int(11) NOT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
