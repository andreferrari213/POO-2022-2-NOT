package heranca;

/**
 * Uma casa é um imóvel, por isso existe o "extends" de Imovel.
 * Todos os atributos e métodos de Imovel estão presentes na classe Casa.
 * Aqui serão definidos novos atributos somente para Cassa
 *
 */
public class Casa extends Imovel{
	
	private int tamanhoJardim;
	private int tamanhoGaragem;
	
	@Override
	public String getResumo() {
		return getEndereco() + " - " + getTamanhoJardim() + 
				" - " + getTamanhoGaragem();
	}
	
	public int getTamanhoJardim() {
		return tamanhoJardim;
	}
	
	public void setTamanhoJardim(int tamanhoJardim) {
		this.tamanhoJardim = tamanhoJardim;
	}
	
	public int getTamanhoGaragem() {
		return tamanhoGaragem;
	}
	
	public void setTamanhoGaragem(int tamanhoGaragem) {
		this.tamanhoGaragem = tamanhoGaragem;
	}
	
}
