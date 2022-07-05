/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nitro;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author tiago
 */
@DisplayName("Notas inglaterra test")
@TestClassOrder(ClassOrderer.OrderAnnotation.class)
public class NotasInglaterraTest {
    
    NotasInglaterra inglaterra;
    
    @BeforeEach
    void setup(){
        inglaterra = new NotasInglaterra();
    }
    
    @Test
    @Order(1)
    void caseTestOne(){
        char expected = 'D';
        Assertions.assertEquals(expected, inglaterra.exibiResult(12));
    }
    
    @Test
    @Order(2)
    void caseTestTwo(){
        char expected = 'A';
        Assertions.assertEquals(expected, inglaterra.exibiResult(87));
    }
    
    @Test
    @Order(3)
    void caseTestThree(){
        char expected = 'E';
        Assertions.assertEquals(expected, inglaterra.exibiResult(0));
    }
    
}
