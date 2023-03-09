package p1;

public class SwitchCase {

	public static void main(String[] args) {
		int marks=31;
		int x=marks/10;
		String grade="";
		switch(x) {
		case 9:
			grade="A";
			break;
		
		case 8:
			grade="B";
			break;
		case 7:
			grade="C";
			break;
			
		case 6:
			grade="D";
			break;
			default :
			grade="f";
	}
System.out.println("Grade obtained "+ grade);
}}
