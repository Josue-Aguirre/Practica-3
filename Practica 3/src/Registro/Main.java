package Registro;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		Vector<Estudiante> nuevo_estudiante = new Vector<>();
		Estudiante captura = new Estudiante();
        Scanner sc = new Scanner(System.in);
        int opcion=' ';
        nuevo_estudiante.add(new Estudiante("0", "Abraham", "Calculo", 80));
        nuevo_estudiante.add(new Estudiante("1", "Miguel", "Geografia", 70));
        nuevo_estudiante.add(new Estudiante("2", "Brandon", "Historia", 50));
        nuevo_estudiante.add(new Estudiante("3", "Eduardo", "Algebra", 60));
        nuevo_estudiante.add(new Estudiante("4", "Alfredo", "Circuitos Digitales", 96));
        do 
        {
            System.out.println("Menu\nx) Capturar Alumnos \ny) Mostrar Alumnos \nz) Salir ");
            opcion=sc.next().charAt(0);
            	switch(opcion)
	            {
	            	case 'x':
	            		captura.registrar_nombre(sc);
	            		nuevo_estudiante.add(captura);
	            		break;
	            	case 'y':
	            		nuevo_estudiante.forEach((x) -> 
	            		{
	            		System.out.println(x.toString());
	            		});
	            		break;
	            	case 'z':
	            		System.out.println("¡¡¡Gracias por utilizar este programa!!!");
	            		break;
	            	default:
	            		break;
	            }
           }while(opcion!='z');

	}
}