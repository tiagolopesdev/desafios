/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIO.OrdenaçãoFiltros;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author tiagolopes
 */
public class FilaBanco {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int qntRepet = sc.nextInt();
        Integer elements = null;
        Integer naoMudou;
        List<Integer> numbersList = new ArrayList<>();
        List<Integer> sortedList = new ArrayList<>();        
        for (int i = 0; i < qntRepet; i++) {
            sc.nextLine();
            
            naoMudou = 0;
            
            int qntElements = sc.nextInt();
            sc.nextLine();
            
            for (int j = 0; j < qntElements; j++) {
                elements = Integer.parseInt(sc.next());
                numbersList.add(elements);                
            }                        
            sortedList = numbersList.stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());                               

            for (int j = 0; j < qntElements; j++) {
                if (numbersList.get(j) == sortedList.get(j)) {
                    naoMudou++;
                }
            }            
            System.out.println(naoMudou);
            numbersList.clear();
            sortedList.clear();            
        }       
    }
}
