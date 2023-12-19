package arrayPrograms;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to print sum of the array element

		int a[] = {3,5,7,18,7,20};
		
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			
			sum = sum + a[i]; 
					
		}
		System.out.println(sum);		
	}

}
