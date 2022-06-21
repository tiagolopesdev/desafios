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
public class TransporteInternacional {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long containerA = scan.nextInt();
        long containerB = scan.nextInt();
        long containerC = scan.nextInt();
        long navioX = scan.nextInt();
        long navioY = scan.nextInt();
        long alturaCargaZ = scan.nextInt();

        if (containerC > alturaCargaZ) {
            System.out.print(0);
        } else {
            System.out.print(
                    (navioX / containerA)
                    * (alturaCargaZ / containerC)
                    * (navioY / containerB)
            );
        }
    }
}
