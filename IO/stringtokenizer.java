import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class stringtokenizer {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//StringTokenizer�� ��ū���� ���ڿ��� ���� ���������� ������ �������� ����ȯ�� ������Ѵ�.
		int N = Integer.parseInt(st.nextToken());
		int N2 = Integer.parseInt(st.nextToken());
		
		System.out.println(N);
		System.out.println(N2);
	}

}