/**
 * Basic class that implements everything an animal should at least be able to do.
 * 
 * @author Xeryus Stokkel 
 */
public abstract class Animal {
	private int energy;
	
	public Animal() {
		energy = 10;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	/**
	 * 
	 */
	abstract public void turn();
}
