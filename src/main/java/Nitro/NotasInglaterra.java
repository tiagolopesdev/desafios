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
public class NotasInglaterra {

    char exibiResult(int nota) {
        if (nota >= 86) {
            return 'A';
        } else if (nota >= 61) {
            return 'B';
        } else if (nota >= 36) {
            return 'C';            
        } else if (nota >= 1) {
            return 'D';                        
        }      
        return 'E';
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        System.out.println(new NotasInglaterra().exibiResult(scan.nextInt()));
    }
}
