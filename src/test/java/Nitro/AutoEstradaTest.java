/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nitro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


/**
 *
 * @author tiago
 */
@DisplayName("Classe teste auto estrada")
public class AutoEstradaTest {
    
    AutoEstrada autoEstrada;
    
    @BeforeEach
    void setup(){
        autoEstrada = new AutoEstrada();
    }
    
    @org.junit.jupiter.api.Test
    @DisplayName("Caso de teste um")
    void caseTestOne(){
        int expected = 5;
        Assertions.assertEquals(expected, autoEstrada.exibiResult(5, "DAPCD"));
    }
    
    @org.junit.jupiter.api.Test
    @DisplayName("Caso de teste dois")
    void caseTestTwo(){
        int expected = 12;
        Assertions.assertEquals(expected, autoEstrada.exibiResult(8, "AACCAAPP"));
    }
    
    @org.junit.jupiter.api.Test
    @DisplayName("Caso de teste dois")
    void caseTestThree(){
        int expected = 21;
        Assertions.assertEquals(expected, autoEstrada.exibiResult(14, "ADCCPPPPPAADCP"));
    }
    
}
