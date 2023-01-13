package Nitro;

import java.util.*;

public class AccumulatedRain {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int mapSize = scan.nextInt();
		
		int dimensão = 2;
		
		int variableToLoop = mapSize;
		
		int[][] rain = new int [mapSize][mapSize];
				
		while (dimensão != 0) {			

			for (int i = 0; i < variableToLoop; i++) {
				for (int j = 0; j < variableToLoop; j++) {
					rain[i][j] += scan.nextInt(); 
				}
			}
			
			dimensão--;
		}
		
		for (int i = 0; i < variableToLoop; i++) {
			for (int j = 0; j < variableToLoop; j++) {
				System.out.print(rain[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
