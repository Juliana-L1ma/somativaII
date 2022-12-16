package correcaoSomativa;

public class Gerente {
	//atribuir uma senha para o gerente
	private int senha = 123;
	
	//método para conferir a senha
	public boolean senhaDeAcesso (int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
		
	}
}
