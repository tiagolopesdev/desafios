/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nitro;

import java.util.*;

/**
 *
 * @author tiagolopes
 */
public class FamosoBafo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int qntLoop = scan.nextInt();
        int qntPontosAldo = 0;
        int qntPontosBeto = 0;
        int qntTest = 1;
        
        while (qntLoop != 0) {       
            System.out.printf("Teste %d\n", qntTest++);
            for (int i = 0; i < qntLoop; i++) {
                qntPontosAldo += scan.nextInt();
                qntPontosBeto += scan.nextInt();
            }    
            if (qntPontosAldo > qntPontosBeto) {
                System.out.print("Aldo");
            } else {
                System.out.print("Beto");                
            }
            System.out.print("\n\n");
            qntPontosAldo = 0;
            qntPontosBeto = 0;
            qntLoop = scan.nextInt();
        }
    }
}
