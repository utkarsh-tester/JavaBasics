package Abstraction;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		b.xyz();
		b.xyz1();
		b.xyz2();
		b.xyz3();
	}

}

abstract class A {
	
	abstract void xyz();
	abstract void xyz1();
	abstract void xyz2();
	
	public void xyz3() {
		System.out.println("xyz3");
	}
	
}

class B extends A {
	
	public void xyz() {
		System.out.println("xyz");
	}
	public void xyz1() {
		System.out.println("xyz1");
	}
	public void xyz2() {
		System.out.println("xyz2");
	}
}