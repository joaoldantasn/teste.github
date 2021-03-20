package pacote2;

import pacote1.ClassePublica1;

public class ClasseDefault2 {
	
	private int variavelPrivada;
	int variavelDefault;
	protected int variavelProtegida;
	public int variavelPublica;
	
	public static void main(String[] args) {
		
		ClasseDefault2 cd2 = new ClasseDefault2();
		cd2.variavelDefault = 1;
		cd2.variavelPrivada = 1;
		cd2.variavelProtegida = 1;
		cd2.variavelPublica = 1;
		
		ClassePublica2 cp2 = new ClassePublica2();
		cp2.variavelDefault = 1;
		cp2.variavelProtegida = 1;
		cp2.variavelPublica = 1;
		//cp2.variavelPrivada = 1, só é visivel na classe
		
		
		ClassePublica1 cp1 = new ClassePublica1();
		cp1.variavelPublica = 1;
		//cp1.variavelPrivada = 1, só é visivel na classe
		//cp1.variavelProtected = 1, só é visivel na classe
		//cd1.variavelDefault = 1, só é visivel na classe
		
		
		//ClasseDefault2 cd2 = new //ClasseDefault2();
		// não é possivel acessar a classe, pacotes diferentes
		
	}

}
