package arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to remove duplicate from the ArrayList
		
		List <String> x = new ArrayList <String> ();
		List <String> y = new ArrayList <String> ();
		
		x.add("Cat");
		x.add("Dog");
		x.add("Elephant");
		x.add("Tiger");
		x.add("Cat");
		x.add("Dog");
		x.add("Cow");
		x.add("Tiger");
		
		for(int i=0; i<x.size(); i++) {
			
			if(y.contains(x.get(i))) {
				
			}else {
				
				y.add(x.get(i));
			}
				
		}
		
		System.out.println(y);

	}

}
