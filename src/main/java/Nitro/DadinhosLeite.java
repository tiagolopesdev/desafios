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
public class DadinhosLeite {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int qntPessoas = scan.nextInt();
        int dadoPessoa = scan.nextInt();
        int custo = scan.nextInt();                
        
        while (!(qntPessoas == 0)) {                        
            System.out.println((qntPessoas * dadoPessoa) * custo);
            qntPessoas = scan.nextInt();
            dadoPessoa = scan.nextInt();
            custo = scan.nextInt();
        }
    }
}
