# Taller JPA-EJB
# Desarrollado por: Fabio Camilo López Castellanos

-------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------
1- se crean las tablas en la db sample (por defecto en derby)
2- se agrega las librerias de jersey en ~\TallerJPA\CarrosPartes-war\web\WEB-INF\jersey-bundle-1.19.1.jar
3- se adiciona un servicio rest en ~\TallerJPA\CarrosPartes-war\src\java\carrospartes\servicios\ServicioRest.java
4- se adiciona la inyeccion de dependencias con la anotación @EJB dentro del servicio rest
5- se crea la peticion request consultaPropietariosJSON y consultaCarrosJSON

URL de pruebas : http://localhost:8080/CarrosPartes-war/serviciorest/consultaPropietariosJSON

-------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------


# Scrip usado para generar la DB


Create Table PARTES (
CODIGO  varchar (6) NOT NULL PRIMARY KEY,
NOMBRE  varchar (50),
DESCRIPCION varchar (100)
);

Create Table CARROS (
PLACA  varchar (6) NOT NULL PRIMARY KEY,
MARCA  varchar (20),
MODELO varchar (50),
COLOR  varchar (50)
);

Create Table CARROS_PARTES (
PLACA_CARRO  varchar (6) NOT NULL,
CODIGO_PARTE  varchar (6) NOT NULL,
PRIMARY KEY(PLACA_CARRO,CODIGO_PARTE),
CANTIDAD Integer
);

Create Table PROPIETARIO(
IDENTIFICACION  INTEGER NOT NULL PRIMARY KEY,
NOMBRE  varchar (50),
DIRECCION varchar (20),
CIUDAD varchar (20)
);

Create Table PROPIETARIO_CARROS(
ID_PROPIETARIO  varchar (6) NOT NULL,
PLACA_CARRO  varchar (6) NOT NULL,
PRIMARY KEY(ID_PROPIETARIO,PLACA_CARRO)
);


# Relaciones entre entidades

ALTER TABLE CARROS_PARTES ADD CONSTRAINT PLACA_FK
Foreign Key (PLACA_CARRO) REFERENCES CARROS (PLACA);

ALTER TABLE CARROS_PARTES ADD CONSTRAINT CODIGO_FK
Foreign Key (CODIGO_PARTE) REFERENCES PARTES (CODIGO);

ALTER TABLE PROPIETARIO_CARROS ADD CONSTRAINT ID_PROPIETARIO_FK
Foreign Key (ID_PROPIETARIO) REFERENCES PROPIETARIO (IDENTIFICACION);

ALTER TABLE PROPIETARIO_CARROS ADD CONSTRAINT CPLACA_CARRO_FK
Foreign Key (PLACA_CARRO) REFERENCES CARROS (PLACA);
