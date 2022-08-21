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
public class NovoGarcom {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int loop = scan.nextInt();

        int latas = 0;
        int copos = 0;
        int coposCaidos = 0;

        for (int i = 0; i < loop; i++) {
            latas = scan.nextInt();
            copos = scan.nextInt();
            if (latas > copos) {
                coposCaidos += copos;
            }
        }
        System.out.print(coposCaidos);
    }
}
