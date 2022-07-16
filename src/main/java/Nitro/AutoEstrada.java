/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nitro;

import java.util.*;

/**
 *
 * @author tiago
 */
public class AutoEstrada {
    
    int NUMBER_CODIGO_PISTA = 2;
    int NUMBER_CODIGO_CURVA = 2;
    int NUMBER_CODIGO_ACESSO = 1;
    char CODIGO_PISTA = 'P';
    char CODIGO_CURVA = 'C';
    char CODIGO_ACESSO = 'A';
    
    int exibiResult(int qntLoop, String wordInput) {
        int qntPainel = 0;
        for (int i = 0; i < qntLoop; i++) {
            if (wordInput.charAt(i) == CODIGO_PISTA) {
                qntPainel += NUMBER_CODIGO_PISTA;
            } else if (wordInput.charAt(i) == CODIGO_CURVA) {
                qntPainel += NUMBER_CODIGO_CURVA;
            } else if (wordInput.charAt(i) == CODIGO_ACESSO) {
                qntPainel += NUMBER_CODIGO_ACESSO;
            }
        }
        return qntPainel;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AutoEstrada autoEstrada = new AutoEstrada();
        System.out.println(autoEstrada.exibiResult(scan.nextInt(), scan.next()));
    }    
}
