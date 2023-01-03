package Nitro;

import java.util.*;

public class MinedField {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int repetLoop = scan.nextInt();		
		
		boolean beforeNumber = false;
		int[] input = new int[repetLoop];
		
		for (int i = 0; i < repetLoop; i++) {			
			input[i] = scan.nextInt();		
		}
		
		int count = 0;
		
		for (int j = 0; j < input.length; j++) {
			
			if (input[j] == 1){
				count++;
			} 
			if ((j - 1) >= 0) {
				if (input[j - 1] == 1) {
					count++;
				}
			}
			if ((j + 1) < input.length) {
				if (input[j + 1] == 1) {
					count++;
				}
			}
			System.out.print(count+"\n");
			count = 0;
		}		
	}
}
