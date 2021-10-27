package reading_writing_txt;

import java.io.File;

public class App2 {

	public static void main(String[] args) {
		//파일의 절대경로를 문자열로 표시(\\로 표시됌)
		String fileLocation="C:\\java\\java-study\\CH21_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());
	}

}
