package exercicio5;

public class InteiroPositivo {

	private int x;
	
	public void setValor(int valor) {
		if (valor > 0) {
			this.x = valor;
		}
	}

	public int getX() {
		return x;
	}

	public int multiplicar(InteiroPositivo objeto) {
		return this.x * objeto.getX();
	}
	
	public int dividir() {
		return 0;
	}
	
}
