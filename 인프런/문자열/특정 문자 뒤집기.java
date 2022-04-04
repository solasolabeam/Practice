import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char[] arr= str.toCharArray();
		int lt=0;
		int rt=str.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(arr[lt])) lt++;
			else if (!Character.isAlphabetic(arr[rt])) rt--;
			else {
				char tmp=arr[lt];
				arr[lt]=arr[rt];
				arr[rt]=tmp;
				lt++;
				rt--;
			
			}			
		}
		String rvs=new String(arr);
		System.out.println(rvs);
	}
}