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
@DisplayName("Passa tempo cartas teste")
public class PassatempoCartasTest {
    
    PassatempoCartas passatempoCartas;
    
    @BeforeEach
    void setup(){
        passatempoCartas = new PassatempoCartas();
    }
    
    @Test
    void testCaseOne(){
        char expected = 'C';
        Assertions.assertEquals(expected, passatempoCartas.exibiResult(1, 2, 3, 4, 5, 6));
    }
    
}
