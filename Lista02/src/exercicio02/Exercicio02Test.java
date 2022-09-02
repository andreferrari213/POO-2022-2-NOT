package exercicio02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * Teste unitário do exercício 02.
 *
 */
class Exercicio02Test {

	@Test
	void test() {
		Exercicio02 objeto = new Exercicio02("ISTO       é UM  TESTE");
		String[] palavras = objeto.getPalavras();

		assertEquals("ISTO", palavras[0]);
		assertEquals("é", palavras[1]);
		
		assertEquals(4, palavras.length);
	}

}
