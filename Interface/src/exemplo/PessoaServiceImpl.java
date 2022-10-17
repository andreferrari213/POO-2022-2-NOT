package exemplo;

import java.util.ArrayList;
import java.util.List;

/**
 * Essa classe é a implementação de "PessoaService". Aqui devemos implementar todos os métodos definidos na interface.
 * 
 * "implements" deve ser uma interface que define métodos.
 * 
 * Essa classe é uma classe comum, a única diferença é que ela DEVE implementar métodos definidos na interface
 * 
 * 
 * No nome da classe, é adicionado "Impl", que sinifica "Implementação" de uma interface.
 * 
 * 
 * @author gabriel vieira
 *
 */
public class PessoaServiceImpl implements PessoaService {

	
	public List<Pessoa> lista = new ArrayList<>();
	
	@Override
	public void adicionar(Pessoa pessoa) {
		lista.add(pessoa);
	}

	@Override
	public List<String> getNomePessoas() {
		List<String> retornos = new ArrayList<>();
		
		for (Pessoa pessoa : lista) {
			retornos.add(pessoa.getNome());
		}
		
		return retornos;
	}

	@Override
	public boolean excluir(int id) {
		for (Pessoa pessoa : lista) {
			if (pessoa.getId() == id) {
				lista.remove(pessoa);
				return true;
			}
		}
		return false;
	}

}
