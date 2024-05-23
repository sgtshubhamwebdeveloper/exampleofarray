package arrayexample;

public class EvenPosition {
	public static void main(String[] args) {
		int num[] = {1,3,5,7,9,11,13};
		System.out.println("Array Elements on even positions : ");
		for(int i=1;i<num.length;i=i+2)
		{
			System.out.println(num[i]);
		}
	}

}
