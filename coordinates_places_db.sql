-- Crear la base de datos si no existe
CREATE DATABASE coordinates_places_db;

-- Conectar a la base de datos
\c coordinates_places_db;

-- Crear la tabla de coordenadas
CREATE TABLE IF NOT EXISTS coordinates
(
    date          DATE,
    latitude      DOUBLE PRECISION,
    longitude     DOUBLE PRECISION,
    id_coordinate BIGSERIAL PRIMARY KEY
);

-- Insertar coordenadas para la Estatua de la Libertad
INSERT INTO coordinates (date, latitude, longitude)
VALUES ('2023-01-01', 40.689247, -74.044502);

-- Insertar coordenadas para el Coliseo de Roma
INSERT INTO coordinates (date, latitude, longitude)
VALUES ('2023-01-02', 41.890251, 12.492373);

-- Insertar coordenadas para la Torre Eiffel
INSERT INTO coordinates (date, latitude, longitude)
VALUES ('2023-01-03', 48.858844, 2.294350);

-- Insertar coordenadas para el Gran Cañón
INSERT INTO coordinates (date, latitude, longitude)
VALUES ('2023-01-04', 36.066670, -112.140619);

-- Insertar coordenadas para la Plaza Roja de Moscú
INSERT INTO coordinates (date, latitude, longitude)
VALUES ('2023-01-05', 55.753930, 37.620795);
