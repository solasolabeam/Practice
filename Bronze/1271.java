import java.util.Scanner;
import java.math.BigInteger;     // 조건의 범위가 10의 1000제곱이므로 BigInteger
public class Main {                    

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		BigInteger n = in.nextBigInteger();   // int 대신 BigInteger 사용
		BigInteger m = in.nextBigInteger();
		
		System.out.println(n.divide(m));     // BigInteger 내부 함수 사용
		System.out.println(n.remainder(m));
		
	}
}

/* 문자열 형태로 이루어져 있기에 사칙연산이 안된다.
   따라서 BigInteger의 값을 계산을 하려면 클래스 내부의 함수를 이용 해야한다. */