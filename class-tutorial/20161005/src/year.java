import java.util.Scanner;

public class year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.println("請輸入年份：");
		year = sc.nextInt();
		
		
		if (year % 400 == 0)
			System.out.println("閏年");		
		else if ((year % 4 == 0) && (year % 100 != 0)) 
			System.out.println("閏年");
		else
			System.out.println("平年");
		
		sc.close();
	}
}