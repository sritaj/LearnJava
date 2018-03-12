
class animal {
	
	void walk() {
		
		System.out.println("animal is walking");
	}
	
	void hunt() {
		
		System.out.println("animal is hunting");
	}
	
}

class sheep extends animal{
	
	void sheepwalk() {
		
		System.out.println("sheep is walking");
	}
	
	void sheepeat() {
		
		System.out.println("sheep is eating");
	}
}
public class code31_inheritance {
	
	public static void main(String[] args) {
		
		animal a = new animal();
		a.walk();
		a.hunt();
		
		sheep s = new sheep();
		s.sheepwalk();
		s.sheepeat();
		s.walk();
		s.hunt();
	}

}
