import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] str = new int[3];               // ������ �迭�� 3���� ���� ����
		
	
		
		for(int i=0; i<str.length; i++) {     // �迭�� �Է��ϴ´�� ���� 
			str[i]=in.nextInt();              // str[0]~str[2] ���� ����
		}
		Arrays.sort(str);                     // �������� ���� �޼ҵ�
						
	//	System.out.println(str[1]+str[2]);   �׽�Ʈ ���

		int A = str[0];                      // ���� �������� A�� ����          
		int B = str[1];                      // �߰����� B�� ����  
		int C = str[2];                      // ���� ū���� C�� ����  
		
		if(A==B&&B==C&&C==A) {                    // �� ���ڰ� ��� ���� �Ҷ�
			System.out.println(10000+A*1000);
		}
		else if(A==B) {                           // �� ���ڰ� ���� �Ҷ� 1#
			System.out.println(1000+A*100);
			
		}
		else if(C==B) {                           // �� ���ڰ� ���� �Ҷ� 2#
			System.out.println(1000+C*100);
			
		}
		else if(A==C) {                           // �� ���ڰ� ���� �Ҷ� 3#
			System.out.println(1000+A*100);
			
		}
		else if(A!=B&&B!=C&&A!=C) {               // �� ���ڰ� �������� ������ 
			System.out.println(C*100);
			
		}		
	}
}
