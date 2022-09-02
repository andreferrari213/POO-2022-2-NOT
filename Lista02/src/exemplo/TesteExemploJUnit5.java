package exemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * Classe exemplo de teste usando JUnit5
 *
 */
class TesteExemploJUnit5 {

	@Test
	void test() {
		assertEquals("igual", "igual");
		assertNotEquals("naoIgual", "igual");
	}

}
