import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str =in.nextLine();
		String[] arr=str.split(" ");
		int max= 0;        //  ÃÖ´ñ°ª
		String answer="";
		
		for(String x : arr) {
			int len=x.length();
			if(len>max) {
				max=len;
				answer=x;
			}
		}
		System.out.println(answer);
	}
}