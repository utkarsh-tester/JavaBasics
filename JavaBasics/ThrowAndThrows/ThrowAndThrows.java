package ThrowAndThrows;

public class ThrowAndThrows {

	public static void main(String[] args) throws ArithmeticException, ClassNotFoundException {
		// TODO Auto-generated method stub

		int a = 10;
		int c = a/0;
		System.out.println(c);
		
		throw new ArithmeticException("Wrong Input - you can not divided by zero");
//		throw new ArrayIndexOutOfBoundsException("Array Range is over");
	}

}
