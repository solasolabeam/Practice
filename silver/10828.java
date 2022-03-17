import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
        // Stack ��ü ����.
		Stack<Integer> stack = new Stack<>();
		
        // ����.
		for(int i = 0;i<n;i++) {
			String cons = br.readLine();
			
			if(cons.contains("push")) { // ����.
				String spt[] = cons.split(" ");
				stack.push(Integer.parseInt(spt[1]));
			}else if(cons.contains("pop")) { // ����.
				if(stack.empty()) bw.write(-1+"\n"); // ������ empty() üũ�� �ʿ��ϴ�.			
				else bw.write(stack.pop()+"\n");			
			}else if(cons.contains("size")) { // ����.
				bw.write(stack.size()+"\n");
			}else if(cons.contains("empty")) { // ����.
				if(stack.empty()) bw.write(1+"\n"); // ������ empty() üũ�� �ʿ��ϴ�.	
				else bw.write(0+"\n");
			}else if(cons.contains("top")) { // ����.
				if(stack.empty())bw.write(-1+"\n");	// ������ empty() üũ�� �ʿ��ϴ�.									
				else bw.write(stack.peek()+"\n");
			}
		}
		
		bw.flush();
		bw.close();		
		br.close();
	     
	}

}