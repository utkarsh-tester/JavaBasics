package forLoopPrograms;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to print series [0-20]
		//print = 2,-4,6,-8,10,-12,14------20
		//print = 2,4,6,8,10,12,14------20
		//print = -2,4,-6,8,-10,12,-14------20
		
		int count = 1;
		
		for(int i=0; i<=20; i++) {
			
			if(i%2==0) { // even/odd value
				
				if(count%2==1) { // positive/negative sign
					
					System.out.println(i);
				}else {
					
					System.out.println(-i);
				}
				
				count = count +1;
			}
			
		}
		
		
	}

}
