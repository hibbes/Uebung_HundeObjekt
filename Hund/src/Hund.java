
public class Hund {
	String rasse;

	String name;

	int alter; 

	double lautstaerkeDB; 
	
	public Hund(String name, int alter, double lautstaerkeDB) {
		this.name = name;
		this.alter=alter;
		this.lautstaerkeDB = lautstaerkeDB;
	}
	
	public Hund(String name) {
		this(name, 10, 5);
	}
	
	public Hund() {
		this("Hundi");
	}
	
	public double getLautstaerkeDB() {
		return lautstaerkeDB;
	}
	
	
}
