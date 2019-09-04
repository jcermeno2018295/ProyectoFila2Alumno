package org.alumnoscrum.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author programacion
 */
@Entity
@Table(name="alumno")
public class Alumno implements Serializable {

   // private static final long serialVersionUID = 1L;
    @Id
    @Column(name="idAlumno")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int idAlumno;
    @Column
    private String carnet;
    @Column
    private String nombres;
    @Column
    private String apellidos;
    @Column
    private String edad;
    @Column
    private String carrera;
    @Column
    private String seccion;

    public Alumno() {
    }

    public Alumno(int idAlumno, String carnet, String nombres, String apellidos, String edad, String carrera, String seccion) {
        this.idAlumno = idAlumno;
        this.carnet = carnet;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.carrera = carrera;
        this.seccion = seccion;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idAlumno;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if (this.idAlumno != other.idAlumno) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", carnet=" + carnet + ", nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + ", carrera=" + carrera + ", seccion=" + seccion + '}';
    }

}