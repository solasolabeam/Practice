import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st =new StringTokenizer(br.readLine());
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		int V=Integer.parseInt(st.nextToken());
		int cnt=0;
		int sum=0;
		while(true) {
			cnt++;
			sum+=A;
			if(sum==V) {
				bw.write(cnt+"\n");
				break;
			}
			sum-=B;
			
		}
		bw.flush();
		bw.close();
	}
}