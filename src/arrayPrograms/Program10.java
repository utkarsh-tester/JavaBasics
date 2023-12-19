package arrayPrograms;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to print accournce of number in array
		
		int a[] = {3,5,10,7,10,10,12};
		
		int counter = 0;
		
		int b = 10;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]==b) {
				
				counter = counter + 1;
				
			}
		}
		
		System.out.println(counter);
	}

}
