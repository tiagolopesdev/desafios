/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nitro;

import org.junit.jupiter.api.*;

/**
 *
 * @author tiagolopes
 */
@DisplayName("Classe economia de água test")
public class EconomiaAguaTest {
    
    EconomiaAgua economiaAgua;
    
    @BeforeEach
    void setup(){
        economiaAgua = new EconomiaAgua();
    }
    
    @Test
    @DisplayName("Primeiro caso de test")
    void testCaseOneEconomiaAguaEquals(){
        long expected = 7;
        Assertions.assertEquals(expected, economiaAgua.valorContaAgua(8));
    }
    
    @Test
    @DisplayName("Segundo caso de test")
    void testCaseTwoEconomiaAguaEquals(){
        long expected = 11;
        Assertions.assertEquals(expected, economiaAgua.valorContaAgua(14));
    }
    
    @Test
    @DisplayName("Terceiro caso de test")
    void testCaseThreeEconomiaAguaEquals(){
        long expected = 51;
        Assertions.assertEquals(expected, economiaAgua.valorContaAgua(42));
    }
    
    @Test
    @DisplayName("Terceiro caso de test")
    void testCaseFourEconomiaAguaEquals(){
        long expected = 267;
        Assertions.assertEquals(expected, economiaAgua.valorContaAgua(120));
    }
    
}
