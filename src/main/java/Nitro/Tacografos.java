package Nitro;

import java.util.Iterator;
import java.util.Scanner;

public class Tacografos {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		long time, speed, result = 0;

		long qntLoop = scan.nextLong();		
		
		for (int i = 0; i < qntLoop; i++) {
			time = scan.nextLong();
			speed = scan.nextLong();
			result += time * speed;			
		}
		System.out.print(result);
	}
}
