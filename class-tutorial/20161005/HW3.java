public class HW3 {
	public static int flag = 1;	// 設立判斷旗標
	public static int key = 0;	// 設立保存旗標

	
	/* 主程式 */
	public static void main(String[] args) {
		int dice1 = 1, dice2 = 1; 
		
		while (true) {
			/* 讓兩個骰子產生隨機數字 */
			dice1 = (int) Math.ceil(Math.random() * 6);
			dice2 = (int) Math.ceil(Math.random() * 6);
			int jump = rolldice(dice1, dice2);	
			++flag;			// 每多進入迴圈一次，就自動將旗標值 +1 
			
			if (jump == 0)	// 判斷是否要繼續下一回合
				break;
		}
	}
	
	
	/* 判斷副程式 */
	private static int rolldice(int dice1, int dice2) {
		int result = dice1 + dice2;		// 將兩個骰子的結果相加
		
		System.out.println("********進入第" + flag + "回合********");
		System.out.println("骰子1點數為：" + dice1);
		System.out.println("骰子2點數為：" + dice2);
		System.out.println("兩個骰子相加後點數為：" + result);
		
		
		// 先判斷旗標，是否為第一次進入判斷程序
		if (flag == 1) {	// 第一次進入			
			// 如果加總結果是 7 或 11，玩家贏了
			if (result == 7 || result == 11) {
				System.out.println("恭喜！你贏了！！");
				return 0;
			}
				
			// 如果加總結果是 2 或 3 或 12，玩家輸了
			else if (result == 2 || result == 3 || result == 12) {
				System.out.println("哇！你輸了！！");
				return 0;
			}
			
			// 如果是其他情況，則準備進入下一回合
			else {	
				key = result;	// 將第一次的投擲結果存入保存旗標內
				return 1;
			}
		}
		
		// 並非第一次進入
		else if (flag != 1 && result == key) {
			if (result == key) {
				System.out.println("恭喜！你贏了！！");
				return 0;
			}
			
			else if (result == 7) {
				System.out.println("哇！你輸了！！");
				return 0;
			}
			
			// 如果沒有得到目標點數或是結果為 7，則繼續進入下一回合
			else {
				return 1;
			}
		}		
		
		return 1;
	}			
}
