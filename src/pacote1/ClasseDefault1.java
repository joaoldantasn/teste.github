package pacote1;

import pacote2.ClassePublica2;

class ClasseDefault1 {
	 
	 private int variavelPrivada;
	 int variavelDefault;
	 protected int variavelProtegida;
	 public int variavelPublica;
	 
	 public static void main(String[] args) {
		
		 ClasseDefault1 cdf1 = new ClasseDefault1();
		 cdf1.variavelPrivada = 1;
		 cdf1.variavelDefault = 1;
		 cdf1.variavelProtegida = 1;
		 cdf1.variavelPublica = 1;
		 
		 ClassePublica1 cpl1 = new ClassePublica1();
		 cpl1.variavelDefault = 1;
		 cpl1.variavelProtegida = 1;
		 cpl1.variavelPublica = 1;
		 //cpl1.variavelPrivada = 1, só é visivel na classe ClassePublica1
		 
		 ClassePublica2 cpl2 = new ClassePublica2();
		//cpl2.variavelPrivada = 1, só é visivel na classe ClassePublica1
		//cpl2.variavelDefault = 1, só é visivel na classe ClassePublica1
		//cpl2.variavelProtected = 1, só é visivel na classe ClassePublica1
		 cpl2.variavelPublica = 1;
		 
		 //ClasseDefault2 cdf2 = new ClasseDefault2();
		 //Não é possivel acessar a classe
	}

	 
}
