CREATE DATABASE backend;

USE backend;

CREATE TABLE IF NOT EXISTS reserva (
	id INT NOT NULL AUTO_INCREMENT,
	nome VARCHAR(100) NOT NULL,
    sexo VARCHAR(15),
    email varchar(50),
    data_chegada VARCHAR(20),
    noites INT,
    qtd_hospedes INT,	
    mensagem VARCHAR(255),
    PRIMARY KEY (id)
);

SELECT * FROM reserva;
