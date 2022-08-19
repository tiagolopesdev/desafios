/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nitro;

import java.util.Scanner;

/**
 *
 * @author tiago
 */
public class LinguaP {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder textBuilder = new StringBuilder(scan.nextLine());        
        for (int i = 0; i < textBuilder.length(); i++) {            
            if (textBuilder.charAt(i) == 'p') {
                textBuilder.deleteCharAt(i);
            }            
        }
        System.out.println(textBuilder);
    }
}
