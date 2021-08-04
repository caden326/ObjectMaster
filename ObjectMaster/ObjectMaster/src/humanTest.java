
public class humanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//constructors
		human human1 = new human();
		human human2 = new human();
		
		Wizard wizard1 = new Wizard();
		
		Ninja ninja1 = new Ninja();
		
		Samurai samurai1 = new Samurai();
		Samurai samurai2 = new Samurai();
		Samurai samurai3 = new Samurai();
		Samurai samurai4 = new Samurai();
		
		
		///commands
		
//		human1.attack(human2);
//		
//		System.out.println(human2.health);
		
		
//		//wizard tests
//		wizard1.fireball(human1);
//		
//		System.out.println(human1.health);
//		
//		wizard1.heal(human1);
//		
//		System.out.println(human1.health);
//		
//		
//	//Ninja tests
//		ninja1.runaway();
//		System.out.println(ninja1.health);
//		
//		ninja1.steal(human1);
//		System.out.println(human1.health);
		
// Samurai tests
		samurai1.deathBlow(human1);
		System.out.println(human1.health);
		
		samurai1.meditate();
		
		System.out.println(samurai1.health);
		
		System.out.println(Samurai.howMany());
		
		
	}

}
