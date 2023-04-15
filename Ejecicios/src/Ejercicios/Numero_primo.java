package Ejercicios;
import java.util.*;


public class Numero_primo {

	public static void main(String[] args) {
		/*Escribe un programa que solicite al usuario ingresar un número entero y 
		luego determine si dicho número es primo o no. Si es primo, muestra un mensaje indicando que es 
		primo, de lo contrario, muestra un mensaje indicando que no es primo.*/

		Scanner input = new Scanner (System.in);
		System.out.println("Ingrese un numero entero");
		int a = input.nextInt();
		
		if (a==2 || a==3) {
			
			System.out.println(a + " Es primo");
			
		} else if (a<=1) {
			
			System.out.println(a + " No es primo");
			
			
		} else if (a%2==0 || a%3==0 ) {
			
			System.out.println(a +" No es primo");
			
		} else {
			
			int i = 5;
			
				while (i<=a) {
				
					if (i%2==0 || i+2%2==0) {
						
						System.out.println(a + " No es primo");
						
					} else {
						
						System.out.println(a + " Es primo");
						break;
						
					}
				
				}
			
			
		}
		
		
		
		
	}

}
