package correcaoSomativa;

public class Vendedores {
	//ID dos vendedores
	private int [] idVendedores = {100, 200, 300};

   //NOME dos vendedores
	private String [] nomeVendedores = {"Abel", "Beto", "Carlos"};
	
	//TOTAL VENDIDO por vendedores
	private double [] totalVendido = {0, 0, 0};
	
	
	public int[] getIdVendedores() {
		return idVendedores;
	}

	public String[] getNomeVendedores() {
		return nomeVendedores;
	}

	//MÉTODO para imprimir a relação de vendedores
	public void vendedores () {
		
		//imprimir cada id e nome de cada vendedor
		for (int x=0; x<3; x++) {
			//imprimindo o id e nome
			System.out.println("ID: " + idVendedores[x] + "\nNome: " + nomeVendedores[x]);
		}
	}
	
	//MÉTODO de relatório por cada vendedor
	public void relatorio () {
		//imprime ID, NOME e TOTAL VENDIDO
		for(int x=0; x<3; x++) {
			System.out.println("ID: " + idVendedores[x] + "\nNome: " + nomeVendedores[x] + "\nTotal vendido: R$" + totalVendido[x]);
		}
		
	}
	
	//busca os dados do vendedor que está realizando a venda
	public void chamaVendedor (int id) {
		//busca id escolhido
		for(int x=0; x<3; x++) {
			if(idVendedores[x] == id) {
				System.out.println("ID: " + this.idVendedores[x] + "\nVendedor: " + this.nomeVendedores[x]);
				
				
			}
		}
	}
	
	//MÉTODO de vendas realizadas por cada vendedor
	public void vendasRealizadas (int idVendedor, double valorDaVenda) {
		//buscar ID e LOCALIZAR INDICE DO VETOR
		for(int x=0; x<3; x++) {
			if (idVendedores[x] == idVendedor) {
				//carrega o indice de vendas do vendedor
				totalVendido[x] =+ valorDaVenda;
				System.out.println("Venda realizada com sucesso");
			}
		}
		
	}
}
