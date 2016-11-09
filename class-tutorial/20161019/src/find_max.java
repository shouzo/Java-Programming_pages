import java.util.Scanner;
public class find_max {
	public static void main(String[] args) {
		int i = 0, max = 0;
		int [] a = new int[6];
		Scanner input = new Scanner(System.in);
		
		/* 使用者輸入數字 */
		for (i = 0; i <= 4; i++) {
			System.out.print("請輸入第" + (i+1) + "個數字：");
			a[i] = input.nextInt();
		}
			
		System.out.println("****** 輸出結果 ******");
		
		/* 顯示使用者輸入的數字 */
		for (i = 0; i <= 4; i++)
			System.out.println("第" + (i+1) + "個數字為："+ a[i]);
				
		/* 數字之間比大小 */
		for (i = 0; i <= 4; i++)
			if (max < a[i])
				max = a[i];			
		
		System.out.println("最大值為：" + max);
		input.close();
	}
}
