create database cba_fly_app;
use cba_fly_app;
CREATE TABLE aerolinea_usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre_completo VARCHAR(100),
    correo_electronico VARCHAR(100) UNIQUE,
    contraseña VARCHAR(100),
    telefono VARCHAR(20),
    pais VARCHAR(50),
    ciudad VARCHAR(50)
);
CREATE TABLE aerolinea_vuelo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    origen VARCHAR(50),
    destino VARCHAR(50),
    hora_salida DATETIME,
    hora_llegada DATETIME,
    duracion TIME
);
CREATE TABLE aerolinea_vuelos_gestionados (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT,
    vuelo_id INT,
    FOREIGN KEY (usuario_id) REFERENCES aerolinea_usuario(id),
    FOREIGN KEY (vuelo_id) REFERENCES aerolinea_vuelo(id)
);