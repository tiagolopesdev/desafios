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
public class TaxiTabajaraTest {
    
    TaxiTabajara tabajara;
    
    @BeforeEach
    void setUp(){
        tabajara = new TaxiTabajara();
    }
    
    @Test
    @DisplayName("Should return char A")
    void caseTestOne(){
        char expected = 'A';        
        Assertions.assertEquals(expected, tabajara.displayResult(
                Float.parseFloat("1.20"),
                Float.parseFloat("2.30"),
                Float.parseFloat("10.00"),
                Float.parseFloat("15.00")));
        Assertions.assertNotNull(tabajara.displayResult(
                Float.parseFloat("1.20"),
                Float.parseFloat("2.30"),
                Float.parseFloat("10.00"),
                Float.parseFloat("15.00")));
    }
    
    @Test
    @DisplayName("Should return char G, test two")
    void caseTestTwo(){
        char expected = 'G';        
        Assertions.assertEquals(expected, tabajara.displayResult(
                Float.parseFloat("1.00"),
                Float.parseFloat("1.00"),
                Float.parseFloat("9.00"),
                Float.parseFloat("9.01")));
        Assertions.assertNotNull(tabajara.displayResult(
                Float.parseFloat("1.00"),
                Float.parseFloat("1.00"),
                Float.parseFloat("9.00"),
                Float.parseFloat("9.01")));
    }
    
    @Test
    @DisplayName("Should return char G, test three")
    void caseTestThree(){
        char expected = 'G';        
        Assertions.assertEquals(expected, tabajara.displayResult(
                Float.parseFloat("1.00"),
                Float.parseFloat("1.00"),
                Float.parseFloat("11.00"),
                Float.parseFloat("11.00")));
        Assertions.assertNotNull(tabajara.displayResult(
                Float.parseFloat("1.00"),
                Float.parseFloat("1.00"),
                Float.parseFloat("11.00"),
                Float.parseFloat("11.00")));
    }
    
    
}
