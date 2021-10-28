/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIO.Fundamentos_aritmeticos;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author tiago
 */
public class ExibiNumPares {

    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }
    }
}
