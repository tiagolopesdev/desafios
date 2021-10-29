/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIO.Fundamentos_aritmeticos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author tiago
 */
public class ContagemCedulas {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String entrada = br.readLine();
        Integer valor = Integer.parseInt(entrada);

        int[] notas = new int[]{100, 50, 20, 10, 5, 2, 1};
        int[] totalNota = new int[7];
        
        for (int i = 0; i < notas.length; i++) {
            if (valor >= notas[i]) {
                totalNota[i] = valor / notas[i];
                valor = valor - totalNota[i] * notas[i];
            }
        }

        System.out.println(entrada);

        for (int i = 0; i < totalNota.length; i++) {
            System.out.println(totalNota[i] + " nota(s) de R$" + notas[i] + ",00");
        }
    }
}
