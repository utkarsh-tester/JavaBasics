package arrayPrograms;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to count odd numbers from an array
		int a[] = {3,5,7,18,7,20};
		
		int oddCount = 0;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%2==1) {
				
				oddCount = oddCount + 1;
			}
		}

		System.out.println(oddCount);
	}

}
