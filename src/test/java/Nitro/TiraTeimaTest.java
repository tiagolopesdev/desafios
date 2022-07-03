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
@DisplayName("Testes desafio Tira-Teima")
public class TiraTeimaTest {
    
    TiraTeima tiraTeima;
    
    @BeforeEach
    void setup(){
        tiraTeima = new TiraTeima();
    }
    
    @Test
    @DisplayName("First case test")
    void testCaseFirst(){
        String expected = "fora";
        Assertions.assertEquals(expected, tiraTeima.exibiResult(-2, 200));
    }
    
    @Test
    @DisplayName("Secund case test")
    void testCaseSecond(){
        String expected = "dentro";
        Assertions.assertEquals(expected, tiraTeima.exibiResult(432, 10));
    }
    
    @Test
    @DisplayName("Third case test")
    void testCaseThird(){
        String expected = "fora";
        Assertions.assertEquals(expected, tiraTeima.exibiResult(100, 469));
    }        
}
