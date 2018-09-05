package uppgfitergithub;

import java.util.Scanner;

public class repetition {
	
	public static void main(String[] args) {
		
		uppgift4();
		
	}
	
	public static int uppgift1(int... integer) {
		
		int sum = 0;
		
		for (int i = 0; i < integer.length; i++) {
			sum = sum + integer[i];
		}
		
		return sum;
		
	}
	
	public static void uppgift2(){
		
		Scanner sc = new Scanner(System.in);
		
		String ord1 = sc.nextLine();
		String ord2 = sc.nextLine();
		String ord3 = sc.nextLine();
		
		String tempOrd1 = "";
		String tempOrd2 = "";
		String tempOrd3 = "";
		
		for (int i = ord1.length()-1; i >= 0; i--) {
			
			tempOrd1 = tempOrd1 + ord1.charAt(i);
			
		}
		
		for (int i = ord2.length()-1; i >= 0; i--) {
					
			tempOrd2 = tempOrd2 + ord2.charAt(i);
					
		}
		
		for (int i = ord3.length()-1; i >= 0; i--) {
			
			tempOrd3 = tempOrd3 + ord3.charAt(i);
			
		}
		
		System.out.println(tempOrd1);
		System.out.println(tempOrd2);
		System.out.println(tempOrd3);
		
	}
	
	public static void uppgift3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Skriv in radie i meter: ");
		
		double radie = sc.nextDouble();
		double pi = Math.PI;
		double volym = (4 * pi * radie * radie * radie) / 3;
		
		System.out.println(volym + "m^3");
		
	}
	
	public static void uppgift4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Skriv in två heltal: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a < b) {
			System.out.println(a + " är det minsta talet.");
		}
		else {
			System.out.println(b + " är det minsta talet.");
		}
		
	}
	
	
	
}








