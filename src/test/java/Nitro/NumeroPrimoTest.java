/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nitro;

import org.junit.jupiter.api.*;

/**
 *
 * @author tiago
 */
@DisplayName("Classe teste número primo")
public class NumeroPrimoTest {
    
    NumeroPrimo numeroPrimo;
    
    @BeforeEach
    void setup(){
        numeroPrimo = new NumeroPrimo();
    }
    
    @Test
    @DisplayName("Caso de teste com numero 7")
    void testCaseOneNumeroPrimo(){
        String expected = "sim";
        Assertions.assertEquals(expected, numeroPrimo.verificaNumber(7));
    }
    
    @Test
    @DisplayName("Caso de teste com numero 10")
    void testCaseTwoNumeroPrimo(){
        String expected = "nao";
        Assertions.assertEquals(expected, numeroPrimo.verificaNumber(10));
    }
    
}
