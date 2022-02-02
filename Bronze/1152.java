import java.util.Scanner;
import java.util.StringTokenizer;
 
public class test {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		String N = in.nextLine();
		in.close();
 
	
		StringTokenizer st = new StringTokenizer(N," ");
		System.out.println(st.countTokens());	
		
	}
 
}