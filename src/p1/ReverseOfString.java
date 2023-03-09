package p1;

public class ReverseOfString {

	public static void main(String[] args) {
		 String str="Reverse the Program";
		 char ch[]=str.toCharArray();  

		    String rev="";  

		    for(int i=ch.length-1;i>=0;i--){  

		        rev+=ch[i];  

		    } 
		    System.out.println(rev);
		 	}

}
