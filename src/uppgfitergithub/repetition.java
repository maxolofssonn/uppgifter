package uppgfitergithub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class repetition {
	
	static Person person = new Person(10, "Max");
	static Person person2 = new Person(15, "Hej");
	
	public static void main(String[] args) {
		
	}
	
	public static String acadaba(int n) {
		
		
		
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
	
	public static void uppgift6(Person p1, Person p2) {
		
		if(p1.age > p2.age) {
			System.out.println(p1.name);
		}
		else if(p2.age > p1.age) {
			System.out.println(p2.name);
		}
		
	}
	
	public static int[] uppgift8(int... massa_tal) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for(int i : massa_tal) {
			array.add(i);
		}
		
		Collections.sort(array);
		
		for (int i = 0; i < massa_tal.length; i++) {
			massa_tal[i] = array.get(i);
		}
		
		return massa_tal;
		
	}
	
}








