package Somativa2;
//aqui contém dados dos vendedores e suas vendas, 
public class Vendedores {
	//parte do método para dados dos vendedores
	private String nome;
	private String numeroDeVendedor;
	private int totalVendido;
	private int valorDaVenda;
	
	public int getTotalVendido() {
		return totalVendido;
	}
	public void setTotalVendido(int totalVendido) {
		this.totalVendido = totalVendido;
	}
	public int getValorDaVenda() {
		return valorDaVenda;
	}
	public void setValorDaVenda(int valorDaVenda) {
		this.valorDaVenda = valorDaVenda;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroDeVendedor() {
		return numeroDeVendedor;
	}
	public void setNumeroDeVendedor(String numeroDeVendedor) {
		this.numeroDeVendedor = numeroDeVendedor;
	}
	
	public Vendedores (String nome, String numeroDeVendedor) {
    	this.nome = nome;
		this.numeroDeVendedor = numeroDeVendedor;
	}
	
	double vendaRealizada = valorDaVenda + totalVendido;
	
	
}
