package Nitro;

import java.util.*;

public class Notas {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int qntLoop = scan.nextInt();
		
		int[] frequency = new int[101];
		
		int input = 0;
		
		for (int i = 0; i < qntLoop; i++) {
			
			input = scan.nextInt();
			
			frequency[input]++;
		}
		
		int positionResult = 0;
		
		for (int i = 0; i < 101; i++) {			
			if (frequency[i] >= frequency[positionResult]) {
				positionResult = i;
			}			
		}
		
		System.out.print(positionResult);
	}
}
