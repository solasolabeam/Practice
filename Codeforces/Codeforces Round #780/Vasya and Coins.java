import java.util.Scanner;
 
public class test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t =in.nextInt();

		for(int i=0; i<t; i++) {
			int a=in.nextInt();  // 1�� ¥��
			int b=in.nextInt();  // 2�� ¥��
		if(a==0)
			System.out.println(1); // 1��¥���� ���ٸ� 1
		else
			System.out.println(a+b*2+1);
		}
	}
}