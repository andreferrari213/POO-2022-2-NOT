package prova;

import java.util.ArrayList;

/**
 * DIAGRAMA DE CLASSE DA PROVA
 * 
 * 	ORÇAMENTO (TODO)			1 <----> 1..*	Produto (PARTE)
 * ------------------------------------				-------------------------
 * numero - int							descricao - String
 * tipo - char							unidadeMedida - char
 * cliente - String						quantidade - int
 * endereco - String						valorUnitario - float
 * telefone - String						dificuldade - char
 * marca - String
 * quilometragem - int
 * horas - int
 * ------------------------------------				-------------------------
 * getValorTotalProdutos() float				getValorTotal() float
 * getMaiorCusto() String
 * getProdutoAltaDificuldade() boolean
 * getValorMaoObra() float
 * getValorTotal() float
 * getDificuldadeMedia() int
 * ------------------------------------				-------------------------
 * 
 * 
 * @author Gabriel Vieira
 *
 */


public class Orcamento {
	
	private int numero;
	private char tipo;
	private String cliente;
	private String endereco;
	private String telefone;
	private String marca;
	private int quilometragem;
	private int horas;
	
	private ArrayList<Produto> produtos;
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public Orcamento() {
		produtos = new ArrayList<>();
	}

	public float getValorTotalProdutos() {
		float total = 0;
		for (Produto produto : produtos) {
			total+= produto.getValorTotal();
		}
		return total;
	}
	
	public String getMaiorCusto() {
		Produto maior = null;
		for (Produto produto : produtos) {
			if (maior == null || produto.getValorTotal() > maior.getValorTotal()) {
				maior = produto;
			}
		}
		if (maior != null) {
			return maior.getDescricao();
		} 
		return "Não existe produto cadastrado nesse or�amento";
	}
	
	public boolean getProdutoAltaDificuldade() {
		for (Produto produto : produtos) {
			if ('A' == produto.getDificuldade()) {
				return true;
			}
		}
		return false;
	}
	
	public float getValorMaoObra() {
		return getHoras() * 70;
	}
	
	public float getValorTotal() {
		float valorTotal = getValorTotalProdutos() + getValorMaoObra();
		
		if ('P' == getTipo()) {
			return valorTotal * 0.9f;
		}
		if ('E' == getTipo()) {
			return valorTotal * 0.93f;
		}
		
		return valorTotal;
	}
	
	public int getDificuldadeMedia() {
		int count = 0;
		for (Produto produto : produtos) {
			if ('M' == produto.getDificuldade()) {
				count++;
			}
		}
		return count;
	}
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
}
