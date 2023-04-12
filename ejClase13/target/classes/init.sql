CREATE TABLE Departamentos (
DepartamentoID varchar(4) NOT NULL,
Nombre varchar(45) NOT NULL,
Presupuesto int,
PRIMARY KEY (DepartamentoID)
);

INSERT INTO Departamentos(DepartamentoID, Nombre, Presupuesto) VALUES
('D001', 'Logística', 970000),
('D002', 'Compras', 1970000),
('D003', 'Legales', 250000);

CREATE TABLE Empleados (
EmpleadoID varchar(4) NOT NULL PRIMARY KEY,
Nombre varchar(255) NOT NULL,
Apellido varchar(255) NOT NULL,
DNI int NOT NULL,
Nacionalidad varchar(45),
DepartamentoID varchar(4),
FOREIGN KEY (DepartamentoID) REFERENCES Departamentos(DepartamentoID)
);

INSERT INTO Empleados(EmpleadoID, Nombre, Apellido, DNI, Nacionalidad, DepartamentoID) VALUES
('E001', 'Juan', 'Perez', 34567890, 'Argentina', 'D002'),
('E002', 'Pepe', 'Argento', 24567890, 'Argentina', 'D001'),
('E003', 'Ana', 'Martinez', 14567890, 'Argentina', 'D003'),
('E004', 'Fernanda', 'Garcia', 25567890, 'Argentina', 'D001');