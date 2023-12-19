package arrayPrograms;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to print max number from the array
		
		int a[] = {3,5,8,15,9,10,12};
		
		int max = a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]>max) {
				
				max = a[i];
			}
		}
		System.out.println(max);
	}

}
