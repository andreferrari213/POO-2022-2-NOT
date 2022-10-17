package exercicio01;

import java.time.LocalDate;

public abstract class Telefone {
	private String numeroTelefone;
	protected String nomeUsuario;  // para exemplificar
	private String enderecoInstalacao;
	private LocalDate dataInstalacao;
	
	
	public Telefone(String numero, String nome, String endereco, LocalDate data) {
		this.setNumeroTelefone(numero);
		this.setNomeUsuario(nome);
		this.setEnderecoInstalacao(endereco);
		this.setDataInstalacao(data);
	}

	public abstract double getValorBasico();
	
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getEnderecoInstalacao() {
		return enderecoInstalacao;
	}
	public void setEnderecoInstalacao(String enderecoInstalacao) {
		this.enderecoInstalacao = enderecoInstalacao;
	}
	public LocalDate getDataInstalacao() {
		return dataInstalacao;
	}
	public void setDataInstalacao(LocalDate dataInstalacao) {
		this.dataInstalacao = dataInstalacao;
	}
	
	public String exibir() {
		String str = "Telefone:"+this.getNumeroTelefone()
					+"\nUsu�rio: "+this.nomeUsuario // para exemplificar o protected
					+"\nEndere�o de instala��o:"+this.getEnderecoInstalacao()
					+"\nData de instala��o:"+this.getDataInstalacao()
					+"\nValor b�sico: R$"+this.getValorBasico();
		return str;
	}
	
}
