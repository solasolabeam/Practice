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
		for (int i = 0; i < arr.length-1; i++) {
			for (int j =0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int x : arr)
			System.out.print(x+" ");

		System.out.println();

	}
}
