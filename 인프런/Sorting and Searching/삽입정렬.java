import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		int temp;
		for(int i=1; i<arr.length; i++) {
			for(int j=i; j>0; j--) {
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int x : arr)
			System.out.print(x+" ");

		System.out.println();

	}
}
