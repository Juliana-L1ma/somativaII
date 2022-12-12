package Somativa2;
//invoca o método relatório da classe vendedores
public class VendedorDoAno extends Vendedores {

	public VendedorDoAno(String nome, String numeroDeVendedor) {
		super(nome, numeroDeVendedor);
	}

	public String relatorioDeVendas () {
		return relatorio();
		
	}
}
