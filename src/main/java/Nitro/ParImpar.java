package Nitro;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner scan = new Scanner(System.in);

		int qntRodadas = scan.nextInt();

		int teste = 1;

		while (qntRodadas != 0) {
			int numeroA = 0;
			int numeroB = 0;
			String jogadorPar = null;
			String jogadorImpar = null;
			jogadorPar = scan.next();
			jogadorImpar = scan.next();
			System.out.printf("Teste %d\n", teste++);
			for (int i = 0; i < qntRodadas; i++) {
				numeroA = scan.nextInt();
				numeroB = scan.nextInt();
				if ((numeroA + numeroB) % 2 == 0) {
					System.out.println(jogadorPar);
				} else {
					System.out.println(jogadorImpar);
				}
			}			
			qntRodadas = scan.nextInt();
		}
	}

}
