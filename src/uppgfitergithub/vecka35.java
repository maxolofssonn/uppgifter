package uppgfitergithub;

public class vecka35 {

	public static void main(String[] args) {
		
		
		System.out.println(uppgift3("max","sdfsdf","sdfsdf","sdfdgrth"));
		
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
	
	public static <T> T uppgift3(T... obj){
		
		Object[] arr = new Object[obj.length];
		
		for (int i = 0; i < obj.length; i++) {
			
			arr = (Object[]) obj[i];
			
		}
		
		return (T) arr;
		
	}
	
	
	
}





