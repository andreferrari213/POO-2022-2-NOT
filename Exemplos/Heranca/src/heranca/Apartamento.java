package heranca;

public class Apartamento extends Imovel {

	private int quantidadeElevadores;
	
	@Override
	public String getResumo() {
		return getEndereco() + " - " + getQuantidadeElevadores();
	}
	
	public void setQuantidadeElevadores(int quantidadeElevadores) {
		this.quantidadeElevadores = quantidadeElevadores;
	}
	
	public int getQuantidadeElevadores() {
		return quantidadeElevadores;
	}
}