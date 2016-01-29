package lamdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class CountWords {

	public static void main(String[] args) {
		//Syste
		List<String> words=new ArrayList<String>();
		//System.out.println("Enter");
		words.add("Hagos");
		words.add("come");
		words.add("back");
		words.add("kelb");
		words.add("chara");
		words.add("join");
		//char ch='c';
		//char dd='d';
		System.out.println(countWords(words,'c','d',5));
		//countWords(words,ch,dd,5);
		
	}
	public static int countWords(List<String> words,char c, char d,int len){
	 
		String str1 = ""+c;
		String str2 = "" + d;
			 return (int)words.stream()
					 .filter(w->w.contains(str1))
					 .filter(w->!w.contains(str2))
					 .filter(w->w.length()==len)
					 .count();
					 //.forEach(System.out::println);
			//return filt;
	}

}
