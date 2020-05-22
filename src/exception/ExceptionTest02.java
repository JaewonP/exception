package exception;

public class ExceptionTest02 {

	public static void main(String[] args) {
		int a = 0;
		int result = 0;
		
		// some code1 -> some code2 -> 예외 발생 (13번라인) -> catch문 블락으로 들어감 (18번라인) -> finally 블럭
		try {	
			// try 를 사용했으면 catch는 꼭 써야함
			System.out.println("some code1");
			System.out.println("some code2");		
			result = 1000/a;	
			System.out.println("some code3");
			System.out.println("some code4");	
			System.out.println(result);
		} catch( ArithmeticException ex) {
			//1. 사과
			System.out.println("미안합니다.");
			
			//2. 로그 남기기 (파일로)
			System.out.println(ex);
			                  
			//3. 정상 종료
		    return;
		} finally {
			// 정상적으로 애플리케이션 코드가 실행되어도 실행되고, 예외가 발생해도 실행됨 
			// 반드시 한 번은 꼭 실행되는 블럭임 
			// return;이 있어도 실행됨 
			// 옵션으로 try catch문 뒤에 붙임 
			System.out.println("자원정리할 때 사용함");
		}
	}

}
