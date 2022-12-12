package Somativa2;
//método de senha

public class Gerente{
	

   private int senha = 123;
	
	
	public int getSenha() {
		return senha;
	}
	
	boolean senhaSeguranca(int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
		
	}
	

}
