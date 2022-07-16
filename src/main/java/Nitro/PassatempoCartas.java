/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nitro;

import java.util.Scanner;

/**
 *
 * @author tiago
 */
class PassatempoCartas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] inputs = new int[5];

        for (int i = 0; i < 5; i++) {
            inputs[i] = scan.nextInt();
        }
        int crescente = 1;
        int decrescente = 1;

        for (int i = 0; i < inputs.length - 1; i++) {
            if (inputs[i] < inputs[i + 1]) {
                crescente++;
            } else if (inputs[i] > inputs[i + 1]) {
                decrescente++;
            }
        }
        if (crescente == 5) {
            System.out.print('C');
        } else if (decrescente == 5) {
            System.out.print('D');
        } else {
            System.out.print('N');
        }
    }
}
