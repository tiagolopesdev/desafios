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

    char displayResult(float alcool, float gasolina, float rendiAlcool, float rendiGasolina) {
        float econoAlcool = econoTypeFuel(alcool, rendiAlcool);
        float econoGasolina = econoTypeFuel(gasolina, rendiGasolina);
        if (econoAlcool < econoGasolina) {
            return 'A';
        } else if (econoAlcool == econoGasolina) {
            return 'G';
        } 
        return 'G';
    }
    float econoTypeFuel(float typeFuel, float rendimento){
        return typeFuel / rendimento;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float alcool = scan.nextFloat();
        float gasolina = scan.nextFloat();
        float rendiAlcool = scan.nextFloat();
        float rendiGasolina = scan.nextFloat();
        System.out.println(new TaxiTabajara().displayResult(alcool, gasolina,
                rendiAlcool, rendiGasolina));
    }
}
