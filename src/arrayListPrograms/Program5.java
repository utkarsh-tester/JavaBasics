package arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to count odd and even numbers from ArrayList
		
		List <Integer> x = new ArrayList <Integer> ();
		
		x.add(20);
		x.add(10);
		x.add(5);
		x.add(17);
		x.add(25);
		
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i=0; i<x.size(); i++) {
			
			if(x.get(i)%2==0) {
				
				evenCount = evenCount + 1;
				System.out.println("evenNumbers :"+x.get(i));
			}
			else {
				
				oddCount = oddCount + 1;
				System.out.println("oddNumbers :"+x.get(i));
			}
	
		}
		System.out.println("evenCount :"+evenCount);
		System.out.println("oddCount :"+oddCount);
	}

}
