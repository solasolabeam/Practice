import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str =in.next();
		str=str.toUpperCase();
		String rvs=new StringBuilder(str).reverse().toString();
		if(str.equals(rvs))System.out.println("YES");
		else System.out.println("NO");
	}
}