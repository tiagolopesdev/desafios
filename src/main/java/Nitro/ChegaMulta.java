/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nitro;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author tiagolopes
 */
public class ChegaMulta {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Integer numberInput = scan.nextInt();

        double milhaKm = 1.609344;
        double result = numberInput * milhaKm;

        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.US);
        dfs.setDecimalSeparator('.');
        dfs.setGroupingSeparator(',');

        String pattersTwo = "###,###.##";

        System.out.println(new DecimalFormat(pattersTwo, dfs).format(result));

    }
}
