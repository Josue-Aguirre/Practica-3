package Registro;

import java.util.Scanner;

public class Estudiante {
	private String nombre;
	private String id;
	private String materia;
    private String estado;
    private int calificacion;
    
    public Estudiante(String id, String nombre, String materia, int calificacion)
    {
    	this.nombre=nombre;
    	this.id=id;
    	this.materia=materia;
    	this.calificacion=calificacion;
    	this.estado=this.estado1(calificacion);
    }
    
    public Estudiante() 
    {
    	this.nombre=null;
    	this.id=null;
    	this.materia=null;
    	this.calificacion = 0;
        this.estado = null;
    }
    
    public void registrar_nombre(Scanner sc)
    {
    	System.out.print("ID=");
        this.id = sc.next();
        System.out.print("Nombre=");
        this.nombre = sc.next();
        System.out.print("Materia=");
        this.materia = sc.next();
        System.out.print("Calificacion=");
        this.calificacion = sc.nextInt();
        this.registrar_estado();
    }
    
    private String estado1(int calificacion)
    {
    	return (calificacion >= 60 ? "Esta aprobado" : "Esta reprobado");
    }
    
    private String estado1()
    {
    	return estado1(this.calificacion);
    }
    
    public void registrar_estado()
    {
    	this.estado=this.estado1();
    }
    public String toString() {
        return "Estudiante="+"\n id=" + id + "\n nombre=" + nombre + "\n materia=" + materia + "\n estado=" + estado + "\n calificacion=" + calificacion;
    }
    
    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }
    
    public String getnombre() {
        return nombre;
    }
    
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getmateria() {
        return materia;
    }

    public void setmateria(String materia) {
        this.materia = materia;
    }

    public String getestado1() {
        return estado;
    }

    public void setestado1(String estado) {
        this.estado = estado;
    }

    public float getcalificacion() {
        return calificacion;
    }

    public void setcalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
