package SingleLevelInheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B ();
		b.flat();
		b.farm();
	}

}

class A {//parent

	public void farm() {
		System.out.println("farm");
	}

}

class B extends A {//child 

	public void flat() {
		System.out.println("flat");
	}
}