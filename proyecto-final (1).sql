-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2023 a las 20:41:55
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto-final`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comida`
--

CREATE TABLE `comida` (
  `idComida` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `detalle` varchar(100) NOT NULL,
  `cantCalorias` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comida`
--

INSERT INTO `comida` (`idComida`, `nombre`, `detalle`, `cantCalorias`, `estado`) VALUES
(1, 'Liviano', 'Desayuno', 362, 1),
(2, 'Liviano 2', 'Desayuno', 641, 1),
(3, 'Liviano 3', 'Desayuno', 626, 1),
(4, 'Abundante', 'Desayuno', 1824, 1),
(5, 'Leche chocolatada', 'Desayuno', 1364, 1),
(6, 'Batido lacteo con galletitas', 'Desayuno', 497, 1),
(7, 'Cafe con pan y dulce', 'Desayuno', 879, 1),
(8, 'Brunch Frances', 'Desayuno', 1801, 1),
(9, 'Brunch Español', 'Desayuno', 3225, 1),
(10, 'Brunch Iberico', 'Desayuno', 1412, 1),
(11, 'Brunch Americano', 'Merienda', 2729, 1),
(12, 'Clasica', 'Merienda', 972, 1),
(13, 'Fitness', 'Desayuno', 1403, 1),
(14, 'FitPro', 'Merienda', 612, 1),
(15, 'Colacion 1', 'Media mañana', 52, 1),
(16, 'Colacion 2', 'Media mañana', 90, 1),
(17, 'Colacion 3', 'Media mañana', 432, 1),
(18, 'Colacion Pro', 'Media mañana', 708, 1),
(19, 'Vegetariano', 'Almuerzo', 1466, 1),
(20, 'Vegetariano 2', 'Almuerzo', 1701, 1),
(21, 'Vegetariano 3', 'Almuerzo', 2096, 1),
(22, 'Clasico', 'Almuerzo', 1249, 1),
(23, 'Especial', 'Almuerzo', 1284, 1),
(24, 'Proteico', 'Almuerzo', 783, 1),
(25, 'Proteico 2', 'Almuerzo', 982, 1),
(26, 'Proteico fit', 'Almuerzo', 550, 1),
(27, 'Proteico 3', 'Almuerzo', 1554, 1),
(28, 'Hipercalorico', 'Almuerzo', 2409, 1),
(29, 'Hipercalorico 2', 'Almuerzo', 1812, 1),
(30, 'Hiprcalorico 3', 'Almuerzo', 2126, 1),
(31, 'Del mar', 'Almuerzo', 721, 1),
(32, 'Del mar 2', 'Almuerzo', 975, 1),
(33, 'Del mar 3', 'Almuerzo', 1097, 1),
(34, 'Casera', 'Almuerzo', 962, 1),
(35, 'Casera 2', 'Almuerzo', 1607, 1),
(36, 'Casero 3', 'Almuerzo', 2279, 1),
(37, 'Especial', 'Almuerzo', 654, 1),
(38, 'Especial 2', 'Almuerzo', 1060, 1),
(39, 'Especial 3', 'Almuerzo', 628, 1),
(40, 'Light', 'Media mañana', 241, 1),
(41, 'Light 2', 'Media mañana', 485, 1),
(42, 'Light 3', 'Media mañana', 630, 1),
(43, 'Brunch Bomba', 'Merienda', 3393, 1),
(44, 'Brunch Extra', 'Merienda', 4368, 1),
(45, 'Brunch Light', 'Merienda', 1087, 1),
(46, 'Brunch Classic', 'Merienda', 3331, 1),
(47, 'Casera', 'Cena', 891, 1),
(48, 'Casera 2', 'Cena', 927, 1),
(49, 'Parrilla', 'Cena', 2173, 1),
(50, 'Parrilla 2', 'Cena', 1238, 1),
(51, 'Pasta con estofado', 'Cena', 1404, 1),
(52, 'Pasta al dente', 'Cena', 600, 1),
(53, 'Pastel de papa', 'Cena', 1617, 1),
(54, 'pizza', 'Cena', 1409, 1),
(55, 'Hamburguesa especial', 'Cena', 1856, 1),
(56, 'Ligth5', 'Desayuno', 191, 1),
(57, 'Huevo duro', 'Desayuno', 147, 1),
(58, 'yogurt ligth', 'Desayuno', 45, 1),
(59, 'yogurt con frutos', 'Desayuno', 100, 1),
(60, 'Manzana', 'Media mañana', 52, 1),
(61, 'Platano', 'Media mañana', 90, 1),
(62, 'Melon', 'Media mañana', 31, 1),
(63, 'Castañas de caju', 'Media mañana', 199, 1),
(64, 'helado de agua', 'Media mañana', 139, 1),
(65, 'Pastel de queso', 'Merienda', 414, 1),
(66, 'Pastel manzana', 'Merienda', 311, 1),
(67, 'Galletitas', 'Merienda', 397, 1),
(68, 'Expres', 'Desayuno', 198, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `idDieta` int(11) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `fechaInicial` date NOT NULL,
  `pesoInicial` double NOT NULL,
  `pesoFinal` double NOT NULL,
  `fechaFinal` date NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dieta`
--

INSERT INTO `dieta` (`idDieta`, `idPaciente`, `nombre`, `fechaInicial`, `pesoInicial`, `pesoFinal`, `fechaFinal`, `estado`) VALUES
(1, 5, 'Vegana', '2023-05-15', 95.56, 84, '2023-08-15', 0),
(2, 2, 'ddf', '2023-10-01', 52, 55, '2023-12-01', 0),
(3, 2, 'Dieta Ayuno intermitente', '2023-10-01', 78, 75, '2023-12-01', 0),
(4, 7, 'Dieta de la luna', '2023-10-01', 95, 76, '2024-10-01', 0),
(5, 2, 'Dieta Proteica', '2023-10-18', 65, 75, '2024-02-18', 0),
(6, 6, 'dieta Prueba', '2023-10-01', 70, 72, '2023-12-01', 0),
(7, 6, 'Prueba 2', '2023-10-01', 80, 87, '2024-02-01', 0),
(8, 6, 'Prueba 3', '2023-10-18', 75, 82, '2024-02-18', 0),
(9, 7, 'Prueba 5', '2023-10-01', 80, 76, '2023-12-01', 0),
(10, 8, 'Proteica', '2023-07-01', 72, 85, '2024-01-01', 0),
(11, 9, 'Calorica', '2023-03-01', 50, 65, '2023-09-01', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dietacomida`
--

CREATE TABLE `dietacomida` (
  `idDietCom` int(11) NOT NULL,
  `idComida` int(11) NOT NULL,
  `idDieta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dietacomida`
--

INSERT INTO `dietacomida` (`idDietCom`, `idComida`, `idDieta`) VALUES
(1, 65, 2),
(2, 65, 2),
(3, 36, 3),
(4, 33, 3),
(5, 20, 3),
(6, 19, 3),
(7, 32, 3),
(8, 25, 3),
(9, 7, 3),
(10, 48, 3),
(11, 47, 3),
(12, 34, 3),
(13, 3, 3),
(14, 2, 3),
(15, 1, 3),
(16, 48, 4),
(17, 22, 4),
(18, 27, 4),
(19, 33, 4),
(20, 38, 4),
(21, 35, 4),
(22, 12, 4),
(23, 32, 4),
(25, 34, 4),
(26, 47, 4),
(27, 52, 4),
(28, 26, 4),
(29, 31, 4),
(30, 37, 4),
(31, 39, 4),
(32, 65, 4),
(33, 17, 4),
(34, 6, 4),
(35, 1, 4),
(36, 52, 5),
(37, 48, 5),
(38, 47, 5),
(39, 55, 5),
(40, 49, 5),
(41, 50, 5),
(42, 45, 5),
(43, 46, 5),
(44, 11, 5),
(45, 14, 5),
(46, 12, 5),
(47, 34, 5),
(48, 25, 5),
(49, 24, 5),
(50, 37, 5),
(51, 26, 5),
(52, 57, 5),
(53, 63, 5),
(54, 68, 5),
(55, 16, 5),
(56, 15, 5),
(57, 6, 5),
(58, 37, 6),
(59, 39, 6),
(60, 41, 6),
(61, 17, 6),
(62, 42, 6),
(63, 18, 6),
(64, 2, 6),
(65, 3, 6),
(66, 1, 6),
(67, 6, 6),
(68, 68, 6),
(69, 30, 7),
(70, 20, 7),
(71, 9, 7),
(72, 20, 7),
(73, 33, 7),
(74, 28, 7),
(75, 20, 7),
(76, 28, 7),
(77, 23, 7),
(78, 28, 7),
(79, 31, 8),
(80, 14, 8),
(81, 39, 8),
(94, 18, 9),
(99, 52, 9),
(100, 2, 9),
(101, 19, 10),
(102, 21, 10),
(103, 10, 10),
(104, 9, 10),
(105, 8, 10),
(106, 5, 10),
(107, 39, 10),
(108, 37, 10),
(109, 31, 10),
(110, 18, 10),
(111, 3, 10),
(112, 2, 10),
(113, 34, 10),
(114, 32, 10),
(115, 25, 10),
(116, 24, 10),
(117, 12, 10),
(118, 7, 10),
(119, 10, 11),
(120, 19, 11),
(121, 21, 11),
(122, 23, 11),
(123, 28, 11),
(124, 23, 11),
(125, 20, 11),
(126, 13, 11),
(127, 10, 11),
(128, 2, 11),
(129, 3, 11),
(130, 14, 11),
(131, 37, 11),
(132, 39, 11),
(133, 37, 11),
(134, 37, 11),
(135, 31, 11),
(136, 31, 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingredientes`
--

CREATE TABLE `ingredientes` (
  `idIngredientes` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `categoria` varchar(30) NOT NULL,
  `cantCalorias` int(10) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ingredientes`
--

INSERT INTO `ingredientes` (`idIngredientes`, `nombre`, `categoria`, `cantCalorias`, `estado`) VALUES
(1, 'Aceitunas negras', 'Vegetales', 349, 1),
(2, 'Aceitunas verdes', 'Vegetales', 132, 1),
(3, 'Acelgas', 'Vegetales', 33, 1),
(4, 'Ajos', 'Vegetales', 169, 1),
(5, 'Alcachofas', 'Vegetales', 64, 1),
(6, 'Apio', 'Vegetales', 20, 1),
(7, 'Berenjena', 'Vegetales', 29, 1),
(8, 'Berros', 'Vegetales', 21, 1),
(9, 'Brocoli', 'Vegetales', 31, 1),
(10, 'Calabacin', 'Vegetales', 31, 1),
(11, 'Calabaza', 'Vegetales', 24, 1),
(12, 'Cebolla', 'Vegetales', 47, 1),
(13, 'Champiñon y setas', 'Vegetales', 28, 1),
(14, 'Col', 'Vegetales', 28, 1),
(15, 'Col de Bruselas', 'Vegetales', 54, 1),
(16, 'Coliflor', 'Vegetales', 30, 1),
(17, 'Endibia', 'Vegetales', 22, 1),
(18, 'Esparragos', 'Vegetales', 26, 1),
(19, 'Espinaca', 'Vegetales', 32, 1),
(20, 'Lechuga', 'Vegetales', 18, 1),
(21, 'Nabos', 'Vegetales', 29, 1),
(22, 'Papa', 'Vegetales', 86, 1),
(23, 'Pepino', 'Vegetales', 12, 1),
(24, 'Perejil', 'Vegetales', 55, 1),
(25, 'Pimiento', 'Vegetales', 22, 1),
(26, 'Rabanos', 'Vegetales', 20, 1),
(27, 'Remolacha', 'Vegetales', 40, 1),
(28, 'Repollo', 'Vegetales', 19, 1),
(29, 'Rucula', 'Vegetales', 37, 1),
(30, 'Soja', 'Vegetales', 50, 1),
(31, 'Tomate conserva', 'Vegetales', 39, 1),
(32, 'Tomates', 'Vegetales', 22, 1),
(33, 'Zanahoria', 'Vegetales', 42, 1),
(34, 'Tomate zumo', 'Vegetales', 21, 1),
(35, 'Arandanos', 'Frutas', 41, 1),
(36, 'Caqui', 'Frutas', 64, 1),
(37, 'Cereza', 'Frutas', 47, 1),
(38, 'Ciruela', 'Frutas', 44, 1),
(39, 'Ciruela seca', 'Frutas', 290, 1),
(40, 'Coco', 'Frutas', 646, 1),
(41, 'Durazno', 'Frutas', 39, 1),
(42, 'Frambuesa', 'Frutas', 40, 1),
(43, 'Fresas', 'Frutas', 36, 1),
(44, 'Granada', 'Frutas', 65, 1),
(45, 'Higos', 'Frutas', 80, 1),
(46, 'Higos secos', 'Frutas', 275, 1),
(47, 'Kiwi', 'Frutas', 51, 1),
(48, 'Limon', 'Frutas', 39, 1),
(49, 'Mandarina', 'Frutas', 40, 1),
(50, 'Mango', 'Frutas', 57, 1),
(51, 'Manzana', 'Frutas', 52, 1),
(52, 'Melon', 'Frutas', 31, 1),
(53, 'Mora', 'Frutas', 37, 1),
(54, 'Naranja', 'Frutas', 44, 1),
(55, 'Papaya', 'Frutas', 45, 1),
(56, 'Pera', 'Frutas', 61, 1),
(57, 'Piña', 'Frutas', 51, 1),
(58, 'Piña en almibar', 'Frutas', 84, 1),
(59, 'Platano', 'Frutas', 90, 1),
(60, 'Pomelo', 'Frutas', 30, 1),
(61, 'Sandia', 'Frutas', 30, 1),
(62, 'Uva', 'Frutas', 81, 1),
(63, 'Uva pasa', 'Frutas', 324, 1),
(64, 'Zumo de fruta', 'Frutas', 45, 1),
(65, 'Zumo de Naranja', 'Frutas', 42, 1),
(66, 'Almendras', 'Frutos Secos', 620, 1),
(67, 'Avellanas', 'Frutos Secos', 675, 1),
(68, 'Castañas', 'Frutos Secos', 199, 1),
(69, 'Mani', 'Frutos Secos', 560, 1),
(70, 'Nueces', 'Frutos Secos', 660, 1),
(71, 'Piñones', 'Frutos Secos', 660, 1),
(72, 'Pistachos', 'Frutos Secos', 581, 1),
(73, 'Flan de huevo', 'Lacteos y derivados', 126, 1),
(74, 'Flan de vainilla', 'Lacteos y derivados', 102, 1),
(75, 'Helados lacteos', 'Lacteos y derivados', 167, 1),
(76, 'Leche condensada c/azucar', 'Lacteos y derivados', 350, 1),
(77, 'Leche condensada s/azucar', 'Lacteos y derivados', 160, 1),
(78, 'Leche de cabra', 'Lacteos y derivados', 72, 1),
(79, 'Leche descremada', 'Lacteos y derivados', 36, 1),
(80, 'Leche en polvo descremada', 'Lacteos y derivados', 373, 1),
(81, 'Leche en polvo entera', 'Lacteos y derivados', 500, 1),
(82, 'Leche entera', 'Lacteos y derivados', 68, 1),
(83, 'Leche semi descremada', 'Lacteos y derivados', 49, 1),
(84, 'Mousse', 'Lacteos y derivados', 177, 1),
(85, 'Crema de leche', 'Lacteos y derivados', 298, 1),
(86, 'Queso blanco desnatado', 'Lacteos y derivados', 70, 1),
(87, 'Queso cheddar', 'Lacteos y derivados', 381, 1),
(88, 'Queso crema', 'Lacteos y derivados', 245, 1),
(89, 'Queso fundido untable', 'Lacteos y derivados', 285, 1),
(90, 'Queso gruyere', 'Lacteos y derivados', 391, 1),
(91, 'Queso mozzarella', 'Lacteos y derivados', 245, 1),
(92, 'Queso parmesano', 'Lacteos y derivados', 393, 1),
(93, 'Queso ricota', 'Lacteos y derivados', 400, 1),
(94, 'Queso roquefort', 'Lacteos y derivados', 405, 1),
(95, 'Requeson', 'Lacteos y derivados', 96, 1),
(96, 'Yogur desnatado', 'Lacteos y derivados', 45, 1),
(97, 'Yogur desnatado c/frutas', 'Lacteos y derivados', 82, 1),
(98, 'Yogur con nata', 'Lacteos y derivados', 65, 1),
(99, 'Yogur natural', 'Lacteos y derivados', 62, 1),
(100, 'Yogur natural c/frutas', 'Lacteos y derivados', 100, 1),
(101, 'Bacon(Panceta ahumada)', 'Carnes/Embutidos', 665, 1),
(102, 'Butifarra cocida', 'Carnes/Embutidos', 390, 1),
(103, 'Butifarra, salchicha fresca', 'Carnes/Embutidos', 326, 1),
(104, 'Cabrito', 'Carnes/Embutidos', 127, 1),
(105, 'Cerdo, chuleta', 'Carnes/Embutidos', 330, 1),
(106, 'Cerdo, higado', 'Carnes/Embutidos', 153, 1),
(107, 'Cerdo, lomo', 'Carnes/Embutidos', 208, 1),
(108, 'Chicharron', 'Carnes/Embutidos', 601, 1),
(109, 'Chorizo', 'Carnes/Embutidos', 468, 1),
(110, 'Ciervo', 'Carnes/Embutidos', 120, 1),
(111, 'Codorniz y perdiz', 'Carnes/Embutidos', 114, 1),
(112, 'Conejo, liebre', 'Carnes/Embutidos', 162, 1),
(113, 'Cordero', 'Carnes/Embutidos', 105, 1),
(114, 'Cordero, costillas', 'Carnes/Embutidos', 215, 1),
(115, 'Cordero, higado', 'Carnes/Embutidos', 132, 1),
(116, 'Gallina', 'Carnes/Embutidos', 369, 1),
(117, 'Hamburguesa', 'Carnes/Embutidos', 230, 1),
(118, 'Jabali', 'Carnes/Embutidos', 107, 1),
(119, 'Jamon', 'Carnes/Embutidos', 380, 1),
(120, 'Jamon cocido', 'Carnes/Embutidos', 126, 1),
(121, 'Jamon crudo', 'Carnes/Embutidos', 296, 1),
(122, 'Lengua de vaca', 'Carnes/Embutidos', 191, 1),
(123, 'Lomo embuchado', 'Carnes/Embutidos', 380, 1),
(124, 'Mortadela', 'Carnes/Embutidos', 265, 1),
(125, 'Pato', 'Carnes/Embutidos', 200, 1),
(126, 'Pavo, muslo', 'Carnes/Embutidos', 186, 1),
(127, 'Pavo, pechuga', 'Carnes/Embutidos', 134, 1),
(128, 'Pollo, higado', 'Carnes/Embutidos', 129, 1),
(129, 'Pollo, muslo', 'Carnes/Embutidos', 186, 1),
(130, 'Pollo', 'Carnes/Embutidos', 134, 1),
(131, 'Salamin', 'Carnes/Embutidos', 325, 1),
(132, 'Salchicha Frankfurt', 'Carnes/Embutidos', 315, 1),
(133, 'Salchichon', 'Carnes/Embutidos', 294, 1),
(134, 'Ternera', 'Carnes/Embutidos', 181, 1),
(135, 'Tira de asado', 'Carnes/Embutidos', 401, 1),
(136, 'Tripas', 'Carnes/Embutidos', 100, 1),
(137, 'Vaca, higado', 'Carnes/Embutidos', 129, 1),
(138, 'Almejas', 'Pescados/Mariscos', 50, 1),
(139, 'Anchoas', 'Pescados/Mariscos', 175, 1),
(140, 'Atun en aceite vegetal', 'Pescados/Mariscos', 280, 1),
(141, 'Atun en lata con agua', 'Pescados/Mariscos', 127, 1),
(142, 'Atun fresco', 'Pescados/Mariscos', 225, 1),
(143, 'Bacalao fresco', 'Pescados/Mariscos', 74, 1),
(144, 'Bacalao seco', 'Pescados/Mariscos', 322, 1),
(145, 'Besugo', 'Pescados/Mariscos', 118, 1),
(146, 'Caballa', 'Pescados/Mariscos', 153, 1),
(147, 'Calamar', 'Pescados/Mariscos', 82, 1),
(148, 'Cangrejo', 'Pescados/Mariscos', 85, 1),
(149, 'Caviar', 'Pescados/Mariscos', 233, 1),
(150, 'Gambas', 'Pescados/Mariscos', 96, 1),
(151, 'Langosta', 'Pescados/Mariscos', 67, 1),
(152, 'Langostino', 'Pescados/Mariscos', 96, 1),
(153, 'Lenguado', 'Pescados/Mariscos', 73, 1),
(154, 'Lucio', 'Pescados/Mariscos', 81, 1),
(155, 'Mejillon', 'Pescados/Mariscos', 74, 1),
(156, 'Merluza', 'Pescados/Mariscos', 86, 1),
(157, 'Ostras', 'Pescados/Mariscos', 80, 1),
(158, 'Pejerrey', 'Pescados/Mariscos', 87, 1),
(159, 'Pez espada', 'Pescados/Mariscos', 109, 1),
(160, 'Pulpo', 'Pescados/Mariscos', 57, 1),
(161, 'Salmon', 'Pescados/Mariscos', 172, 1),
(162, 'Salmon ahumado', 'Pescados/Mariscos', 154, 1),
(163, 'Sardina c/aceite vegetal', 'Pescados/Mariscos', 192, 1),
(164, 'Sardinas', 'Pescados/Mariscos', 151, 1),
(165, 'Trucha', 'Pescados/Mariscos', 94, 1),
(166, 'Azucar', 'Dulces', 380, 1),
(167, 'Cacao en polvo azucarado', 'Dulces', 366, 1),
(168, 'Caramelos', 'Dulces', 378, 1),
(169, 'Chocolate c/leche', 'Dulces', 550, 1),
(170, 'Chocolate s/leche', 'Dulces', 530, 1),
(171, 'Chocolate c/avellanas', 'Dulces', 549, 1),
(172, 'Dulce de membrillo', 'Dulces', 215, 1),
(173, 'Helados de agua', 'Dulces', 139, 1),
(174, 'Mermeladas c/azucar', 'Dulces', 280, 1),
(175, 'Mermelada s/azucar', 'Dulces', 145, 1),
(176, 'Miel', 'Dulces', 300, 1),
(177, 'Arroz blanco', 'Cereales y derivados', 354, 1),
(178, 'Arroz integral', 'Cereales y derivados', 350, 1),
(179, 'Avena', 'Cereales y derivados', 367, 1),
(180, 'Cebada', 'Cereales y derivados', 373, 1),
(181, 'Centeno', 'Cereales y derivados', 350, 1),
(182, 'Cereales c/chocolate', 'Cereales y derivados', 358, 1),
(183, 'Cereales c/miel', 'Cereales y derivados', 386, 1),
(184, 'Copos de maiz', 'Cereales y derivados', 350, 1),
(185, 'Harina trigo integral', 'Cereales y derivados', 340, 1),
(186, 'Harina trigo refinada', 'Cereales y derivados', 353, 1),
(187, 'Pan de centeno', 'Cereales y derivados', 241, 1),
(188, 'Pan de trigo blanco', 'Cereales y derivados', 255, 1),
(189, 'Pan de trigo integral', 'Cereales y derivados', 239, 1),
(190, 'Pan de trigo molde blanco', 'Cereales y derivados', 233, 1),
(191, 'Pan de trigo molde integral', 'Cereales y derivados', 216, 1),
(192, 'Pasta al huevo', 'Cereales y derivados', 368, 1),
(193, 'Pasta de semola', 'Cereales y derivados', 361, 1),
(194, 'Polenta', 'Cereales y derivados', 358, 1),
(195, 'Semola de trigo', 'Cereales y derivados', 368, 1),
(196, 'Yuca', 'Cereales y derivados', 338, 1),
(197, 'Garbanzos', 'Legumbres', 361, 1),
(198, 'Judias', 'Legumbres', 343, 1),
(199, 'Lentejas', 'Legumbres', 336, 1),
(200, 'Clara de huevo', 'Huevos', 48, 1),
(201, 'Huevo duro', 'Huevos', 147, 1),
(202, 'Huevo entero', 'Huevos', 162, 1),
(203, 'Yema de huevo', 'Huevos', 368, 1),
(204, 'Bizcocho', 'Pasteleria', 456, 1),
(205, 'Croissant chocolate', 'Pasteleria', 469, 1),
(206, 'Croissant, donut', 'Pasteleria', 456, 1),
(207, 'Galletas de chocolate', 'Pasteleria', 524, 1),
(208, 'Galletas de mantequilla', 'Pasteleria', 397, 1),
(209, 'Galletas saladas', 'Pasteleria', 464, 1),
(210, 'Magdalenas', 'Pasteleria', 469, 1),
(211, 'Pasta de hojaldre cocida', 'Pasteleria', 565, 1),
(212, 'Pastel de manzana', 'Pasteleria', 311, 1),
(213, 'Pastel manzana c/masa hojaldre', 'Pasteleria', 456, 1),
(214, 'Pastel de queso', 'Pasteleria', 414, 1),
(215, 'Batido lacteo de cacao', 'Bebidas', 100, 1),
(216, 'Cacao s/azucar en taza', 'Bebidas', 439, 1),
(217, 'Cafe', 'Bebidas', 1, 1),
(218, 'Cerveza negra', 'Bebidas', 37, 1),
(219, 'Cerveza rubia', 'Bebidas', 45, 1),
(220, 'Champaña dulce', 'Bebidas', 118, 1),
(221, 'Champaña seca', 'Bebidas', 85, 1),
(222, 'Coñac, brandy', 'Bebidas', 243, 1),
(223, 'Daiquiri', 'Bebidas', 122, 1),
(224, 'Gin y tonica', 'Bebidas', 76, 1),
(225, 'Ginebra', 'Bebidas', 244, 1),
(226, 'Leche de almendras', 'Bebidas', 335, 1),
(227, 'Licor de caña', 'Bebidas', 273, 1),
(228, 'Piña colada', 'Bebidas', 194, 1),
(229, 'Pisco', 'Bebidas', 210, 1),
(230, 'Refrescos carbonatados', 'Bebidas', 48, 1),
(231, 'Ron', 'Bebidas', 244, 1),
(232, 'Sidra dulce', 'Bebidas', 33, 1),
(233, 'Sidra seca', 'Bebidas', 35, 1),
(234, 'Te', 'Bebidas', 1, 1),
(235, 'Vermouth amargo', 'Bebidas', 112, 1),
(236, 'Vermouth dulce', 'Bebidas', 160, 1),
(237, 'Vino de mesa', 'Bebidas', 70, 1),
(238, 'Vino dulce, jerez', 'Bebidas', 160, 1),
(239, 'Vino oporto', 'Bebidas', 160, 1),
(240, 'Vodka', 'Bebidas', 315, 1),
(241, 'Whisky', 'Bebidas', 244, 1),
(242, 'Aceite de girasol', 'Aceites y grasas', 900, 1),
(243, 'Aceite de oliva', 'Aceites y grasas', 900, 1),
(244, 'Manteca', 'Aceites y grasas', 670, 1),
(245, 'Mantequilla', 'Aceites y grasas', 752, 1),
(246, 'Margarina vegetal', 'Aceites y grasas', 752, 1),
(247, 'Bechamel', 'Salsas y condimentos', 115, 1),
(248, 'Caldos concentrados', 'Salsas y condimentos', 259, 1),
(249, 'Ketchup', 'Salsas y condimentos', 98, 1),
(250, 'Mayonesa', 'Salsas y condimentos', 718, 1),
(251, 'Mayonesa ligth', 'Salsas y condimentos', 374, 1),
(252, 'Mostaza', 'Salsas y condimentos', 15, 1),
(253, 'Salsa de soja', 'Salsas y condimentos', 61, 1),
(254, 'Salsa de tomate en conserva', 'Salsas y condimentos', 86, 1),
(255, 'Sofrito', 'Salsas y condimentos', 116, 1),
(256, 'Vinagres', 'Salsas y condimentos', 8, 1),
(257, 'pan de mesa', 'Cereales y derivados', 169, 1),
(258, 'harina de mais', 'Cereales y derivados', 180, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `idPaciente` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `dni` int(11) NOT NULL,
  `domicilio` varchar(60) NOT NULL,
  `telefono` varchar(12) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`idPaciente`, `nombre`, `dni`, `domicilio`, `telefono`, `estado`) VALUES
(1, 'Jorge', 30518478, 'Lujan 258', '1596532658', 0),
(2, 'Franco', 35897458, 'Tres Arroyos 458', '1548795823', 1),
(5, 'Pablo', 31658996, 'Las Delicias 987', '1548721563', 1),
(6, 'Carlos', 41548775, 'Piñol 552', '1587415599', 1),
(7, 'Jose', 29548865, 'Manzanares 143', '1542111656', 1),
(8, 'Carlos Corvalan', 30917965, 'Formosa 627', '3855756288', 1),
(9, 'Maria DB', 192001, 'Netbeans 72', '58586262', 1),
(10, 'Fernanda Almagro', 35741963, 'Milburg 157', '452585896', 1),
(11, 'Julia Lopez', 15963741, 'Buenos Aires 354', '65478965', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prepararcomida`
--

CREATE TABLE `prepararcomida` (
  `idPrepararComida` int(11) NOT NULL,
  `idComida` int(11) NOT NULL,
  `idIngredientes` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `prepararcomida`
--

INSERT INTO `prepararcomida` (`idPrepararComida`, `idComida`, `idIngredientes`) VALUES
(1, 1, 175),
(2, 1, 191),
(3, 1, 234),
(4, 2, 176),
(5, 2, 185),
(6, 2, 217),
(7, 3, 88),
(8, 3, 201),
(9, 3, 190),
(10, 3, 217),
(11, 4, 69),
(12, 4, 70),
(13, 4, 82),
(14, 4, 174),
(15, 4, 188),
(16, 4, 217),
(17, 5, 204),
(18, 5, 210),
(19, 5, 216),
(20, 6, 208),
(21, 6, 215),
(22, 7, 204),
(23, 7, 175),
(24, 7, 187),
(25, 7, 79),
(26, 7, 217),
(27, 8, 174),
(28, 8, 191),
(29, 8, 210),
(30, 8, 212),
(31, 8, 206),
(32, 8, 82),
(33, 8, 217),
(34, 9, 101),
(35, 9, 121),
(36, 9, 244),
(37, 9, 202),
(38, 9, 187),
(39, 9, 72),
(40, 9, 69),
(41, 9, 83),
(42, 9, 217),
(43, 10, 46),
(44, 10, 47),
(45, 10, 57),
(46, 10, 172),
(47, 10, 191),
(48, 10, 201),
(49, 10, 213),
(50, 10, 234),
(51, 11, 101),
(52, 11, 120),
(53, 11, 170),
(54, 11, 190),
(55, 11, 200),
(56, 11, 206),
(57, 11, 244),
(58, 11, 217),
(59, 12, 244),
(60, 12, 190),
(61, 12, 82),
(62, 12, 234),
(63, 13, 68),
(64, 13, 67),
(65, 13, 42),
(66, 13, 35),
(67, 13, 183),
(68, 13, 99),
(69, 14, 202),
(70, 14, 184),
(71, 14, 100),
(72, 15, 51),
(73, 16, 59),
(74, 17, 184),
(75, 17, 97),
(76, 18, 182),
(77, 18, 76),
(78, 19, 90),
(79, 19, 243),
(80, 19, 33),
(81, 19, 32),
(82, 19, 27),
(83, 19, 23),
(84, 19, 16),
(85, 19, 7),
(86, 20, 189),
(87, 20, 256),
(88, 20, 253),
(89, 20, 243),
(90, 20, 19),
(91, 20, 16),
(92, 20, 10),
(93, 20, 9),
(94, 20, 6),
(95, 20, 1),
(96, 21, 246),
(97, 21, 197),
(98, 21, 93),
(99, 21, 92),
(100, 21, 8),
(101, 21, 13),
(102, 21, 14),
(103, 21, 30),
(104, 21, 29),
(105, 21, 18),
(106, 22, 188),
(107, 22, 250),
(108, 22, 256),
(109, 22, 134),
(110, 22, 12),
(111, 22, 20),
(112, 22, 32),
(113, 23, 237),
(114, 23, 250),
(115, 23, 201),
(116, 23, 24),
(117, 23, 22),
(118, 23, 107),
(119, 24, 33),
(120, 24, 92),
(121, 24, 202),
(122, 24, 126),
(123, 25, 239),
(124, 25, 21),
(125, 25, 5),
(126, 25, 1),
(127, 25, 123),
(128, 26, 4),
(129, 26, 29),
(130, 26, 30),
(131, 26, 25),
(132, 26, 12),
(133, 26, 142),
(134, 27, 237),
(135, 27, 242),
(136, 27, 33),
(137, 27, 24),
(138, 27, 22),
(139, 27, 135),
(140, 28, 87),
(141, 28, 101),
(142, 28, 201),
(143, 28, 242),
(144, 28, 22),
(145, 28, 117),
(146, 29, 230),
(147, 29, 245),
(148, 29, 188),
(149, 29, 86),
(150, 29, 120),
(151, 29, 121),
(152, 29, 124),
(153, 30, 171),
(154, 30, 230),
(155, 30, 186),
(156, 30, 89),
(157, 30, 11),
(158, 30, 2),
(159, 30, 22),
(160, 30, 134),
(161, 30, 109),
(162, 31, 238),
(163, 31, 7),
(164, 31, 12),
(165, 31, 25),
(166, 31, 18),
(167, 31, 157),
(168, 31, 149),
(169, 31, 143),
(170, 31, 138),
(171, 32, 220),
(172, 32, 23),
(173, 32, 24),
(174, 32, 27),
(175, 32, 26),
(176, 32, 94),
(177, 32, 150),
(178, 32, 161),
(179, 32, 160),
(180, 33, 188),
(181, 33, 235),
(182, 33, 6),
(183, 33, 4),
(184, 33, 3),
(185, 33, 17),
(186, 33, 164),
(187, 33, 165),
(188, 33, 162),
(189, 33, 158),
(190, 34, 230),
(191, 34, 185),
(192, 34, 254),
(193, 34, 177),
(194, 34, 130),
(195, 35, 185),
(196, 35, 242),
(197, 35, 4),
(198, 35, 25),
(199, 35, 12),
(200, 35, 137),
(201, 36, 251),
(202, 36, 242),
(203, 36, 186),
(204, 36, 12),
(205, 36, 4),
(206, 36, 91),
(207, 36, 122),
(208, 37, 247),
(209, 37, 238),
(210, 37, 12),
(211, 37, 16),
(212, 37, 18),
(213, 37, 19),
(214, 37, 54),
(215, 37, 125),
(216, 38, 232),
(217, 38, 15),
(218, 38, 10),
(219, 38, 6),
(220, 38, 192),
(221, 38, 148),
(222, 38, 149),
(223, 38, 147),
(224, 38, 157),
(225, 38, 155),
(226, 39, 219),
(227, 39, 28),
(228, 39, 27),
(229, 39, 17),
(230, 39, 18),
(231, 39, 19),
(232, 39, 21),
(233, 39, 95),
(234, 39, 256),
(235, 39, 255),
(236, 39, 253),
(237, 39, 127),
(238, 40, 100),
(239, 40, 56),
(240, 40, 45),
(241, 41, 179),
(242, 41, 43),
(243, 41, 97),
(244, 42, 189),
(245, 42, 90),
(246, 43, 245),
(247, 43, 215),
(248, 43, 217),
(249, 43, 214),
(250, 43, 212),
(251, 43, 205),
(252, 43, 188),
(253, 43, 186),
(254, 43, 202),
(255, 43, 174),
(256, 43, 41),
(257, 43, 43),
(258, 43, 47),
(259, 43, 86),
(260, 43, 100),
(261, 44, 244),
(262, 44, 234),
(263, 44, 217),
(264, 44, 201),
(265, 44, 191),
(266, 44, 189),
(267, 44, 171),
(268, 44, 121),
(269, 44, 120),
(270, 44, 101),
(271, 44, 88),
(272, 44, 85),
(273, 44, 76),
(274, 44, 68),
(275, 44, 42),
(276, 44, 46),
(277, 44, 57),
(278, 45, 234),
(279, 45, 191),
(280, 45, 200),
(281, 45, 70),
(282, 45, 53),
(283, 45, 52),
(284, 45, 38),
(285, 45, 30),
(286, 46, 217),
(287, 46, 213),
(288, 46, 201),
(289, 46, 200),
(290, 46, 189),
(291, 46, 176),
(292, 46, 167),
(293, 46, 120),
(294, 46, 91),
(295, 46, 82),
(296, 46, 67),
(297, 46, 70),
(298, 47, 255),
(299, 47, 129),
(300, 47, 189),
(301, 47, 178),
(302, 48, 191),
(303, 48, 192),
(304, 48, 130),
(305, 48, 20),
(306, 48, 22),
(307, 48, 24),
(308, 48, 25),
(309, 48, 13),
(310, 49, 136),
(311, 49, 109),
(312, 49, 250),
(313, 49, 237),
(314, 49, 28),
(315, 49, 25),
(316, 49, 24),
(317, 49, 20),
(318, 49, 22),
(319, 49, 191),
(320, 49, 135),
(321, 50, 239),
(322, 50, 22),
(323, 50, 24),
(324, 50, 188),
(325, 50, 136),
(326, 50, 134),
(327, 50, 114),
(328, 50, 126),
(329, 51, 191),
(330, 51, 248),
(331, 51, 254),
(332, 51, 193),
(333, 51, 134),
(334, 51, 25),
(335, 51, 4),
(336, 51, 11),
(337, 51, 22),
(338, 52, 256),
(339, 52, 24),
(340, 52, 4),
(341, 52, 192),
(342, 53, 242),
(343, 53, 91),
(344, 53, 202),
(345, 53, 24),
(346, 53, 4),
(347, 53, 22),
(348, 54, 254),
(349, 54, 242),
(350, 54, 186),
(351, 54, 86),
(352, 55, 190),
(353, 55, 230),
(354, 55, 22),
(355, 55, 32),
(356, 55, 20),
(357, 55, 12),
(358, 55, 87),
(359, 55, 101),
(360, 55, 120),
(361, 55, 117),
(362, 56, 99),
(363, 56, 47),
(364, 56, 53),
(365, 56, 35),
(366, 57, 201),
(367, 58, 96),
(368, 59, 100),
(369, 60, 51),
(370, 61, 59),
(371, 62, 52),
(372, 63, 68),
(373, 64, 173),
(374, 65, 214),
(375, 66, 212),
(376, 67, 208),
(377, 68, 79),
(378, 68, 202);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visita`
--

CREATE TABLE `visita` (
  `idVisita` int(11) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `idDieta` int(11) NOT NULL,
  `pesoVisita` double NOT NULL,
  `fechaVisita` date NOT NULL,
  `objetivo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `visita`
--

INSERT INTO `visita` (`idVisita`, `idPaciente`, `idDieta`, `pesoVisita`, `fechaVisita`, `objetivo`) VALUES
(1, 2, 2, 60, '2023-12-02', 1),
(2, 5, 1, 79, '2023-09-02', 1),
(3, 6, 6, 68, '2023-12-15', 0),
(4, 8, 10, 86, '2024-01-02', 1),
(5, 9, 11, 70, '2023-10-05', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comida`
--
ALTER TABLE `comida`
  ADD PRIMARY KEY (`idComida`);

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`idDieta`),
  ADD KEY `idPaciente` (`idPaciente`);

--
-- Indices de la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  ADD PRIMARY KEY (`idDietCom`),
  ADD KEY `idComida` (`idComida`),
  ADD KEY `idDieta` (`idDieta`);

--
-- Indices de la tabla `ingredientes`
--
ALTER TABLE `ingredientes`
  ADD PRIMARY KEY (`idIngredientes`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`idPaciente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `prepararcomida`
--
ALTER TABLE `prepararcomida`
  ADD PRIMARY KEY (`idPrepararComida`),
  ADD KEY `idComida` (`idComida`),
  ADD KEY `idIngredientes` (`idIngredientes`);

--
-- Indices de la tabla `visita`
--
ALTER TABLE `visita`
  ADD PRIMARY KEY (`idVisita`),
  ADD KEY `idPaciente` (`idPaciente`),
  ADD KEY `idDieta` (`idDieta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comida`
--
ALTER TABLE `comida`
  MODIFY `idComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=69;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `idDieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  MODIFY `idDietCom` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=137;

--
-- AUTO_INCREMENT de la tabla `ingredientes`
--
ALTER TABLE `ingredientes`
  MODIFY `idIngredientes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=259;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `idPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `prepararcomida`
--
ALTER TABLE `prepararcomida`
  MODIFY `idPrepararComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=379;

--
-- AUTO_INCREMENT de la tabla `visita`
--
ALTER TABLE `visita`
  MODIFY `idVisita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`);

--
-- Filtros para la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  ADD CONSTRAINT `dietacomida_ibfk_2` FOREIGN KEY (`idDieta`) REFERENCES `dieta` (`idDieta`);

--
-- Filtros para la tabla `visita`
--
ALTER TABLE `visita`
  ADD CONSTRAINT `visita_ibfk_1` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`),
  ADD CONSTRAINT `visita_ibfk_2` FOREIGN KEY (`idDieta`) REFERENCES `dieta` (`idDieta`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
