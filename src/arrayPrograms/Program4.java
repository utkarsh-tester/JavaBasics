package arrayPrograms;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to print of array element
		
		int a[] = {3,10,3,4,5,8};
		
		int sum = 0;
		int avg = 1;
		
		for (int i=0; i<a.length; i++) {
			
			sum = sum + a[i];
		}
		    avg = sum/a.length;
		    
	   System.out.println(avg);
	}

}
