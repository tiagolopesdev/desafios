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

    long defaultPositionX = 432;
    long defaultPositionY = 432;
    String result = null;

    String exibiResult(long positionX, long positionY) {
        if (verificaInputs(positionX, defaultPositionX)
                && verificaInputs(positionY, defaultPositionY)) {
            result = "dentro";
        } else {
            result = "fora";
        }
        return result;
    }

    boolean verificaInputs(long positionInput, long defaultPosition) {
        return positionInput >= 0 && positionInput <= defaultPosition;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TiraTeima tiraTeima = new TiraTeima();
        System.out.println(tiraTeima.exibiResult(scan.nextLong(), scan.nextLong()));
    }
}
