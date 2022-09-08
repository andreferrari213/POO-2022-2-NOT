package exercicio03;

public class NameGenerator {
	public static String generateStarWarsName(String[] entrada) {
		String nomeCompleto = entrada[0];
		String sobrenomeNascimentoMae = entrada[1];
		String cidadeNascimento = entrada[2];

		String[] nomeCompletoVetor = nomeCompleto.split(" ");

		String sobrenome = nomeCompletoVetor[nomeCompletoVetor.length - 1];

		String nome = nomeCompletoVetor[0];

		String parteSobrenome = sobrenome.substring(0, Math.min(sobrenome.length(), 3));

		String parteNome = nome.substring(0, Math.min(nome.length(), 2));
		
		String parteSobrenomeMae = sobrenomeNascimentoMae.substring(0, Math.min(sobrenomeNascimentoMae.length(), 2));
		
		String parteCidade = cidadeNascimento.substring(0, Math.min(cidadeNascimento.length(), 3));

		return parteSobrenome + parteNome.toLowerCase() + " " + parteSobrenomeMae + parteCidade.toLowerCase();
	}
}