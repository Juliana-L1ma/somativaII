package Somativa2;
//aqui contém dados dos vendedores e suas vendas, 
public class Vendedores extends DadosVendedores{
	//parte do método para dados dos vendedores
	private String nome;
	private String id;
	
    
	public Vendedores(String nome, String id) {
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	//parte do método para Vendas realizadas
	private double valorDaVenda;
	private double totalvendido = 2000;
	
	public double getTotalvendido() {
		return totalvendido;
	}

	public void setTotalvendido(double totalvendido) {
		this.totalvendido = totalvendido;
	}
	
	public double getValorDaVenda() {
		return valorDaVenda;
	}

	public void setValorDaVenda(double valorDaVenda) {
		this.valorDaVenda = valorDaVenda;
	}

	public double vendasRealizadas () {
		double vendasRealizadas = valorDaVenda + totalvendido;
		return vendasRealizadas ;
	}
	
	//parte para o método relatório 
	public String relatorio (String nome, String id, double totalVendido) {
		
		return  nome + id + totalVendido;
	}
}
