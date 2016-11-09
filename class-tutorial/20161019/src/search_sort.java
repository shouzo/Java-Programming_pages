import java.util.Scanner;
public class search_sort {
	private static int Seqential(int[] a, int target) {
		int i = 0, index = -1;
		
		for (i = 0; i <= 6; i++) {
			if (a[i] == target) {
				index = i;
			}
			System.out.print("[" + a[i] + "]" + "\t");									
		}
		
			if (index != -1)
				return index;
			else
				return -1;
	}
	
	public static void main(String[] args) {
		int i = 0;
		int[] a = {89, 34, 78, 45, 12, 99, 23};
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("請輸入搜尋數字：");
		int target = input.nextInt();		
		int pos = Seqential(a, target);
		
		
		if (pos != -1)
			System.out.println("\n" + "數字 " + target + " 的索引位址在：" + pos);
		if (pos == -1)
			System.out.println("\n" + "數字 " + target + " 不存在");	
	}
}
