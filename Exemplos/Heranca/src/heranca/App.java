package heranca;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		
		Apartamento a = new Apartamento();
		a.setCodigo(100);
		a.setDataCompra(LocalDate.of(2022, 1, 10));
		a.setEndereco("Rua YYY, 108");
		a.setLocalizacao("Blumenau, SC");
		a.setQuantidadeElevadores(2);
		
		System.out.println("Resumo apartamento: " + a.getResumo());


		Casa c = new Casa();
		c.setCodigo(999);
		c.setDataCompra(LocalDate.of(2021, 10, 1));
		c.setEndereco("Rua UUU, 100");
		c.setLocalizacao("Timbó, SC");
		c.setTamanhoGaragem(40);
		c.setTamanhoJardim(40);
		
		System.out.println("Resumo casa: " + c.getResumo());
	}

}
