
public class Ninja extends human{

//constructor
	public Ninja() {
		this.stealth = 10;
	}
	
//methods
	
	public void steal(human target) {
		target.health -= this.stealth;
	}
	
	public void runaway() {
		this.health -= 10;
	}
}
