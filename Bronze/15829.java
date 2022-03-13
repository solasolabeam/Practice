import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long L = in.nextLong();
		String str = in.next();
		long num = 0;            // 알파벳 자릿 수
		long sum = 0;            // 합 계
		for (int i = 0; i < L; i++) {
			switch (str.charAt(i)) {   // a~z 까지 1~26 할당
			case 'a':
				num = 1;
				break;
			case 'b':
				num = 2;
				break;
			case 'c':
				num = 3;
				break;
			case 'd':
				num = 4;
				break;
			case 'e':
				num = 5;
				break;
			case 'f':
				num = 6;
				break;
			case 'g':
				num = 7;
				break;
			case 'h':
				num = 8;
				break;
			case 'i':
				num = 9;
				break;
			case 'j':
				num = 10;
				break;
			case 'k':
				num = 11;
				break;
			case 'l':
				num = 12;
				break;
			case 'm':
				num = 13;
				break;
			case 'n':
				num = 14;
				break;
			case 'o':
				num = 15;
				break;
			case 'p':
				num = 16;
				break;
			case 'q':
				num = 17;
				break;
			case 'r':
				num = 18;
				break;
			case 's':
				num = 19;
				break;
			case 't':
				num = 20;
				break;
			case 'u':
				num = 21;
				break;
			case 'v':
				num = 22;
				break;
			case 'w':
				num = 23;
				break;
			case 'x':
				num = 24;
				break;
			case 'y':
				num = 25;
				break;
			case 'z':
				num = 26;
				break;
			}
			sum += num * Math.pow(31, i);     // 알파벳 해당 수 * 31 의 자리순번의 제곱
		}
		System.out.println(sum);
		in.close();
	}
}