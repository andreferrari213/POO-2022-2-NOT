package exemplo;

import java.util.List;

/**
 * Esse código fonte define quais são as implementações que estão disponíveis no software
 * Nesse momento não existe implementação. Para implementar deve ser criado uma classe que "implements" essa interface.
 * Não tem atributos.
 * 
 * @author gabriel vieira
 */
public interface PessoaService {

	/**
	 * Método que adiciona uma pessoa, passando por parâmetro uma pessoa.
	 * @param pessoa
	 */
	void adicionar(Pessoa pessoa);
	
	/**
	 * Lista todas os nomes das pessoas
	 * @return uma lista de nomes de pessoas
	 */
	List<String> getNomePessoas();
	
	/**
	 * Excluir uma pessoa pelo ID
	 * @param id
	 * @return se excluiu o registro
	 */
	boolean excluir(int id);
}
