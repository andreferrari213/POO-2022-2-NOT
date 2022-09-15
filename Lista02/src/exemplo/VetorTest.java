package exemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * Classe de teste que valida a implementação da classe Vetor
 *
 */
class VetorTest {

	@Test
	void test() {
		Vetor objeto = new Vetor();
		
		//Quantidade de espaços disponível: 365 * 24 * 60
		assertEquals(525600, objeto.getQuantidadeInformacao());
		
		//O vetor é definido no construtor: a posição 0 0 0 está definido com o valor "1"
		assertEquals(1, objeto.getVetor()[0][0][0]);
		
		//Verifica se o objeto não é nulo
		assertNotNull(objeto);
		
	}

}
