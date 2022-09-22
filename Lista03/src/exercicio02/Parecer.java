package exercicio02;

import java.time.LocalDate;

public class Parecer { 
	
	private String parecerista;
	private LocalDate data;
	private String conteudo;

	public String getParecerista() {
		return parecerista;
	}

	public void setParecerista(String parecerista) {
		if (parecerista != null && parecerista.length()>2) {
			this.parecerista = parecerista;
		} else {
			throw new IllegalArgumentException("Nome do parecerista é obrigatório.");
		}
	}

	public LocalDate getData() {
		return data;
	}

	public void setDate(LocalDate date) {
		this.data = date;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
}
