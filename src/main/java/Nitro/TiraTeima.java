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
public class TiraTeima {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long positionX = scan.nextLong();
        long positionY = scan.nextLong();
        long defaultPositionX = 432;
        long defaultPositionY = 432;

        if ((positionX >= 0 && positionX <= defaultPositionX) && (positionY >= 0 && positionY <= defaultPositionY)) {            
            System.out.print("dentro");
        } else {
            System.out.print("fora");
        }
    }
}
