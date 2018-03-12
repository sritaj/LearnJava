
public class code21_object {
	
	String dth = "TataSky";
	String channel = "StarSports";
	
	public void TurnON() {
		System.out.println("Turn ON the DTH");
	}
	
	public void SwitchTo() {
		System.out.println("Change the channel to the Sports");
	}
	
	public void TurnOFF() {
		System.out.println("Turn OFF the DTH");
	}
	
	public static void main(String[] args) {
		
		code21_object obj = new code21_object();
		System.out.println("Accessing Data Members");
		System.out.println(obj.dth);
		System.out.println(obj.channel);
		
		System.out.println("Accessing Functional Members");
		obj.TurnON();
		obj.SwitchTo();
		obj.TurnOFF();
	}

}
