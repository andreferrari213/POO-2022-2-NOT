package exemplo;

public class Vetor {
    
    private int vetor[][][] = new int[365][24][60];

    public Vetor(){
        vetor[0][0][0] += 1;

        vetor[364][23][59] = 200;
    }

    public int[][][] getVetor() {
        return vetor;
    }

    public boolean vetorZero(){
        return vetor[0][0][0] == 0;
    }
}
