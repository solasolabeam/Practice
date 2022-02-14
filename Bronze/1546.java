import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] arr = new double[in.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextDouble();

		}
		Arrays.sort(arr);
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += (arr[i] / arr[arr.length - 1]) * 100;
		}
		System.out.println(sum/arr.length);
		in.close();
	}
}