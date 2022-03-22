import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt = 0;// Ãş¿¡ ÇØ´çµÇ´Â ¹úÁı °¹¼ö
		int sum= 1; // Ãş ±îÁö ¸ğµç ¹æÀÇ °¹¼ö
		int layer = 1; // Ãş ¼ö = ÃÖ¼Ò°ª
		int N = in.nextInt();

			while (N > sum) {						
				cnt +=6;
				sum += cnt;
				layer++;
			}
			System.out.println(layer);
		
		in.close();
	}
}