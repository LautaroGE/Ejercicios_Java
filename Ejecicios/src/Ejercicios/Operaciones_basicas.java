package Ejercicios;
import java.util.*;

public class Operaciones_basicas {

	public static void main(String[] args) {
		// Escribe un programa que le pida al usuario dos números y luego imprima en la consola el 
		//resultado de la suma, resta, multiplicación y división de esos números...

		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese un numero.");
		int a = input.nextInt();
		
		System.out.println("El primer numero es: " + a);
		
		System.out.println("Ingrese otro numero.");
		int b = input.nextInt();
		
		System.out.println("El segundo numero es: " + b);
	
		
		int suma = a + b;
		int resta = a - b;
		int mult = a * b;
		double div = (double) a / b;
		
		
		System.out.println("La suma entre " + a + " y " + b + " es: " + suma);
		System.out.println("La resta entre " + a + " y " + b + " es: " + resta);
		System.out.println("La multiplicacion entre " + a + " y " + b + " es: " + mult);
		System.out.printf("La division entre " + a + " y " + b + " es: " + "%.2f", div);
		
		
		
		
		
		
	}

}
