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
public class BolinhaMetal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int statusP = scan.nextInt();
        int statusR = scan.nextInt();

        if (statusP == 0) {
            System.out.print("C");
        } else {
            if (statusR == 1) {
                System.out.print("A");
            } else {
                System.out.print("B");                
            }
        }
    }
}
