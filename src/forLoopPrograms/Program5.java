package forLoopPrograms;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wap to print summation of the series sum= 2-4+6-8+10-12+14-16+18-20

		int sum = 0;
		int count = 1;

		for(int i=0; i<=20; i++) {

			if (count%2==0) {

				sum = sum +i;
			}
			else {

				sum = sum-i;
			}

			count = count +1;
		}

		System.out.println(sum);
		
	}

}
