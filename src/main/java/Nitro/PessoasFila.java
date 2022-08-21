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
public class PessoasFila {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qntPessoas = scan.nextInt();
        List<Integer> idAddPessoas = new ArrayList<>();
        for (int i = 0; i < qntPessoas; i++) {
            idAddPessoas.add(scan.nextInt());
        }
        int qntRemovePessoas = scan.nextInt();
        List<Integer> idRemovePessoa = new ArrayList<>();
        for (int i = 0; i < qntRemovePessoas; i++) {
            idRemovePessoa.add(scan.nextInt());
        }
        for (int i = 0; i < idRemovePessoa.size(); i++) {
            for (int j = 0; j < idAddPessoas.size(); j++) {
                if (idAddPessoas.get(j) == idRemovePessoa.get(i)) {
                    idAddPessoas.remove(j);
                }
            }
        }
        for (Integer integer : idAddPessoas) {
            System.out.print(integer + " ");
        }
    }
}
