package arrayPrograms;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to print sqare of all even and odd element in array
		
		int a[] = {3,10,3,4,5,8};
		
		double eSum = 0;
		double oSum = 0;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%2==0) {
				
				eSum = eSum + Math.pow(a[i], 2);
			
			}else {
				
				oSum = oSum + Math.pow(a[i], 2);
				
			}
		}
		
		System.out.println(oSum);
		System.out.println(eSum);
	}

}
