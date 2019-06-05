package Organism;

import java.util.ArrayList;

public class Brain extends HeadOrgan {
	private int åfficiency;
	private ArrayList<String> list = new ArrayList<String>();
	
	public Brain(int weight,int åfficiency) {
		super(weight);
		this.åfficiency=åfficiency;
	}
	public int getEfficiency() {
		return this.åfficiency;
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