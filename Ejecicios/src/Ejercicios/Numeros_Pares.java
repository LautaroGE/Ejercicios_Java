package Ejercicios;
import java.util.*;

public class Numeros_Pares {

	public static void main(String[] args) {

		//Escribe un programa que le pida al usuario un número y luego imprima en la consola 
		//todos los números pares del 0 hasta ese número.
		
		Scanner peticion = new Scanner(System.in);
		System.out.println("Escriba un numero, por favor: ");
		int numero = peticion.nextInt();
		
		System.out.print("Los numeros pares desde el 0 hasta el numero elegido son: ");
		for (int a=0;a<=numero;a++) {
			
			if (a%2==0) {
				
				System.out.print(a + ", ");
				
			}
			
		}
		
		
		
	}

}
