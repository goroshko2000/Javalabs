package Organism;

public class  Organ {
	private int weight;
	
	public Organ (int weight)
	throws IllegalArgumentException{
		if (weight<=0) {
			throw new IllegalArgumentException("The value of organ weight can't be zero or negative!");
		}
		this.weight=weight;
	}
	public int getWeight() {
		return this.weight;
	}
}