package exercicioextra;

import java.util.ArrayList;

public class Votacao {

	private ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
	private int votosNulos;

	public void cadastrar(String nome, String chapa, int numeroID) {
		candidatos.add(new Candidato(nome, chapa, numeroID));

	}

	public void votar(int numeroID) {
		for (Candidato voto : candidatos) {
			if (voto.getNumeroID() == numeroID) {
				voto.votar();
				return;
			}
		}
		votosNulos++;
	}

	public Candidato getVencedor() {
		Candidato candidatoMaisVotos = null;
		int maior = 0;
		for (Candidato candidato : candidatos) {
			if (candidato.getQuantidadeVotos() > maior) {
				candidatoMaisVotos = candidato;
				maior = candidato.getQuantidadeVotos();
			}
		}

		return candidatoMaisVotos;

	}

	public int getVotosNulos() {
		return votosNulos;
	}

}
