package ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exception Handling by using try catch
		try {
			int a = 10;
			int c = a/0;
			System.out.println(c);
		
		}catch (Exception e) {
			
			System.out.println("Exception Occur");
		}
		
		
		//can we use multiple try with single catch - No
		
//		try {
//			
//		}
//		
//		try {
//			
//		}
//		
//		catch(Exception e) {
//			
//		}
		
		//can we use single try with multiple catch - Yes
		
		try {
			String x = null;
			System.out.println(x.length());
		}
		catch(ArithmeticException e1) {
			System.out.println("Divided by zero");	
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e) {
			System.out.println("Genralised Exception");
		}

	}

}
