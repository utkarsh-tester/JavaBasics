package RunTimePolymorphism;

public class MethodOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		b.sum(10, 10);
		
	}

}

class A {
	public void sum (int a,int b) {
		int sum = a - b;
		System.out.println(sum);
	}
}
class B extends A {
	public void sum (int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
}