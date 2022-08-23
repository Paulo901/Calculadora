package sistema;
/**
 * Essa classe tem como função:
 * 	-	Pegar e concatenar Strings com valores que podem ser convertidos para números
 *	-	Converter o Valor das variáveis para int(por enquanto) obtendo os resultados calculáveis
 *	-	Também coloquei aqui o método para calcular
 * 
 *	-> Objeto dessa classe foi criado em InterfaceGrafica
 *	@author paulo
 */
import javax.swing.JOptionPane;

public class Numeros {
	
	
		
	private Double numero, numero2, resultado;
	private String concatena = "", getnumero, getnumero2, operações;
	
	
    
   public void calculo() {
		try {
		switch(operações) {
		
		case "s":
			 resultado = numero + numero2;
			 break;
		case "-":	
			 resultado = numero - numero2;
			 break;
		case "/":
			 resultado = numero / numero2;
			 break;
		case "*":	
			 resultado = numero * numero2;
			 break;
			 
		default	 :
			
		}
		}catch(ArithmeticException | NullPointerException e) {
    		JOptionPane.showMessageDialog(null,"Não foi possível realizar o cálculo \n"
    					+ "MOTIVO: "  + e.getMessage());
    		
    	}

    	concatena = "";
    	
	}
   
   
   
	
	//getters e setters
	public Double getNumero() {
		return numero;
	}
	public void setNumero(Double numero) {
		this.numero = numero;
	}
	public Double getResultado() {
		return resultado;
	}
	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	public String getConcatena() {
		return concatena;
	}
	public void setConcatena(String concatena) {
		this.concatena = concatena;
	}
	public String getGetnumero() {
		return getnumero;
	}
	// Essa operação Concatena os números numa string e converte para número
	public void setGetnumero(String getnumero) {
		if(operações == null) {
			this.getnumero = getnumero;
			concatena += this.getnumero;
			numero = Double.parseDouble(concatena);
		
		}else {
			this.getnumero2 = getnumero;
			concatena += this.getnumero2;
			numero2 = Double.parseDouble(concatena);
		}
  	
	}
	public String getOperações() {
		return operações;
	}
	public void setOperações(String operações) {
			this.operações = operações;		
	}
	public Double getNumero2() {
		return numero2;
	}
	public void setNumero2(Double numero2) {
		this.numero2 = numero2;
	}
	
	//fim getter e setter


	}
	
	
	

	
	
