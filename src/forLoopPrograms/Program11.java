package forLoopPrograms;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int alphabet = 65;
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print((char) (alphabet + j-1) +" ");
			}
			
			System.out.println(" ");
		}

	}

}
