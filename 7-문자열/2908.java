import java.util.Scanner;

public class test {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] arr=new int[2];
		for(int j=0; j<2; j++) { // �� ���� ��
		int A = in.nextInt();
		int num=0;
		int sum=0;
		int cnt=100;        // ���� �ڸ�->���� �ڸ�->�����ڸ� 
		
		for(int i=0; i<3; i++) {  // �� �ڸ��� ����
		
		
		num=A%10;          // �� �ڸ��� ���� ���ϱ�
		A=A/10;
		sum+=num*cnt;
		cnt/=10;           
		}
		arr[j]=sum;   // �Ųٷ� ���� ���� �迭�� ����
		}
if(arr[0]<arr[1]) {
	System.out.println(arr[1]);
}
else {
	System.out.println(arr[0]);
}
		
		

	}
}