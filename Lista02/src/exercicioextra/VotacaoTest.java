package exercicioextra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VotacaoTest {

	@Test
	void votacao_chapa01() {
		Votacao v1 = new Votacao();
		v1.cadastrar("Gabriel", "chapa01", 9);
		v1.cadastrar("João", "chapa02", 3);
		v1.cadastrar("Susana", "chapa02", 5);

		v1.votar(9);
		v1.votar(2);
		v1.votar(9);
		v1.votar(3);
		v1.votar(9);
		v1.votar(3);
		v1.votar(3);
		
		assertEquals("Gabriel", v1.getVencedor().getNome());
		assertEquals(1, v1.getVotosNulos());
		}

	
	@Test
	void votacao_sem_candidato() {
		Votacao v2 = new Votacao();
	
		assertNull(v2.getVencedor());
		assertEquals(0, v2.getVotosNulos());
	}
	
	@Test
	void votacao_sem_vencedor() {
		Votacao v3 = new Votacao();
		v3.cadastrar("Gabriel", "chapa01", 9);

		
		assertNull(v3.getVencedor());
	}
	

}
