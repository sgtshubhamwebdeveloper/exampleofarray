package arrayexample;

public class Oddposition {
	public static void main(String[] args) {
		int num[]= {1,3,5,7,9,11,13};
		System.out.println("Array elements on Odd position :");
		for(int i=0;i<num.length;i=i+2) {
			System.out.println(num[i]);
		}
	}

}
