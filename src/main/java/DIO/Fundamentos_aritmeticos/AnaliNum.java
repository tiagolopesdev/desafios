/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIO.Fundamentos_aritmeticos;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author tiago
 */
public class AnaliNum {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        int i = 0;

        while (i < 5) {
            a[i] = sc.nextInt();

            if ((a[i] % 2) == 0) {
                par++;
                if (a[i] > 0) {
                    positivo++;
                } else {
                    if (!(a[i] == 0)) {
                        negativo++;
                    }
                }
            } else {
                impar++;
                if (a[i] > 0) {
                    positivo++;
                } else {
                    if (!(a[i] == 0)) {
                        negativo++;
                    }
                }
            }
            sc.nextLine();
            i++;
        }
        System.out.println(par + " par(es)");
        System.out.println(impar + " impar(es)");
        System.out.println(positivo + " positivo(s)");
        System.out.println(negativo + " negativo(s)");
    }
}
