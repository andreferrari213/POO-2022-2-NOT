package exemplo;

import java.util.ArrayList;

/**
 * Classe que mostra exemplos de uso do ArrayList.
 */
public class Lista {

    //Atributo da classe: declaração de um ArrayList do tipo String
    private ArrayList<String> lista;

    /**
     * Contrutor da class Lista
     */
    public Lista(){
        //Instanciar um ArrayList
        lista = new ArrayList<>();

        //Adicionar dados em uma lista
        lista.add("Nome 01");
        lista.add("Nome 02");

        //Alterar a lista na posição zero para "Nome 03"
        lista.set(0, "Nome 03");
        
        //Imprimir o conteúdo da lista no índice "0" (primeiro registro da lista)
        System.out.println("Primeiro elemento da lista: " + lista.get(0));

        //Remove da lista uma ou mais String que contém "Nome 02"
        lista.remove("Nome 02");

        //Limpa todo o conteúdo da lista
        lista.clear();
    
        System.out.println("----------");

        //Verifica se a lista é vazia
        System.out.println("Lista está vazia? " + lista.isEmpty());

        System.out.println("----------");

        //Verifica se existe uma string "Nome 04" na lista
        System.out.println("Existe um Nome 04 na lista? " + lista.contains("Nome 04"));

        System.out.println("----------");

        //Retorna o tamanho 
        int tamanhoLista = lista.size();

        System.out.println("Tamanho da lista: " + tamanhoLista);

        //Adiciona um novo nome
        lista.add("Nome 04");

        System.out.println("----------");

        //foreach - navega em todo o conteúdo da lista, linha a linha, começando do primeiro até o último elemento.
        //primeiro dado "String": representa o tipo de dado que a minha lista possui
        //segundo dado "valor": representa o conteúdo da linha da lista. 
        //terceiro dado "lista": representa a lista que possui o conteúdo.
        for (String valor : lista){
            //Vai imprimir todas as linhas da lista.
            System.out.println("Linha: " + valor);
        }

        System.out.println("----------");

        //for tradicional: igual ao utilizado em vetor, só muda a forma como a informação é recuperada
        for (int i = 0; i < lista.size(); i++) {
            //para acessar um elemento, usa-se o get(index)
            System.out.println("Linha: " + lista.get(i));
        }
        
        System.out.println("----------");

        //Carregar uma lista com 10 números
        ArrayList<Integer> listaInteiros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listaInteiros.add(i);
        }

        //Listar os 10 números no console
        for (Integer linha : listaInteiros) {
            System.out.println("Número: "+linha);
        }

    }

    public static void main(String[] args) {
        new Lista();
    }
}
