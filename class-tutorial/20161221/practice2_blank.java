package Java20151119;

import java.io.*;
import java.util.Scanner;

// 主類別
public class practice2_blank {
	// 主程式
	public static void main(String[] args) throws Exception {
		int n, sum = 1;
		String file = "D:\\QQ.txt";//宣告file作為檔案路徑

		Scanner ip = new Scanner(System.in);
		System.out.println("請輸入階層數:");

		n = ....;//輸入填入n
		....{//計算n!
			....;
		}
		String str1 ....;//要填入檔案的字串

		// 建立BufferedWriter的輸出串流物件
		.... output ....(file));
		output.....(str1); // 輸出2個字串
		output.....(); // 關閉串流
		System.out.println("寫入檔案完成...");
		// 建立BufferedReader的輸入串流物件
		.... input = new ....(new ....(file));
		System.out.println("檔案: " + file);
		System.out.println("---------------------");
		// 使用while迴圈讀取資料
		while (.... != null)
			System.out.println(str1);
		input.close(); // 關閉串流
	}
}