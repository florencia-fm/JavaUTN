CREATE DATABASE qatar2022;

CREATE TABLE Departamentos (
DepartamentoID varchar(4) NOT NULL, 
Nombre varchar(45) NOT NULL, 
Presupuesto double(9, 2), 
PRIMARY KEY (DepartamentoID)
);

INSERT INTO Departamentos VALUES ("D001", "Logística", "970000.00");
INSERT INTO Departamentos VALUES ("D002", "Compras", "1970000.00");
INSERT INTO Departamentos VALUES ("D003", "Legales", "250000.00");

CREATE TABLE Empleados (
EmpleadoID varchar(4) NOT NULL PRIMARY KEY, 
Nombre varchar(255) NOT NULL, 
Apellido varchar(255) NOT NULL, 
DNI int NOT NULL, 
Nacionalidad varchar(45), 
DepartamentoID varchar(4),
FOREIGN KEY (DepartamentoID) REFERENCES Departamentos(DepartamentoID)
);

INSERT INTO Empleados VALUES ("E001", "Juan", "Perez", "34567890", "Argentina", "D002");
INSERT INTO Empleados VALUES ("E002", "Pepe", "Argento", "24567890", "Argentina", "D001");
INSERT INTO Empleados VALUES ("E003", "Ana", "Martinez", "14567890", "Argentina", "D003");
INSERT INTO Empleados VALUES ("E004", "Fernanda", "Garcia", "25567890", "Argentina", "D001");

UPDATE Empleados
SET Nacionalidad = "Estadounidense"
WHERE EmpleadoID = "E003";

DELETE FROM Departamentos 
WHERE DepartamentoID = "D003";

SELECT Empleados.EmpleadoID, Empleados.Nombre, Empleados.Apellido, Departamentos.Nombre as Departamento
FROM Empleados
INNER JOIN Departamentos
ON Empleados.DepartamentoID = Departamentos.DepartamentoID
WHERE Departamentos.DepartamentoID = "D001";

SELECT * FROM [Departamentos]
