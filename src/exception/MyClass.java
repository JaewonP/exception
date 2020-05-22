package exception;

import java.io.IOException;

public class MyClass {
	public void danger() throws IOException, MyException {
		System.out.println("some code1");
		System.out.println("some code2");
		
		if(2 - 1 == 2) {
		    throw new IOException("예외발생");
		
		}
		
		System.out.println("some code3");
		
		if( 2 -1 ==1) {
			throw new MyException();
		}
		
		System.out.println("some code4");
	}

}
