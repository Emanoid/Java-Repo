
public class Main {
	public static void main(String[] args) {
		
		Constituents Lion1= new Constituents("Mufasa", 4);
		Constituents Lion2 = new Constituents("Scar",3);
		Constituents Lion3 = new Constituents("Simba", 1);
		
		Lion1.roar();
		Lion2.roar();
		Lion3.roar();
		
		Lion1.hunt();
		Lion1.hunt();
		Lion1.hunt();
		Lion2.hunt();
		Lion1.hunt();
		Lion1.hunt();
		Lion3.hunt();
		Lion1.hunt();
		Lion2.hunt();
		Lion1.hunt();
		
		System.out.println(Lion3.LionAge);
		
		
	}
}
