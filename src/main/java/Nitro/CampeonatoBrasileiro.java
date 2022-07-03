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
public class CampeonatoBrasileiro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int comergoVitoria = scan.nextInt();
        int comergoEmpate = scan.nextInt();
        int comergoSaldoGol = scan.nextInt();
        int flaminVitoria = scan.nextInt();
        int flaminEmpate = scan.nextInt();
        int flaminSaldoGol = scan.nextInt();

        int resultComergo = (comergoVitoria * 3) + comergoEmpate;
        int resultFlamin = (flaminVitoria * 3) + flaminEmpate;

        if (resultComergo > resultFlamin) {
            System.out.print('C');
        } else if (resultComergo < resultFlamin) {
            System.out.print('F');
        } else {
            if (comergoSaldoGol > flaminSaldoGol) {
                System.out.print('C');
            } else if (flaminSaldoGol > comergoSaldoGol){
                System.out.print('F');                
            } else {
                System.out.print('=');                                
            }
        }
    }
}
