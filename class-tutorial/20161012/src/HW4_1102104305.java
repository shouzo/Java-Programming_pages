import java.util.Scanner;

public class HW4_1102104305 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.print("請輸入 a ：");
		int a = num.nextInt();	
		System.out.print("請輸入 b ：");
		int b = num.nextInt();
		
		System.out.print("gcd(a, b) = " + gcd(a, b));
		num.close();
	}
	
	
	public static int gcd(int a, int b) {
		if (a != 0 && b != 0) {
			if (a >= b) {
				a = a % b;
				return gcd(a, b);
			}
			
			if (a <= b) {
				b = b % a;
				return gcd(a, b);
			}			
		}
		
		if (a >= b)
			return a;
		else
			return b;
	}
}

