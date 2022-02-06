import java.util.HashSet;  // HashSet 은 자바 Collection 중 Set 의 파생클래스이다.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		HashSet<Integer> h = new HashSet<Integer>(); 
		//  HashSet<Integer> 으로 타입을 Integer로 선언했기 때문에 int 형 또는 Integer 객체를 넣어주어야한다.

		for (int i = 0; i < 10; i++) {
			h.add(in.nextInt() % 42);  // HashSet.add() 메소드는 HashSet에 저장하는 메소드이다
		}
		in.close();
		System.out.println(h.size());
		// HashSet 에 저장하면서 들어간 원소의 개수가 HashSet 의 사이즈가 되는 것
	}

}
/*  이 메소드에서 값을 넣을 때 만약 중복되는 값이 없으면 HashSet 에 저장되면서 True 를 반환하고, 만약 중복되어 저장되지 않으면 False 를 반환한다.
 *  1. 중복되는 원소를 넣을 경우 하나만 저장한다. 즉, 중복원소를 허용하지 않는다.
 *  2. HashSet 은 순서 개념이 없다. 따라서 Collections.sort() 메소드를 사용할 수 없다. 만약 정렬을 하고 싶다면 리스트로 변환 후 정렬해야한다.
 */