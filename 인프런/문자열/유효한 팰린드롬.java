import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str =in.nextLine();
		str=str.toUpperCase();
		String replace =str.replaceAll("[^A-Z]", "");  // �빮�� ���ĺ��� �����ϴ� ���ڿ�
		String rvs=new StringBuilder(replace).reverse().toString(); // replace�� ���� 
		if(replace.equals(rvs)) System.out.println("YES"); // �縰��� �ΰ�?
		else System.out.println("NO");
		
	
		
		
	}
}