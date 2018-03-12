class vegetables{
	
	void cook() {
		System.out.println("Cooking");
	}
	
	void chop() {
		System.out.println("Chopping");
	}

}

class carrot extends vegetables{
	
	void chop() {
		System.out.println("Carrot chopping");
	}
	
	void preparehalwa() {
		System.out.println("Prepare halwa");
	}
	
	
}
	
public class code37_upcasting {
	
	public static void main(String[] args) {
		
		vegetables v = new vegetables();
		v.cook();
		v.chop();
		
		carrot c = new carrot();
		c.cook();
		c.chop();
		c.preparehalwa();
		
		vegetables v1 = new carrot();
		v1.cook();
		v1.chop();
			
	}

}
