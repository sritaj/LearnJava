package java_oops;
class Diary {
	
	void OpenDiary() {
		System.out.println("Take out the diary");
	}
	
	void FlipPage() {
		System.out.println("Flip to page 17");
	}
	
	void CloseDiary() {
		System.out.println("Close the diary");
	}
}

class Pen {
	
	void StartWriting() {
		System.out.println("Start writing the daily activites");
	}
	
	void StopWriting() {
		System.out.println("Stop writing and put a dot");
	}
}
public class code23_multipleclasses {
	
	public static void main(String[] args) {
		Diary di = new Diary();
		Pen p = new Pen();	
		di.OpenDiary();
		p.StartWriting();
		di.FlipPage();
		p.StartWriting();
		p.StopWriting();
		di.CloseDiary();
	}
	
}
