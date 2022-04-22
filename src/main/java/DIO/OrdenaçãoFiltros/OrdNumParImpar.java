/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIO.OrdenaçãoFiltros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 *
 * @author
 *
 * Crie um programa onde você receberá valores inteiros não negativos como
 * entrada.
 *
 * Ordene estes valores de acordo com o seguinte critério:
 *
 * Primeiro os Pares Depois os Ímpares Você deve exibir os pares em ordem
 * crescente e na sequência os ímpares em ordem decrescente.
 */
public class OrdNumParImpar {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer n = Integer.parseInt(st.nextToken());

        ArrayList<Integer> entradas = new ArrayList<Integer>();
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            entradas.add(Integer.parseInt(st.nextToken()));

            if (entradas.get(i) % 2 == 0) {
                pares.add(entradas.get(i));
            } else {
                impares.add(entradas.get(i));
            }
        }
        Collections.sort(pares);
        Collections.sort(impares);
        
        Collections.reverse(impares);
        
        for (Integer pare : pares) {
            System.out.println(pare);
        }
        for (Integer impare : impares) {
            System.out.println(impare);
        }
    }
}
