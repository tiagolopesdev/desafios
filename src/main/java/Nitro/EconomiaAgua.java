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
public class EconomiaAgua {

    int assinaturaMensal = 7;

    long valorContaAgua(long qntConsumo) {
        if (qntConsumo >= 0 && qntConsumo <= 10) {
            return assinaturaMensal;
        } else if (qntConsumo > 10 && qntConsumo <= 30) {
            long caseTwo = 11;
            while (caseTwo <= qntConsumo) {
                caseTwo++;
                assinaturaMensal += 1;
            }
            return assinaturaMensal;
        } else if (qntConsumo > 30 && qntConsumo <= 100) {
            long caseThree = 31;
            while (caseThree <= qntConsumo) {
                caseThree++;
                assinaturaMensal += 2;
            }
            return assinaturaMensal + 20;
        }
        long caseThree = 101;
        while (caseThree <= qntConsumo) {
            caseThree++;
            assinaturaMensal += 5;
        }
        return assinaturaMensal + 20 + 140;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EconomiaAgua economiaAgua = new EconomiaAgua();
        
        System.out.println(economiaAgua.valorContaAgua(scan.nextLong()));
    }

}
