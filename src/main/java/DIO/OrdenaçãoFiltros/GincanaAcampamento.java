/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIO.OrdenaçãoFiltros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author tiagolopes
 */
public class GincanaAcampamento {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        Integer qntRepet = Integer.parseInt(st.nextToken());

        String nextElement;
        String[] namesNumbers;
        Integer number;
        Integer qntCaracteres;
        List<String> namesList = new ArrayList<>();
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < qntRepet; i++) {
            nextElement = reader.readLine();
            namesNumbers = nextElement.split(" ");
            number = Integer.parseInt(namesNumbers[1]);
            qntCaracteres = nextElement.indexOf(" ");
            Character.isAlphabetic(qntCaracteres);
            if (qntCaracteres < 30 && !namesNumbers[0].contains("_")) {
                numbersList.add(number);
                namesList.add(namesNumbers[0]);
            }
        }
        Integer qntInverse = 0;
        if (qntRepet != 0) {
            for (int i = numbersList.size() - 1; i >= 0; i--) {
                if (i > 0) {
                    if (numbersList.get(numbersList.size() - 1) % 2 == 0) {
                        numbersList.remove(numbersList.size() - 1);
                        namesList.remove(namesList.size() - 1);
                        Collections.reverse(numbersList);
                        Collections.reverse(namesList);
                        qntInverse++;
                    } else {
                        namesList.remove(namesList.size() - 1);
                        numbersList.remove(numbersList.size() - 1);
                        if (qntInverse > 0) {
                            Collections.reverse(numbersList);
                            Collections.reverse(namesList);
                            qntInverse=0;
                        }
                    }
                }
            }
            String result = namesList.get(0);
            System.out.println("Vencedor(a): " + result);
        }

    }
}
