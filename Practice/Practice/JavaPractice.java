package Practice;


public class JavaPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "2 sas 2";
		String y = "";
		
		for(int i=x.length()-1; i>=0; i--) {
			
			y = y + x.charAt(i);
		
		}	
		
			if(x.equals(y)){
				
				System.out.println("String is Palindrome");
			}
			else {
				System.out.println("String is Not a Palindrome");
			}
		
		
	}

}
