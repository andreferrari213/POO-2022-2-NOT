package prova;

public class Produto {

	private String descricao;
	private char unidadeMedida;
	private int quantidade;
	private float valorUnitario;
	private char dificuldade;
	
	public float getValorTotal() {
		return this.getQuantidade() * this.getValorUnitario();
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public char getUnidadeMedida() {
		return unidadeMedida;
	}
	
	public void setUnidadeMedida(char unidadeMedida) {
		if (unidadeMedida == 'L' || unidadeMedida == 'P') {
			this.unidadeMedida = unidadeMedida;
		}
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public float getValorUnitario() {
		return valorUnitario;
	}
	
	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public char getDificuldade() {
		return dificuldade;
	}
	
	public void setDificuldade(char dificuldade) {
		if (dificuldade == 'A' || dificuldade == 'M' || dificuldade == 'B') {
			this.dificuldade = dificuldade;
		}
	}
}
