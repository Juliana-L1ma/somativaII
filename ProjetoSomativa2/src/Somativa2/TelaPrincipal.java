package Somativa2;
//essa classe vai executar
//para imprimir o relatório dessa página somente o gerente com sua senha pode conseguir 

import java.util.Scanner;

public class TelaPrincipal {

	public static void main (String [] args) {
		
		Scanner in = new Scanner (System.in);
		
		Vendedores dadosVendedor1 = new Vendedores ("Ana Clara Moreira", "1234");
		Vendedores dadosVendedor2 = new Vendedores ("Ana Clara Moreira", "1234");
		Vendedores dadosVendedor3 = new Vendedores ("Ana Clara Moreira", "1234");
		
		System.out.println("Digite a senha de segurança para ver o relatório de vendas");
		Gerente g1= new Gerente();
		g1.setSenha(in.nextInt());
		
		
		}
	}
	
	
	
	
	



