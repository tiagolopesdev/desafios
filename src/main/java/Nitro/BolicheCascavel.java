package Nitro;

import java.util.*;

public class BolicheCascavel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int diamBola = scan.nextInt();
		int[] medidasCaixa = new int[3];
		int count = 0;

		for (int i = 0; i < 3; i++) {
			medidasCaixa[i] = scan.nextInt();
		}
		for (int i = 0; i < medidasCaixa.length; i++) {
			if (medidasCaixa[i] >= diamBola) {
				count++;
			}
		}
		if (count == 3) {
			System.out.print('S');
		} else {
			System.out.print('N');
		}
		scan.close();
	}
}
