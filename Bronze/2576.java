import java.util.Arrays;
import java.util.Scanner;
public class Main { 
	
	public static void main(String[] args) { 
	
		Scanner in = new Scanner(System.in);
		
		int[] arr = {                                // �Է��� 7�� �ް�, �迭�� �����մϴ�.
		in.nextInt(),in.nextInt(),in.nextInt(),
		in.nextInt(),in.nextInt(),in.nextInt(),
		in.nextInt()};
		in.close();
		Arrays.sort(arr);                            // �迭�� ������������ ���� �մϴ�.
		int val=0;   // Ȧ�� , ¦�� �����ϱ����� ��
		int count=0; // �ּ� Ȧ���� �к��� �Էµ� ���� ��� ¦���϶� ���� 0
		int sum=0;   // Ȧ�������� ��
		int mini=0;  // ���� �ּ��� Ȧ��
		
		for(int i=0; i<7; i++) {    // �迭�� ����� ���̸�ŭ �ݺ�
			val=arr[i]%2;    // �������� 0�̸� ¦��, 1�̸� Ȧ��
			if(val==1) {     
				sum+=arr[i]; // ���� Ȧ���̸� sum������ ���� ����
				count++;     // Ȧ���� ã�������� ����
				if(count==1) {  // ���ʷ�ã�� Ȧ�� �� �ּҰ� Ȧ�� �к�
					mini=arr[i];  // ���� �ּ��� Ȧ���� ���� mini�� ����
				}
			}
			
		}
		if(count==0) {        // Ȧ���� �ϳ��� ���ٸ�  -1 ���
			System.out.print(-1);
		}
		else {
			System.out.println(sum);  // Ȧ���� ��� ��
			System.out.println(mini); // �ּ� Ȧ��
		}
		
		

	}
}

