/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nitro;

import java.util.*;

/**
 *
 * @author tiagolopes
 */
public class InvertSequency {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Integer qntLoop = scan.nextInt();
        
        List<String> numbers = new ArrayList<>();
        
        for (int i = 0; i < qntLoop; i++) {
            numbers.add(String.valueOf(scan.nextInt()));
        }          
        Collections.reverse(numbers);
                      
        numbers.stream().forEach(p -> System.out.print(p+" "));
        
    }
}
