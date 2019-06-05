package Organism;

import java.util.ArrayList;

public class Brain extends HeadOrgan {
	private int �fficiency;
	private ArrayList<String> list = new ArrayList<String>();
	
	public Brain(int weight,int �fficiency) {
		super(weight);
		this.�fficiency=�fficiency;
	}
	public int getEfficiency() {
		return this.�fficiency;
	}
	public void governOrgans(Mouth mouth, Nose nose, Stomach stomach) {
		nose.sniff(this);
		nose.scratch(this);
		mouth.eat(this,stomach);
		mouth.say(this);
	}
	public void getDataOrgans(String data) {
		list.add(data);
	}
	public String getDataList() {
		 String arr = list.get(0);
	     list.remove(0);
	      return arr;
	}

}