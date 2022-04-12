import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<Character, Integer> map1 = new HashMap<>();   // 문자열 t에 대한 맵
		HashMap<Character, Integer> map2 = new HashMap<>();   // 문자열 s에 대한 맵
		Scanner in= new Scanner(System.in);
		char[] s=in.next().toCharArray();                     // 문자열 s를 character타입 배열로 초기화
		String t=in.next();
		int cnt=0;
		
		for(char x : t.toCharArray())                          // map1에 문저열 t의 키,값 을 저장
			map1.put(x, map1.getOrDefault(x, 0)+1);

		int p1=0,p2=0;                                         // sliding window 투포인트
		for(p2=0; p2<t.length(); p2++) {                       
			map2.put(s[p2], map2.getOrDefault(s[p2], 0)+1);    // map2에 문자열 s의 키,값을 저장
			
		}
		if(map1.equals(map2))                               // map1 와 map2의 키,값이 동일하면 카운트
			cnt++;
		while(p2<s.length) {
			map2.put(s[p2], map2.getOrDefault(s[p2],0)+1);
			p2++;
			map2.put(s[p1], map2.getOrDefault(s[p1], 0)-1);     // 윈도우를 옆으로 밀면서 키,값도 -1 
			if(map2.get(s[p1])==0)                              // 키가 다 나갔으면 remove
				map2.remove(s[p1]);
			p1++;
			if(map1.equals(map2))                      
				cnt++;
		}
		System.out.println(cnt);
	}
}