
public class Constituents {
	String LionName;
	int LionAge;
	String[] Preys = {"Sheep", "Antelope", "Deer", "Zebra", "Wilderbeasts"};
	String prey;
	private int counter = -1;
	
	public void roar() {System.out.println("Lion "+LionName+" Roars!");}
	
	public Constituents(String name, int age) {
		this.LionName= name;
		this.LionAge= age * 10;		
	}
	
	
		public void hunt() { 
		counter = (counter + 1) % 5;
		prey = Preys[counter];
		
		System.out.print("This "+LionName+" has captured and eaten ");
		if((prey.charAt(0)=='A')||(prey.charAt(0)=='E')||(prey.charAt(0)=='I')||(prey.charAt(0)=='O')||(prey.charAt(0)=='U')) {
			System.out.print("an ");}
		else {System.out.print("a ");}
		System.out.println(prey);
	
			}
	
}
