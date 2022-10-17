package heranca;

import java.time.LocalDate;

/**
 * Uma classe abstract representa um conteúdo base que será utilizado pelas classes filhas
 * Classe "Casa" e "Apartamento" são imóveis, por isso elas são subclasses de Imovel.
 *
 */
public abstract class Imovel {

	private Integer codigo;
	private String endereco;
	private String localizacao;
	private LocalDate dataCompra;
	
	public Imovel() {

	}

	public abstract String getResumo();

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco != null && !endereco.isEmpty()) {
			this.endereco = endereco;			
		} else {
			throw new IllegalArgumentException("Endereço não pode ser vazio.");
		}
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		if (localizacao != null && !localizacao.isEmpty()) {
			this.localizacao = localizacao;
		} else {
			throw new IllegalArgumentException("Localização não pode ser vazio.");			
		}
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDate dataCompra) {
		if (dataCompra != null && dataCompra.isBefore(LocalDate.now())) {
			this.dataCompra = dataCompra;
		} else {
			throw new IllegalArgumentException("Data da compra é inválida.");						
		}
	}
}
