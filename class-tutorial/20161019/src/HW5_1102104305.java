public class HW5_1102104305 {
	public static void main(String[] args) {
		int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int [][] b = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
		int [][] c = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
			
		printARR(a, b, c);
	}
	
	public static int printARR(int [][] a, int [][] b, int [][] c) {
		int i = 0, j = 0, k = 0;
		
		/* 矩陣相乘 */
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				for (k = 0; k < 3; k++) {
					c[i][j] += a[i][j] + b[i][j];
				}
			}
		}
		
		/* 輸出矩陣a */
		System.out.println("a：");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("[" + a[i][j] + "]");
			}
			System.out.println(" ");
		}
		
		/* 矩陣b */
		System.out.println("c：");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("[" + b[i][j] + "]");
			}
			System.out.println(" ");
		}
		
		/* 矩陣c */
		System.out.println("c：");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("[" + c[i][j] + "]");
			}
			System.out.println(" ");
		}
		
		return 0;
	}
}
