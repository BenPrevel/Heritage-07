package eli;

public class Hangar {

	public static void main(String[] args) {
		Car punto = new Car ("Fiat Punto", 20000);
		Boat yacht =  new Boat ("Blue Sea 56", 2000);
		
		System.out.println (punto.doStuff());
		System.out.println (yacht.doStuff());

	}

}
