package p1;

public class NumberOfVowelsInString {

	public static void main(String[] args) {
		String str="Java Program";
		  int vCount = 0;
		char ch[]=str.toCharArray();
		str = str.toLowerCase(); 
		for(int i = 0; i < str.length(); i++) {  
		if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) =='o' || str.charAt(i) == 'u') {
		vCount++;
		
		}
	   
}
	    System.out.println("Number of vowels: " + vCount);  
}}