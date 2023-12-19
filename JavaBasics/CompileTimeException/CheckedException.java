package CompileTimeException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// TODO Auto-generated method stub

		//fileNotFountException("not existing file text")
		
		FileInputStream strem = new FileInputStream ("D:/file.txt");
		
		Thread.sleep(1000);
	}

}
