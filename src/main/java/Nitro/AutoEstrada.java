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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qntLoop = scan.nextInt();

        String wordInput;
        int qntPainel = 0;
        wordInput = scan.next();
//        System.out.println(wordInput);
//        System.out.println(wordInput.charAt(0));
        for (int i = 0; i < qntLoop; i++) {            
            if (wordInput.charAt(i) == 'P') {
                qntPainel += 2;
            } else if (wordInput.charAt(i) == 'C') {
                qntPainel += 2;
            } else if (wordInput.charAt(i) == 'A') {
                qntPainel += 1;
            }
        }
        System.out.print(qntPainel);
    }
}
