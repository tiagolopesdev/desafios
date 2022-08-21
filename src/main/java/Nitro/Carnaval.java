/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nitro;

import java.util.*;

/**
 *
 * @author tiago
 */
public class Carnaval {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float somaNotas = 0;
        float[] notas = new float[5];

        for (int i = 0; i < 5; i++) {
            notas[i] = scan.nextFloat();
        }
        Arrays.sort(notas);
        for (int i = 1; i < 4; i++) {            
            somaNotas +=notas[i];
        }
        System.out.printf("%.1f", somaNotas);
    }
}
