package stringPrograms;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to print alternate character upper case and lower case
		
		String x = "myspaceclass";
		String y = " ";
		
		for(int i=0; i<x.length(); i++) {
			
			if(i%2==0) {
				
				y = y + Character.toUpperCase(x.charAt(i));
			}
			else {
				y = y + Character.toLowerCase(x.charAt(i));
			}
		}

		System.out.println(y);
	}

}
