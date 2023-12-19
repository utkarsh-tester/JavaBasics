package stringPrograms;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to reverse a string
		
		String x = "my space class";
		String y = " ";
		
		for(int i=x.length()-1; i>=0; i--) {
			
			y = y + x.charAt(i);
		}
		System.out.println(y);
		
	}

}
