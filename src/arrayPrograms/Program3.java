package arrayPrograms;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to print mulitiplication of the array element
		
		int a[] = {14,7,21,18,22};
		
		int multi = 1;
		
		for(int i=0; i<a.length; i++) {
			
			multi = multi * a[i];
		}
		
		System.out.println(multi);
	}

}
