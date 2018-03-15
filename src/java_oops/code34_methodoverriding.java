package java_oops;
class Browser{
	
	void Open() {
		
		System.out.println("Open the Browser");
	}
	
	void Maximize() {
		
		System.out.println("Maximize the Browser");
	}
	
	void Quit() {
		
		System.out.println("Close the Browser");
	}
}

class Firefox extends Browser {
	
	void Open() {
		
		System.out.println("Open Firefox");
	}
	
	void Maximize() {
		
		System.out.println("Maximize Firefox");
	}
	
	void Quit() {
		
		System.out.println("Quit Firefox");
	}
}

public class code34_methodoverriding {
	
	public static void main(String[] args) {
		
		Firefox fire = new Firefox();
		fire.Open();
		fire.Maximize();
		fire.Quit();
	}

}
