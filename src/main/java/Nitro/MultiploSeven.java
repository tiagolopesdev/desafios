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
public class MultiploSeven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Function<Float, String> multiplo = num ->
                num % 2 == 0 ? "É MULTIPLO DE 7" : "ESSE NÃO É";
        
        System.out.println(multiplo.apply(scan.nextFloat()));        
    }
}
