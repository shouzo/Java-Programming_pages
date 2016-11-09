import java.util.Scanner;
public class rope_function {
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int length = 0, limit = 0;
		
		System.out.println("請輸入繩子的長度：");
		length = sc.nextInt();
		System.out.println("請輸入繩子的限制(小於的長度)：");
		limit = sc.nextInt();
		
		fold(length, limit);	// 進入副程式
		sc.close();
	}
	
	private static int fold(int length, int limit) {
		int time = 0;
		int key = length;
		
		while (length >= limit)
		{
			length = length / 2;
			time++;
			System.out.println("第" + time + "次對折，長度變" + length);
		}
		System.out.println(key + "公分的繩子對折[" + time + "]次會小於" + limit + "公分");
	
		return 1;
	}
}
