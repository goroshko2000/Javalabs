package Organism;

import java.util.ArrayList;
import java.util.List;

public class Head  {
	private  List<Organ> organs ;
	
	public Head(Mouth mouth, Nose nose, Brain brain) 
		 throws NullPointerException {
		        if (mouth == null) {
		            throw new NullPointerException("The value of mout param can not be null!");
		        }
		        if (nose == null) {
		            throw new NullPointerException("The value of nose param can not be null!");
		        }
		        if (brain == null) {
		            throw new NullPointerException("The value of brain param can not be null!");
		        }
		      
		        this.organs = new ArrayList<Organ>();
		        organs.add(mouth);
		        organs.add(nose);
		        organs.add(brain);
		    }

		    public List<Organ> getHead() {
		        return organs;
		    }   
	}