package Somativa2;
//aqui contém dados dos vendedores e suas vendas, 
public class Vendedores implements acessoVendedor{
	//parte do método para dados dos vendedores
	private String nome;
	private String id;
	
	 private int senhavendedor123 = 111;
	 private int senhavendedor456 = 222;
	 private int senhavendedor789 = 333;
	 
	 public int senhavendedor123() {
			return senhavendedor123;
	 }
	 
	 public int senhavendedor456() {
			return senhavendedor456;
	 }
	 
	 public int senhavendedor789() {
			return senhavendedor789;
	 }
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
	//todos vendedores terão um saldo inicial de R$ 2000 a partir das compras feitas eles irão aumentando seu saldo
	private double totalvendido = 2000;
	double vendasRealizadas;
	
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
		return vendasRealizadas = valorDaVenda + totalvendido;
	}
	
	//parte para o método relatório 
	public String relatorio () {
		
		return " Nome: " + nome + "\n Id: " + id + "\n Total Vendido: " + (valorDaVenda + totalvendido);
	}
}
