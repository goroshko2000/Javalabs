package Organism;

public class Stomach extends BodyOrgan {
	private int amount;
	
	public Stomach(int weight,int amount) {
		super(weight);
		this.amount=amount;
	}
	public int getAmount() {
		return this.amount;
	}
	public void getFood(String name) {
		this.digest(name);
	}
	private	void digest(String name) {
		name= null;
	}
	
}
