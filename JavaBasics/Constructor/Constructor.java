package Constructor;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method");
		 
		xyz x = new xyz();
		xyz y = new xyz();

	}

}

class xyz {
	public xyz() { // Default Constructor
		System.out.println("xyz");
	}
	
	public xyz(String a) {//Parameterized Constructor
		System.out.println("xyz");
	}
}
