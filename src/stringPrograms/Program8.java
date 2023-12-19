package stringPrograms;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to print string palindrome
		
		String x = "2 sas 2";
		String y = "";
		
		for(int i=x.length()-1; i>=0; i--) {
			
			y = y + x.charAt(i);
			
			
		}
		System.out.println(y);
		
			if(x.equals(y)) {
				
				System.out.println("String is palindrome");
				
			}else 
				
			{
				
				System.out.println("String is not palindrome");
		
			}

	}

}
