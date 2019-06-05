package Organism;

public class Mouth extends Organ {
	private String size;
	public enum Food{
		MEAT("Meat"),
		CAKE("Cake"){},
		BISCUIT("Biscuit"){},
		PANCAKES("Pancakes"){},
		PINEAPPLE("Pineapple"){},
		SALAD("Salad"){},
		BANANA("Banana"){},
		APPLE("Apple"){},
		CHEESE("Cheese"){},
		STRAWBERRY("Strawberry"){},
		SUSHI("Sushi"){};

		private final String food;
		Food(String food) {
		this.food = food;
		}
		
		public String getFood() { 
			return food;
		}
	}
	public enum Phrases{
		HI("Hi!"),
		WANT("I want to eat!"){},
		WALK("Let's go for a walk!"){},
		STOP("I do not want to talk anymore!"){};
		
		private final String sentence;
		
		Phrases(String sentence) {
		this.sentence = sentence;
		}
		
		public String getSentence() { 
			return sentence;
		}
	}	
	public Mouth (int weight, String size) {
		super(weight);
		this.size=size;
	}
	
	public String getSize() {
		return this.size;
	}

	public void eat(Brain brain) {
		int num=11;
		int id = (int)(Math.random()*num);
		Food name=Food.values()[id];
		brain.getDataOrgans(name.getFood());
	}

	public void say(Brain brain) {
		int num = 4;
		int id = (int)(Math.random()*num);
		Phrases phrases =Phrases.values()[id];
		brain.getDataOrgans(phrases.getSentence());
	}
}