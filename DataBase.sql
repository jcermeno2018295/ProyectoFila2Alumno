create database DB_ScrumFila2;
use DB_ScrumFila2;

create table Alumno(
	idAlumno int auto_increment,
    carnet varchar(50),
    nombres varchar(50),
    apellidos varchar(50),
    edad varchar(50),
    carrera varchar(50),
    seccion varchar(50),
    primary key PK_idAlumno (idAlumno)
);