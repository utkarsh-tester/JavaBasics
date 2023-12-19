package arrayPrograms;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to count even numbers from an array 
		 
		int a[] = {3,5,7,18,7,20};
		
		int evenCount = 0;
		
		for(int i=0;i<a.length; i++) {
			
			if(a[i]%2==0) {
				
				evenCount = evenCount + 1; 
			}
		}
	System.out.println(evenCount);
	}

}
