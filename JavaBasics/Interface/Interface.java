package Interface;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C b = new C();
		b.abc();
		b.xyz();
		b.abc1();
		b.xyz2();
	}

}

interface A {
	void abc();
	void xyz();
}
//interface supports multiple interfaces
interface B {
	void abc1();
	void xyz2();
	
}

class C implements A,B {
	public void abc() {
		System.out.println("abc");
	}
	public void xyz() {
		System.out.println("xyz");
	}
	public void abc1() {
		System.out.println("abc1");
	}
	public void xyz2() {
		System.out.println("xyz2");
	}
}