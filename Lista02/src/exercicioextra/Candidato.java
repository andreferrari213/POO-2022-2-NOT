package exercicioextra;


public class Candidato {
	
	private String nome;
	private String chapa;
	private int numeroID;
	private int quantidadeVotos;

	public void votar() {
		quantidadeVotos++;
		
	}
	
	public Candidato(String nome, String chapa, int numeroID) {
		this.nome = nome;
		this.chapa = chapa;
		this.numeroID = numeroID;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getChapa() {
		return chapa;
	}

	public void setChapa(String chapa) {
		this.chapa = chapa;
	}

	public int getNumeroID() {
		return numeroID;
	}

	public void setNumeroID(int numeroID) {
		this.numeroID = numeroID;
	}

	public int getQuantidadeVotos() {
		return quantidadeVotos;
	}

	public void setQuantidadeVotos(int quantidadeVotos) {
		this.quantidadeVotos = quantidadeVotos;
	}
}
