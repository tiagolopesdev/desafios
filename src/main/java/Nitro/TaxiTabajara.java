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
public class TaxiTabajara {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float alcool = scan.nextFloat();
        float gasolina = scan.nextFloat();
        float rendiAlcool = scan.nextFloat();
        float rendiGasolina = scan.nextFloat();
        
        float econoAlcool = alcool / rendiAlcool;
        float econoGasolina = gasolina / rendiGasolina;     
        
        if (econoAlcool < econoGasolina) {
            System.out.print('A');
        } else if (econoAlcool == econoGasolina) {
            System.out.print('G');
        } else {
            System.out.print('G');
        }     
    }
}
