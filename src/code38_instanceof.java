class X {
	
}

class Y extends X {
	
}

class Z extends Y {
	
}

public class code38_instanceof {
	
	public static void main(String[] args) {
		
		X ap = new X();
		Y bt = new Y();
		Z gm = new Z();
		X xp = new Z();
		
		System.out.println(ap instanceof X);
		System.out.println(bt instanceof Y);
		System.out.println(gm instanceof Z);
		System.out.println(ap instanceof Y);
		System.out.println(bt instanceof Z);
		System.out.println(xp instanceof Y);
		System.out.println(xp instanceof Z);
	}

}
