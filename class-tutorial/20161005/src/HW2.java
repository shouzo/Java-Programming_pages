import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double income = 0, part = 0;
		
		double tax6 = 370000 * 0.06;
		double tax13 = tax6;
		double tax21 = tax6 + (990000 - 370000) * 0.13;
		double tax30 = tax21 + (1980000 - 990000) * 0.21;
		double tax40 = tax30 + (3720000 - 1980000) * 0.3;
				
		System.out.println("請輸入所得淨額：");
		income = sc.nextFloat();	// 取得輸入的金額
		
		
	/*	------------ 計算稅率	------------	*/
		// 稅率 6%
		if (income <= 370000)								
			part = tax6;
		
		// 稅率 13%
		else if (income >= 370001 && income <= 990000)
			part = tax13 + (income - 370000) * 0.13;
		
		// 稅率 21%
		else if (income >= 990001 && income <= 1980000)
			part = tax21 + (income - 990000) * 0.21;
		
		// 稅率 30%
		else if (income >= 1980001 && income <= 3720000)
			part = tax30 + (income - 1980000) * 0.3;
		
		// 稅率 40%
		else if (income >= 3720001)
			part = tax40 + (income - 3720000) * 0.4;
		
		
		System.out.println("扣稅金額：" + part);	// 輸出扣稅金額
		
		sc.close();
	}
}
