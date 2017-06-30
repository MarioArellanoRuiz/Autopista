package Model;
// Generated Jun 29, 2017 6:13:26 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cobrador generated by hbm2java
 */
public class Cobrador  implements java.io.Serializable {


     private int idNumeroEmpleado;
     private String nombre;
     private Date fechaIngreso;
     private Set certificacions = new HashSet(0);
     private Set eventos = new HashSet(0);

    public Cobrador() {
    }

	
    public Cobrador(int idNumeroEmpleado) {
        this.idNumeroEmpleado = idNumeroEmpleado;
    }
    public Cobrador(int idNumeroEmpleado, String nombre, Date fechaIngreso, Set certificacions, Set eventos) {
       this.idNumeroEmpleado = idNumeroEmpleado;
       this.nombre = nombre;
       this.fechaIngreso = fechaIngreso;
       this.certificacions = certificacions;
       this.eventos = eventos;
    }
   
    public int getIdNumeroEmpleado() {
        return this.idNumeroEmpleado;
    }
    
    public void setIdNumeroEmpleado(int idNumeroEmpleado) {
        this.idNumeroEmpleado = idNumeroEmpleado;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public Set getCertificacions() {
        return this.certificacions;
    }
    
    public void setCertificacions(Set certificacions) {
        this.certificacions = certificacions;
    }
    public Set getEventos() {
        return this.eventos;
    }
    
    public void setEventos(Set eventos) {
        this.eventos = eventos;
    }




}

