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
public class Quermesse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qntLoop = scan.nextInt();
        long numberInput = 0;
        int qntTeste = 1;
        int ganhador = 0;

        while (qntLoop != 0) {
            for (int i = 1; i <= qntLoop; i++) {
                numberInput = scan.nextInt();
                if (numberInput == i) {
                    ganhador = i;
                }
            }
            System.out.printf("Teste %d\n", qntTeste++);
            System.out.println(ganhador+"\n");                        
            qntLoop = scan.nextInt();
        }
    }
}
