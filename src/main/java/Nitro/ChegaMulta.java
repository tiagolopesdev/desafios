/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nitro;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author tiagolopes
 */
public class ChegaMulta {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberInput = scan.nextInt();
        
        double result = numberInput / 0.62137;
        
        System.out.printf("%.2f", result);

        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.US);
        dfs.setDecimalSeparator('.');
        dfs.setGroupingSeparator(',');

        //System.out.printf(new DecimalFormat("#,##0.00", dfs).format(numberInput / 0.62137));
    }
}
