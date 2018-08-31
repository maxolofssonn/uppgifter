package uppgfitergithub;

public class vecka35 {

	public static void main(String[] args) {
		
		
		System.out.println(uppgift2("max"));
		
	}
	
	public static int uppgift1(int... n) {
		
		int sum = 0;
		
		for (int i = 0; i < n.length; i++) {
			
			sum = sum + n[i];
			
		}
		
		return sum;
		
	}
	
	public static String uppgift2(String string){
		
		if(string.length() == 0){
			
			return string;
			
		}
		
		else {
			
			return uppgift2(string.substring(1)) + string.charAt(0);
			
		}
		
	}
	
	
	
}





