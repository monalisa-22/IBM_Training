package p1;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		String str="This is my java program";
		int wordCount=0;
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ') {
			wordCount++;
		}	
		
		}
	    System.out.println("Number of words: " + (wordCount+1));  
	}

}
