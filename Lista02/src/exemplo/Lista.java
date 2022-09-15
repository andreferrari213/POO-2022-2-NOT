package exemplo;

import java.util.ArrayList;

public class Lista {

    //Lista do tipo String
    private ArrayList<String> lista = new ArrayList<>();

    public Lista(){
        lista.add("Nome 01");
        lista.add("Nome 02");

        //Alterar a lista na posição zero para "Nome 03"
        lista.set(0, "Nome 03");
        
        //Remove da lista uma ou mais String que contém "Nome 02"
        lista.remove("Nome 02");

        //Limpa todo o conteúdo da lista
        lista.clear();
    
        //Verifica se a lista é vazia
        lista.isEmpty();
        //Verifica se existe uma string "Nome 04" na lista
        lista.contains("Nome 04");
        //Retorna o tamanho 
        lista.size();
        //Adiciona um novo nome
        lista.add("Nome 04");

        for (String valor : lista){
            System.out.println(valor);
        }
    }

    public static void main(String[] args) {
        new Lista();
    }
}
