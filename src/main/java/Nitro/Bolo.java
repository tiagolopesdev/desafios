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
public class Bolo {

    long receitaQntTrigo = 2;
    long receitaQntOvo = 3;
    long receitaQntLeite = 5;

    long qntMaxBolo(long qntTrigo, long qntOvos, long qntLeite) {
        long resultTrigo = qntTrigo / receitaQntTrigo;
        long resultOvo = qntOvos / receitaQntOvo;
        long resultLeite = qntLeite / receitaQntLeite;
        return ordenarElementos(resultTrigo, resultOvo, resultLeite);
    }
    long ordenarElementos(long resultTrigo, long resultOvo, long resultLeite){
        List<Long> elements = Arrays.asList(resultTrigo, resultOvo, resultLeite);
        Collections.reverse(elements);
        return elements.get(0); 
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bolo b = new Bolo();
        System.out.println(b.qntMaxBolo(
                scan.nextLong(),
                scan.nextLong(),
                scan.nextLong()));
    }
}
