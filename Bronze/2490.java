import java.util.Scanner; 
public class Main { 
	
	public static void main(String[] args) { 
	
		Scanner in = new Scanner(System.in); 
	
		
		
		
		for(int i=0; i<3; i++) {
			int count =0;
			for(int j=0; j<4; j++) {
				
				int A = in.nextInt();
				
				if(A==0) {
					count++;
				}
				
				
			}
			if(count==0){            // 모
				System.out.println("E");
			}
			else if(count==1) {      // 도
				System.out.println("A");
			}
			else if(count==2) {      // 개
				System.out.println("B");
			}
			else if(count==3) {      // 걸
				System.out.println("C");
			}
			else if(count==4) {      // 윷
				System.out.println("D");
			}
			
			
		}
		
		
		

		in.close();
	}
}

