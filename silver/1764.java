import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		ArrayList<String> list =new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int cnt=0;
		String str="";
		String[] a=new String[n];
		String[] b=new String[m];
		for(int i=0; i<n; i++) {
			a[i]=in.next();
			hm.put(a[i],hm.getOrDefault(a[i], 0)+1);   // ó�� �߰ߵ� ���ڸ� 1+
		}
		for(int i=0; i<m; i++) {
			b[i]=in.next();
			if(hm.containsKey(b[i])){           // ���� ���ڰ� �����ϸ� ī���� ++ , ���ڿ� ����
					cnt++;
					list.add(b[i]);
			}
			
		}
		Collections.sort(list);       // ���� ������ ���
		System.out.println(cnt);
		for(String x : list)
		System.out.println(x);
	}
}