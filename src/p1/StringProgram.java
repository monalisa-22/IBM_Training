package p1;

public class StringProgram {

	public static void main(String[] args) {
		String str="My first java program ";
		String str2="My second java program";
		System.out.println(str.contains("java"));
		System.out.println(str.substring(8));
		System.out.println(String.join(";",str,str2));
		System.out.println(str.replace("java", "python"));
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("m"));
		System.out.println(str.concat(str2));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.compareTo(str2));
		System.out.println(str);
		System.out.println(str.startsWith("My"));

	}

}
