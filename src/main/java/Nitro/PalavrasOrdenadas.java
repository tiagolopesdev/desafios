package Nitro;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class PalavrasOrdenadas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int qntLoop = scan.nextInt();
				
		while (qntLoop != 0) {
			
			String worldInput = scan.next();
			
			char[] worldCompare = worldInput.toUpperCase().toCharArray();
			
			boolean sequencyEquals = false;
			
			Arrays.sort(worldCompare);			
			
			for (int i = 0; i < worldCompare.length -1; i++) {
				if (worldCompare[i] == worldCompare[i + 1]) {
					sequencyEquals = true;
					break;
				}
			}					
			if ((Arrays.compare(worldInput.toUpperCase().toCharArray(), worldCompare) == 0) && !sequencyEquals) {
				System.out.println(worldInput + ": O");
			} else {
				System.out.println(worldInput + ": N");
			}			
			qntLoop--;
		}
		scan.close();
	}
}
