package stringPrograms;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to remove white space from string
		
		String x = "my space class";
		String y = " ";
		
		for(int i=0; i<x.length(); i++) {
			
			if(x.charAt(i)==' ') {
				
				
			}
			else {
				y = y + x.charAt(i);
			}
		}
       System.out.println(y);
	}

}
