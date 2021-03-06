/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nitro;

import java.math.*;
import java.util.Scanner;

/**
 *
 * @author tiagolopes
 */
public class MelhorCalculadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char operacao = scan.next().charAt(0);
        BigDecimal numberOne = scan.nextBigDecimal();
        BigDecimal numberTwo = scan.nextBigDecimal();        
        
        if (operacao == '+') {
            System.out.println(numberOne.add(numberTwo));
        } else if (operacao == '-') {
            System.out.println(numberOne.subtract(numberTwo));
        } else if (operacao == '*') {
            System.out.println(numberOne.multiply(numberTwo));
        } else if (operacao == '/') {
            System.out.println(numberOne.divide(numberTwo,
                    1, RoundingMode.UP));
        }
    }
}
