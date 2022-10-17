package exemplo;

import java.util.List;

public class App {

	public static void main(String[] args) {
		
		
		//service é uma interface, mas a instância é a implementação.
		//Sempre fizemos o "new" da implementação.
		PessoaService service = new PessoaServiceImpl();
		
		//Criar uma classe pessoa para adicinar os dados de pessoa.
		Pessoa p = new Pessoa();
		p.setId(10);
		p.setNome("Maria");
		
		
		//A interface mostra que temos o método adicionar.
		//Essa chamada vai na implementação do serviço, adicionar na lista.
		service.adicionar(p);
		
		
		//A interface mostra que temos o método para retornar nome de pessoas.
		List<String> nomes = service.getNomePessoas();
		
		
		//Apresentar todas as pessoas
		for (String nome : nomes) {
			System.out.println("Nome: "+nome);
		}		
	}
}
