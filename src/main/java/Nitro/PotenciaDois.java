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
public class PotenciaDois {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long numberInput = scan.nextLong();

        System.out.printf("%.0f", Math.pow(2, numberInput));
    }
}
