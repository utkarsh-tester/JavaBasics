package arrayPrograms;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to print count of even and odd numbers
		int a[] = {3,5,8,15,9,10,12,18,20};
		
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%2==0) {
				
				evenCount = evenCount + 1;
			}else {
				oddCount = oddCount + 1;
			}
		}
		
		System.out.println(evenCount);
		System.out.println(oddCount);
	}

}
