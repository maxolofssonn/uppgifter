package uppgfitergithub;

public class repetition {
	
	public static void main(String[] args) {
		
		System.out.println(uppgift1(1,3,4));
		
	}
	
	public static int uppgift1(int... integer) {
		
		int sum = 0;
		
		for (int i = 0; i < integer.length; i++) {
			sum = sum + integer[i];
		}
		
		return sum;
		
	}
	
}
