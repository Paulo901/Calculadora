package testes;

import sistema.Numeros;

public class TesteLogica {

	public static void main (String[] args) {
		
		Numeros Teste = new Numeros();
	
		Teste.setGetnumero("1");
	    Teste.setGetnumero("1");
	    
		
		System.out.println(Teste.getConcatena());
		System.out.println(Teste.getNumero());
		Teste.setResultado( Teste.getNumero());
		Teste.setOperações("-");
		Teste.setConcatena("");
		Teste.setGetnumero("4");
	
		Teste.calculo();
		Teste.getResultado();
		System.out.println(Teste.getResultado() );

		Teste.setResultado(-20.0);
		System.out.println(Teste.getResultado());

	}
}
