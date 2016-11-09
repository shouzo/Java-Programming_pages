import java.util.Scanner;

public class square {
	public static void main(String[] args) {
		int number;		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入一個整數：");
		number = sc.nextInt();
		square(number);
		
		sc.close();
	}
	
	private static int square(int number) {
		while (number > 0) {
			System.out.println(number + "的平方 = " + number * number);
			number--;
		}
		return 0;
	}
}
