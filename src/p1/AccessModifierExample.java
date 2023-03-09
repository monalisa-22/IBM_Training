package p1;

public class AccessModifierExample {

	public static void main(String[] args) {
		A obj=new A();
		obj.callme();

	}}
class A{
	//private int x=10;
	public int y=20;
	protected int a=40;
	int z=30;
	public void callme() {
System.out.println(y);		
	}
	
}


