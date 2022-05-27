package Nitro;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tiagolopes
 */
public class AcimaMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer qntLoop = sc.nextInt();

        Integer numbers[] = new Integer[qntLoop];
        Integer somaNumbers = 0;
        Integer qntAlunos = 0;
        
        for (int i = 0; i < qntLoop; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < qntLoop; i++) {
            somaNumbers += numbers[i];
        }
        somaNumbers /= qntLoop;        
        
        for (int i = 0; i < qntLoop; i++) {
            if (numbers[i] > somaNumbers) {
                qntAlunos++;
            }
        }
        System.out.println("Qnt Alunos: "+ qntAlunos);
    }
}
