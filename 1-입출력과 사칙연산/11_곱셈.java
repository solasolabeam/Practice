import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		
    Scanner in = new Scanner(System.in);
    
    int a = in.nextInt();
    String b = in.next();
    
    in.close();
    
    
    
    System.out.println(a*(b.charAt(2)-'0'));
    System.out.println(a*(b.charAt(1)-'0'));
    System.out.println(a*(b.charAt(0)-'0'));
    System.out.println(a*Integer.parseInt(b));
  //  System.out.println(a*b.String);
    

	}
}