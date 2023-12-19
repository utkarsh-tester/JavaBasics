package CompileTimePolymorphisam;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.sum(10, 20);
		a.sum(10, 20, 30);
		a.sum(10, 20, 30, 40);
	}

}
class A {
	
	public void sum (int a,int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	
	public void sum (int a,int b,int c) {
		int sum = a + b + c;
		System.out.println(sum);
	}
	
	public void sum (int a ,int b,int c,int d) {
		int sum = a + b + c + d;
		System.out.println(sum);
	}
	
}