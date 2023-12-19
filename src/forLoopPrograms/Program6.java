package forLoopPrograms;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to print summatiom of the series (1-3+5-7+9-11+13-15+17-19+20)
		
		int sum = 0;
		int count = 1;
		
		for(int i=0; i<=20; i++) {
			
			if(count%2==1) {
				
				sum = sum + i;
			}
			else {
				
				sum = sum - i;
			}
			
			count = count +1;
		}
		
		System.out.println(sum);
	}

}
