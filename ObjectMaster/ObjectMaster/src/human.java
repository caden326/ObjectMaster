
public class human {
	
	
	public int strength;
	public int stealth;
	public int inteligence;
	public int health;
	
	
	//constructor
	public human() {
		this.health = 100;
	}	
		
	//methods 
	
	public void attack(human target) {
		 target.health -= 5;
		  
		  
	}
	
	
}
