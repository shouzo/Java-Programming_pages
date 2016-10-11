import java.util.Scanner;

public class rope {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = 0;
		float length;
		
		System.out.println("請輸入繩子的長度：");
		length = sc.nextFloat();
		while ( length >= 20)
		{
			length = length / 2;
			time++;
		}
		System.out.println("需要對折：" + time + "次");
		
		sc.close();
	}	
}
