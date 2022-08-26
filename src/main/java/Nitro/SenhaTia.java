package Nitro;

import java.util.*;
import java.util.stream.Stream;

public class SenhaTia {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int a = scan.nextInt();
		int k = scan.nextInt();

		String senha = scan.next();

		int nTotal = 0, mTotal = 0, aTotal = 0, kTotal = 0;

		for (int i = 0; i < senha.length(); i++) {
			if (Character.isLetterOrDigit(senha.charAt(i))) {        
				nTotal++;
			}
			if (Character.isLowerCase(senha.charAt(i))) {
				mTotal++;
			}
			if (Character.isUpperCase(senha.charAt(i))) {
				aTotal++;
			}
			if (Character.isDigit(senha.charAt(i))) {
				kTotal++;
			}
		}
		if (nTotal >= n && mTotal >= m && aTotal >= a && kTotal >= k) {
			System.out.print("Ok =/");      
		} else {
			System.out.print("Ufa :)");
		}			
	}
}
