package forLoopPrograms;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to find factorial of a given number (4*3*2*1)
		
		int n = 4;
		int fact = 1;
		
		for(int i=n; i>=1; i--) {
			
			fact = fact * i;
		}
		
		System.out.println("factor of 4:"+fact);
				
	}

}
