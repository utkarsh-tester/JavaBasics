package stringPrograms;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to convert upper case to lower case and lower case to upper case
		
		String x = "My SpAcE cLaSs";
		String y = " ";
		
		for(int i=0; i<x.length(); i++) {
			
			if(i%2==0) {
				
				y = y + Character.toLowerCase(x.charAt(i));
				
			}
			else {
				
				y = y + Character.toUpperCase(x.charAt(i));
			}
		}
		
		System.out.println(y);

	}

}
