package Somativa2;

public interface acessoVendedor {

 int senhavendedor123 = 111;
 int senhavendedor456 = 222;
 int senhavendedor789 = 333;	
	
	
	static boolean senhaSeguranca1(int senha) {
		if (senhavendedor123 == senha) {
			return true;
		}else {
			return false;
		}
		
	}
	
	static boolean senhaSeguranca2(int senha) {
		if (senhavendedor456 == senha) {
			return true;
		}else {
			return false;
		}
		
	}
	
	static boolean senhaSeguranca3(int senha) {
		if (senhavendedor789 == senha) {
			return true;
		}else {
			return false;
		}
		
	}
}
