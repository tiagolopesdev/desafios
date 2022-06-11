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
public class UmaTomada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Integer result = 0;

        Integer numberOne = scan.nextInt();
        result += numberOne;
        Integer numberTwo = scan.nextInt();
        result += numberTwo;
        Integer numberThree = scan.nextInt();
        result += numberThree;
        Integer numberFour = scan.nextInt();
        result += numberFour;

        System.out.println(result - 3);
    }
}
