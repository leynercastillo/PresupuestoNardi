--
-- PostgreSQL database dump
--

-- Dumped from database version 9.0.12
-- Dumped by pg_dump version 9.0.12
-- Started on 2013-04-04 08:26:03

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = off;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET escape_string_warning = off;

--
-- TOC entry 488 (class 2612 OID 11574)
-- Name: plpgsql; Type: PROCEDURAL LANGUAGE; Schema: -; Owner: postgres
--

CREATE OR REPLACE PROCEDURAL LANGUAGE plpgsql;


ALTER PROCEDURAL LANGUAGE plpgsql OWNER TO postgres;

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 151 (class 1259 OID 16422)
-- Dependencies: 5
-- Name: basic_data; Type: TABLE; Schema: public; Owner: ascensor_admin; Tablespace: 
--

CREATE TABLE basic_data (
    id_basic integer NOT NULL,
    data_base_name character varying(50) NOT NULL,
    name character varying(150) NOT NULL,
    field character varying(300) NOT NULL,
    editable boolean NOT NULL,
    priority integer NOT NULL,
    imageurl character varying(150),
    status character(1) NOT NULL,
    parent_id_basic integer
);


ALTER TABLE public.basic_data OWNER TO ascensor_admin;

--
-- TOC entry 150 (class 1259 OID 16420)
-- Dependencies: 5 151
-- Name: basic_data_idbasic_seq; Type: SEQUENCE; Schema: public; Owner: ascensor_admin
--

CREATE SEQUENCE basic_data_idbasic_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.basic_data_idbasic_seq OWNER TO ascensor_admin;

--
-- TOC entry 1889 (class 0 OID 0)
-- Dependencies: 150
-- Name: basic_data_idbasic_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: ascensor_admin
--

ALTER SEQUENCE basic_data_idbasic_seq OWNED BY basic_data.id_basic;


--
-- TOC entry 156 (class 1259 OID 16443)
-- Dependencies: 5
-- Name: budget; Type: TABLE; Schema: public; Owner: ascensor_admin; Tablespace: 
--

CREATE TABLE budget (
    id_budget integer NOT NULL,
    id_business_partner integer NOT NULL,
    number integer NOT NULL,
    date timestamp without time zone NOT NULL,
    rif_type character(1) NOT NULL,
    rif_partner character varying(15) NOT NULL,
    partner_name character varying(100) NOT NULL,
    construction character varying(100) NOT NULL,
    id_security_user integer NOT NULL,
    seller character varying(100) NOT NULL,
    construction_address character varying(200) NOT NULL,
    construction_city character varying(100) NOT NULL,
    contact_phone character varying(15) NOT NULL,
    email character varying(100) NOT NULL,
    contact_name character varying(100) NOT NULL,
    plane_p boolean,
    plane_c boolean,
    type boolean NOT NULL,
    building_type integer,
    elevator_type integer,
    elevator_quantity integer,
    elevator_capacitance integer,
    motor_quantity integer,
    motor_traction character varying(10),
    machine_type integer,
    machine_base integer,
    access integer,
    electricity_type integer,
    speed integer,
    frequency integer,
    voltage_lighting integer,
    hour_machine integer,
    maneuver_type integer,
    stop_number integer,
    tour double precision,
    on_tour double precision,
    width_hole double precision,
    fossa double precision,
    bottom_hole double precision,
    cabin_design integer,
    design_special boolean,
    design_special_comment character varying(300),
    roof_type integer,
    button_type integer,
    railing integer,
    mirror integer,
    floor_type integer,
    fan integer,
    door_of_number integer,
    door_type integer,
    door_system integer,
    doorframe_type integer,
    doorframe_type_comment character varying(200),
    height integer,
    free_admission integer,
    control_type integer,
    booth_button integer,
    hall_button_place character varying(100),
    booth_display integer,
    floor_display integer,
    light_curtain boolean,
    load_limiter boolean,
    speech_synthesizer boolean,
    gom_system boolean,
    intercom boolean,
    phone boolean,
    access_sytem boolean,
    firefighter_keychain boolean,
    display_place_floor character varying(50),
    stop_sequence_continuous boolean,
    stop_sequence_continuous_q character varying(50),
    stop_sequence_continuous_number integer,
    stop_sequence_even boolean,
    stop_sequence_even_q character varying(50),
    stop_sequence_even_number integer,
    stop_sequence_odd boolean,
    stop_sequence_odd_q character varying(50),
    stop_sequence_odd_number integer,
    door_frame_hammered integer,
    door_frame_hammered_desc character varying(100),
    door_frame_stainless boolean,
    door_frame_stainless_descrip character varying(50),
    sistel_wdisplay_pb boolean,
    sistel_wdisplay_floor integer,
    sistel_warrow_pb boolean,
    sistel_warrow_floor integer,
    hall_button_type integer,
    hall_button integer,
    comment character varying(700),
    status character(1) NOT NULL
);


ALTER TABLE public.budget OWNER TO ascensor_admin;

--
-- TOC entry 154 (class 1259 OID 16439)
-- Dependencies: 156 5
-- Name: budget_id_budget_seq; Type: SEQUENCE; Schema: public; Owner: ascensor_admin
--

CREATE SEQUENCE budget_id_budget_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.budget_id_budget_seq OWNER TO ascensor_admin;

--
-- TOC entry 1890 (class 0 OID 0)
-- Dependencies: 154
-- Name: budget_id_budget_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: ascensor_admin
--

ALTER SEQUENCE budget_id_budget_seq OWNED BY budget.id_budget;


--
-- TOC entry 155 (class 1259 OID 16441)
-- Dependencies: 156 5
-- Name: budget_number_seq; Type: SEQUENCE; Schema: public; Owner: ascensor_admin
--

CREATE SEQUENCE budget_number_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.budget_number_seq OWNER TO ascensor_admin;

--
-- TOC entry 1891 (class 0 OID 0)
-- Dependencies: 155
-- Name: budget_number_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: ascensor_admin
--

ALTER SEQUENCE budget_number_seq OWNED BY budget.number;


--
-- TOC entry 153 (class 1259 OID 16433)
-- Dependencies: 5
-- Name: business_partner; Type: TABLE; Schema: public; Owner: ascensor_admin; Tablespace: 
--

CREATE TABLE business_partner (
    id_business_partner integer NOT NULL,
    rif character varying(15) NOT NULL,
    rif_type integer NOT NULL,
    name character varying(100) NOT NULL,
    address character varying(200),
    status character(1) NOT NULL
);


ALTER TABLE public.business_partner OWNER TO ascensor_admin;

--
-- TOC entry 152 (class 1259 OID 16431)
-- Dependencies: 153 5
-- Name: business_partner_id_business_partner_seq; Type: SEQUENCE; Schema: public; Owner: ascensor_admin
--

CREATE SEQUENCE business_partner_id_business_partner_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.business_partner_id_business_partner_seq OWNER TO ascensor_admin;

--
-- TOC entry 1892 (class 0 OID 0)
-- Dependencies: 152
-- Name: business_partner_id_business_partner_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: ascensor_admin
--

ALTER SEQUENCE business_partner_id_business_partner_seq OWNED BY business_partner.id_business_partner;


--
-- TOC entry 149 (class 1259 OID 16415)
-- Dependencies: 5
-- Name: group_user; Type: TABLE; Schema: public; Owner: ascensor_admin; Tablespace: 
--

CREATE TABLE group_user (
    id_security_user integer NOT NULL,
    id_security_group integer NOT NULL
);


ALTER TABLE public.group_user OWNER TO ascensor_admin;

--
-- TOC entry 146 (class 1259 OID 16402)
-- Dependencies: 5
-- Name: role_group; Type: TABLE; Schema: public; Owner: ascensor_admin; Tablespace: 
--

CREATE TABLE role_group (
    id_security_group integer NOT NULL,
    id_security_role integer NOT NULL
);


ALTER TABLE public.role_group OWNER TO ascensor_admin;

--
-- TOC entry 145 (class 1259 OID 16396)
-- Dependencies: 5
-- Name: security_group; Type: TABLE; Schema: public; Owner: ascensor_admin; Tablespace: 
--

CREATE TABLE security_group (
    id_security_group integer NOT NULL,
    name character varying(40) NOT NULL,
    status character(1) NOT NULL
);


ALTER TABLE public.security_group OWNER TO ascensor_admin;

--
-- TOC entry 144 (class 1259 OID 16394)
-- Dependencies: 5 145
-- Name: security_group_id_security_group_seq; Type: SEQUENCE; Schema: public; Owner: ascensor_admin
--

CREATE SEQUENCE security_group_id_security_group_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.security_group_id_security_group_seq OWNER TO ascensor_admin;

--
-- TOC entry 1893 (class 0 OID 0)
-- Dependencies: 144
-- Name: security_group_id_security_group_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: ascensor_admin
--

ALTER SEQUENCE security_group_id_security_group_seq OWNED BY security_group.id_security_group;


--
-- TOC entry 143 (class 1259 OID 16388)
-- Dependencies: 5
-- Name: security_role; Type: TABLE; Schema: public; Owner: ascensor_admin; Tablespace: 
--

CREATE TABLE security_role (
    id_security_role integer NOT NULL,
    name character varying(40) NOT NULL,
    status character(1) NOT NULL
);


ALTER TABLE public.security_role OWNER TO ascensor_admin;

--
-- TOC entry 142 (class 1259 OID 16386)
-- Dependencies: 143 5
-- Name: security_role_id_security_role_seq; Type: SEQUENCE; Schema: public; Owner: ascensor_admin
--

CREATE SEQUENCE security_role_id_security_role_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.security_role_id_security_role_seq OWNER TO ascensor_admin;

--
-- TOC entry 1894 (class 0 OID 0)
-- Dependencies: 142
-- Name: security_role_id_security_role_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: ascensor_admin
--

ALTER SEQUENCE security_role_id_security_role_seq OWNED BY security_role.id_security_role;


--
-- TOC entry 148 (class 1259 OID 16409)
-- Dependencies: 5
-- Name: security_user; Type: TABLE; Schema: public; Owner: ascensor_admin; Tablespace: 
--

CREATE TABLE security_user (
    id_security_user integer NOT NULL,
    name character varying(40) NOT NULL,
    email character varying(100) NOT NULL,
    password character varying(100) NOT NULL,
    phone character varying(20) NOT NULL,
    status character(1) NOT NULL
);


ALTER TABLE public.security_user OWNER TO ascensor_admin;

--
-- TOC entry 147 (class 1259 OID 16407)
-- Dependencies: 148 5
-- Name: security_user_id_security_user_seq; Type: SEQUENCE; Schema: public; Owner: ascensor_admin
--

CREATE SEQUENCE security_user_id_security_user_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.security_user_id_security_user_seq OWNER TO ascensor_admin;

--
-- TOC entry 1895 (class 0 OID 0)
-- Dependencies: 147
-- Name: security_user_id_security_user_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: ascensor_admin
--

ALTER SEQUENCE security_user_id_security_user_seq OWNED BY security_user.id_security_user;


--
-- TOC entry 1825 (class 2604 OID 16425)
-- Dependencies: 151 150 151
-- Name: id_basic; Type: DEFAULT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY basic_data ALTER COLUMN id_basic SET DEFAULT nextval('basic_data_idbasic_seq'::regclass);


--
-- TOC entry 1827 (class 2604 OID 16446)
-- Dependencies: 154 156 156
-- Name: id_budget; Type: DEFAULT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget ALTER COLUMN id_budget SET DEFAULT nextval('budget_id_budget_seq'::regclass);


--
-- TOC entry 1828 (class 2604 OID 16447)
-- Dependencies: 155 156 156
-- Name: number; Type: DEFAULT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget ALTER COLUMN number SET DEFAULT nextval('budget_number_seq'::regclass);


--
-- TOC entry 1826 (class 2604 OID 16436)
-- Dependencies: 152 153 153
-- Name: id_business_partner; Type: DEFAULT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY business_partner ALTER COLUMN id_business_partner SET DEFAULT nextval('business_partner_id_business_partner_seq'::regclass);


--
-- TOC entry 1823 (class 2604 OID 16399)
-- Dependencies: 145 144 145
-- Name: id_security_group; Type: DEFAULT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY security_group ALTER COLUMN id_security_group SET DEFAULT nextval('security_group_id_security_group_seq'::regclass);


--
-- TOC entry 1822 (class 2604 OID 16391)
-- Dependencies: 142 143 143
-- Name: id_security_role; Type: DEFAULT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY security_role ALTER COLUMN id_security_role SET DEFAULT nextval('security_role_id_security_role_seq'::regclass);


--
-- TOC entry 1824 (class 2604 OID 16412)
-- Dependencies: 148 147 148
-- Name: id_security_user; Type: DEFAULT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY security_user ALTER COLUMN id_security_user SET DEFAULT nextval('security_user_id_security_user_seq'::regclass);


--
-- TOC entry 1840 (class 2606 OID 16430)
-- Dependencies: 151 151
-- Name: id_basic_data; Type: CONSTRAINT; Schema: public; Owner: ascensor_admin; Tablespace: 
--

ALTER TABLE ONLY basic_data
    ADD CONSTRAINT id_basic_data PRIMARY KEY (id_basic);


--
-- TOC entry 1844 (class 2606 OID 16452)
-- Dependencies: 156 156
-- Name: id_budget; Type: CONSTRAINT; Schema: public; Owner: ascensor_admin; Tablespace: 
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT id_budget PRIMARY KEY (id_budget);


--
-- TOC entry 1842 (class 2606 OID 16438)
-- Dependencies: 153 153
-- Name: id_business_partner; Type: CONSTRAINT; Schema: public; Owner: ascensor_admin; Tablespace: 
--

ALTER TABLE ONLY business_partner
    ADD CONSTRAINT id_business_partner PRIMARY KEY (id_business_partner);


--
-- TOC entry 1838 (class 2606 OID 16419)
-- Dependencies: 149 149 149
-- Name: id_group_user; Type: CONSTRAINT; Schema: public; Owner: ascensor_admin; Tablespace: 
--

ALTER TABLE ONLY group_user
    ADD CONSTRAINT id_group_user PRIMARY KEY (id_security_user, id_security_group);


--
-- TOC entry 1834 (class 2606 OID 16406)
-- Dependencies: 146 146 146
-- Name: id_role_group; Type: CONSTRAINT; Schema: public; Owner: ascensor_admin; Tablespace: 
--

ALTER TABLE ONLY role_group
    ADD CONSTRAINT id_role_group PRIMARY KEY (id_security_group, id_security_role);


--
-- TOC entry 1832 (class 2606 OID 16401)
-- Dependencies: 145 145
-- Name: id_security_group; Type: CONSTRAINT; Schema: public; Owner: ascensor_admin; Tablespace: 
--

ALTER TABLE ONLY security_group
    ADD CONSTRAINT id_security_group PRIMARY KEY (id_security_group);


--
-- TOC entry 1830 (class 2606 OID 16393)
-- Dependencies: 143 143
-- Name: id_security_role; Type: CONSTRAINT; Schema: public; Owner: ascensor_admin; Tablespace: 
--

ALTER TABLE ONLY security_role
    ADD CONSTRAINT id_security_role PRIMARY KEY (id_security_role);


--
-- TOC entry 1836 (class 2606 OID 16414)
-- Dependencies: 148 148
-- Name: id_security_user; Type: CONSTRAINT; Schema: public; Owner: ascensor_admin; Tablespace: 
--

ALTER TABLE ONLY security_user
    ADD CONSTRAINT id_security_user PRIMARY KEY (id_security_user);


--
-- TOC entry 1882 (class 2606 OID 16638)
-- Dependencies: 151 156 1839
-- Name: basic_data_budget_fk; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basic_data_budget_fk FOREIGN KEY (machine_base) REFERENCES basic_data(id_basic);


--
-- TOC entry 1850 (class 2606 OID 16633)
-- Dependencies: 1839 153 151
-- Name: basic_data_business_partner_fk; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY business_partner
    ADD CONSTRAINT basic_data_business_partner_fk FOREIGN KEY (rif_type) REFERENCES basic_data(id_basic);


--
-- TOC entry 1849 (class 2606 OID 16613)
-- Dependencies: 1839 151 151
-- Name: basicdata_basicdata_fk; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY basic_data
    ADD CONSTRAINT basicdata_basicdata_fk FOREIGN KEY (parent_id_basic) REFERENCES basic_data(id_basic);


--
-- TOC entry 1858 (class 2606 OID 16508)
-- Dependencies: 156 1839 151
-- Name: basicdata_budget_fk; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk FOREIGN KEY (speed) REFERENCES basic_data(id_basic);


--
-- TOC entry 1852 (class 2606 OID 16478)
-- Dependencies: 156 151 1839
-- Name: basicdata_budget_fk1; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk1 FOREIGN KEY (building_type) REFERENCES basic_data(id_basic);


--
-- TOC entry 1861 (class 2606 OID 16523)
-- Dependencies: 1839 156 151
-- Name: basicdata_budget_fk10; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk10 FOREIGN KEY (hour_machine) REFERENCES basic_data(id_basic);


--
-- TOC entry 1881 (class 2606 OID 16628)
-- Dependencies: 1839 151 156
-- Name: basicdata_budget_fk11; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk11 FOREIGN KEY (hall_button) REFERENCES basic_data(id_basic);


--
-- TOC entry 1862 (class 2606 OID 16528)
-- Dependencies: 156 151 1839
-- Name: basicdata_budget_fk12; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk12 FOREIGN KEY (maneuver_type) REFERENCES basic_data(id_basic);


--
-- TOC entry 1863 (class 2606 OID 16533)
-- Dependencies: 156 1839 151
-- Name: basicdata_budget_fk13; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk13 FOREIGN KEY (cabin_design) REFERENCES basic_data(id_basic);


--
-- TOC entry 1880 (class 2606 OID 16623)
-- Dependencies: 1839 156 151
-- Name: basicdata_budget_fk14; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk14 FOREIGN KEY (hall_button_type) REFERENCES basic_data(id_basic);


--
-- TOC entry 1864 (class 2606 OID 16538)
-- Dependencies: 156 1839 151
-- Name: basicdata_budget_fk15; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk15 FOREIGN KEY (roof_type) REFERENCES basic_data(id_basic);


--
-- TOC entry 1865 (class 2606 OID 16543)
-- Dependencies: 1839 151 156
-- Name: basicdata_budget_fk16; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk16 FOREIGN KEY (button_type) REFERENCES basic_data(id_basic);


--
-- TOC entry 1866 (class 2606 OID 16548)
-- Dependencies: 151 1839 156
-- Name: basicdata_budget_fk17; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk17 FOREIGN KEY (railing) REFERENCES basic_data(id_basic);


--
-- TOC entry 1867 (class 2606 OID 16553)
-- Dependencies: 156 1839 151
-- Name: basicdata_budget_fk18; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk18 FOREIGN KEY (mirror) REFERENCES basic_data(id_basic);


--
-- TOC entry 1868 (class 2606 OID 16558)
-- Dependencies: 156 1839 151
-- Name: basicdata_budget_fk19; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk19 FOREIGN KEY (floor_type) REFERENCES basic_data(id_basic);


--
-- TOC entry 1853 (class 2606 OID 16483)
-- Dependencies: 151 1839 156
-- Name: basicdata_budget_fk2; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk2 FOREIGN KEY (elevator_type) REFERENCES basic_data(id_basic);


--
-- TOC entry 1869 (class 2606 OID 16563)
-- Dependencies: 151 1839 156
-- Name: basicdata_budget_fk20; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk20 FOREIGN KEY (fan) REFERENCES basic_data(id_basic);


--
-- TOC entry 1870 (class 2606 OID 16568)
-- Dependencies: 156 1839 151
-- Name: basicdata_budget_fk21; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk21 FOREIGN KEY (door_type) REFERENCES basic_data(id_basic);


--
-- TOC entry 1871 (class 2606 OID 16573)
-- Dependencies: 156 1839 151
-- Name: basicdata_budget_fk22; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk22 FOREIGN KEY (door_system) REFERENCES basic_data(id_basic);


--
-- TOC entry 1872 (class 2606 OID 16578)
-- Dependencies: 1839 151 156
-- Name: basicdata_budget_fk23; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk23 FOREIGN KEY (doorframe_type) REFERENCES basic_data(id_basic);


--
-- TOC entry 1873 (class 2606 OID 16583)
-- Dependencies: 1839 151 156
-- Name: basicdata_budget_fk24; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk24 FOREIGN KEY (control_type) REFERENCES basic_data(id_basic);


--
-- TOC entry 1874 (class 2606 OID 16588)
-- Dependencies: 1839 151 156
-- Name: basicdata_budget_fk25; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk25 FOREIGN KEY (booth_button) REFERENCES basic_data(id_basic);


--
-- TOC entry 1875 (class 2606 OID 16593)
-- Dependencies: 151 1839 156
-- Name: basicdata_budget_fk26; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk26 FOREIGN KEY (booth_display) REFERENCES basic_data(id_basic);


--
-- TOC entry 1876 (class 2606 OID 16598)
-- Dependencies: 1839 151 156
-- Name: basicdata_budget_fk27; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk27 FOREIGN KEY (floor_display) REFERENCES basic_data(id_basic);


--
-- TOC entry 1854 (class 2606 OID 16488)
-- Dependencies: 156 151 1839
-- Name: basicdata_budget_fk3; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk3 FOREIGN KEY (elevator_capacitance) REFERENCES basic_data(id_basic);


--
-- TOC entry 1877 (class 2606 OID 16603)
-- Dependencies: 1839 156 151
-- Name: basicdata_budget_fk30; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk30 FOREIGN KEY (free_admission) REFERENCES basic_data(id_basic);


--
-- TOC entry 1878 (class 2606 OID 16608)
-- Dependencies: 1839 156 151
-- Name: basicdata_budget_fk31; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk31 FOREIGN KEY (height) REFERENCES basic_data(id_basic);


--
-- TOC entry 1879 (class 2606 OID 16618)
-- Dependencies: 1839 151 156
-- Name: basicdata_budget_fk4; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk4 FOREIGN KEY (door_frame_hammered) REFERENCES basic_data(id_basic);


--
-- TOC entry 1855 (class 2606 OID 16493)
-- Dependencies: 1839 156 151
-- Name: basicdata_budget_fk5; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk5 FOREIGN KEY (machine_type) REFERENCES basic_data(id_basic);


--
-- TOC entry 1856 (class 2606 OID 16498)
-- Dependencies: 156 151 1839
-- Name: basicdata_budget_fk6; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk6 FOREIGN KEY (access) REFERENCES basic_data(id_basic);


--
-- TOC entry 1857 (class 2606 OID 16503)
-- Dependencies: 1839 156 151
-- Name: basicdata_budget_fk7; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk7 FOREIGN KEY (electricity_type) REFERENCES basic_data(id_basic);


--
-- TOC entry 1859 (class 2606 OID 16513)
-- Dependencies: 1839 156 151
-- Name: basicdata_budget_fk8; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk8 FOREIGN KEY (frequency) REFERENCES basic_data(id_basic);


--
-- TOC entry 1860 (class 2606 OID 16518)
-- Dependencies: 156 151 1839
-- Name: basicdata_budget_fk9; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT basicdata_budget_fk9 FOREIGN KEY (voltage_lighting) REFERENCES basic_data(id_basic);


--
-- TOC entry 1883 (class 2606 OID 16643)
-- Dependencies: 156 1841 153
-- Name: business_partner_budget_fk; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT business_partner_budget_fk FOREIGN KEY (id_business_partner) REFERENCES business_partner(id_business_partner);


--
-- TOC entry 1847 (class 2606 OID 16458)
-- Dependencies: 145 1831 149
-- Name: security_group_group_user_fk; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY group_user
    ADD CONSTRAINT security_group_group_user_fk FOREIGN KEY (id_security_group) REFERENCES security_group(id_security_group);


--
-- TOC entry 1846 (class 2606 OID 16463)
-- Dependencies: 145 1831 146
-- Name: security_group_role_group_fk; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY role_group
    ADD CONSTRAINT security_group_role_group_fk FOREIGN KEY (id_security_group) REFERENCES security_group(id_security_group);


--
-- TOC entry 1845 (class 2606 OID 16453)
-- Dependencies: 146 143 1829
-- Name: security_role_role_group_fk; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY role_group
    ADD CONSTRAINT security_role_role_group_fk FOREIGN KEY (id_security_role) REFERENCES security_role(id_security_role);


--
-- TOC entry 1851 (class 2606 OID 16473)
-- Dependencies: 1835 156 148
-- Name: security_user_budget_fk; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY budget
    ADD CONSTRAINT security_user_budget_fk FOREIGN KEY (id_security_user) REFERENCES security_user(id_security_user);


--
-- TOC entry 1848 (class 2606 OID 16468)
-- Dependencies: 1835 148 149
-- Name: security_user_group_user_fk; Type: FK CONSTRAINT; Schema: public; Owner: ascensor_admin
--

ALTER TABLE ONLY group_user
    ADD CONSTRAINT security_user_group_user_fk FOREIGN KEY (id_security_user) REFERENCES security_user(id_security_user);


--
-- TOC entry 1888 (class 0 OID 0)
-- Dependencies: 5
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2013-04-04 08:26:04

--
-- PostgreSQL database dump complete
--

