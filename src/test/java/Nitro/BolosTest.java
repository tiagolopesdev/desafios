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
@DisplayName("Bolos classe teste")
public class BolosTest {
    
    Bolo bolo;
    
    @BeforeEach
    void setup(){
        bolo = new Bolo();
    }
    
    @Test
    @DisplayName("Caso de teste um")
    void testCaseOne(){
        long expected = 2;
        Assertions.assertEquals(expected, bolo.qntMaxBolo(4, 6, 10));
    }
    
    @Test
    @DisplayName("Caso de teste dois")
    void testCaseTwo(){
        long expected = 1;
        Assertions.assertEquals(expected, bolo.qntMaxBolo(4, 6, 9));
    }
    
    @Test
    @DisplayName("Caso de teste três")
    void testCaseThree(){
        long expected = 4;
        Assertions.assertEquals(expected, bolo.qntMaxBolo(8, 12, 20));
    }
    
}
