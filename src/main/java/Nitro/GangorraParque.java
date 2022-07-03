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
public class GangorraParque {
    
    long pesoChildOne;
    long comprGanLeft;
    long pesoChildTwo;
    long comprGanRight;

    String isEquilibrada(long pesoChildOne, long comprGanLeft,
            long pesoChildTwo, long comprGanRight) {                
        if (resultCalcLeft(pesoChildOne, comprGanLeft) == 
                resultCalcRight(pesoChildTwo, comprGanRight)) {
            return "0";
        } else if (resultCalcLeft(pesoChildOne, comprGanLeft) > 
                resultCalcRight(pesoChildTwo, comprGanRight)) {
            return "-1";            
        }        
        return "1";        
    }
    long resultCalcLeft(long pesoChildOne, long comprGanLeft){        
        return pesoChildOne * comprGanLeft;
    }
    long resultCalcRight(long pesoChildTwo, long comprGanRight){
        return pesoChildTwo * comprGanRight;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GangorraParque parque = new GangorraParque();
        
        System.out.print(parque.isEquilibrada(
                scan.nextLong(), 
                scan.nextLong(),
                scan.nextLong(),
                scan.nextLong())
        );
    }
    
}
