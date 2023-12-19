package FinallyBlock;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Finally works with Abnormal Behavior
		
		try {
			String x = null;
			System.out.println(x.length());
		}
		catch(Exception e) {
			System.out.println("Genralised Exception");
		}
		finally {
			System.out.println("It is filally Block");
		}
		
		//Finally works with Normal Behavior
		
		try {
			String y = "myspaceclass";
			System.out.println(y.length());
		}
		catch(Exception e) {
			System.out.println("Genralised Exception");
		}
		finally {
			System.out.println("It is filally Block");
		}
		
		//can we use only try block - Generally No, But in case of finally block it work
		
		try {
			String y = "myspaceclass";
			System.out.println(y.length());
		}
		finally {
			System.out.println("It is filally Block");
		}
	}

}
