
public class rolldice_function {
	public static void main(String[] args) {
		rolldice();
	}
	
	
	private static int rolldice() {
		int count = 1, key = 0, total = 0;
		int dice1 = 0, dice2 = 0, dice3 = 0, dice4 = 0, dice5 = 0, dice6 = 0;
		
		while (count <= 6000)
		{ 
			key = (int) Math.ceil(Math.random() * 6);
			switch (key) {
				case 1:	dice1++;	break;
				case 2:	dice2++;	break;
				case 3: dice3++;	break;
				case 4:	dice4++;	break;
				case 5:	dice5++;	break;
				case 6:	dice6++;	break;
				default:	break;
			}
			++count;
		}
		total = dice1 + dice2 + dice3 + dice4 + dice5 + dice6;
		
		System.out.println("1 總共出現[" + dice1 + "]次");
		System.out.println("2 總共出現[" + dice2 + "]次");
		System.out.println("3 總共出現[" + dice3 + "]次");
		System.out.println("4 總共出現[" + dice4 + "]次");
		System.out.println("5 總共出現[" + dice5 + "]次");
		System.out.println("6 總共出現[" + dice6 + "]次");
		
		System.out.println("總共骰了" + total + "次");
	
		return 1;
	}
	
}
