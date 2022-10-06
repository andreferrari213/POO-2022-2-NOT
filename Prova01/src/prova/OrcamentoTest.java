package prova;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrcamentoTest {

	@Test
	void test() {
		Orcamento o = new Orcamento();
		o.setNumero(1023);
		o.setTipo('P');
		o.setCliente("João");
		o.setEndereco("Rua X, 200");
		o.setTelefone("(47) 99999-9999");
		o.setMarca("audi");
		o.setQuilometragem(89002);
		o.setHoras(7);
		
		Produto produto01 = new Produto();
		produto01.setDescricao("Óleo motor");
		produto01.setUnidadeMedida('L');
		produto01.setQuantidade(3);
		produto01.setValorUnitario(24);
		produto01.setDificuldade('M');

		Produto produto02 = new Produto();
		produto02.setDescricao("velas");
		produto02.setUnidadeMedida('P');
		produto02.setQuantidade(4);
		produto02.setValorUnitario(10);
		produto02.setDificuldade('M');
		
		Produto produto03 = new Produto();
		produto03.setDescricao("filtro gasolina");
		produto03.setUnidadeMedida('P');
		produto03.setQuantidade(1);
		produto03.setValorUnitario(34);
		produto03.setDificuldade('B');

		Produto produto04 = new Produto();
		produto04.setDescricao("óleo câmbio");
		produto04.setUnidadeMedida('L');
		produto04.setQuantidade(3);
		produto04.setValorUnitario(89);
		produto04.setDificuldade('A');

		
		o.addProduto(produto01);
		o.addProduto(produto02);
		o.addProduto(produto03);
		o.addProduto(produto04);
		
		assertEquals(413, o.getValorTotalProdutos(), 0.1);
		assertEquals("óleo câmbio", o.getMaiorCusto());
		assertEquals(true, o.getProdutoAltaDificuldade());
		assertEquals(490, o.getValorMaoObra(), 0.1);
		assertEquals(812.7, o.getValorTotal(), 0.1);
		assertEquals(2, o.getDificuldadeMedia());
		
	}

}
