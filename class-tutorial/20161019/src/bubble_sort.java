import java.util.Scanner;
public class bubble_sort {
	public static void main(String[] args) {
		int i = 0;
		int [] data = new int[5];
		Scanner input = new Scanner(System.in);

		/* 使用者輸入數字 */
		for (i = 0; i <= 3; i++) {
			System.out.print("請輸入第" + (i+1) + "個數字：");
			data[i] = input.nextInt();
		}
		
		bubble(data);
	}
	
	private static void bubble(int [] data) {
		int i = 0, j = 0, tmp;
		
		/* 排列輸入的數字 */
		for (i = 0; i <= 3; i++) {
			for (j = 0; j <= 3; j++) {
				if (data[j] < data [j+1]) {
					tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}
		
		System.out.println("****** 輸出結果 ******");
		System.out.println("數字從大排到小的結果為：");
		/* 顯示使用者輸入的數字 */
		for (i = 0; i <= 3; i++)
			System.out.print(data[i] + "\t");
	}
}
