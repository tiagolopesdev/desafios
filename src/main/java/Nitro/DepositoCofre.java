/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nitro;

import java.util.Scanner;

/**
 *
 * @author tiagolopes
 */
public class DepositoCofre {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qntDeposito = scan.nextInt();
        int result = 0;
        int qntTeste = 1;

        while (qntDeposito != 0) {
            System.out.printf("Teste %d\n", qntTeste++);
            for (int i = 0; i < qntDeposito; i++) {
                result = result + (scan.nextInt() - scan.nextInt());
                System.out.println(result);
            }
            System.out.printf("\n");
            result = 0;
            qntDeposito = scan.nextInt();
        }
    }
}
