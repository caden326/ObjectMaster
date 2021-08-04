
public class Wizard extends human{
	
	//constructor
	public Wizard(){
		this.health = 50;
		this.inteligence = 8;
	}
	
	//methods
	
	public void heal(human target) {
		 target.health += this.inteligence;
	}
	
	public void fireball(human target) {
		 target.health -= this.inteligence * 3;
	}
	
	

}
