/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nitro;

import java.util.Scanner;
import java.util.function.Function;

/**
 *
 * @author tiagolopes
 */
public class MultiploSete {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Function<Integer, String> multiplo = num
                -> num % 7 == 0 ? "É MULTIPLO DE 7" : "ESSE NÃO É";
        
        System.out.println(multiplo.apply(scan.nextInt()));
    }
}
