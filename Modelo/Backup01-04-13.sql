--
-- PostgreSQL database dump
--

-- Dumped from database version 9.0.12
-- Dumped by pg_dump version 9.0.12
-- Started on 2013-04-01 09:20:41

SET statement_timeout = 0;
SET client_encoding = 'WIN1252';
SET standard_conforming_strings = off;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET escape_string_warning = off;

SET search_path = public, pg_catalog;

--
-- TOC entry 1893 (class 0 OID 0)
-- Dependencies: 150
-- Name: basic_data_idbasic_seq; Type: SEQUENCE SET; Schema: public; Owner: ascensor_admin
--

SELECT pg_catalog.setval('basic_data_idbasic_seq', 1, false);


--
-- TOC entry 1894 (class 0 OID 0)
-- Dependencies: 154
-- Name: budget_id_budget_seq; Type: SEQUENCE SET; Schema: public; Owner: ascensor_admin
--

SELECT pg_catalog.setval('budget_id_budget_seq', 1, false);


--
-- TOC entry 1895 (class 0 OID 0)
-- Dependencies: 155
-- Name: budget_number_seq; Type: SEQUENCE SET; Schema: public; Owner: ascensor_admin
--

SELECT pg_catalog.setval('budget_number_seq', 1, false);


--
-- TOC entry 1896 (class 0 OID 0)
-- Dependencies: 152
-- Name: business_partner_id_business_partner_seq; Type: SEQUENCE SET; Schema: public; Owner: ascensor_admin
--

SELECT pg_catalog.setval('business_partner_id_business_partner_seq', 1, false);


--
-- TOC entry 1897 (class 0 OID 0)
-- Dependencies: 144
-- Name: security_group_id_security_group_seq; Type: SEQUENCE SET; Schema: public; Owner: ascensor_admin
--

SELECT pg_catalog.setval('security_group_id_security_group_seq', 1, false);


--
-- TOC entry 1898 (class 0 OID 0)
-- Dependencies: 142
-- Name: security_role_id_security_role_seq; Type: SEQUENCE SET; Schema: public; Owner: ascensor_admin
--

SELECT pg_catalog.setval('security_role_id_security_role_seq', 1, false);


--
-- TOC entry 1899 (class 0 OID 0)
-- Dependencies: 147
-- Name: security_user_id_security_user_seq; Type: SEQUENCE SET; Schema: public; Owner: ascensor_admin
--

SELECT pg_catalog.setval('security_user_id_security_user_seq', 6, true);


--
-- TOC entry 1888 (class 0 OID 17485)
-- Dependencies: 151
-- Data for Name: basic_data; Type: TABLE DATA; Schema: public; Owner: ascensor_admin
--

INSERT INTO basic_data VALUES (1, 'BUDGET', 'RESIDENCIAL', 'BUILDING TYPE', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (2, 'BUDGET', 'COMERCIAL', 'BUILDING TYPE', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (3, 'BUDGET', 'EMPRESARIAL', 'BUILDING TYPE', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (4, 'BUDGET', 'HOSPITAL', 'BUILDING TYPE', false, 4, 'A', NULL);
INSERT INTO basic_data VALUES (5, 'BUDGET', 'HOTEL', 'BUILDING TYPE', false, 5, 'A', NULL);
INSERT INTO basic_data VALUES (6, 'BUDGET', 'INDUSTRIAL', 'BUILDING TYPE', false, 6, 'A', NULL);
INSERT INTO basic_data VALUES (7, 'BUDGET', 'PASAJERO', 'ELEVATOR TYPE', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (8, 'BUDGET', 'MONTA CAMILLA', 'ELEVATOR TYPE', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (9, 'BUDGET', 'PANORAMICO', 'ELEVATOR TYPE', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (10, 'BUDGET', 'CARGA', 'ELEVATOR TYPE', false, 4, 'A', NULL);
INSERT INTO basic_data VALUES (11, 'BUDGET', 'MONTA CARRO', 'ELEVATOR TYPE', false, 5, 'A', NULL);
INSERT INTO basic_data VALUES (12, 'BUDGET', 'MONTA PLATO', 'ELEVATOR TYPE', false, 6, 'A', NULL);
INSERT INTO basic_data VALUES (13, 'BUDGET', 'WINCHE', 'ELEVATOR TYPE', false, 7, 'A', NULL);
INSERT INTO basic_data VALUES (14, 'BUDGET', '320 - 4', 'ELEVATOR CAPACITANCE', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (15, 'BUDGET', '450 - 6', 'ELEVATOR CAPACITANCE', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (16, 'BUDGET', '600 - 8', 'ELEVATOR CAPACITANCE', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (17, 'BUDGET', '800 - 10', 'ELEVATOR CAPACITANCE', false, 4, 'A', NULL);
INSERT INTO basic_data VALUES (18, 'BUDGET', '1050 - 13', 'ELEVATOR CAPACITANCE', false, 5, 'A', NULL);
INSERT INTO basic_data VALUES (19, 'BUDGET', '1200 - 16', 'ELEVATOR CAPACITANCE', false, 6, 'A', NULL);
INSERT INTO basic_data VALUES (20, 'BUDGET', '1500 - 20', 'ELEVATOR CAPACITANCE', false, 7, 'A', NULL);
INSERT INTO basic_data VALUES (21, 'BUDGET', '2000 - 26', 'ELEVATOR CAPACITANCE', false, 8, 'A', NULL);
INSERT INTO basic_data VALUES (22, 'BUDGET', 'CON SALA DE MAQUINA 2V', 'MACHINE TYPE', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (23, 'BUDGET', 'CON SALA DE MAQUINA VVVF', 'MACHINE TYPE', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (24, 'BUDGET', 'SIN SALA DE MAQUINA MRL', 'MACHINE TYPE', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (25, 'BUDGET', 'HIDRAULICO', 'MACHINE TYPE', false, 4, 'A', NULL);
INSERT INTO basic_data VALUES (26, 'BUDGET', 'WINCHE', 'MACHINE TYPE', false, 5, 'A', NULL);
INSERT INTO basic_data VALUES (27, 'BUDGET', '1 PUERTA', 'BUILDING EMBARQUE', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (28, 'BUDGET', '2 PUERTAS (DOBLE ACCESO - 180)', 'BUILDING EMBARQUE', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (29, 'BUDGET', '2 PUERTAS (DOBLE ACCESO - 90)', 'BUILDING EMBARQUE', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (30, 'BUDGET', '2 PUERTAS (DOBLE ACCESO - 270)', 'BUILDING EMBARQUE', false, 4, 'A', NULL);
INSERT INTO basic_data VALUES (31, 'BUDGET', '208V', 'ELECTRICITY TYPE', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (32, 'BUDGET', '220V', 'ELECTRICITY TYPE', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (33, 'BUDGET', '380V', 'ELECTRICITY TYPE', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (34, 'BUDGET', '440V', 'ELECTRICITY TYPE', false, 4, 'A', NULL);
INSERT INTO basic_data VALUES (35, 'BUDGET', '0.5', 'SPEED', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (36, 'BUDGET', '1', 'SPEED', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (37, 'BUDGET', '1.2', 'SPEED', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (38, 'BUDGET', '1.6', 'SPEED', false, 5, 'A', NULL);
INSERT INTO basic_data VALUES (39, 'BUDGET', '1.75', 'SPEED', false, 6, 'A', NULL);
INSERT INTO basic_data VALUES (40, 'BUDGET', '2', 'SPEED', false, 7, 'A', NULL);
INSERT INTO basic_data VALUES (41, 'BUDGET', '2.5', 'SPEED', false, 8, 'A', NULL);
INSERT INTO basic_data VALUES (42, 'BUDGET', '60 HZ', 'FREQUENCY', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (43, 'BUDGET', '50 HZ', 'FREQUENCY', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (44, 'BUDGET', '110V', 'VOLTAGE LIGHTING', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (45, 'BUDGET', '220V', 'VOLTAGE LIGHTING', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (46, 'BUDGET', '180 HORAS (STANDARD)', 'HOUR MACHINE', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (47, 'BUDGET', '240 HORAS (ALTO TRAFICO)', 'HOUR MACHINE', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (48, 'BUDGET', 'COLECTIVA EN DESC SIMPLEX (UN BOTON)', 'MANEUVER TYPE', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (49, 'BUDGET', 'COLECTIVA EN DESC DUPLEX (UN BOTON)', 'MANEUVER TYPE', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (50, 'BUDGET', 'COLECTIVA EN DESC TRIPLEX (UN BOTON)', 'MANEUVER TYPE', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (51, 'BUDGET', 'COLECTIVA EN DESC CUADRUPLEX (UN BOTON)', 'MANEUVER TYPE', false, 4, 'A', NULL);
INSERT INTO basic_data VALUES (52, 'BUDGET', 'COLECTIVO EN ASC Y DESC SIMPLEX (DOS BOTONES)', 'MANEUVER TYPE', false, 9, 'A', NULL);
INSERT INTO basic_data VALUES (53, 'BUDGET', 'COLECTIVO EN ASC Y DESC DUPLEX (DOS BOTONES)', 'MANEUVER TYPE', false, 10, 'A', NULL);
INSERT INTO basic_data VALUES (54, 'BUDGET', 'COLECTIVO EN ASC Y DESC TRIPLEX (DOS BOTONES)', 'MANEUVER TYPE', false, 11, 'A', NULL);
INSERT INTO basic_data VALUES (55, 'BUDGET', 'COLECTIVO EN ASC Y DESC CUADRUPLEX (DOS BOTONES)', 'MANEUVER TYPE', false, 12, 'A', NULL);
INSERT INTO basic_data VALUES (56, 'BUDGET', 'DISENO 1357', 'CABIN MODEL', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (57, 'BUDGET', 'DISENO P26', 'CABIN MODEL', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (58, 'BUDGET', 'FORMICA - VERTICAL', 'DESIGN', false, 1, 'A', 57);
INSERT INTO basic_data VALUES (59, 'BUDGET', 'ACERO INOX. 304-4 - VERTICAL', 'DESIGN', false, 2, 'A', 57);
INSERT INTO basic_data VALUES (60, 'BUDGET', 'ACERO INOX. 630 - VERTICAL', 'DESIGN', false, 3, 'A', 57);
INSERT INTO basic_data VALUES (61, 'BUDGET', 'ACERO INOX. ESPEJO - VERTICAL', 'DESIGN', false, 4, 'A', 57);
INSERT INTO basic_data VALUES (62, 'BUDGET', 'PL-3', 'ROOF TYPE', false, 1, 'A', 14);
INSERT INTO basic_data VALUES (63, 'BUDGET', 'PL-3', 'ROOF TYPE', false, 1, 'A', 15);
INSERT INTO basic_data VALUES (64, 'BUDGET', 'PL-4', 'ROOF TYPE', false, 2, 'A', 15);
INSERT INTO basic_data VALUES (65, 'BUDGET', 'PL-PERFORADO', 'ROOF TYPE', false, 3, 'A', 15);
INSERT INTO basic_data VALUES (66, 'BUDGET', 'PL-MODULAR', 'ROOF TYPE', false, 4, 'A', 15);
INSERT INTO basic_data VALUES (67, 'BUDGET', 'CORTA', 'BUTTON TYPE', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (68, 'BUDGET', 'PISO A TECHO', 'BUTTON TYPE', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (69, 'BUDGET', 'PISO A TECHO CON TELEFONO', 'BUTTON TYPE', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (70, 'BUDGET', 'RECTO', 'RAILING', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (71, 'BUDGET', 'REDONDO', 'RAILING', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (72, 'BUDGET', 'DOBLE PASAMANO REDONDO', 'RAILING', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (73, 'BUDGET', 'VINIL', 'FLOOR TYPE', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (74, 'BUDGET', 'VULCA', 'FLOOR TYPE', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (75, 'BUDGET', 'GRANITO POR CUENTA DEL CLIENTE', 'FLOOR TYPE', false, 4, 'A', NULL);
INSERT INTO basic_data VALUES (76, 'BUDGET', 'OTROS', 'FLOOR TYPE', false, 5, 'A', NULL);
INSERT INTO basic_data VALUES (77, 'BUDGET', '1 - 450 KG', 'FAN 1', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (78, 'BUDGET', '1 - 600 KG', 'FAN 1', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (79, 'BUDGET', '2 - 800 KG', 'FAN 2', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (80, 'BUDGET', '2 - 1000 KG', 'FAN 2', false, 4, 'A', NULL);
INSERT INTO basic_data VALUES (81, 'BUDGET', '2 - 1200 KG', 'FAN 2', false, 5, 'A', NULL);
INSERT INTO basic_data VALUES (82, 'BUDGET', '2 - 1500 KG', 'FAN 2', false, 6, 'A', NULL);
INSERT INTO basic_data VALUES (83, 'BUDGET', 'APERTURA TELESCOPICA IZQUIERDA', 'DOOR TYPE', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (84, 'BUDGET', 'APERTURA TELESCOPICA DERECHA', 'DOOR TYPE', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (85, 'BUDGET', 'APERTURA TELESCOPICA CENTRAL', 'DOOR TYPE', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (86, 'BUDGET', 'APERTURA CENTRAL', 'DOOR TYPE', false, 4, 'A', NULL);
INSERT INTO basic_data VALUES (87, 'BUDGET', 'BATIENTE IZQUIERDA', 'DOOR TYPE', false, 5, 'A', NULL);
INSERT INTO basic_data VALUES (88, 'BUDGET', 'FERMATOR', 'DOOR SYSTEM', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (89, 'BUDGET', 'SELCOM', 'DOOR SYSTEM', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (90, 'BUDGET', 'RECTO - 50X100', 'DOOR FRAME TYPE', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (91, 'BUDGET', 'RECTO - 30X150', 'DOOR FRAME TYPE', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (92, 'BUDGET', 'ABIERTO', 'DOOR FRAME TYPE', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (93, 'BUDGET', 'OCULTO', 'DOOR FRAME TYPE', false, 4, 'A', NULL);
INSERT INTO basic_data VALUES (94, 'BUDGET', '700', 'FREE ADMISSION', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (95, 'BUDGET', '800', 'FREE ADMISSION', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (96, 'BUDGET', '900', 'FREE ADMISSION', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (97, 'BUDGET', '1000', 'FREE ADMISSION', false, 4, 'A', NULL);
INSERT INTO basic_data VALUES (98, 'BUDGET', '1100', 'FREE ADMISSION', false, 5, 'A', NULL);
INSERT INTO basic_data VALUES (99, 'BUDGET', '1200', 'FREE ADMISSION', false, 6, 'A', NULL);
INSERT INTO basic_data VALUES (100, 'BUDGET', '2000', 'HEIGHT', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (101, 'BUDGET', '2100', 'HEIGHT', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (102, 'BUDGET', 'SISTEL (ELECTRONICO INTELIGENTE CON MICROPROCESADOR Y DETECTOR DE AVERIAS)', 'CONTROL TYPE', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (103, 'BUDGET', 'CF CONTROL (ELECTRONICO INTELIGENTE CON MICROPROCESADOR Y DETECTOR DE AVERIAS)', 'CONTROL TYPE', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (104, 'BUDGET', 'RELEMATICO (CONTACTORES Y RELE DE AVERIAS)', 'CONTROL TYPE', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (105, 'BUDGET', 'SISTEL TELEFONICA', 'BOOTH BUTTON', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (106, 'BUDGET', 'BOTON ACERO PLASTICO CON NOMENCLATURA Y BRAILLE DE 37mm', 'BOOTH BUTTON', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (107, 'BUDGET', 'BOTON DE ACERO INOX. ANTI - VANDALICO DE 30 mm', 'BOOTH BUTTON', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (108, 'BUDGET', 'SISTEL MATRIZ DE PUNTO PEQUENO', 'BOOTH DISPLAY SISTEL', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (109, 'BUDGET', 'SISTEL MATRIZ DE PUNTO GRANDE', 'BOOTH DISPLAY SISTEL', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (110, 'BUDGET', 'SISTEL MATRIZ DE PUNTO HORA Y GRADO', 'BOOTH DISPLAY SISTEL', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (111, 'BUDGET', 'SISTEL LCD DE 7&#39;&#39; (CON SINTETIZADOR DE VOZ)', 'BOOTH DISPLAY SISTEL', false, 4, 'A', NULL);
INSERT INTO basic_data VALUES (112, 'BUDGET', 'SISTEL LCD AZUL', 'BOOTH DISPLAY SISTEL', false, 5, 'A', NULL);
INSERT INTO basic_data VALUES (113, 'BUDGET', 'CF CONTROL MATRIZ DE PUNTO ROJO', 'BOOTH DISPLAY CF', false, 7, 'A', NULL);
INSERT INTO basic_data VALUES (114, 'BUDGET', 'CF CONTROL MATRIZ DE PUNTO AZUL', 'BOOTH DISPLAY CF', false, 8, 'A', NULL);
INSERT INTO basic_data VALUES (115, 'BUDGET', 'CF CONTROL LCD AZUL PEQUENO', 'BOOTH DISPLAY CF', false, 9, 'A', NULL);
INSERT INTO basic_data VALUES (116, 'BUDGET', 'SISTEL MATRIZ DE PUNTO PEQUENO', 'FLOOR DISPLAY SISTEL', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (117, 'BUDGET', 'SISTEL MATRIZ DE PUNTO GRANDE', 'FLOOR DISPLAY SISTEL', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (118, 'BUDGET', 'SISTEL MATRIZ DE PUNTO HORA Y GRADO', 'FLOOR DISPLAY SISTEL', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (119, 'BUDGET', 'SISTEL LCD DE 7&#39;&#39; (CON SINTETIZADOR DE VOZ)', 'FLOOR DISPLAY SISTEL', false, 4, 'A', NULL);
INSERT INTO basic_data VALUES (120, 'BUDGET', 'SISTEL LCD AZUL', 'FLOOR DISPLAY SISTEL', false, 5, 'A', NULL);
INSERT INTO basic_data VALUES (121, 'BUDGET', 'CF CONTROL MATRIZ DE PUNTO ROJO', 'FLOOR DISPLAY CF', false, 6, 'A', NULL);
INSERT INTO basic_data VALUES (122, 'BUDGET', 'CF CONTROL MATRIZ DE PUNTO AZUL', 'FLOOR DISPLAY CF', false, 7, 'A', NULL);
INSERT INTO basic_data VALUES (123, 'BUDGET', 'CF CONTROL LCD AZUL PEQUENO', 'FLOOR DISPLAY CF', false, 8, 'A', NULL);
INSERT INTO basic_data VALUES (124, 'BUDGET', 'ACERO TIPO ESPEJO', 'MIRROR', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (125, 'BUDGET', 'POR CUENTA DEL CLIENTE', 'MIRROR', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (126, 'BUDGET', 'COLECTIVA EN ASC SIMPLEX (UN BOTON)', 'MANEUVER TYPE', false, 5, 'A', NULL);
INSERT INTO basic_data VALUES (127, 'BUDGET', 'COLECTIVA EN ASC DUPLEX (UN BOTON)', 'MANEUVER TYPE', false, 6, 'A', NULL);
INSERT INTO basic_data VALUES (128, 'BUDGET', 'COLECTIVA EN ASC TRIPLEX (UN BOTON)', 'MANEUVER TYPE', false, 7, 'A', NULL);
INSERT INTO basic_data VALUES (129, 'BUDGET', 'COLECTIVA EN ASC CUADRUPLEX (UN BOTON)', 'MANEUVER TYPE', false, 8, 'A', NULL);
INSERT INTO basic_data VALUES (130, 'BUDGET', 'BATIENTE DERECHA', 'DOOR TYPE', false, 6, 'A', NULL);
INSERT INTO basic_data VALUES (131, 'BUDGET', 'GUILLOTINA', 'DOOR TYPE', false, 7, 'A', NULL);
INSERT INTO basic_data VALUES (132, 'BUDGET', 'SANTA MARIA', 'DOOR TYPE', false, 8, 'A', NULL);
INSERT INTO basic_data VALUES (133, 'BUDGET', 'SISTEL TFT DE 10&#39;&#39;', 'BOOTH DISPLAY SISTEL', false, 6, 'A', NULL);
INSERT INTO basic_data VALUES (134, 'BUDGET', 'CF CONTROL LCD AZUL GRANDE', 'BOOTH DISPLAY CF', false, 10, 'A', NULL);
INSERT INTO basic_data VALUES (135, 'BUDGET', 'SISTEL TFT DE 10&#39;&#39;', 'FLOOR DISPLAY SISTEL', false, 6, 'A', NULL);
INSERT INTO basic_data VALUES (136, 'BUDGET', 'CF CONTROL LCD AZUL GRANDE', 'FLOOR DISPLAY CF', false, 10, 'A', NULL);
INSERT INTO basic_data VALUES (137, 'BUDGET', 'FORMICA', 'DESIGN', false, 1, 'A', 56);
INSERT INTO basic_data VALUES (138, 'BUDGET', 'ACERO INOXIDABLE 304-4', 'DESIGN', false, 2, 'A', 56);
INSERT INTO basic_data VALUES (139, 'BUDGET', 'GRIS', 'DOOR FRAME HAMMERED', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (140, 'BUDGET', 'MARRON', 'DOOR FRAME HAMMERED', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (141, 'BUDGET', 'ESPECIAL', 'DOOR FRAME TYPE', false, 5, 'A', NULL);
INSERT INTO basic_data VALUES (142, 'BUDGET', 'PLANA', 'HALL BUTTON TYPE', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (143, 'BUDGET', 'CON DOBLÉ RECTO', 'HALL BUTTON TYPE', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (144, 'BUDGET', 'BOTON ACERO PLASTICO CON NOMENCLATURA Y BRAILLE DE 37 mm', 'HALL BUTTON', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (145, 'BUDGET', 'BOTON DE ACERO INOX. ANTI - VANDALICO DE 30 mm', 'HALL BUTTON', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (146, 'BUDGET', '1.5', 'SPEED', false, 4, 'A', NULL);
INSERT INTO basic_data VALUES (147, 'BUDGET', 'DISENO P26 H', 'CABIN MODEL', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (148, 'BUDGET', 'FORMICA HORIZONTAL CON ESQUINERO EN ACERO INOX.', 'DESIGN', false, 1, 'A', 147);
INSERT INTO basic_data VALUES (149, 'BUDGET', 'ACERO INOX. 304-4 HORIZONTAL CON ESQUINERO EN ACERO INOX.', 'DESIGN', false, 2, 'A', 147);
INSERT INTO basic_data VALUES (150, 'BUDGET', 'ACRILICO CON PERFIL DE ALUMINIO', 'ROOF TYPE', false, 5, 'A', 15);
INSERT INTO basic_data VALUES (151, 'BUDGET', 'PL-4', 'ROOF TYPE', false, 1, 'A', 16);
INSERT INTO basic_data VALUES (152, 'BUDGET', 'PL-PERFORADO', 'ROOF TYPE', false, 2, 'A', 16);
INSERT INTO basic_data VALUES (153, 'BUDGET', 'PL-MODULAR', 'ROOF TYPE', false, 3, 'A', 16);
INSERT INTO basic_data VALUES (154, 'BUDGET', 'PL-4', 'ROOF TYPE', false, 1, 'A', 17);
INSERT INTO basic_data VALUES (155, 'BUDGET', 'PL-6', 'ROOF TYPE', false, 2, 'A', 17);
INSERT INTO basic_data VALUES (156, 'BUDGET', 'PL-MODULAR', 'ROOF TYPE', false, 3, 'A', 17);
INSERT INTO basic_data VALUES (157, 'BUDGET', 'PL-6', 'ROOF TYPE', false, 1, 'A', 18);
INSERT INTO basic_data VALUES (158, 'BUDGET', 'PL-PERFORADO', 'ROOF TYPE', false, 2, 'A', 18);
INSERT INTO basic_data VALUES (159, 'BUDGET', 'PL-MODULAR', 'ROOF TYPE', false, 3, 'A', 18);
INSERT INTO basic_data VALUES (160, 'BUDGET', 'PLAFON DE ACRILICO CON MARCO DE ALUMINIO', 'ROOF TYPE', false, 4, 'A', 18);
INSERT INTO basic_data VALUES (161, 'BUDGET', 'PL-6', 'ROOF TYPE', false, 1, 'A', 19);
INSERT INTO basic_data VALUES (162, 'BUDGET', 'PLAFON DE ACRILICO CON MARCO DE ALUMINIO', 'ROOF TYPE', false, 2, 'A', 19);
INSERT INTO basic_data VALUES (163, 'BUDGET', 'PL-6', 'ROOF TYPE', false, 1, 'A', 20);
INSERT INTO basic_data VALUES (164, 'BUDGET', 'PLAFON DE ACRILICO CON MARCO DE ALUMINIO', 'ROOF TYPE', false, 2, 'A', 20);
INSERT INTO basic_data VALUES (165, 'BUDGET', 'PL-6', 'ROOF TYPE', false, 1, 'A', 21);
INSERT INTO basic_data VALUES (166, 'BUDGET', 'SISTEL', 'HALL BUTTON TYPE', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (167, 'BUDGET', 'ACERO INOXIDABLE 430', 'DESIGN', false, 3, 'A', 56);
INSERT INTO basic_data VALUES (168, 'BUDGET', 'ACERO INOXIDABLE ESPEJO', 'DESIGN', false, 4, 'A', 56);
INSERT INTO basic_data VALUES (169, 'BUDGET', 'ACERO INOX. 430 HORIZONTAL CON ESQUINERO EN ACERO INOX.', 'DESIGN', false, 3, 'A', 147);
INSERT INTO basic_data VALUES (170, 'BUDGET', 'ACERO INOX. ESPEJO HORIZONTAL CON ESQUINERO EN ACERO INOX.', 'DESIGN', false, 4, 'A', 147);
INSERT INTO basic_data VALUES (171, 'BUSINESS PARTNER', 'J', 'RIF TYPE', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (172, 'BUSINESS PARTNER', 'V', 'RIF TYPE', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (173, 'BUSINESS PARTNER', 'E', 'RIF TYPE', false, 3, 'A', NULL);
INSERT INTO basic_data VALUES (174, 'BUDGET', 'ESTANDAR SEGUN MODELO', 'MACHINE BASE', false, 1, 'A', NULL);
INSERT INTO basic_data VALUES (175, 'BUDGET', 'ESPECIAL', 'MACHINE BASE', false, 2, 'A', NULL);
INSERT INTO basic_data VALUES (176, 'BUDGET', 'OTRA', 'ELEVATOR CAPACITANCE', false, 9, 'A', NULL);
INSERT INTO basic_data VALUES (190, 'asdf', 'asdf', 'asdf', true, 1, 'A', NULL);


--
-- TOC entry 1889 (class 0 OID 17493)
-- Dependencies: 153 1888
-- Data for Name: business_partner; Type: TABLE DATA; Schema: public; Owner: ascensor_admin
--

INSERT INTO business_partner VALUES (1, '123456', 171, 'MOLINA Y CIA.', NULL, 'A');
INSERT INTO business_partner VALUES (2, '111111', 171, 'CAROCCHI CONSTRUCCIONES', NULL, 'A');
INSERT INTO business_partner VALUES (3, '222222', 171, 'ASOCIACION CIVIL RES EL PORTAL TORRE D', NULL, 'A');
INSERT INTO business_partner VALUES (4, '333333', 171, 'DISTRIBUIDORA OLRUCA, C.A.', NULL, 'A');
INSERT INTO business_partner VALUES (5, '444444', 171, 'INVERSIONES SALUSGA, C.A.', NULL, 'A');
INSERT INTO business_partner VALUES (6, '555555', 171, 'GEOMETRICO CONSORCIO TURISTICO AMBIENTAL', NULL, 'A');
INSERT INTO business_partner VALUES (7, '666666', 171, 'HCL C.A', NULL, 'A');
INSERT INTO business_partner VALUES (8, '777777', 171, 'MADERERA CORINSA C.A', NULL, 'A');
INSERT INTO business_partner VALUES (9, '888888', 171, 'CONTRUCCIONES PALACE C.A', NULL, 'A');
INSERT INTO business_partner VALUES (10, '00031531-0', 171, 'Alfonzo Rivas & CIA', NULL, 'A');
INSERT INTO business_partner VALUES (11, '30909470-0', 171, 'CONSTRUCTORA 2066, C.A.', NULL, 'A');
INSERT INTO business_partner VALUES (12, '30549498-3', 171, 'HOTELES CUMBERLAND, C. A.', NULL, 'A');
INSERT INTO business_partner VALUES (13, '999999', 171, 'MIRAMAR SUITES', NULL, 'A');
INSERT INTO business_partner VALUES (14, '1111111', 171, 'CENTRO PORTUGUEZ DE GUAYANA', NULL, 'A');
INSERT INTO business_partner VALUES (15, '2222222', 171, 'C0RPORACION TERRAKA, C.A.', NULL, 'A');
INSERT INTO business_partner VALUES (16, '3333333', 171, 'JUNTA DE CONDOMINIO RES. BUENA VISTA', NULL, 'A');
INSERT INTO business_partner VALUES (17, '4444444', 171, 'JUNTA DE CONDOMINIO RES. CORAL', NULL, 'A');
INSERT INTO business_partner VALUES (18, '5555555', 171, 'JUNTA DE CONDOMINIO RESIDENCIAS VERSALLES', NULL, 'A');
INSERT INTO business_partner VALUES (19, '6666666', 171, 'Centro de Imágenes GROW,C.A.', NULL, 'A');
INSERT INTO business_partner VALUES (20, '77777777', 171, 'CONSTRUCCIONES DMA C.A', NULL, 'A');
INSERT INTO business_partner VALUES (21, '8888888', 171, 'PROMOTORA VERONA C.A', NULL, 'A');
INSERT INTO business_partner VALUES (22, '9999999', 171, 'GRUPO PROINVAL C.A', NULL, 'A');
INSERT INTO business_partner VALUES (23, '7777777', 171, 'DIPROYEDI C.A', NULL, 'A');
INSERT INTO business_partner VALUES (24, '654321', 171, 'JUNTA DE CONDOMINIO RESIDENCIAS YARACUY', NULL, 'A');
INSERT INTO business_partner VALUES (25, '987654', 171, 'JUNTA DE CONDOMINIO RES. ORINOCO', NULL, 'A');
INSERT INTO business_partner VALUES (26, '456789', 171, 'OPERADORA LIGHT, C.A.', NULL, 'A');
INSERT INTO business_partner VALUES (27, '159753', 171, 'JUNTA DE CONDOMINIO RES. URARE', NULL, 'A');
INSERT INTO business_partner VALUES (28, '951357', 171, 'Clinica Santa Fe, C.A.', NULL, 'A');
INSERT INTO business_partner VALUES (29, '147896', 171, 'Centro oftalmologico navarro del oeste, C.A.', NULL, 'A');
INSERT INTO business_partner VALUES (30, '369874', 171, 'Inprogeca, C.A.', NULL, 'A');
INSERT INTO business_partner VALUES (31, '123698', 171, 'INVERSIONES ELEFANTE, C.A', NULL, 'A');
INSERT INTO business_partner VALUES (32, '31582857-0', 171, 'Empresas Proasia, C.A.', NULL, 'A');
INSERT INTO business_partner VALUES (33, '852147', 171, 'DISTRIBUIDORA DICE, C.A.', NULL, 'A');
INSERT INTO business_partner VALUES (34, '07536592-5', 171, 'CONSTRUCTORA COFRAN ', NULL, 'A');
INSERT INTO business_partner VALUES (35, '963258', 171, 'Inversiones TDE II, C.A.', NULL, 'A');
INSERT INTO business_partner VALUES (36, '741258', 171, 'Promotora CDV 54, C.A.', NULL, 'A');


--
-- TOC entry 1886 (class 0 OID 17472)
-- Dependencies: 148
-- Data for Name: security_user; Type: TABLE DATA; Schema: public; Owner: ascensor_admin
--

INSERT INTO security_user VALUES (1, 'Roberto Nardi', 'robertonardi@hotmail.com', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', '0414-5119212', 'A');
INSERT INTO security_user VALUES (6, 'Jerry de Sousa', 'jerrydesousa@ascensoresnardi.com', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', '5555555', 'A');
INSERT INTO security_user VALUES (7, 'Maurizio Nardi', 'maurizionardi@ascensoresnardi.com	', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', '0424-5019904', 'A');
INSERT INTO security_user VALUES (2, 'Juan C. Villaverde', 'jcvillaverde@ascensoresnardi.com', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', '0251-2544738', 'A');
INSERT INTO security_user VALUES (3, 'Mauricio Moretti', 'moretti@ascensoresnardi.com', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', '5555555', 'A');
INSERT INTO security_user VALUES (8, 'Administrador', 'sistemas@ascensoresnardi.com', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', '0414-3534887', 'A');
INSERT INTO security_user VALUES (4, 'Cesar Molina', 'cesarmolina@ascensoresnardi.com', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', '5555555', 'A');
INSERT INTO security_user VALUES (5, 'Raul Colmenarez', 'raulcolmenares@ascensoresnardi.com', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', '5555555', 'A');


--
-- TOC entry 1890 (class 0 OID 17503)
-- Dependencies: 156 1886 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1888 1889
-- Data for Name: budget; Type: TABLE DATA; Schema: public; Owner: ascensor_admin
--

INSERT INTO budget VALUES (25, 25, 25, '2013-03-26 09:40:00', 'J', '987654', 'JUNTA DE CONDOMINIO RES. ORINOCO', 'RES. ORINOCO', 3, 'Mauricio Moretti', 'AV, ARMANDO REVERÓN, LA CAMPIÑA', 'CARACAS', 'NINGUNO', 'NINGUNO@NINGUNO.COM', 'CAROLINA PALMERA', false, false, false, 1, 7, 1, 14, 1, '1:01', 23, 175, NULL, NULL, 36, NULL, NULL, NULL, 48, 0, 14.300000000000001, 3.8999999999999999, 0, 1.5, 0, 137, true, 'ACERO INOXIDABLE AL FRENTE Y FORMICA AL FONDO Y LATERALES', NULL, NULL, 70, NULL, 73, NULL, 0, 86, 88, NULL, '', 100, 94, 103, 107, 'PARED', NULL, NULL, true, true, false, false, true, false, false, false, ' ', true, 'PB.1-5', 0, false, '', 0, false, '', 0, 139, '', false, '', false, 0, false, 0, NULL, 145, '- SE CONSERVAN RIELES DE CABINA Y CONTRAPESO, MARCOS DE PISO, MARCO DE CONTRAPSO, BASTIDOR DE CABINA Y AMORTIGUADORES. ', 'A');
INSERT INTO budget VALUES (32, 14, 32, '2013-03-26 13:42:00', 'J', '1111111', 'CENTRO PORTUGUEZ DE GUAYANA', 'ninguna', 3, 'Mauricio Moretti', 'Puerto Ordaz, Edo. Bolivar', 'Puerto Ordaz, Edo. Bolivar', 'NINGUNO', 'NINGUNO@NINGUNO.COM', 'Arq° Omar Perdomo', false, false, true, 2, 7, 1, 17, 1, '2:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 48, 3, 8, 4, 0, 1.5, 0, 58, true, '#¿NOMBRE?', 156, NULL, NULL, NULL, 76, NULL, 0, 83, 89, NULL, '', 101, 96, 103, 107, 'PARED', NULL, NULL, true, true, false, false, true, false, false, false, ' ', true, 'PB,1,2', 3, false, '', 0, false, '', 0, 139, 'RESTO DE LOS PISOS.', true, 'PB', false, 0, false, 0, NULL, 145, '- Pozo de 1,85 mts de ancho x 2,20 mts de fondo - Cabina de 1,40 mts de ancho x 1,40 mts de fondo x 2,30 mts de alto', 'A');
INSERT INTO budget VALUES (34, 32, 34, '2013-03-26 15:05:00', 'J', '31582857-0', 'Empresas Proasia, C.A.', 'Venta para terceros', 2, 'Juan C. Villaverde', 'Entrega en fabrica', 'Entrega en fabrica', 'NINGUNO', 'NINGUNO@NINGUNO.COM', 'Sr. Omar Salazar', false, false, true, 1, 7, 1, 15, 1, '1:01', 22, 174, NULL, NULL, 36, NULL, NULL, NULL, 48, 4, 12, 1.2, 0, 1.7, 0, 61, false, ' ', 66, NULL, 70, NULL, 73, NULL, 0, 84, 88, NULL, '', 100, 95, 103, 107, 'PARED', NULL, NULL, true, false, false, false, false, false, false, false, ' ', true, 'PB,1,2,3', 0, false, '', 0, false, '', 0, NULL, '', true, 'TODOS LOS PISOS.', false, 0, false, 0, NULL, 145, '- MAQUINA 2V EVO30S - El operador de puertas y mecanismos de pasillo deben ser FERMATOR (el que sea) y el control debe ser CFCONTROL en 2 velocidades con sus displays y botones de acero de 31 mm. El acero a utilizar en el frente de cabina y para los marco', 'A');
INSERT INTO budget VALUES (27, 27, 27, '2013-03-26 10:06:00', 'J', '159753', 'JUNTA DE CONDOMINIO RES. URARE', 'RES. URARE', 3, 'Mauricio Moretti', 'LA ROSALEDA , SUR', 'caracas', 'NINGUNO', 'NINGUNO@NINGUNO.COM', 'JULIO ARIAS BRICEÑO', false, false, false, 1, 7, 2, 15, 2, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 48, 17, 48, 4, 0, 1.5, 0, NULL, false, ' ', NULL, NULL, NULL, NULL, NULL, NULL, 0, 86, 89, NULL, '', 100, 95, 103, 107, 'MARCO', NULL, NULL, true, true, false, false, true, false, false, true, ' ', false, '', 0, true, 'PB,2,4,6,8,10,12,14,16', 9, true, 'PB,1,3,5,7,9,11,13,15', 9, NULL, '', false, '', false, 0, false, 0, NULL, 145, ' - Hay un compromiso con este cliente en los tiempos de instalacion por favor tener en cuenta este requerimiento', 'A');
INSERT INTO budget VALUES (8, 8, 8, '2013-03-22 15:56:00', 'J', '777777', 'MADERERA CORINSA C.A', 'EDIF RESIDENCIAL', 4, 'Cesar Molina', 'CAGUA - ARAGUA', 'CAGUA - ARAGUA', 'ninguno', 'ninguno@ninguno.com', 'SR GIOVANNI ARPAIA', false, false, true, 1, 7, 1, 15, 1, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 48, 4, 0, 0, 0, 0, 0, 58, true, 'No comentado por el vendedor.', 65, NULL, 71, NULL, 73, NULL, 0, 83, NULL, NULL, '', 100, 95, NULL, NULL, ' ', NULL, NULL, true, false, false, false, false, false, false, false, ' ', true, 'PB,1,2,3', 4, false, '', 0, false, '', 0, 139, 'No comentado por el vendedor.', false, '', false, 0, false, 0, NULL, NULL, '1.- PORFA HAZ UNO ESTANDAR Y OTRO LUJO', 'A');
INSERT INTO budget VALUES (30, 30, 30, '2013-03-26 11:33:00', 'J', '369874', 'Inprogeca, C.A.', 'Edificios Residenciales GMVV, La Lareda (Caracas)', 2, 'Juan C. Villaverde', 'Caracas', 'Caracas', '0424 1340075', 'ninguno@ninguno.com', 'Ing. Edgar Croes', false, false, true, 1, 7, 2, 16, 2, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, NULL, 10, 37, 1.2, 0, 0, 0, 58, true, 'COLOR NO INDICADO PARA FORMICA.', 153, NULL, NULL, NULL, 73, NULL, 0, 85, 89, 90, ' ', 100, 95, NULL, NULL, 'PARED', NULL, NULL, true, false, false, false, false, false, false, false, ' ', false, '', 0, true, 'PB,2,4,6,8', 5, true, 'PB,1,3,5,7,9', 6, 139, 'RESTO DE LOS PISOS', true, 'PB', false, 0, false, 0, NULL, NULL, '- Otros: Solo fabricacion, sin montaje, sin control electronico, sin espejo - Tomar en cuenta en esta oportunidad el recorrido ya que los anteriores los cables se fueron cortos ( fosa y viajero ), el acero inoxidable a utilizar es el acero espejo para tod', 'A');
INSERT INTO budget VALUES (15, 15, 15, '2013-03-25 16:24:00', 'J', '2222222', 'C0RPORACION TERRAKA, C.A.', 'Brisas de Miravila,  Edificios 3 y 4 ', 3, 'Mauricio Moretti', 'Parque Kaisa, Sector Carimao, Urbanización Miravila, calle Salamanca, Carretera la flecha - ', 'Carimao, Municipio Sucre, Estado Miranda.', 'ninguno', 'ninguno@ninguno.com', 'Ing. Guillermo Trujillo', true, true, true, 1, 7, 2, 16, 2, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 48, 11, 28.5, 4.4500000000000002, 0, 1.5, 0, 58, true, 'FORMICA LAS PAREDES, ACERO INOX EL FRENTE.', 153, NULL, 71, NULL, 73, NULL, 0, 86, 89, NULL, '', 100, 95, NULL, 107, 'PARED', NULL, NULL, true, true, false, false, true, false, true, true, ' ', false, '', 0, true, 'PB,2,4,6,8,10', 6, true, 'PB,1,3,5,7,9', 6, 139, 'RESTO. NO SE INDICA COLOR', true, 'PB', false, 0, false, 0, NULL, 145, '', 'A');
INSERT INTO budget VALUES (5, 5, 5, '2013-03-22 14:21:00', 'J', '444444', 'INVERSIONES SALUSGA, C.A.', 'CENTRO EMPRESARIAL ROCA', 3, 'Mauricio Moretti', 'AV. ORINOCO SUR , LAS MERCEDES, FRENTE A LA UE', 'CARACAS', 'ninguno', 'ninguno@ninguno.com', 'DR. NELSON SANSIVERIO Y DR. ABEL GALARRAGA', false, false, false, 2, 7, 2, 16, 2, '1:01', 23, 174, NULL, NULL, 38, NULL, NULL, NULL, 53, 6, 18.600000000000001, 6.2999999999999998, 0, 1.8, 0, 149, false, ' ', 152, NULL, 71, NULL, 73, NULL, 0, 86, 89, NULL, '', 100, 96, 102, 107, 'PARED', NULL, NULL, true, false, false, false, false, false, false, true, ' ', true, ' S1,PB,1,2,3,PH', 6, false, '', 0, false, '', 0, 139, 'Resto de los pisos.', true, 'PB', true, 6, false, 0, 166, NULL, '"1.- Pozo de 2,00 mts de ancho x 1,80 mts de fondo 2.- Cabina de 1,45 mts de ancho x 0,96 mts de fondo x 2,20 mts de alto 3.- Incluir "" Reservación"" en botonera de cabina y botonera doble en piso con display de posición, dirección y gongs,  en todos los pisos 4.- Se conservan marcos de puerta, marco de contrapeso y pesas, rieles, bastidor de cabina y amortiguadores hidraulicos"', 'A');
INSERT INTO budget VALUES (2, 2, 2, '2013-03-22 13:34:00', 'J', '111111', 'CAROCCHI CONSTRUCCIONES', 'CONJUNTO RESIDENCIAL SAN OMERO', 4, 'Cesar Molina', 'CALABOZO - EDO GUARICO', 'CALABOZO - EDO GUARICO', '0414- 4886842', 'ninguno@ninguno.com', 'GERARDO CIAROCCHI', false, false, true, 1, 9, 1, 15, 1, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 48, 4, 12, 0, 0, 0, 0, 58, true, 'FORMICA NO DETALLADO', NULL, NULL, 71, NULL, 73, NULL, 0, 86, NULL, NULL, '', 100, 95, NULL, NULL, ' ', NULL, NULL, false, false, false, false, false, false, false, false, ' ', true, 'PB,1,2,3', 4, false, '', 0, false, '', 0, 139, 'No especificado el color', false, '', false, 0, false, 0, NULL, NULL, '1.- PANORAMICO RECTO ', 'A');
INSERT INTO budget VALUES (7, 7, 7, '2013-03-22 14:38:00', 'J', '666666', 'HCL C.A', 'CONJUNTO RESIDENCIAL EL PARQUE', 4, 'Cesar Molina', 'CHICHIRIVICHE - FALCON', 'CHICHIRIVICHE - FALCON', 'NINGUNO', 'NIGUNO@NINGUNO.COM', 'SR FRANCISCO SALAS', false, false, true, 1, 7, 1, 19, 1, '1:01', 23, 174, NULL, NULL, 37, NULL, NULL, NULL, 48, 6, 0, 0, 0, 0, 0, 58, true, '1.- CABINA ESTANDAR LUJO', 162, NULL, 71, NULL, 73, NULL, 0, 86, NULL, NULL, '', 100, 97, NULL, NULL, ' ', NULL, NULL, true, false, false, false, false, false, false, false, ' ', true, 'PB,1,2,3,4,5', 6, false, '', 0, false, '', 0, NULL, '', true, 'Todos los pisos.', false, 0, false, 0, NULL, NULL, '', 'A');
INSERT INTO budget VALUES (28, 28, 28, '2013-03-26 10:12:00', 'J', '951357', 'Clinica Santa Fe, C.A.', 'Ampliacion de la sede de la clinica', 2, 'Juan C. Villaverde', 'Final av. Vargas con calle Uruguay', 'Barquisimeto', 'NINGUNO', 'NINGUNO@NINGUNO.COM', 'Ing. Gerardo Cupido / Ing. Yenny Salazar', false, false, true, 4, 8, 1, 18, 1, '2:01', 22, 174, NULL, NULL, 36, NULL, NULL, NULL, 48, 2, 8, 1.2, 0, 0, 0, 138, false, ' ', 160, NULL, 70, NULL, 73, NULL, 0, 84, 89, 90, ' ', 100, 96, 102, 107, 'PARED', NULL, NULL, true, false, false, false, false, false, false, false, ' ', true, 'PB,1', 2, false, '', 0, false, '', 0, NULL, '', true, 'TODOS LOS PISOS', false, 0, false, 0, NULL, 145, ' - A este cliente por competencia se le debe instalar un espejo RECTO sencillo en el fondo de la cabina….', 'A');
INSERT INTO budget VALUES (22, 22, 22, '2013-03-26 09:02:00', 'J', '9999999', 'GRUPO PROINVAL C.A', 'PARAPARAL PLAZA', 4, 'Cesar Molina', 'CARABOBO', 'CARABOBO', 'NINGUNO', 'NINGUNO@NINGUNO.COM', 'SR CARLOS MUCI', false, false, true, 2, 7, 1, 16, 1, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 48, 2, 0, 0, 0, 1.8, 0, 58, true, 'COLOR NO DEFINIDO PARA FORMICA', 153, NULL, 71, NULL, 73, NULL, 0, 86, NULL, NULL, '', 100, 96, NULL, NULL, ' ', NULL, NULL, true, false, false, false, false, false, false, false, ' ', true, 'PB, M', 0, false, '', 0, false, '', 0, NULL, '', true, '', false, 0, false, 0, NULL, NULL, '1.- UN PRESUPUESTO DE 450KG CON Y SIN SALA DE MAQUINAS 2.- OTRO DE 600 KG CON Y SIN SALA DE MAQUINAS 3.- TOTAL 4 PRESUPUESTOS', 'A');
INSERT INTO budget VALUES (29, 29, 29, '2013-03-26 11:26:00', 'J', '147896', 'Centro oftalmologico navarro del oeste, C.A.', 'Ampliacion de la sede de la C.O.N.O', 2, 'Juan C. Villaverde', 'Carrera 19 entre calles 42 y 43', 'Barquisimeto', '0412 - 5109993', 'ninguno@ninguno.com', 'Lic. Rafael Vasquez', true, true, true, 2, 7, 1, 16, 1, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 48, 4, 13, 1.2, 0, 1.8, 0, 58, true, 'NO INDICA COLOR FORMICA', 153, NULL, NULL, NULL, 73, NULL, 0, 86, 89, 90, ' ', 100, 96, 102, 107, 'PARED', NULL, NULL, true, false, false, false, false, false, true, false, ' ', true, 'PB,1,2,3', 4, false, '', 0, false, '', 0, 139, 'RESTO DE LOS PISOS.', true, 'PB', false, 3, false, 0, 166, 145, '- El ultimo piso debe llevar en el boton mas la lectora de llave de contacto con 3 llaves programadas', 'A');
INSERT INTO budget VALUES (24, 24, 24, '2013-03-26 09:24:00', 'J', '654321', 'JUNTA DE CONDOMINIO RESIDENCIAS YARACUY', 'RES. YARACUY', 3, 'Mauricio Moretti', 'PASEO COLÓN, ENTRE PLAZA VZLA. Y COLEGIO DE INGS.', 'CARACAS', 'NINGUNO', 'NINGUNO@NINGUNO.COM', 'MILAGROS CHIVIGO', false, false, false, 1, 7, 2, 18, 2, '1:01', NULL, 175, NULL, NULL, 40, NULL, NULL, NULL, 48, 22, 60, 5.2999999999999998, 0, 2.7200000000000002, 0, NULL, false, ' ', NULL, NULL, NULL, NULL, NULL, NULL, 0, 86, 89, NULL, '', 101, 96, 102, 107, 'PARED', NULL, NULL, true, true, false, false, true, false, true, true, ' ', false, '', 0, true, 'S2,PB,2,4,6,8,10,12,14,16,18,20', 12, true, 'S2,PB,1,3,5,7,9,11,13,15,17,19', 12, 139, 'RESTO DE LOS PISOS.', true, 'PB', true, 21, false, 0, 166, 145, '- Sistema de acceso de contacto. - Se conservan rieles, marcos, marco de contrapeso y pesas, cabina con su bastidor, y amortiguadores - Incluir interruptores de seguridad por acceso al pozo en nivel S/R y en nivel foso', 'A');
INSERT INTO budget VALUES (10, 10, 10, '2013-03-22 17:09:00', 'J', '00031531-0', 'Alfonzo Rivas & CIA', 'Edf. Mamber, sede de McCormick', 3, 'Mauricio Moretti', 'Av. Chicago con calle Boston, Urb. La California Sur, Caracas', 'CARACAS', 'NO', 'NO@NO.COM', 'Ing° Abraham Lasser', false, false, false, 6, 10, 1, 20, 1, '2:01', 22, 174, NULL, NULL, 35, NULL, NULL, NULL, 53, 4, 12, 3.5, 0, 1.8, 0, 137, true, 'Cabina de acero pintada (No se especifica color). Acabado de piso Lamina acero estriada', 164, NULL, NULL, NULL, 76, NULL, 0, 131, NULL, NULL, '', 101, 99, 104, 107, 'PARED', NULL, NULL, false, false, false, false, false, false, false, false, ' ', true, ' PB,1,2,3', 4, false, '', 0, false, '', 0, 139, 'No se especifica color.', false, '', false, 0, false, 0, NULL, 145, '- PB ABRE AL FRENTE - 1,2,3 ABRE OPUESTO - CONSERVAR TZ (CAIDA DE GUAYAS = 510 mm) - INCLUIR BOTONES DE RENIVELACIÓN EN AMBOS EXTREMOS DE LA CABINA, AL LADO DE LA BOTONERA - INCLUIR 2 BOTONERAS EN CABINA, cada una con botones de llamada, boton de alarma e', 'A');
INSERT INTO budget VALUES (23, 23, 23, '2013-03-26 09:11:00', 'J', '7777777', 'DIPROYEDI C.A', 'EMERGENCIAS MEDICAS SANTA ROSALIA', 4, 'Cesar Molina', 'NINGUNA', 'NINGUNA', 'NINGUNO', 'NINGUNO@NINGUNO.COM', 'SRA MARITZA MONTALEONES', false, false, true, 2, 7, 1, 16, 1, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 48, 3, 0, 0, 0, 1.8, 0, 59, false, ' ', 153, NULL, 71, NULL, 73, NULL, 0, 84, NULL, NULL, '', 100, 96, NULL, NULL, ' ', NULL, NULL, true, false, false, false, false, false, false, false, ' ', true, 'PB,1,2', 3, false, '', 0, false, '', 0, NULL, '', true, '', false, 0, false, 0, NULL, NULL, '1.- UN PRESUPUESTO CON SALA DE MAQUINAS 2.- UN PRESUPUESTO SIN SALA DE MAQUINAS', 'A');
INSERT INTO budget VALUES (36, 33, 36, '2013-03-26 15:27:00', 'J', '852147', 'DISTRIBUIDORA DICE, C.A.', 'CAUCHERA DICE', 3, 'Mauricio Moretti', 'CALLE ORIENTE, URB. ORINOCO', 'PUERTO ORDAZ', 'NINGUNO', 'NINGUNO@NINGUNO.COM', 'CESAR CENEDEFE', false, false, false, 2, 7, 1, 17, 1, '2:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 52, 4, 10, 4.5, 0, 1.6000000000000001, 0, 137, true, 'FORMICA NO ESPECIFICA COLOR.', NULL, NULL, NULL, NULL, NULL, NULL, 0, 86, 89, 90, ' ', NULL, NULL, 103, 107, 'PARED', NULL, NULL, true, true, false, false, true, false, false, false, ' ', true, 'PB, MZ,1,2', 0, false, '', 0, false, '', 0, 139, 'RESTO DE LOS PISOS', true, 'PB', false, 0, false, 0, NULL, 145, '- PLAFON DE TECHO: Lámina pintada con lamparas embutidas - TIPO PISO: LAMINA ESTRIADA - Equipo para ser instalado segun contrato en fecha: tiempo más corto posible < 7 meses ', 'A');
INSERT INTO budget VALUES (20, 20, 20, '2013-03-26 08:25:00', 'J', '77777777', 'CONSTRUCCIONES DMA C.A', 'RESIDENCIAS CENTRAL PARK', 4, 'Cesar Molina', 'MARACAY.', 'MARACAY, ESTADO ARAGUA', 'ninguno', 'ninguno@ninguno.com', 'ninguno', false, false, true, 1, 7, 3, 16, 3, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 48, 18, 54, 4, 0, 1.8, 0, 58, true, 'NO SE INDICA COLOR EN FORMICA.', 153, NULL, 71, NULL, 73, NULL, 0, 86, NULL, NULL, '', 100, 95, NULL, NULL, ' ', NULL, NULL, false, false, false, false, false, false, false, false, ' ', true, 'S,PB,E1,E2,1-14', 18, false, '', 0, false, '', 0, 139, 'RESTO DE LOS PISOS', true, 'PB', false, 0, false, 0, NULL, NULL, '1.- CABINA ESTANDAR', 'A');
INSERT INTO budget VALUES (17, 17, 17, '2013-03-25 16:56:00', 'J', '4444444', 'JUNTA DE CONDOMINIO RES. CORAL', 'RES. CORAL', 3, 'Mauricio Moretti', 'AV1, ENTRE TRANSV. 1 Y AV. FCO. DE MIRANDA, LOS PALOS GRANDES', 'CARACAS', 'ninguno', 'ninguno@ninguno.com', 'GABRIELA TIRADO', false, false, false, 1, 7, 2, 15, 2, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 53, 11, 30, 3.8999999999999999, 0, 1.8999999999999999, 0, 149, false, ' ', 66, NULL, 71, NULL, 73, NULL, 0, 84, 89, NULL, '', 101, 95, 102, 107, ' ', NULL, NULL, true, true, false, false, true, false, false, false, ' ', true, 'PB,1-9,PH', 11, false, '', 0, false, '', 0, NULL, '', true, 'PB', false, 0, false, 0, NULL, 145, '- SE CONSERVAN RIELES DE CABINA Y CONTRAPESO, MARCOS, MARCO DE CONTRAPESO Y PESAS, BASTIDOR DE CABINA -INCLUIR AMORTIGUADORES DE RESORTE (NO HAY AMORTIGUADORES EN FOSO) - ASC IZQ LLEGA AL 9 Y ASC DER LLEGA A PH(TIENE UNA PARADA MÁS) ==> VERIFICAR MANIOBRA', 'A');
INSERT INTO budget VALUES (21, 21, 21, '2013-03-26 08:37:00', 'J', '8888888', 'PROMOTORA VERONA C.A', 'RES BAKARAT', 4, 'Cesar Molina', 'NINGUNA', 'NINGUNA', 'NINGUNA', 'NINGUNA@NINGUNA.COM', 'SR TONY NAJAR', false, false, true, 1, 7, 2, 15, 2, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 49, 10, 0, 0, 0, 1.8, 0, 59, false, ' ', 66, NULL, 71, NULL, 73, NULL, 0, 86, NULL, NULL, '', 100, 95, NULL, NULL, ' ', NULL, NULL, true, false, false, false, false, false, false, false, ' ', true, ' S1,PB,1,2,3,4,5,6,7,8', 10, false, '', 0, false, '', 0, NULL, '', true, 'NO INDICA PISOS', false, 0, false, 0, NULL, NULL, '1-   ASCENSOR DE LUJO', 'A');
INSERT INTO budget VALUES (19, 19, 19, '2013-03-25 17:15:00', 'J', '6666666', 'Centro de Imágenes GROW,C.A.', 'Centro de imágenes, Las Mercedes', 3, 'Mauricio Moretti', 'Las Mercedes', 'CARACAS', 'ninguno', 'ninguno@ninguno.com', 'Arq. Oscar Diquez L.', false, false, true, 4, 7, 2, 17, 2, '2:01', 24, 174, NULL, NULL, 38, NULL, NULL, NULL, 53, 7, 26.25, 4.3499999999999996, 0, 1.7, 0, 59, true, 'PISO PREPARADO POR CUENTA DEL CLIENTE', 156, NULL, 71, NULL, 76, NULL, 0, 86, 89, NULL, '', 101, 96, 102, NULL, 'PARED', NULL, NULL, true, true, false, false, true, false, false, true, ' ', true, 'PB, MZ, 1,2,3,4,5', 7, false, '', 0, false, '', 0, 139, 'RESTO DE LOS PISOS', true, 'PB', true, 6, false, 0, 166, NULL, '1.- INCLUIR PARACAIDAS EN CONTRAPESO POZO COMÚN : 4,35 mts ancho x 1,90 mts fondo pozo individual 2,10 mts de ancho x 1,90 mts fondo 2.- Dimensiones de cabina: 1,50 mts de ancho x 1,30 mts de fondo x 2,30 mts alto 3.- Iluminación de emergencia en cabina', 'A');
INSERT INTO budget VALUES (6, 6, 6, '2013-03-22 14:33:00', 'J', '555555', 'GEOMETRICO CONSORCIO TURISTICO AMBIENTAL', 'PUERTO MORROCOY', 4, 'Cesar Molina', 'TUCACAS - FALCON', 'TUCACAS - FALCON', 'ninguno', 'ninguno@ninguno.com', 'SR LUIS RADA', false, false, true, 1, 9, 3, 15, 3, '1:01', 23, 174, NULL, NULL, NULL, NULL, NULL, NULL, 48, 6, 0, 0, 0, 0, 0, 59, false, ' ', 65, NULL, 71, NULL, 73, NULL, 0, 86, NULL, NULL, '', 101, 96, 102, NULL, ' ', NULL, NULL, true, false, false, false, false, false, false, false, ' ', true, ' PB,1,2,3,4', 5, false, '', 0, false, '', 0, NULL, '', true, 'TODOS LOS PISOS?', false, 0, false, 0, NULL, NULL, '1.- PANORAMICO DE LUJO (TUCACAS)', 'A');
INSERT INTO budget VALUES (9, 9, 9, '2013-03-22 16:00:00', 'J', '888888', 'CONTRUCCIONES PALACE C.A', 'PLATINUM PALACE ', 4, 'Cesar Molina', 'CALLE LOS SAUCES  URB EL BOSQUE PARCELA 32', 'MARACAY EDO ARAGUA', 'NINGUNO', 'NINGUNO@NINGUNO.COM', 'ING EDGAR HASKUR', false, false, true, 1, 7, 2, 15, 2, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 48, 10, 0, 0, 0, 0, 0, 58, true, 'nada', 66, NULL, 71, NULL, 73, NULL, 0, 86, NULL, NULL, '', 100, 95, NULL, NULL, ' ', NULL, NULL, true, false, false, false, false, false, false, false, ' ', false, '', 0, true, 'S1,PB,2,4,6,8', 6, true, 'S1,PB,1,3,5,7,8', 7, 139, 'S1, y resto de los pisos.', true, 'PB', false, 0, false, 0, NULL, NULL, '3.- MARCO DE 200 mm ( 5% + QUE EL COMUN)', 'A');
INSERT INTO budget VALUES (13, 13, 13, '2013-03-25 15:41:00', 'J', '999999', 'MIRAMAR SUITES', 'MIRAMAR SUITES', 3, 'Mauricio Moretti', 'PLAYA GRANDE, Av 1', 'Caracas', 'ninguno', 'ninguno@ninguno.com', 'BRUNO DI ROCCO', false, false, false, 5, 7, 1, 15, 1, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 52, 10, 30, 4, 0, 1.5, 0, 149, false, ' ', 66, NULL, 71, NULL, 73, NULL, 0, 86, 89, NULL, '', 100, 95, 102, 107, 'PARED', NULL, NULL, true, false, false, false, true, false, false, true, ' ', true, 'PB, 1- 9', 10, false, '', 0, false, '', 0, 139, 'RESTO DE LOS PISOS. No se especifico color.', true, 'PB', false, 10, false, 0, 166, 145, '- Pesacargas. - Cliente realiza estructura metálica y cerramiento de pozo, ya que es externo a la edificación actual', 'A');
INSERT INTO budget VALUES (12, 12, 12, '2013-03-25 15:26:00', 'J', '30549498-3', 'HOTELES CUMBERLAND, C. A.', 'HOTELES CUMBERLAND, C. A.', 3, 'Mauricio Moretti', '2a. Av. Las Delicias de Sabana Grande', 'Caracas', 'ninguno', 'ninguno@ninguno.com', 'Mariano De Alba', false, false, false, 5, 7, 2, 15, 2, '1:01', 23, 175, NULL, NULL, 38, NULL, NULL, NULL, 53, 20, 57, 4.5, 0, 1.8999999999999999, 0, 149, false, ' ', 66, NULL, 71, NULL, 73, NULL, 0, 86, 89, NULL, '', 100, 95, 102, 107, 'PARED', NULL, NULL, false, false, false, false, false, false, true, true, ' ', true, 'S,PB,1-17,PH', 20, false, '', 0, false, '', 0, 139, 'RESTO DE LOS PISOS. NO SE INDICO COLOR', true, 'PB', false, 20, false, 0, 166, 145, '- LLAVE PARA NIVEL SOTANO EN CABINA. - INCLUIR ESPEJO - REVESTIR MARCOS DE ACERO INOX EN PB (LOBBY) (tipo abiertos) - INCLUIR ESPEJO - INCLUIR INDICADOR DE POSICIÓN Y DE DIRECCIÓN + GONGS, EN TODOS LOS PISOS - Incluir llave de reservación en botonera de c', 'A');
INSERT INTO budget VALUES (11, 11, 11, '2013-03-22 17:18:00', 'J', '30909470-0', 'CONSTRUCTORA 2066, C.A.', 'LA CAMPIÑA', 3, 'Mauricio Moretti', 'LA CAMPIÑA', 'CARACAS', 'ninguno', 'ninguno@ninguno.com', 'INGº FELICE DENTE', true, true, true, 1, 7, 2, 15, 2, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 48, 13, 36, 4.4000000000000004, 0, 1.5, 0, 149, false, ' ', 66, NULL, NULL, NULL, 75, NULL, 0, 84, 89, NULL, '', 100, 96, 102, 107, 'PARED', NULL, NULL, true, false, false, false, false, false, true, true, ' ', false, '', 0, true, 'SS,PB,MZ,2,4,6,8,PH', 8, true, 'SS,PB,MZ,1,3,5,7,9,PH', 9, 139, 'RESTO DE LOS PISOS', true, 'PB', true, 16, false, 0, 166, 145, '- Llave magnetica 1.- POZO: 1,80 mts ancho x 1,75 mts de fondo 2.- Cabina con piso acabado por cuenta del cliente, con espesor de 23 mm (piso sintético) incluyendo pega ', 'A');
INSERT INTO budget VALUES (37, 34, 37, '2013-03-26 15:41:00', 'J', '07536592-5', 'CONSTRUCTORA COFRAN ', 'GALPON COMERCIAL', 4, 'Cesar Molina', 'NINGUNA', 'NINGUNA', 'NINGUNA', 'NINGUNA@NINGUNA.COM', 'SR YAYZA VARGAS', false, false, true, 2, 7, 2, 15, 2, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 53, 3, 9, 0, 0, 1.7, 0, 58, true, 'COLOR NO DESCRITO.', 66, NULL, 71, NULL, 73, NULL, 0, 83, NULL, NULL, '', 100, 95, NULL, NULL, ' ', NULL, NULL, false, false, false, false, false, false, false, false, ' ', true, ' PB,1,2', 3, false, '', 0, false, '', 0, 139, 'TODOS LOS PISOS', false, '', false, 0, false, 0, NULL, NULL, '', 'A');
INSERT INTO budget VALUES (14, 14, 14, '2013-03-25 15:53:00', 'J', '1111111', 'CENTRO PORTUGUEZ DE GUAYANA', 'CENTRO PORTUGUEZ DE GUAYANA', 3, 'Mauricio Moretti', 'Puerto Ordaz, Edo. Bolivar', 'Puerto Ordaz, Edo. Bolivar', 'ninguno', 'ninguno@ninguno.com', 'Arq° Omar Perdomo', false, false, true, 2, 7, 1, 17, 1, '2:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 53, 4, 12, 4, 0, 1.5, 0, 149, false, ' ', 156, NULL, 71, NULL, 73, NULL, 0, 86, 89, NULL, '', 101, 96, 102, 107, 'MARCO', NULL, NULL, true, true, false, false, true, false, false, false, ' ', true, 'PB,1,2,3', 4, false, '', 0, false, '', 0, 139, 'RESTO. COLOR NO INDICADO', true, 'PB', false, 4, false, 0, 166, 145, '- Pozo de 2,10 mts de ancho x 2,20 mts de fondo - Cabina de 1,40 mts de ancho x 1,40 mts de fondo x 2,30 mts de alto', 'A');
INSERT INTO budget VALUES (18, 18, 18, '2013-03-25 17:04:00', 'J', '5555555', 'JUNTA DE CONDOMINIO RESIDENCIAS VERSALLES', 'RES. VERSALLES', 3, 'Mauricio Moretti', 'AV. CERVANTES, COLINAS DE BELLO MONTE', 'CARACAS', 'ninguno', 'ninguno@ninguno.com', 'YAJAIRA SARMIENTO', false, false, false, 1, 7, 1, 17, 1, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 48, 8, 21, 4.7000000000000002, 0, 1.55, 0, 137, true, 'ACERO INOX AL FRENTE Y FORMICA AL FONDO Y LATERALES.', 156, NULL, NULL, NULL, 73, NULL, 0, 86, 89, NULL, '', 100, 95, 102, 107, 'PARED', NULL, NULL, true, true, false, false, true, false, true, false, ' ', true, 'PB,1,2,3,4,5,6,7', 8, false, '', 0, false, '', 0, 139, 'TODOS LOS PISOS', false, '', true, 8, false, 0, 166, 145, '- SISTEMA DE ACCESO ES DE CONTACTO. - INCUIR ESPEJO - SE CONSERVAN RIELES DE CABINA Y CONTRAPESO, MARCOS, MARCO DE CONTRAPESO Y PESAS, AMORTIGUADORES Y BASTIDOR DE CABINA ', 'A');
INSERT INTO budget VALUES (26, 26, 26, '2013-03-26 09:54:00', 'J', '456789', 'OPERADORA LIGHT, C.A.', 'Centro comercial Fitnes (Barquisimeto)', 2, 'Juan C. Villaverde', 'Av. Capanaparo al lado de Residencias Plaza Madrid', 'Barquisimeto - Lara', '0414 5216152', 'NINGUNO@NINGUNO.COM', 'Ing. Olga Frafan / Sr. Javier Yanez', true, true, true, 2, 7, 1, 17, 1, '2:01', 22, 175, NULL, NULL, 35, NULL, NULL, NULL, 48, 5, 19, 4.0999999999999996, 0, 2, 0, 58, true, 'CABINA FORMICA COLOR WENGUE', 156, NULL, 71, NULL, 73, NULL, 0, 86, 89, 90, ' ', 100, 95, 102, 107, 'PARED', NULL, NULL, true, false, false, false, false, false, false, false, ' ', true, 'PB,M,1,2,3', 5, false, '', 0, false, '', 0, NULL, '', true, 'TODOS LOS PISOS', true, 4, false, 0, 166, 145, '1.- MOTOR GM42S 
 2. - Hay un compromiso con este cliente en los tiempos de instalacion por favor tener en cuenta este requerimiento 
 3.- A este cliente por competencia se le debe instalar un espejo RECTO sencillo en el fondo de la cabina….', 'A');
INSERT INTO budget VALUES (1, 1, 1, '2013-03-22 11:53:00', 'J', '123456', 'MOLINA Y CIA.', 'LA MARCONA', 3, 'Mauricio Moretti', 'CARRETERA PANAMERICANA KM 18 CARRIZAL', 'CARACAS', 'ninguno', 'ninguno@ninguno.com', 'ING° FERNANDO CAVANILLA', false, false, true, 6, 10, 1, 176, 1, '2:01', 25, 174, NULL, NULL, 35, NULL, NULL, NULL, 48, 2, 3.75, 2.1299999999999999, 0, 1.5, 0, 59, false, ' ', NULL, NULL, NULL, NULL, NULL, NULL, 0, 87, 89, 90, ' ', 101, NULL, 103, 107, 'PARED', NULL, NULL, false, false, false, false, false, false, false, false, ' ', true, 'PB,1', 2, false, '', 0, false, '', 0, NULL, '', true, 'PB, 1', true, 2, false, 0, 166, 145, '1.- CAPACIDAD 2500 KG 2.- ENTRADA LIBRE 1800 3.- POZO DE 2,00 MTS DE ANCHO X 2,00 MTS DE FONDO, Y CABINA CON ALTURA INTERNA DE 2,20 MTS. 4.- INCLUIR MIRILLA DE SEGURIDAD EN HOJAS DE PUERTA 5.- INCLUIR REJA EN CABINA, A MEDIA ALTURA, Y QUICIO REFORZADO (HIERRO PREFERIBLEMENTE) 6.- INCLUIR BOTONES DE RENIVELACIÓN EN BOTONERA DE CABINA 7.- SUMINISTRAR PLANO DE DISPOSICIÓN CON DIMENSIONES MÍNIMAS DE SOBRERECORRIDO Y DIMENSIÓN INTERNA DE CABINA', 'A');
INSERT INTO budget VALUES (38, 35, 38, '2013-03-26 15:45:00', 'J', '963258', 'Inversiones TDE II, C.A.', 'Res. Balcones de la Colina (Bqto.)', 2, 'Juan C. Villaverde', 'Urb. Barici al lado del antiguo autocine', 'Barquisimeto', '0424 5301334', 'ninguno@ninguno.com', 'Ing. Eduardo Chang', true, true, true, 1, 7, 1, 16, 1, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 48, 3, 10, 1.1000000000000001, 0, 1.8, 0, 149, false, ' ', 153, NULL, 71, NULL, 73, NULL, 0, 84, 89, NULL, '', 100, 95, 102, 107, 'PARED', NULL, NULL, true, false, false, false, false, false, false, false, ' ', true, 'PB,1,2', 3, false, '', 0, false, '', 0, NULL, '', true, 'TODOS LOS PISOS', false, 1, false, 0, 166, 145, '1.- Se debe dejar el espacio para que el cliente le coloque por su cuenta el espejo recto.', 'A');
INSERT INTO budget VALUES (4, 4, 4, '2013-03-22 14:09:00', 'J', '333333', 'DISTRIBUIDORA OLRUCA, C.A.', 'HOTEL ORINOCO (VENETUR)', 3, 'Mauricio Moretti', 'PUERTO ORDAZ', 'PUERTO ORDAZ', 'ninguno', 'ninguno@ninguno.com', 'ALFREDO MORALES', false, false, false, 5, 7, 2, 19, 2, '1:01', 23, 174, NULL, 31, 146, NULL, NULL, NULL, 52, 8, 25.649999999999999, 5.0499999999999998, 0, 3, 0, 149, false, ' ', 162, NULL, NULL, NULL, 73, NULL, 0, 86, 89, NULL, '', 101, 98, 102, 107, 'PARED', NULL, NULL, true, false, true, false, false, false, false, true, ' ', true, 'S, PB, 2, 3, 4, 5,6, 7', 8, false, '', 0, false, '', 0, 139, 'Resto de los pisos', true, 'PB, 7', true, 8, false, 0, 166, NULL, '0.- Ascensor no para en nivel 1. 1.- POZO 2540 mm de ancho x 1915 mm de fondo, cada uno pozos adyacentes con viga de separación de 90 mm 2.- Cabina de 1993 mm de ancho x 1272 mm de fondo x 2214 mm de alto hasta el plafón interno 3.- Botonera de cabina debe incluir llaves y controles para Servicio de ascensorista, Reservación, fuera de servicio luz de emergencia, indicación visual y sonora de sobrecarga, alarma e intercomunicador 4.- SE CONSERVAN RIELES, MARCOS DE PUERTAS, MARCO DE CONTRAPESO Y PESAS, Y BASTIDOR DE CABINA 5.- CONSIDERAR AMORTIGUADORES HIDRAULICOS EN FOSO', 'A');
INSERT INTO budget VALUES (16, 16, 16, '2013-03-25 16:46:00', 'J', '3333333', 'JUNTA DE CONDOMINIO RES. BUENA VISTA', 'RES. BUENA VISTA', 3, 'Mauricio Moretti', 'AV. 1A, BUENA VISTA, PETARE', 'CARACAS', 'NINGUNO', 'ninguno@ninguno.com', 'RICHARD OLIVERA', false, false, false, 1, 7, 2, 16, 2, '1:01', 23, 174, NULL, NULL, 37, NULL, NULL, NULL, 48, 21, 53, 4.5999999999999996, 0, 1.6000000000000001, 0, 137, true, 'ACERO INOXIDABLE EN FRENTE Y FORMICA EN LOS LATERALES Y FONDO.', 152, NULL, 70, NULL, 73, NULL, 0, 86, 89, NULL, '', 100, 95, NULL, 107, 'PARED', NULL, NULL, true, true, false, false, true, false, false, true, ' ', false, '', 0, true, 'S,PB,2,4,6,8,10,12,14,16,18,PH', 12, true, 'S,PB,1,3,5,7,9,11,13,15,17,PH', 12, 139, 'TODOS LOS PISOS', false, '', false, 0, false, 0, NULL, 145, '- SE CONSERVAN RIELES DE CABINA Y CONTRAPESO MARCOS DE PISO, MARCO DE CONTRAPESO Y PESAS, AMORTIGUADORES Y BASTIDOR CABINA - MODIFICAR YUGO SUPERIOR CABINA Y CONTRAPESO PARA ELIMINAR POLEAS Y COLOCAR AMARRES FIJOS', 'A');
INSERT INTO budget VALUES (35, 32, 35, '2013-03-26 15:20:00', 'J', '31582857-0', 'Empresas Proasia, C.A.', 'Ventas a Terceros', 2, 'Juan C. Villaverde', 'Caracas', 'Ventas a Terceros', 'NINGUNO', 'NINGUNO@NINGUNO.COM', 'Sr. Omar Salazar', false, false, true, 6, 10, 1, 18, 1, '2:01', 26, 175, NULL, NULL, 35, NULL, NULL, NULL, 48, 3, 8, 1.2, 0, 1.7, 0, NULL, true, ' DISEÑO ESPECIAL NO ESPECIFICADO.', NULL, NULL, NULL, NULL, NULL, NULL, 0, 87, NULL, NULL, '', 100, 98, 103, 107, 'PARED', NULL, NULL, false, false, false, false, false, false, false, false, ' ', true, 'PB,1,2', 0, false, '', 0, false, '', 0, 139, 'TODOS LOS PISOS', false, '', false, 0, false, 0, NULL, 145, '- SISTEMA DE PUERTA: BATIENTE - Este monatcargas va con el winche chino de 1000 kg (2 a 1) con su control CFCONTROL sencillo con display solo en PB y mm asi como los botones dentro de la cabina en 31mm y los de pasillo…el piso debe ser en lamina estruiada', 'A');
INSERT INTO budget VALUES (40, 36, 40, '2013-03-26 15:57:00', 'J', '741258', 'Promotora CDV 54, C.A.', 'Res. Colinas del Viento II Etapa (Bqto.)', 2, 'Juan C. Villaverde', 'Entrada a Barquisimeto, autopista Andres Cimarron (bqto - yaritagua)', 'Barquisimeto', '0424 5301334', 'ninguno@ninguno.com', 'Ing. Eduardo Chang', true, true, true, 1, 7, 1, 16, 1, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 48, 5, 15, 1.1000000000000001, 0, 1.8, 0, 59, false, ' ', 153, NULL, 71, NULL, 73, NULL, 0, 84, 89, 90, ' ', 100, 95, 102, 107, ' ', NULL, NULL, true, false, false, false, false, false, false, false, ' ', true, 'S,PB,1,2,3', 5, false, '', 0, false, '', 0, 139, 'RESTO DE LOS PISOS', true, 'PB', false, 0, false, 0, NULL, 145, '1.- Se debe dejar el espacio para que el cliente le coloque por su cuenta el espejo recto.', 'A');
INSERT INTO budget VALUES (3, 3, 3, '2013-03-22 14:03:00', 'J', '222222', 'ASOCIACION CIVIL RES EL PORTAL TORRE D', 'EL PORTAL TORRE D', 4, 'Cesar Molina', 'RES EL PORTAL TORRE D CALLE FERBUS AL LADO DEL CC REGIONAL TURMERO - ARAGUA', 'TURMERO - ARAGUA', '0424 3666015', 'ninguno@ninguno.com', '  DAICYS REYES', false, false, false, 1, 7, 2, 15, 2, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 48, 13, 0, 0, 0, 0, 0, NULL, true, ' VENDEDOR NO ESPECIFICO DISEÑO', 65, NULL, NULL, NULL, 73, NULL, 0, 86, NULL, NULL, '', 100, 95, NULL, NULL, ' ', NULL, NULL, false, false, false, false, false, false, false, false, ' ', false, '', 0, true, 'PB,2,4,6,8,10,12', 7, true, 'PB,1,3,5,7,9,11', 11, 139, 'Color no especificado por el vendedor', false, '', false, 0, false, 0, NULL, NULL, '1.- MODERNIZACION ', 'A');
INSERT INTO budget VALUES (33, 31, 33, '2013-03-26 14:48:00', 'J', '123698', 'INVERSIONES ELEFANTE, C.A', 'CC LA GRANJA', 4, 'Cesar Molina', 'CARABOBO', 'CARABOBO', 'NINGUNO', 'NINGUNO@NINGUNO.COM', 'SRA MAIRY SALAZAR', false, false, false, 2, 7, 1, 16, 0, '1:01', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 52, 4, 15, 0, 0, 0, 0, 59, false, ' ', 153, NULL, 70, NULL, 73, NULL, 0, 83, NULL, NULL, '', 100, 95, NULL, NULL, ' ', NULL, NULL, true, false, false, false, false, false, false, false, ' ', true, 'PB,1,2,3', 4, false, '', 0, false, '', 0, NULL, '', false, '', false, 0, false, 0, NULL, NULL, '1.- MARCOS ACTUALES ACERO INOX PB Y HIERRO EN RESTO DE LOS PISOS 2.- MODERNIZACION DEJANDO MAQUINA ACTUAL (BUEN ESTADO) ', 'A');
INSERT INTO budget VALUES (39, 36, 39, '2013-03-26 15:52:00', 'J', '741258', 'Promotora CDV 54, C.A.', 'Res. Colinas del Viento II Etapa (Bqto.)', 2, 'Juan C. Villaverde', 'Entrada a Barquisimeto, autopista Andres Cimarron (bqto - yaritagua)', 'Barquisimet', '0424 5301334', 'ninguno@ninguno.com', 'Ing. Eduardo Chang', false, false, true, 1, 7, 1, 16, 1, '1:01', 23, 174, NULL, NULL, 36, NULL, NULL, NULL, 48, 4, 12, 1.1000000000000001, 0, 1.8, 0, 59, false, ' ', 153, NULL, NULL, NULL, 73, NULL, 0, 83, 89, 90, ' ', 100, 95, 102, 107, 'PARED', NULL, NULL, true, false, false, false, false, false, false, false, ' ', true, 'S,PB,1,2', 4, false, '', 0, false, '', 0, 139, 'RESTO DE LOS PISOS.', true, 'PB', true, 0, false, 0, 166, 145, '1.- SE debe dejar El espacio PARA que El Cliente le coloque por su cuenta El ESPEJO recto.', 'A');
INSERT INTO budget VALUES (31, 19, 31, '2013-03-26 12:00:00', 'J', '6666666', 'Centro de Imágenes GROW,C.A.', 'Centro de imágenes, Las Mercedes', 2, 'Juan C. Villaverde', 'Las Mercedes', 'CARACAS', 'ninguno', 'ninguno@ninguno.com', 'Arq. Oscar Diquez L.', false, false, true, 4, 7, 2, 17, 2, '2:01', 23, 174, NULL, NULL, 38, NULL, NULL, NULL, 53, 7, 26.25, 4.3499999999999996, 0, 1.7, 0, 59, true, 'PISO PREPARADO POR EL CLIENTE.', 156, NULL, 71, NULL, 76, NULL, 0, 86, 89, 90, ' ', 101, 96, 102, NULL, 'PARED', NULL, NULL, true, true, false, false, true, false, false, true, ' ', true, 'PB, MZ, 1,2,3,4,5', 7, false, '', 0, false, '', 0, 139, 'RESTO DE LOS PISOS.', true, 'PB', false, 0, false, 0, 166, NULL, '1.- INCLUIR PARACAIDAS EN CONTRAPESO 2.- POZO COMÚN : 4,35 mts ancho x 1,90 mts fondo pozo individual 2,10 mts de ancho x 1,90 mts fondo 3.- Dimensiones de cabina: 1,50 mts de ancho x 1,30 mts de fondo x 2,30 mts alto 4.- Iluminación de emergencia en cabina 5.- Salida de emergencia en techo de cabina', 'A');


--
-- TOC entry 1884 (class 0 OID 17459)
-- Dependencies: 145
-- Data for Name: security_group; Type: TABLE DATA; Schema: public; Owner: ascensor_admin
--

INSERT INTO security_group VALUES (1, 'SELLER', 'A');
INSERT INTO security_group VALUES (2, 'ADMIN', 'A');


--
-- TOC entry 1887 (class 0 OID 17478)
-- Dependencies: 149 1884 1886
-- Data for Name: group_user; Type: TABLE DATA; Schema: public; Owner: ascensor_admin
--

INSERT INTO group_user VALUES (1, 1);
INSERT INTO group_user VALUES (2, 1);
INSERT INTO group_user VALUES (3, 1);
INSERT INTO group_user VALUES (4, 1);
INSERT INTO group_user VALUES (5, 1);
INSERT INTO group_user VALUES (6, 1);
INSERT INTO group_user VALUES (7, 1);
INSERT INTO group_user VALUES (8, 2);


--
-- TOC entry 1883 (class 0 OID 17451)
-- Dependencies: 143
-- Data for Name: security_role; Type: TABLE DATA; Schema: public; Owner: ascensor_admin
--

INSERT INTO security_role VALUES (1, 'ROLE_USER', 'A');
INSERT INTO security_role VALUES (2, 'ROLE_SECURITY_PROFILE', 'A');
INSERT INTO security_role VALUES (3, 'ROLE_SECURITY_GROUPS', 'A');
INSERT INTO security_role VALUES (4, 'ROLE_BUDGET', 'A');
INSERT INTO security_role VALUES (5, 'ROLE_MENU', 'A');
INSERT INTO security_role VALUES (6, 'ROLE_REPORT', 'A');
INSERT INTO security_role VALUES (7, 'ROLE_WINDOW_BUDGETS', 'A');
INSERT INTO security_role VALUES (8, 'ROLE_SECURITY_USERS_MASTER', 'A');


--
-- TOC entry 1885 (class 0 OID 17465)
-- Dependencies: 146 1883 1884
-- Data for Name: role_group; Type: TABLE DATA; Schema: public; Owner: ascensor_admin
--

INSERT INTO role_group VALUES (1, 1);
INSERT INTO role_group VALUES (2, 1);
INSERT INTO role_group VALUES (1, 2);
INSERT INTO role_group VALUES (2, 2);
INSERT INTO role_group VALUES (2, 3);
INSERT INTO role_group VALUES (1, 4);
INSERT INTO role_group VALUES (2, 4);
INSERT INTO role_group VALUES (1, 5);
INSERT INTO role_group VALUES (2, 5);
INSERT INTO role_group VALUES (1, 6);
INSERT INTO role_group VALUES (2, 6);
INSERT INTO role_group VALUES (1, 7);
INSERT INTO role_group VALUES (2, 7);
INSERT INTO role_group VALUES (2, 8);


-- Completed on 2013-04-01 09:20:42

--
-- PostgreSQL database dump complete
--

