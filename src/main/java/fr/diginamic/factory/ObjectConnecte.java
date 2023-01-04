package fr.diginamic.factory;

public class ObjectConnecte {
	private int limiteVolts;
	
	public ObjectConnecte() {
		
	}
	
	public ObjectConnecte(int limiteVolts) {
		this.limiteVolts = limiteVolts;
	}

	public int getLimiteVolts() {
		return limiteVolts;
	}

	public void setLimiteVolts(int limiteVolts) {
		this.limiteVolts = limiteVolts;
	}
	
	
}
