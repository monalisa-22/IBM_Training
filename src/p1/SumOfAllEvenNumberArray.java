package p1;

public class SumOfAllEvenNumberArray {

	public static void main(String[] args) {
		int a[]= {10,11,20,25};
		int sum=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}

}
