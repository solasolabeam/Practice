import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s=in.next();
		char t =in.next().charAt(0);
		int[] arr=new int[s.length()];
		int[] arr2=new int[s.length()];
		
		int temp=100;
		for(int i=0; i<s.length(); i++) {   // ----> �������� Ž��
			temp++;
			if(t==s.charAt(i))
				temp=0;
			arr[i]=temp;
		}
		temp=100;
		for(int i=s.length()-1; i>=0; i--) {  //  <----- �������� Ž��
			temp++;
			if(t==s.charAt(i)) temp=0;
			arr[i]=Math.min(arr[i], temp);    //  ���� ª�� �Ÿ� ���
		}
		for(int x: arr) {
		System.out.print(x+" ");
		}
	}
}