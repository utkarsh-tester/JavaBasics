package stringPrograms;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to extract digit from string
		
		String x = "my 123 space class";
		String y = " ";
		
		for(int i=0; i<x.length(); i++) {
			
			if(Character.isDigit(x.charAt(i))) {
				
				y = y + x.charAt(i);
			}
		}
		System.out.println(y);
	}

}
