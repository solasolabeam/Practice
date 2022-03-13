import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int prime = 1234567891;
		long r = 1;
		long sum = 0;
		for (int i = 0; i < L; i++) {
			sum += ((str.charAt(i) - 'a' + 1) * r) % prime;
			r = (r * 31) % prime;
		}
		System.out.println(sum % prime);


	}
}
