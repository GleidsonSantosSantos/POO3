package model;

public class ContaPoupanca extends ContaBancaria {
	private int diaDeRendimento;

	public ContaPoupanca(String cliente, int num_conta, float saldo, int diaDeRendimento) {
		super(cliente, num_conta, saldo);
		this.diaDeRendimento = diaDeRendimento;
	}

	public void calcularNovoSaldo(float taxaDeRendimento) {
		float novoSaldo = getSaldo() * (1 + taxaDeRendimento / 100);
		setSaldo(novoSaldo);
		System.out.println("Novo saldo com rendimento aplicado: " + getSaldo());
	}

	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}

	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}

}
