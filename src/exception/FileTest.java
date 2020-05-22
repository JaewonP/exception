package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./hello2.txt");
			
			int data = fis.read();
			System.out.println(data);
			
		}catch (FileNotFoundException e) {
		//	e.printStackTrace();
			System.out.println("파일이 없습니다 : " + e);
		}catch (IOException e) {
			System.out.println("오류 발생" + e);
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
