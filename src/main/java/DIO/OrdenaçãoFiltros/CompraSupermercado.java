/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIO.OrdenaçãoFiltros;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author tiago
 */
public class CompraSupermercado {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        Integer n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            String str = sc.nextLine();
            String[] s = str.split(" ");
           
            String[] unique = new HashSet<String>(Arrays.asList(s))
                    .toArray(new String[0]);

            Arrays.sort(unique);
//            Arrays.stream(unique).forEach(System.out::println);
            System.out.println(Arrays.toString(unique)
                    .replaceAll(",\\[", ""));
        }
    }
}
