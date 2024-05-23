package arrayexample;

public class OddNumbers {
	public static void main(String[] args) {
		int a[]= {2,5,7,9,11,12,15,16,19};
		System.out.println("Odd Numbers are :");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
	}

}
