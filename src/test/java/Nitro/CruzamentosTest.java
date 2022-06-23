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
@DisplayName("Cruzamentos")
public class CruzamentosTest {
    
    Cruzamento cruzamento;
    
    @BeforeEach
    void setup(){
        cruzamento = new Cruzamento();
    }
    
    @Test
    @DisplayName("Primeiro caso de teste")
    void testCruzamentoCaseOne(){
        long expected = 11;
        Assertions.assertEquals(expected, 
                cruzamento.minCruzamento(0, 0, 5, 6));
    }
    @Test
    @DisplayName("Segundo caso de teste")
    void testCruzamentoCaseTwo(){
        long expected = 68;
        Assertions.assertEquals(expected, 
                cruzamento.minCruzamento(52, 75, 120, 75));
    }
    
}
