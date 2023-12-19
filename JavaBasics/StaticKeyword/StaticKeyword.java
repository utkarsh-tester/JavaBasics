package StaticKeyword;

public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B.abc();
		B.xyz();
		System.out.println(B.a);
	}

}
class B {
	public static int a = 10;
	public int b = 20;
	
	public static void xyz() {
		System.out.println("xyz");
	}
	
	public static void abc() {
		System.out.println("abc");
	}
	
	public void abc1() {
		System.out.println("abc1");
	}
	
}