package Ejercicios;
import java.util.*;

public class Ingreso_datos {

	public static void main(String[] args) {
		//Escribe un programa que pida al usuario su nombre y su edad
		//y luego imprima un saludo personalizado que incluya la información proporcionada.
		
		Scanner usuario = new Scanner (System.in);
		System.out.println("Ingrese su nombre, por favor: ");
		String nombre = usuario.next();
		
		System.out.println("Ingrese su edad, por favor: ");
		int edad = usuario.nextInt();
		
		System.out.println("Bienvenido/a " + nombre + ". Su edad es de " + edad + " años.");
		
	}

}
