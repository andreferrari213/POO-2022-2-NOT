package exercicio04;

public class Expressao {

    private String exp;

    public Expressao(String exp) {
        this.exp = exp;
    }

    public boolean estaCorretaSintaticamente() {

        boolean corretaSintaticamente;
        int validacao = 0, abertura = 0, fechamento = 0;
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(' || exp.charAt(i) == ')') {
                validacao++;
                if (exp.charAt(i) == '(') {
                    abertura++;
                }
                if (exp.charAt(i) == ')') {
                    fechamento++;
                }
            }

        }
        if ((validacao % 2 == 0) && abertura == fechamento) {
            corretaSintaticamente = true;
        } else {
            corretaSintaticamente = false;
        }

        return corretaSintaticamente;
    }

    public int getQtdeDivisores() {
        int qtdDivisores = 0;
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '/') {
                qtdDivisores++;
            }
        }
        return qtdDivisores;
    }

    public int getPosicaoOperador() {
        int posicao = -1;
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '*' || exp.charAt(i) == '/' || exp.charAt(i) == '+' || exp.charAt(i) == '-') {
                posicao = i;
                break;
            }
        }

        return posicao;
    }

    public static void main(String[] args) {
        Expressao exp = new Expressao("(a+10)/(23*(10.5-b)-2.59/(b*a))");
        System.out.println(exp.estaCorretaSintaticamente());
        System.out.println(exp.getQtdeDivisores());
        System.out.println(exp.getPosicaoOperador());
        
    }

}