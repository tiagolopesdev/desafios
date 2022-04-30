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
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author tiagolopes
 */
public class GincanaAcampamento {

    public static void main(String[] args) throws IOException {

        //Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        Integer qntRepet = Integer.parseInt(st.nextToken());

//        System.out.println(qntRepet);
        String nextElement;
        String[] namesNumbers;
        Integer number;
        List<String> namesList = new ArrayList<>();
        List<Integer> numbersList = new ArrayList<>();                
        for (int i = 0; i < qntRepet; i++) {
            nextElement = reader.readLine();
            namesNumbers = nextElement.split(" ");
            number = Integer.parseInt(namesNumbers[1]);
            numbersList.add(number);            
            namesList.add(namesNumbers[0]);
        }
        System.out.println("Tamanho lista: " + numbersList.size());
        Integer qntRepetNumber = numbersList.size() - 1;        

        Integer getIndex = 0;
        for (int i = qntRepetNumber; i >= 0; i--) {
            if (i != 0) {
                if (numbersList.get(i) % 2 == 0) {
                    numbersList.remove(i);
                    namesList.remove(i);
                    Collections.reverse(numbersList);
                    Collections.reverse(namesList);
                } else {
                    namesList.remove(i);
                    numbersList.remove(i);
                }
            } else {
                getIndex = i;
            }
        }
        System.out.println("Ultimo elemento: " + numbersList.get(getIndex) + "\nGanhadora: " + namesList.get(getIndex));
        //}

    }
}
