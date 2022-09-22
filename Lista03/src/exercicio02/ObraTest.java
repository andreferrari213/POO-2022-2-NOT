package exercicio02;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class ObraTest {

	@Test
	void test() {
		Obra obra = new Obra();
		obra.setTitulo("A escalada do terror");
		obra.setAutor("Fernandinho Beira-mar");
		
		Parecer p1 = new Parecer();
		p1.setParecerista("João de Abreu");
		p1.setConteudo("Livro que não pode ser publicado, pois é um manual do crime.");
		p1.setDate(LocalDate.of(2018, 10, 10));
		
		Parecer p2 = new Parecer();
		p2.setParecerista("Paula Prantos");
		p2.setConteudo("A violência é mostrada de forma cruel. Livro sujeito à censura prévia.");
		p2.setDate(LocalDate.of(2018, 9, 1));
		
		
		
		obra.addParecer(p1);
		obra.addParecer(p2);
		
		assertEquals(2, obra.getQuantidadePareceres());
		assertEquals("João de Abreu", obra.getParecer(0).getParecerista());
	
		assertEquals("A escalada do terror", obra.getTitulo());
	}

}
