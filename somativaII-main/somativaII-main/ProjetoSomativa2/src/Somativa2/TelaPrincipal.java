package Somativa2;
//essa classe vai executar
//para imprimir o relatório dessa página somente o gerente com sua senha pode conseguir 

import java.util.Scanner;

public class TelaPrincipal implements Produtos{

	public static void main (String [] args) {
		
		Scanner in = new Scanner (System.in);
		Gerente gerente1= new Gerente();

		
		Vendedores vendedor1 = new Vendedores ("Maria Clara", "123");
		Vendedores vendedor2 = new Vendedores ("José Carlos", "456");
		Vendedores vendedor3 = new Vendedores ("Antonio Bandeira", "789");
		
		Vendedores vetor [] = new Vendedores [3];
		
		vetor[0] = vendedor1;
		vetor[1] = vendedor2;
		vetor[2] = vendedor3;
		
		
		System.out.println("Para prosseguir sua venda digite seu nome completo: ");
		String nomeCliente = in.nextLine();
		
	    in.nextLine();
	    
	    System.out.println("Qual o id do vendedor que você está comprando ?");
	    String  id = in.nextLine();
	    
	    if(id.equals("123")) {
	    	System.out.println();
	    	System.out.println("Resumo da compra : " + "\n Cliente: " + nomeCliente + "\n2 " + Produtos.produto465 +  " no valor de " + Produtos.valorProduto465 );
	    	double valorTotal = 2*Produtos.valorProduto465;
	  
	    	System.out.println("Valor total: " + valorTotal );
	    	System.out.println();
	    	System.out.println("Confirmar compra, 1 para sim, 2 para não");
	    	System.out.println();	
	    	int confirm = in.nextInt();
	    	if (confirm == 1) {
	    		System.out.println("Obrigado por comprar conosco !");
	    	}
	 	    System.out.println("********************************************************");	
	    	
	    System.out.println();	
	    System.out.println("********************************************************");	
	    System.out.println();
	    System.out.println("Digite a senha para ver os relatórios dos vendedores");
        int senha = in.nextInt();
        
        if (senha == gerente1.getSenha()) {
        	
        	System.out.println("Abaixo você verá os relatórios dos vendedores");
        	vendedor1.relatorio("Maria Clara", "123", senha);
        	
        	System.out.println("Nome");
            
        	
	    }else {
	    	System.out.println("Senha incorreta acessso negado");
	    	
	    }
        vendedor1.setValorDaVenda(valorTotal);
    	System.out.println(vendedor1.vendasRealizadas());
    	
		}
	}
}
	





	
	
	



