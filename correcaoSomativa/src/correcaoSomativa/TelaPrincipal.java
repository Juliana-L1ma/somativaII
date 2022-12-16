package correcaoSomativa;

import java.util.Scanner;

public class TelaPrincipal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		Vendedores vendedores = new Vendedores ();
		Gerente gerente = new Gerente();
		VendedorDoAno vendedorDoAno = new VendedorDoAno();
		
		int loop = 0;
		
		while(loop<1) {
			//imprimir escolhas 
			System.out.println("O que você deseja fazer?" + "\n1 - Realizar venda" + "\n2 - Imprimir relatório " + "\n3 - Finalizar");
			int escolha = in.nextInt();
			
			//coletar a escolha no console
			if (escolha == 1) {
				System.out.println("Escolha o ID do vendedor");
				//imprime os dados dos vendedores
				vendedores.vendedores();
				
				//atribuir o ID do vendedor 
				int id = in.nextInt();
				
				//limpar o console
				in.nextLine();
				
				System.out.println("Escolha o produto desejado");
				String produto = in.nextLine();
				
				//valor do produto
				System.out.println("Informe o valor do produto");
				double valorDoProduto = in.nextDouble();
				
				//imprime os dados da compra para conferir 
				vendedores.chamaVendedor(id);
				System.out.println("Produto: " + produto + "\nValor do produto: " + valorDoProduto);
				
				System.out.println("Confirma a compra?" + "\n 1 - Sim   2 - Não");
				int confirm = in.nextInt();
				if(confirm ==1 ) {
					vendedores.vendasRealizadas(id, valorDoProduto);
				}else {
					System.out.println("Compra cancelada");
				}
				
				}
			
			if (escolha == 2) {
				
			}

			if (escolha == 3) {
				loop=1;
	
			}
		
		}
		
		
		in.close();
	}

}
