import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class stringtokenizer {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//StringTokenizer에 토큰으로 문자열을 나눠 저장했으니 변수에 넣을때는 형변환을 해줘야한다.
		int N = Integer.parseInt(st.nextToken());
		int N2 = Integer.parseInt(st.nextToken());
		
		System.out.println(N);
		System.out.println(N2);
	}

}