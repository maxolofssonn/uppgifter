package uppgfitergithub;

public class vecka35 {

	public static void main(String[] args) {
		
		
		System.out.println(uppgift1(1,2,3,4,5,6,7,8));
		
	}
	
	public static int uppgift1(int... n) {
		
		int sum = 0;
		
		for (int i = 0; i < n.length; i++) {
			
			sum = sum + n[i];
			
		}
		
		return sum;
		
	}
	
}
