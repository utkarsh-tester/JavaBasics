package arrayListPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//differnce betweeen ArrayList and Set
		
		Set <Integer> x = new HashSet <Integer> ();
		List <Integer> y = new ArrayList <Integer> ();
		
		//(Set)   			(List)
		x.add(10);         y.add(10);
		x.add(10);         y.add(10);
		x.add(20);         y.add(20);
		x.add(30);         y.add(30);
		x.add(null);       y.add(null);
		x.add(null);       y.add(null);
		x.add(null);       y.add(null);
		
		System.out.println("Set :"+x);
		System.out.println("List :"+y);
		

	}

}
