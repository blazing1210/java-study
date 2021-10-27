package reading_lineByline;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		//파일의 절대경로를 문자열로 표시(\\로 표시됌)
		String fileLocation="C:\\java\\java-study\\CH21_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());
		System.out.println();

		//파일을 한줄씩 읽을수 있는 클래스
		try (BufferedWriter br=new BufferedWriter(new FileWriter(fileLocation))){
			br.write("오렌지");
			br.newLine();
			br.write("애플");
			br.newLine();
			br.write("바나나");
			br.newLine();
			br.write("배");
			
		}catch(IOException e){
			System.out.println("파일을 쓸 수가 없음"+fileLocation);
		}	
		
		System.out.println("파일 쓰기 완료"+fileLocation);
		
		}

}
