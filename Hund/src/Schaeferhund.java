public class Schaeferhund extends Hund{

	public Schaeferhund(String name, int alter, double lautstaerkeDB) {
		super(name, alter, lautstaerkeDB);
		this.rasse="Schaeferhund";
		
	}
	
	@Override public double getLautstaerkeDB(){
		return 1.5*super.getLautstaerkeDB();
	}
}
