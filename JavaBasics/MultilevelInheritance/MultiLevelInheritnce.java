package MultilevelInheritance;

public class MultiLevelInheritnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B ();
		b.flat();
		b.farm();
		C c = new C ();
		c.flat();
		c.farm();
		c.car();
	}

}

class A {//Grand parent

	public void farm() {
		System.out.println("farm");
	}

}

class B extends A {//parent

	public void flat() {
		System.out.println("flat");
	}
}

class C extends B {//child
	
	public void car() {
		System.out.println("car");
	}
}