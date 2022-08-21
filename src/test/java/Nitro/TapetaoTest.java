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
@DisplayName("Class test tapetao")
public class TapetaoTest {
    
    Tapetao tapetao;
    
    @BeforeEach
    void setup(){
        tapetao = new Tapetao();
    }
    
    @Test
    @DisplayName("Should return 2")
    void caseTestOne() {
        int expected = 2;
        Assertions.assertEquals(expected, tapetao.calculo(2, 2));
    }
    
    @Test
    @DisplayName("Should return 40")
    void caseTestTwo() {
        int expected = 40;
        Assertions.assertEquals(expected, tapetao.calculo(10, 5));
    }
    
    @Test
    @DisplayName("Should return 450")
    void caseTestThree() {
        int expected = 450;
        Assertions.assertEquals(expected, tapetao.calculo(30, 10));
    }
    
}
