import java.util.Arrays;
import java.util.Scanner;
public class Main { 
	
	public static void main(String[] args) { 
	
		Scanner in = new Scanner(System.in);
		int X = 5;   // 5�� �Է°� ����
		int[] arr = new int[X];
		int sum=0;
		for(int i=0; i<X; i++) {
			arr[i]=in.nextInt();  
			sum+=arr[i];  // ���� sum�� �迭�� ��� ���ڵ��� ��� ���� 
		}
		Arrays.sort(arr);
		System.out.println(sum/arr.length); // ��հ�
		System.out.println(arr[arr.length/2]); // �迭�� �߰� ��
		in.close();
	}
}

