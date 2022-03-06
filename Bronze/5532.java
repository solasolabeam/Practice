import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		in.close();
		double a=0,b=0;
		
		a=Math.ceil((double)A/C); 
		b=Math.ceil((double)B/D);

		System.out.println((int)(L-(a>b?a:b)));

	}
}