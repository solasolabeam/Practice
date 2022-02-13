import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M=N;
		for (int i = 0; i < N; i++) {   // 1~5ÁÙ ½ÇÇà
			for(int k=0; k<i; k++) {    // ºóÄ­ ¸¸µé±â
				System.out.print(" ");
			}
			for (int j = 0; j < M; j++) { // º°Âï±â
				System.out.print("*");
				
			}
			
			M--; // ÁÙ ¹Ù²Þ ÇÒ¶§ ¸¶´Ù -1
			
			System.out.println();
		}
	}
}
