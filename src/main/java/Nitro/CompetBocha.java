/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nitro;

import java.util.*;

public class CompetBocha {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        List<Integer> numbers = Arrays.asList(scan.nextInt(), scan.nextInt(), 
                scan.nextInt()
        );
        Collections.sort(numbers);
        System.out.println(numbers.get(1));       
    }
}
