package Nitro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe de teste fatorial")
public class FatorialTest {
		
	Fatorial fatorial;
	
	@BeforeEach
	void setUp() {
		fatorial = new Fatorial();
	}
	
	@Test
	@DisplayName("Deve retonar 6, fatorial de 3")
	void deveRetornarFatorialSeis() {
		assertEquals(6, fatorial.exibiNumero(3));
	}
	
	@Test
	@DisplayName("Deve retonar 2, fatorial de 2")
	void deveRetornarFatorialDois() {
		assertEquals(2, fatorial.exibiNumero(2));
	}
	
	@Test
	@DisplayName("Deve retonar 3628800, fatorial de 10")
	void deveRetornarFatorialDez() {
		assertEquals(3628800, fatorial.exibiNumero(10));
	}		
}
