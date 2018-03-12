class XY{
	
	void play(){
		System.out.println("Start playing");
	}
	
	void quit() {
		System.out.println("Stop playing");
	}
}

class XZ extends XY{
	
	void selectgame() {
		System.out.println("Yu Gi Oh,  Cards Monster");
	}
	
	void play() {
		System.out.println("Playing Card Monster");
	}
	
	void levelup() {
		System.out.println("Gamer level is 16");
	}
	
	void quit() {
		System.out.println("Stop Card Monster");
	}
}

public class code39_downcasting {
	
	public static void main(String[] args) {
		
		XY xy = new XZ();
		XZ xzz = (XZ)xy;
		xzz.selectgame();
		xzz.play();
		xzz.levelup();
		xzz.quit();
	}
}
