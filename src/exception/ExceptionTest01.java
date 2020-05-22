package exception;

public class ExceptionTest01 {

	public static void main(String[] args) {
		int a = 0;
		int result = 0;
		
		// some code1 -> some code2 -> 예외 발생 (13번라인) -> catch문 블락으로 들어감 (18번라인) -> return; 이 없으면 27번 라인으로
		try {	
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
			System.out.println();
		}
	}

}
