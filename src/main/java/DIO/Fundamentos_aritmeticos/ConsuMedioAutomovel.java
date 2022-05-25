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
public class ConsuMedioAutomovel {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        double y = leitor.nextDouble();

        double media = x / y;
        System.out.println(String.format("%.3f km/l", media));
    }
}
