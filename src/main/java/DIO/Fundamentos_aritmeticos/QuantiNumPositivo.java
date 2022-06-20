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
        return valueInput[contadorLoop] > limiteNumberNatural;
    }    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numbersInputs = new double[6];
        for (int i = 0; i < 6; i++) {
            numbersInputs[i] = Double.parseDouble(scan.next());                        
        }
        QuantiNumPositivo numPositivo = new QuantiNumPositivo();
        System.out.print(numPositivo.verificaNumber(numbersInputs));
    }
}
