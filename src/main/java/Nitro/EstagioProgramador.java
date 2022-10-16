/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nitro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EstagioProgramador {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int qntAlunos = scan.nextInt();

		List<Integer> listCode = new ArrayList<>();
		List<Integer> listAverage = new ArrayList<>();

		List<Integer> results = new ArrayList<>();

		int turma = 1;
		int indexBest;

		while (qntAlunos > 0) {

			for (int i = 0; i < qntAlunos; i++) {
				listCode.add(scan.nextInt());
				listAverage.add(scan.nextInt());
			}

			indexBest = 0;

			for (int j = 1; j < qntAlunos; j++) {
				if (listAverage.get(j) >= listAverage.get(indexBest)) {
					indexBest = j;
				}
			}
			for (int j = 0; j < qntAlunos; j++) {
				if (listAverage.get(j) == listAverage.get(indexBest)) {
					results.add(listCode.get(j));
				}
			}

			System.out.printf("Turma %d\n", turma);
			turma++;

			for (int i = 0; i < results.size(); i++) {
				System.out.print(results.get(i) + " ");
			}

			System.out.printf("\n\n");

			listAverage.clear();
			listCode.clear();
			results.clear();

			qntAlunos = scan.nextInt();
		}
	}
}
