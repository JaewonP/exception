package exception;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {

		MyClass myClass = new MyClass();
		try {
			myClass.danger();
// 개별 예외를 하나의 catch문으로 처리하는 방법 
		} catch(IOException  |MyException e) {
			e.printStackTrace();
		}
// 개별적 예외를 하나의 catch 문으로 처리하는 방법 			
//		}catch (Exception e) {
//			e.printStackTrace();
			
// 개별적 예외를 개별 처리하는 방법			
		// catch (IOException e) {
//			e.printStackTrace();
//		} catch (MyException e) {
//			e.printStackTrace();
//		}

	}

}
