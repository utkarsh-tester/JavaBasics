package Method;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Math x = new Math();
		x.add(20, 30);
		x.sub(25, 10);
	}

}

class Math{
	
	public void add (int a , int b) {
		  int c = a + b;
		  System.out.println(c);
	}
	
	public void sub (int a , int b) {
		  int c = a - b;
		  System.out.println(c);
		
	}
	
}