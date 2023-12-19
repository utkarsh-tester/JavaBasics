package hashMapProgram;

import java.util.HashMap;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//simpe program
		
		HashMap <String,Integer> phoneContact = new HashMap <String,Integer> ();
		
		phoneContact.put("Rohit", 99221);
		phoneContact.put("Virat", 99222);
		phoneContact.put("Sachin", 99223);
		phoneContact.put("Rohit", 99224);
		
		System.out.println(phoneContact.get("Rohit"));
		
	}

}
