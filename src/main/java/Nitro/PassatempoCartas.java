/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nitro;

/**
 *
 * @author tiago
 */
class PassatempoCartas {

    boolean trocou = false;

    //Crescente
    void bubbleSort(int numbers[], int arraySize) {
        do {
            trocou = false;
            for (int i = 0; i < arraySize - 1; i++) {
                int firstNumber = numbers[i];
                int secondNumber = numbers[i + 1];
                if (secondNumber < firstNumber) {
                    numbers[i] = secondNumber;
                    numbers[i + 1] = firstNumber;
                    trocou = true;
                }
            }
        } while (trocou);
    }

    public static void main(String[] args) {
//        PassatempoCartas cartas = new PassatempoCartas();
//        int[] numbers = {4, 1, 20, 3, 5, 2, 25, 100, 60};
//        int[] number = {1, 3, 8, 15};
//        cartas.bubbleSort(number, number.length);
//        for (int i : number) {
//            System.out.println(i);
//        }
//        if (cartas.trocou == true) {
//            System.out.println('C');
//        } else {
//            System.out.println('N');            
//        }
        int result = 1;
        for (int i = 1; i < 5; i++) {
            result = result + (2 * i);
            System.out.println(result);
        }
        System.out.printf("Final: %d",result+10);        
        result = 1;
        for (int i = 1; i < 4; i++) {
            result = result + (3 * i);
            System.out.println(result);
        }
        System.out.printf("Final: %d",result+10);
    }

//    char exibiResult(int inputOne, int inputTwo, int inputThree, int inputFour,
//            int inputFive, int inputSix) {
//        
//        if (inputOne > inputTwo) {
//            
//        }
//        
//        return 'C';
//    }
}
