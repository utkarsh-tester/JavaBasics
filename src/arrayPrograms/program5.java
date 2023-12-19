package arrayPrograms;

public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to print factors of each array element
		
		int a[] = {1,2,3,4};
		
		int fact = 1;
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=a[i]; j>1; j--) {
				
				fact = fact *j;
			}
			
			System.out.println(fact);
		}
	}

}
