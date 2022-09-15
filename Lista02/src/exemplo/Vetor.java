package exemplo;

/**
 * Trabalhando com vetores de 3 dimensões 
 */
public class Vetor {
    //Declarar e instanciar um vetor de 3 dimensões representando DIAS, HORAS e MINUTOS
    private int vetor[][][] = new int[365][24][60];

    //Construtor que adiciona dados fixos ao vetor
    public Vetor(){
        vetor[0][0][0] += 1;
        vetor[364][23][59] = 200;
    }

    /**
     * Retorno do vetor
     * @return um vetor de 3 dimensões
     */
    public int[][][] getVetor() {
        return vetor;
    }

    /**
     * Verifica se uma posição é vazia
     * @return true se a posição é vazia
     */
    public boolean vetorZero(int dia, int hora, int minuto){
        return vetor[dia][hora][minuto] == 0;
    }

    public static void main(String[] args) {
        new Vetor();
    }

    /**
     * Esse método retorna a quantidade total disponível para ser inserida no vetor
     * @return uma quantidade de espaços disponível
     */
    public int getQuantidadeInformacao(){
        int quantidade = 0;
        //"for" na primeira dimensão "dias"
        for (int i = 0; i < vetor.length; i++) {
            //"for" na segunda dimensão "horas"
            for (int j = 0; j < vetor[i].length; j++) {
                //"for" na terceira dimensão "minutos" - deve passar [i] e [j]
                for (int k = 0; k < vetor[i][j].length; k++) {
                    quantidade++;
                }
            }
        }
        return quantidade;
    }
}
