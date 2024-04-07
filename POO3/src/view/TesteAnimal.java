package view;

import model.Animal;
import model.Mamifero;
import model.Peixe;

public class TesteAnimal {
	public static void main(String[] args) {

		Animal camelo = new Animal();
		camelo.setNome("Cavalo");
		camelo.setComprimento(180);
		camelo.setCor("Branco");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2.0f);

		Peixe tubarao = new Peixe();
		tubarao.setNome("Cavalo Marinho");
		tubarao.setComprimento(100);
		tubarao.setVelocidade(1.5f);
		tubarao.setCaracteristica("cauda");

		Mamifero urso = new Mamifero();
		urso.setNome("Tigre");
		urso.setComprimento(180);
		urso.setCor("Preto e Amarelo");
		urso.setVelocidade(0.5f);
		urso.setAlimento("Carne");

		System.out.println("Zoo:");
		System.out.println("-------------------------------");
		camelo.dados();
		tubarao.dados();
		urso.dados();
		System.out.println("-------------------------------");
	}
}