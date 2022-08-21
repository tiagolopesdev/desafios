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
public class Letras {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String worldInput = scan.nextLine();
        String textInput = scan.nextLine();
        double qntWorldEquals = 0;
        double allWorlds = 0;
        
        for (String text : textInput.split(" ")) {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == worldInput.charAt(0)) {
                    qntWorldEquals++;
                    break;
                }
            }
            allWorlds++;
        }
        double result = (qntWorldEquals / allWorlds) * 100.0;
        if (result > 100) {
            System.out.print(100.0);
        } else {
            System.out.printf("%.1f", result);
        }
    }
}
