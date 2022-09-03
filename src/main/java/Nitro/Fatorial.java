package Nitro;

import java.util.Iterator;
import java.util.Scanner;

public class Fatorial {

	public int exibiNumero(int numberInput) {		
		int calc = 1;
		if (numberInput == 1) {
			return 1;
		} else {			
			for (int i = 1; i <= numberInput; i++) {
				calc *= i; 				
			}
		}				
		return calc;
	}	
	public static void main(String[] args) {
		System.out.print(new Fatorial().exibiNumero(new Scanner(System.in).nextInt()));			
	}		
}




