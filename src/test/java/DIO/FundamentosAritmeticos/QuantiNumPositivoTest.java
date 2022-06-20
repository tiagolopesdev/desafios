/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIO.FundamentosAritmeticos;

import DIO.Fundamentos_aritmeticos.QuantiNumPositivo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author tiago
 */
@DisplayName("Quantidade de numeros positivos")
public class QuantiNumPositivoTest {
    
    QuantiNumPositivo quantiNumPositivo;
    
    @BeforeEach
    void setup(){
        quantiNumPositivo = new QuantiNumPositivo();
    }
    
    @Test
    @DisplayName("Test método numeros positivos")
    void testQntNumbersPositivos(){
        String expected = "4 valores positivos";
        double[] values = {7,-5,6,-3.4,4.6,12};        
        Assertions.assertEquals(expected, quantiNumPositivo.verificaNumber(values));
    }
    
}
