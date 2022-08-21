/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nitro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author tiago
 */
@DisplayName("Cometa test")
public class CometaTest {
    
    Cometa cometa;
    
    @BeforeEach
    void setup(){
        cometa = new Cometa();
    }
    
    @Test
    @DisplayName("Should return 2062")
    void testCaseOne(){
        long expected = 2062;
        Assertions.assertEquals(expected, cometa.anoAtual(2010));
    }
    
    @Test
    @DisplayName("Should return 10042")
    void testCaseTwo(){
        long expected = 10042;
        Assertions.assertEquals(expected, cometa.anoAtual(10000));
    }
    
    @Test
    @DisplayName("Should return 2138")
    void testCaseThree(){
        long expected = 2138;
        Assertions.assertEquals(expected, cometa.anoAtual(2062));
    }
    
}
