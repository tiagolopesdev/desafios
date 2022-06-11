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
public class ViagemRodoviaria {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Integer compriPista = scan.nextInt();
        Integer distanPedagio = scan.nextInt();
        Integer custoKm = scan.nextInt();
        Integer valorPedagio = scan.nextInt();

        System.out.print((compriPista * custoKm)
                + ((compriPista / distanPedagio) * valorPedagio));
    }
}
