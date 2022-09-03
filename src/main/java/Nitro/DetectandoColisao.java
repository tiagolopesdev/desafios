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
public class DetectandoColisao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long x00 = scan.nextLong();
        long y00 = scan.nextLong();
        long x01 = scan.nextLong();
        long y01 = scan.nextLong();

        long x10 = scan.nextLong();
        long y10 = scan.nextLong();
        long x11 = scan.nextLong();
        long y11 = scan.nextLong();
        
        if (x01 < x10 || x11 < x00) {
            System.out.print(0);
        } else {
            System.out.print(1);
        }
    }
}
