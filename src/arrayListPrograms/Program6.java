package arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to remove duplicate from the ArrayList 
		
		List <Integer> x = new ArrayList <Integer> ();
		List <Integer> y = new ArrayList <Integer> ();
		
		x.add(10);
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(20);
		x.add(10);
		x.add(50);
		
		for(int i=0; i<x.size(); i++) {
			
			if(y.contains(x.get(i))) {
				
			}else {
				y.add(x.get(i));
					
			}
		}

		System.out.println(y);
	}

}
