package basicPrograms;

public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to add two numbers
		
//		int a = 10;
//		int b = 20;
//		int c = a + b;
//		
//		System.out.println(c);
		
		//wap to find addition of two numbers
		
//		float a = 2.5f;
//		float b = 20f;
//		float c = a + b;
//		
//		System.out.println(c);
//		System.out.println("Addition of a and b ="+c);
		
		//wap to find maximum number between two numbers
		
//		int a = 20;
//		int b = 10;
//		
//		if (a>b) {
//			
//			System.out.println("a is bigger");
//		}
//		else {
//			
//			System.out.println("b is bigger");
//		}
			
		
		//wap to swap two numbers using third veriable
		
//		int a = 20;
//		int b = 10;
//		int c = a;
//		
//		a = b;
//		b = c;
//		
//		System.out.println(a);
//		System.out.println(b);
		
		//wap to swap two numbers without using third veriable 
		
//		int a = 20;
//		int b = 10;
//		
//		a = a * b; // 20*10=200 //20+10=30
//		b = a / b; //200/10=20  //30-10=20
//		a = a / b; //200/20=10  //30-20=10
//				
//		System.out.println(a);
//		System.out.println(b);
		
		//wap to find maximum number beetween three numbers
		
		int a = 20; //(a>b)
		int b = 50; //(a>c)
		int c = 30; //(b>c)
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is bigger");
			}else {
				System.out.println("c is bigger");
			}
		}else {
			if(b>c) {
				System.out.println("b is bigger");
			}else {
				System.out.println("c is bigggr");
			}
		}
	}

}
