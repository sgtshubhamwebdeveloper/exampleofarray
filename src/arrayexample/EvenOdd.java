package arrayexample;

public class EvenOdd {
	public static void main(String[] args) {
		int[] arr = {5,7,2,4,9};
		int a = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] %2==0)
				a++;
		}
		System.out.println("Number of even numbers :" +a);
		System.out.println("Number of Odd numbers :" +(arr.length - a));
	}
 
}
