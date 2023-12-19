package stringPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to remove duplicate from a string
		
		String x = "myspaceclass";
		String y = " ";
		
		List <Character> z = new ArrayList <Character> ();
		
		for(int i=0; i<x.length(); i++) {
			
			if(z.contains(x.charAt(i))) {
				
			}
			else {
				z.add(x.charAt(i));
				y = y + x.charAt(i);
				
			}
		}
		System.out.println(y);

	}

}
