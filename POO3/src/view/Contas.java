package view;

import model.ContaEspecial;
import model.ContaPoupanca;

public class Contas {

	
		public static void main(String[] args) {
	        ContaPoupanca poupanca = new ContaPoupanca("Gleidson", 123, 5000, 10);
	        ContaEspecial especial = new ContaEspecial("Fulano", 456, 2000, 500);
 
	        poupanca.sacar(200);
	        especial.sacar(300);
	        especial.sacar(3000); 
	        poupanca.depositar(500);
	        especial.depositar(1000);
	        poupanca.calcularNovoSaldo(0.5f); 
	    }
	}

	


