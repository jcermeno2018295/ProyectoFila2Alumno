/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.alumnoscrum.sistema;

import java.util.Scanner;
import org.alumnoscrum.dominio.Alumno;
import org.alumnoscrum.dao.AlumnoJpaController;

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
    }
}
