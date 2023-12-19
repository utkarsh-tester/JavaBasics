package ReturnKeyword;

public class ReturnKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Math a = new Math();
		int sum = a.add(20, 30);
		int sub = a.sub(sum, 20);
		
	}

}

class Math {
	
	public int add(int a , int b) {
		int c = a + b;
		System.out.println(c);
		return c;
	}
	
	public int sub (int a , int b) {
		int c = a - b;
		System.out.println(c);
		return c;
		
	}
	
}