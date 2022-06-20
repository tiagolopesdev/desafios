/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIO.Fundamentos_aritmeticos;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author tiago
 */
public class QuantiNumPositivo {

    int contadorLoop = 0;
    int qntNumbersPositivos = 0;
    final int limiteNumberNatural = 0;
    final int limiteNumbersInput = 5;
    
    public String verificaNumber(double[] valuesInput) {        
        while (contadorLoop <= limiteNumbersInput) {            
            if (isNatural(valuesInput)) qntNumbersPositivos++;
            contadorLoop++;
        }
        return qntNumbersPositivos + " valores positivos";
    }
    boolean isNatural(double[] valueInput){
        if (valueInput[contadorLoop] > limiteNumberNatural) return true;        
        return false;
    }
//    public static void main(String[] args) throws IOException {
//
//        Scanner ler = new Scanner(System.in);
//
//        Double a;
//        Integer b = 0;
//        int i = 0;
//
//        while (i <= 5) {
//            a = ler.nextDouble();
//            if (a > 0) {
//                ler.nextLine();
//                b++;
//            } else {
//                ler.nextLine();
//            }
//            i++;
//        }
//        
//        System.out.println(b + " valores positivos");
//    }
}
