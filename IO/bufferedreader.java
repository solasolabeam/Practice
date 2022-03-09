import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class bufferedreader {

	//IOException을 던져야함
	public static void main(String[] args) throws IOException{
		//bufferedreader는 설명에서처럼 inputstreamreader에 buffer를 추가하는 것이기 떄문에 
		//inputstreamreader를 받아와야한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//bufferedreader는 무조건 우선 문자열로 저장하기 때문에 다른 형으로 저장하고 싶으면 형 변환을 해줘야한다.
		int N = Integer.parseInt(br.readLine());
		//문자열로 저장할거면 형변환 없이 그냥 저장하면 된다.
		String S = br.readLine();
		
		System.out.println(N);
		System.out.println(S);
	}

}