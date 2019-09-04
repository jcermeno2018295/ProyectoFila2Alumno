/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.alumnoscrum.sistema;

import java.util.Scanner;
import org.alumnoscrum.dominio.Alumno;
import org.alumnoscrum.dao.AlumnoJpaController;
import org.alumnoscrum.dao.exceptions.NonexistentEntityException;

/**
 *
 * @author programacion
 */
public class Principal {
     private static Scanner sc = new Scanner(System.in);
    private static Scanner salumno = new Scanner(System.in);
    private static Alumno a; 
    private static AlumnoJpaController alumnoDao = new AlumnoJpaController();
    private static int op, id;
    
    public static void main(String[] args) {
        System.out.println("----Menu De Opciones-------------------");
        System.out.println("---------------------------------------");
        System.out.println("---- 1. Mostrar Alumno por ID Alumno---"); 
        System.out.println("---- 2. Agregar Alumno al SGBD --------");
        System.out.println("---- 3. Actualizar una Resgistro ------");
        System.out.println("---- 4. Eliminar una Registro ---------");
        System.out.println("---- 5. Listar Alumnos ----------------");
        System.out.println("---- 6. Salir del menu ----------------");
        System.out.println("---------------------------------------");
        System.out.println("---- Elija una Opcion------------------");
        op = sc.nextInt();
        
        switch (op) {
            case 1: 
                a= obtenerAlumno();
                System.out.println(a);        
                
                break;
                
            case 2:
                a = getAlumno();
                if(alumnoDao.agregarAlumno(a)){
                    System.out.println("se agrego al alumno con exito");
                }else
                    System.out.println("no se logro guardar al alumno");
                break;
                
            case 3:
            a = obtenerAlumno();
            System.out.println(a);
            System.out.println("Ingrese los datos nuevos");
            a = new Alumno(id, salumno.nextLine(), salumno.nextLine(),salumno.nextLine(),salumno.nextLine(),salumno.nextLine(),salumno.nextLine());

            try {
                alumnoDao.editarAlumno(a);
                System.out.println("Registro actualizado correctamente");
            } catch (Exception ex) {
                System.out.println("No se puede actualizar el registro");
            }
            break;
            
            case 4:
                a = obtenerAlumno();
                System.out.println("¿Esta seguro de eliminar al siguiente alumno?");
                System.out.println(a);
            
                try {
                    alumnoDao.eliminarAlumno(id);
                    System.out.println("Registro eliminado correctamente");
                } catch (NonexistentEntityException ex) {
                    System.out.println("No se puede eliminar el registro");
                }
                break;
            default:
                System.out.println("no es una opcion del menu...");
        }
    }
    
    public static Alumno obtenerAlumno(){
        System.out.println("Ingrese el codigo de el alumno");
        id = sc.nextInt();
        a = alumnoDao.buscarAlumno(id);
        return a;
    }
    
    private static Alumno getAlumno(){
        System.out.println("Ingrese el codigo, carnet, nombres, apellidos, edad, carrera, seccion del alumno");
        Alumno a = new Alumno(sc.nextInt(),salumno.nextLine(),salumno.nextLine(),salumno.nextLine(),salumno.nextLine(),salumno.nextLine(),salumno.nextLine());
        return a;
    }
}
