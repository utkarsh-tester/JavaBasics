package arrayPrograms;

public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to square pf all element in array
		
		int a[] = {3,10,3,4,5,8};
		
		double sum = 0;
		
		for(int i=0; i<a.length; i++) {
			
			sum = sum + Math.pow(a[i], 2);
		}
		System.out.println(sum);
	}

}
