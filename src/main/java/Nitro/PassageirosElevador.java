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
class PassageirosElevador {

    public static void main(String[] args) {                            

        Scanner scan = new Scanner(System.in);

        int qntLeituras = scan.nextInt();
        int capaElevador = scan.nextInt();
        int pesoAtual = 0;
        boolean limiteExcedido = false;

        for (int i = 0; i < qntLeituras; i++) {
            pesoAtual = pesoAtual + (scan.nextInt() - scan.nextInt());
            if ((pesoAtual * -1) > capaElevador) limiteExcedido = true;
        }
        if (limiteExcedido) System.out.print('S');
        else System.out.print('N');
    }
}
