
public class Main {

	public static void main(String[] args) {
		
		Hund h1 = new Hund("Thorsten",7,31.4);
		
		System.out.println(h1.getLautstaerkeDB());

		// Weitere Testroutinen
		
		Schaeferhund s1 = new Schaeferhund("Blutbert", 6, 22.6);
		System.out.println(s1.rasse);
		System.out.println(s1.getLautstaerkeDB());
		
	}

}
