package pacote1;

import pacote2.ClassePublica2;

public class ClassePublica1 {
	
	private int variavelPrivada;
	
	int variavelDefault;
	
	protected int variavelProtegida;
	
	public int variavelPublica;
	
	public static void main(String[] args) {
		 ClassePublica1 cp1 = new ClassePublica1();
		 cp1.variavelDefault = 1;
		 cp1.variavelPrivada = 1;
		 cp1.variavelProtegida = 1;
		 cp1.variavelPublica = 1;
		 
		 ClasseDefault1 cd1 = new ClasseDefault1();
		 cd1.variavelDefault = 1;
		 cd1.variavelProtegida = 1;
		 cd1.variavelPublica = 1;
		 //cd1.variavelPrivada = 1, só é visivel na classe
		 
		 ClassePublica2 cp2 = new ClassePublica2();
		 cp2.variavelPublica = 1;
		//cp2.variavelPrivada = 1, só é visivel na classe
		//cp2.variavelProtected = 1, só é visivel na classe
		//cp2.variavelDefault = 1, só é visivel na classe
		 
		 //ClasseDefault2 cd2 = new ClasseDefault2();
		 //não é possivel acessar a classe
	}
	
	

}
