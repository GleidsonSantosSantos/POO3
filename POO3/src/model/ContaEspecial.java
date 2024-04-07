package model;

public class ContaEspecial extends ContaBancaria {
	
	 private float limite;

	    public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
	        super(cliente, num_conta, saldo);
	        this.limite = limite;
	    }

	
	    public void sacar(float valor) {
	        if (valor <= getSaldo() + limite) {
	            setSaldo(getSaldo() - valor);
	            System.out.println("Saque de " + valor + " realizado com sucesso.");
	        } else {
	            System.out.println("Saldo e limite insuficientes para saque.");
	        }
	    }
	}

