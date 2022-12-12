package Somativa2;
//essa classe vai executar

//para imprimir o relatório dessa página somente o gerente com sua senha pode conseguir 

import java.util.Scanner;

public class TelaPrincipal implements Produtos {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Gerente gerente1 = new Gerente();

		Vendedores vendedor1 = new Vendedores("Maria Clara", "123");
		Vendedores vendedor2 = new Vendedores("José Carlos", "456");
		Vendedores vendedor3 = new Vendedores("Antonio Bandeira", "789");
        //VendedorDoAno metodo = new VendedorDoAno(null, null);
        
		System.out.println("Para prosseguir sua venda digite seu nome completo: ");
		String nomeCliente = in.nextLine();

		in.nextLine();

		System.out.println("Qual o id do vendedor que você está comprando ?");
		String id = in.nextLine();

		// se for o vendedor 123
		if (id.equals("123")) {
			System.out.println();
			System.out.println(
					"Resumo da compra, veja se é esse pedido que você fez na página anterior : " + "\n Cliente: "
							+ nomeCliente + "\n2 " + Produtos.produto465 + " no valor de " + Produtos.valorProduto465);
			vendedor1.setValorDaVenda(2 * Produtos.valorProduto465);
			System.out.println("Valor total: " + vendedor1.getValorDaVenda());
			System.out.println();
			System.out.println("Confirmar compra, 1 para sim, 2 para não");
			System.out.println();
			int confirm = in.nextInt();
			if (confirm == 1) {
				System.out.println("Obrigado por comprar conosco !");
			}
		}

		// se for o vendedor 456
		if (id.equals("456")) {
			System.out.println();
			System.out.println(
					"Resumo da compra, veja se é esse pedido que você fez na página anterior : " + "\n Cliente: "
							+ nomeCliente + "\n1 " + Produtos.produto555 + " no valor de " + Produtos.valorProduto555
							+ "\n1 " + Produtos.produto777 + " no valor de " + Produtos.valorProduto777);
			vendedor2.setValorDaVenda( (Produtos.valorProduto555 + Produtos.valorProduto777) );

			System.out.println("Valor total: " + vendedor2.getValorDaVenda());
			System.out.println();
			System.out.println("Confirmar compra, 1 para sim, 2 para não");
			System.out.println();
			int confirm = in.nextInt();
			if (confirm == 1) {
				System.out.println("Obrigado por comprar conosco !");
			}

		}
		//SE FOR O VENDEDOR 789
		if (id.equals("789")) {
			System.out.println();
			System.out.println(
					"Resumo da compra, veja se é esse pedido que você fez na página anterior : " + "\n Cliente: "
							+ nomeCliente + "\n1 " + Produtos.produto332 + " no valor de " + Produtos.valorProduto332
							+ "\n1 " + Produtos.produto101 + " no valor de " + Produtos.valorProduto101);
			vendedor3.setValorDaVenda(( Produtos.valorProduto332 + Produtos.valorProduto101));

			System.out.println("Valor total: " + vendedor3.getValorDaVenda());
			System.out.println();
			System.out.println("Confirmar compra, 1 para sim, 2 para não");
			System.out.println();
			int confirm = in.nextInt();

			if (confirm == 1) {
				System.out.println("Obrigado por comprar conosco !");
			}
		}

		System.out.println();
		System.out.println("********************************************************");
		System.out.println("Digite 1 se você é gerente ou 2 se você é vendedor");
		int patente = in.nextInt();

		if (patente == 1) {
			System.out.println();
			System.out.println("Digite a senha para ver os relatórios dos vendedores");
			int senha = in.nextInt();
			if (senha == gerente1.getSenha()) {
				System.out.println("Abaixo você verá os relatórios dos vendedores");
				
				//não consegui pegar o relatorio da classe vendedor do ano 
				System.out.println(vendedor1.relatorio());
				System.out.println();
				System.out.println(vendedor2.relatorio());
				System.out.println();
				System.out.println(vendedor3.relatorio());
				  
			}
		} 
		
		//impressão caso seja o vendedor que queira ver
		if (patente == 2) {
			System.out.println("Digite a senha para ver o seu relatório");
			int senhaVendedor = in.nextInt();
			if (senhaVendedor == vendedor1.senhavendedor123()) {
				System.out.println("Abaixo você verá os relatórios dos vendedores");
				System.out.println(vendedor1.relatorio());
			}
			if (senhaVendedor == vendedor2.senhavendedor456()) {
				System.out.println("Abaixo você verá os relatórios dos vendedores");
				System.out.println(vendedor2.relatorio());
			}
			if (senhaVendedor == vendedor3.senhavendedor789()) {
				System.out.println("Abaixo você verá os relatórios dos vendedores");
				System.out.println(vendedor3.relatorio());
			}
		} 

		in.close();
	}

}
