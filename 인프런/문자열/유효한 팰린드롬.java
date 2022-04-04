import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str =in.nextLine();
		str=str.toUpperCase();
		String replace =str.replaceAll("[^A-Z]", "");  // 대문자 알파벳만 추출하는 문자열
		String rvs=new StringBuilder(replace).reverse().toString(); // replace를 반전 
		if(replace.equals(rvs)) System.out.println("YES"); // 펠린드롬 인가?
		else System.out.println("NO");
		
	
		
		
	}
}