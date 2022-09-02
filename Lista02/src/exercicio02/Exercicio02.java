package exercicio02;

/**
 * Classe que armazena e processa uma "frase"
 */
public class Exercicio02 {

	private String frase;
	/**
	 * Contrutor que recebe uma frase
	 * @param frase
	 */
	public Exercicio02(String frase) {
		this.frase = frase;
	}
	
	/**
	 * Retorna uma frase
	 * @return frase
	 */
	public String getFrase() {
		return frase;
	}
	
	/**
	 * Faz o processamento da frase e retorna um array de palavras.
	 * Usa o caracter espaço para dividir a frase em palavras (' ').
	 * Esse método não utiliza "split".
	 * @return array (vetor) de palavras
	 */
	public String [] getPalavras() {
		String palavra = "";
		//array temporário, que armazena as palavras encontradas. 
		//Iniciado com 100 porque não sei a quantidades de palavras da frase
		String [] palavras = new String[100];
		int index = 0;
		//Percorre a "frase" caracter por caracter
		for (int i = 0; i < frase.length(); i++) {
			//Se encontrou um caracter "espaço", deve retornar uma palavra.
			if (frase.charAt(i) == ' ') {
				//Se existe uma palavra formada (preenchida) devo guardar no array "palavras"
				if (!"".equals(palavra)) {
					//tenho uma palavra formada;
					palavras[index] = palavra;
					index++;
					//limpar a variável "palavra" para preencher com uma nova palavra
					palavra = "";
				}
			} else {
				palavra += frase.charAt(i);
			}
		}
		//Se após o processamento, a variável "palavra" estiver preenchida, adicionar no array.
		if (!"".equals(palavra)) {
			palavras[index] = palavra;
			index++;
		}
		//Criar um retorno: Um array com capacidade exata de palavras que devo retornar.
		String[] retorno = new String[index];
		for (int i = 0; i < index; i++) {
			retorno[i] = palavras[i];
		}
		//Retorno do array com todas as palavras
		return retorno;
	}

	/**
	 * Método que retorna as palavras usando split.
	 * Esse método não funciona corretamente quando existem mais de um caracter "espaço"
	 * @return
	 */
	public String[] getPalavrasSplit(){
		return this.frase.split(" ");
	}
}
