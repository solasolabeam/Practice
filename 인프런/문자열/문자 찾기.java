import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String str=in.next();
		String str2=in.next();
		str=str.toLowerCase();
		str2=str2.toLowerCase();
		int cnt=0;
		for(int i=0; i<str.length(); i++) {
		if(str2.charAt(0)-'a'==str.charAt(i)-'a')
			cnt++;
		}
		
		System.out.println(cnt);
		  
	}
}