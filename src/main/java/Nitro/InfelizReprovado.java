package Nitro;

import java.util.Scanner;

public class InfelizReprovado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int instancia = 1, n;
		int notaAtual, notaAnterior = 11;
		String nomeAtual, nomeAnterior = null;

		n = scan.nextInt();

		while (n != 0) {
			nomeAtual = scan.next();
			notaAtual = scan.nextInt();
			if (notaAtual < notaAnterior) {
				notaAnterior = notaAtual;
				nomeAnterior = nomeAtual;
				System.out.println("IF " + nomeAnterior);
			} else if (notaAtual == notaAnterior && nomeAtual.length() > nomeAnterior.length()) {
				nomeAnterior = nomeAtual;
				System.out.print("Else " + nomeAnterior);
			}
			n--;
		}
		System.out.println("Instancia " + instancia);
		System.out.println(nomeAnterior);

	}
}
