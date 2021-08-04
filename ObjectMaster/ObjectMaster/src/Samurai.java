
public class Samurai extends human {

	public static int numberOfSamurai = 0;
	
	//constructor
	public Samurai() {
		this.health = 200;
		numberOfSamurai++;
		
		
	}
	
	
	//methods
	public void deathBlow(human target) {
		target.health -= target.health;
		this.health -= this.health/2;
		
	}
	
	public void meditate() {
		this.health += this.health/2;
	}
	
	public static int howMany() {
		return numberOfSamurai;
	}
}

	