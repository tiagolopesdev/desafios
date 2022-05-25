/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tiagolopes
 */
public class CamelCase {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String texts = sc.next();
        List<Integer> positions = new ArrayList<>();
        
        for (int i = 0; i < texts.length(); i++) {
            if (Character.isUpperCase(texts.charAt(i))) {
                positions.add(i);                
            }
        }
        System.out.println(positions.size()+1);        
    }
}
