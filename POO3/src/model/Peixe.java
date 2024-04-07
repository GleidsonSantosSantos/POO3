package model;

public class Peixe extends Animal {
	private String caracteristica;

	public Peixe() {
		super();
		this.setPatas(0);
		this.setCor("Cinza");
		this.setAmbiente("Mar");
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public void dados() {
		super.dados();
		System.out.println("Característica: " + caracteristica);
	}
}
