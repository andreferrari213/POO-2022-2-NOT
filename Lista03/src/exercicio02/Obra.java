package exercicio02;

public class Obra {
	
	private String titulo;
	private String autor;
	private Parecer[] pareceres = new Parecer[3];
	private int posicaoParecer;

	public void addParecer(Parecer parecer) {
		if (parecer != null && this.posicaoParecer < this.pareceres.length) {
			this.pareceres[this.posicaoParecer] = parecer;
			posicaoParecer++;
		} else {
			throw new IllegalArgumentException("Problemas com parecer. Não há mais espaço para novos pareceres.");
		}
	}

	public int getQuantidadePareceres() {
		return this.posicaoParecer;
	}
	
	public Parecer getParecer(int posicao) {
		return this.pareceres[posicao];
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
