package Nitro;

import java.util.Scanner;

public class Telescope {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long telecopeArea, qntStars, photonFlux, result, counter = 0;
		long EYE_PERCEPTION = 40000000;
		
		telecopeArea = scan.nextLong();
		qntStars = scan.nextLong();
		
		for (int i = 0; i < qntStars; i++) {			
			photonFlux = scan.nextLong();
			result = photonFlux * telecopeArea;
			if (result >= EYE_PERCEPTION) {
				counter++;
			}
		}
		System.out.print(counter);
	}
}
