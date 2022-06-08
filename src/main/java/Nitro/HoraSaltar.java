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
public class HoraSaltar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Integer numberOne = scan.nextInt();
        Integer numberTwo = scan.nextInt();

        float calc = numberOne / numberTwo;

        if ((calc * numberTwo) < numberOne) {
            calc++;
        }
        System.out.printf("%.0f", calc);
    }
}
