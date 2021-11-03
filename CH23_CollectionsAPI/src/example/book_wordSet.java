package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class book_wordSet {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//책파일을 불러와서 단어로 정령출력
		File wordsSherlock=new File("sherlock.txt");
		
		System.out.println(wordsSherlock.exists());
		
		
		TreeSet<String> Sherlist=loadWords(wordsSherlock);
		
		System.out.println(Sherlist.size());
		displaywords(Sherlist);
	}

	private static void displaywords(TreeSet<String> list) {
		int count=0;
		for(String l:list) {
			
			if(l.length()<=6) continue;
			System.out.printf("%-15s \t" ,l);
			count++;
			if(count%5==0) {
				System.out.println("");
				
			}
		}
		
	}

	private static TreeSet<String> loadWords(File file) throws FileNotFoundException, IOException {
		//파일을 입력하면 파일을 읽어서 단어들을 트리셋으로 리턴
		TreeSet<String> WordSet=new TreeSet<>();
		
		try(BufferedReader br=new BufferedReader(new FileReader(file))) {
			String line=null;
			while((line=br.readLine())!=null){
				String[] words=line.split("[^a-zA-Z]");
				for(String w:words) {
					if(w.length()<2)continue;
					WordSet.add(w.toLowerCase());
				}
			}
		}
		
		return WordSet;
	}

}
