CREATE DATABASE hw_byKarpov;
USE hw_byKarpov;

CREATE TABLE Patients				
(
id			INT AUTO_INCREMENT,
name		VARCHAR(50) NOT NULL,
surname		VARCHAR(50) NOT NULL,
address		VARCHAR(50) NOT NULL,
sex			VARCHAR(30) NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE Doctors					
(
doctor_id			INT AUTO_INCREMENT,
name				VARCHAR(50) NOT NULL,
surname				VARCHAR(50) NOT NULL,
address				VARCHAR(50) NOT NULL,
sex					VARCHAR(30) NOT NULL,
specialty			VARCHAR(50) NOT NULL,
work_experience 	INT NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE Insurance
(
id						INT AUTO_INCREMENT,
date_from				DATE NOT NULL,
date_to					DATE NOT NULL,
patient_id				INT NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(patient_id) REFERENCES patients(id)
);

CREATE TABLE Visits
(
id						INT AUTO_INCREMENT,
date					DATETIME,
doctor_id				INT NOT NULL,
patient_id				INT NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(patient_id) REFERENCES patients(id),
FOREIGN KEY(doctor_id) REFERENCES doctors(id)
);

