package arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to print odd numbers from Arraylist
		
		List <Integer> x = new ArrayList <Integer> ();
		
		x.add(20);
		x.add(10);
		x.add(5);
		x.add(17);
		x.add(25);
		
		for(int i=0; i<x.size(); i++) {
			
			if(x.get(i)%2==1) {
				
				System.out.println(x.get(i));
			}
		}
	}

}
