import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		str=str+" ";
		int cnt=1;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1))
				cnt++;
			else {
				System.out.print(str.charAt(i));
				if(cnt>1) {
					System.out.print(cnt);
					cnt=1;
				}
			}
		}
		
	}
}