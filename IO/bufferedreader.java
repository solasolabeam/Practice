import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class bufferedreader {

	//IOException�� ��������
	public static void main(String[] args) throws IOException{
		//bufferedreader�� ������ó�� inputstreamreader�� buffer�� �߰��ϴ� ���̱� ������ 
		//inputstreamreader�� �޾ƿ;��Ѵ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//bufferedreader�� ������ �켱 ���ڿ��� �����ϱ� ������ �ٸ� ������ �����ϰ� ������ �� ��ȯ�� ������Ѵ�.
		int N = Integer.parseInt(br.readLine());
		//���ڿ��� �����ҰŸ� ����ȯ ���� �׳� �����ϸ� �ȴ�.
		String S = br.readLine();
		
		System.out.println(N);
		System.out.println(S);
	}

}