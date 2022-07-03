/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nitro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author tiagolopes
 */
public class GangorraParqueTest {
    
    GangorraParque gangorraParque;
    
    @BeforeEach()
    void setup(){
        gangorraParque = new GangorraParque();
    }
    
    @Test
    @DisplayName("Caso de teste 1")
    void testCaseOne(){
        String expected = "0";
        Assertions.assertEquals(expected, gangorraParque.isEquilibrada(30, 100, 60, 50));
    }
    @Test
    @DisplayName("Caso de teste 2")
    void testCaseTwo(){
        String expected = "1";
        Assertions.assertEquals(expected, gangorraParque.isEquilibrada(40, 40, 38, 60));
    }
    @Test
    @DisplayName("Caso de teste 3")
    void testCaseThree(){
        String expected = "-1";
        Assertions.assertEquals(expected, gangorraParque.isEquilibrada(35, 80, 35, 75));
    }
    
}
