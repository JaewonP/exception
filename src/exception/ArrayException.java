package exception;

public class ArrayException {

	public static void main(String[] args) {
		
		  try {
		  int[] intArray = new int[5];
	      intArray[0] = 0;
			  
	      for( int i = 0; i < 5; i++ ) {
	          intArray[ i+1 ] = i + 1 + intArray[ i ];                                       //  i = 4인 경우 예외 발생
	          System.out.println( "intArray[" + i + "]"+ "=" + intArray[ i ] );
	      }

		  }catch(ArrayIndexOutOfBoundsException ex) {
			  System.out.println("미안");
			  System.out.println(ex);
			  return;
		  }
	}
}
