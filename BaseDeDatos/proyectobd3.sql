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

-- Volcando datos para la tabla proyectobd3.cliente: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Volcando datos para la tabla proyectobd3.compra: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `compra` DISABLE KEYS */;
/*!40000 ALTER TABLE `compra` ENABLE KEYS */;

-- Volcando datos para la tabla proyectobd3.credito: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `credito` DISABLE KEYS */;
/*!40000 ALTER TABLE `credito` ENABLE KEYS */;

-- Volcando datos para la tabla proyectobd3.credito_has_compra: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `credito_has_compra` DISABLE KEYS */;
/*!40000 ALTER TABLE `credito_has_compra` ENABLE KEYS */;

-- Volcando datos para la tabla proyectobd3.detalle_compra: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_compra` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle_compra` ENABLE KEYS */;

-- Volcando datos para la tabla proyectobd3.detalle_pro: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_pro` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle_pro` ENABLE KEYS */;

-- Volcando datos para la tabla proyectobd3.factura: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;

-- Volcando datos para la tabla proyectobd3.factura_has_pago: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `factura_has_pago` DISABLE KEYS */;
/*!40000 ALTER TABLE `factura_has_pago` ENABLE KEYS */;

-- Volcando datos para la tabla proyectobd3.material: ~15 rows (aproximadamente)
/*!40000 ALTER TABLE `material` DISABLE KEYS */;
INSERT INTO `material` (`id`, `nombre`, `alto`, `ancho`, `cantidad`, `color`, `tipo`) VALUES
	(1, 'Periodico', 27.94, 21.59, 4, 'Gris', 'Carta'),
	(2, 'Bond', 27.94, 21.59, 4, 'blanco', 'Carta'),
	(3, 'Cauche', 33, 21.64, 5, 'Blanco', 'Oficio'),
	(4, 'Bond color', 27.94, 21.59, 3, 'azul', 'Carta'),
	(6, 'adhesivo', 33, 21.64, 5, 'blanco', 'Oficio'),
	(7, 'Cartulina Manila', 27.94, 21.59, 10, '', 'Carta'),
	(8, 'Cremy', 33, 21.64, 10, 'blanco', 'Oficio'),
	(9, 'Cartulina Lino', 27.94, 21.59, 12, '', 'Carta'),
	(11, 'Cartulina Opalina', 33, 21.64, 7, 'blanco', 'Oficio'),
	(12, 'Clip', NULL, NULL, 10, '', 'NULL'),
	(13, 'Bond color 2', 27.94, 21.59, 11, 'morado', 'Carta'),
	(14, 'gancho', NULL, NULL, 10, '', 'NULL'),
	(15, 'grapas', NULL, NULL, 120, '', 'NULL'),
	(16, 'Papel sensibilizado ', NULL, NULL, 20, 'blanco ', 'NULL'),
	(17, 'Papel sensibilizado2', NULL, NULL, 20, 'amarillo ', 'NULL');
/*!40000 ALTER TABLE `material` ENABLE KEYS */;

-- Volcando datos para la tabla proyectobd3.pago: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
/*!40000 ALTER TABLE `pago` ENABLE KEYS */;

-- Volcando datos para la tabla proyectobd3.producto: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` (`id`, `descripcion`, `nombre`) VALUES
	(1, 'Descripcion Factura', 'Factura'),
	(2, 'Descripcion Recibo', 'Recibo'),
	(3, 'Descripcion Notas de envio', 'Notas de envio'),
	(4, 'descripcion 4', 'Producto 4');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;

-- Volcando datos para la tabla proyectobd3.producto_has_material: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `producto_has_material` DISABLE KEYS */;
INSERT INTO `producto_has_material` (`producto_id`, `material_id`, `Cantidad`) VALUES
	(1, 16, 1),
	(1, 17, 1),
	(2, 2, 1),
	(2, 16, 1),
	(3, 2, 2),
	(3, 16, 2),
	(4, 16, 3);
/*!40000 ALTER TABLE `producto_has_material` ENABLE KEYS */;

-- Volcando datos para la tabla proyectobd3.proveedor: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;

-- Volcando datos para la tabla proyectobd3.usuario: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
