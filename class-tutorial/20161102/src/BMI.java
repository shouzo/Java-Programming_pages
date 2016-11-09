public class BMI {
	public static void main(String[] args) {
		class Man
		{
			public int height = 0;	// 身高
			public int weight = 0;	// 體重
			
			public void printBMI() {
				System.out.print("身高：" + height);
				System.out.print(" 體重：" + weight);
				System.out.println(" BMI：" + weight / ((height * 0.01 * height * 0.01)));
			}
		}
		
		Man man1 = new Man();
		Man man2 = new Man();
		Man man3 = new Man();
		
		
		// 設定 man1 物件
		man1.height = 180;
		man1.weight = 60;
				
		// 設定 man2 物件
		man2.height = 170;
		man2.weight = 55;
		
		// 設定 man3 物件
		man3.height = 175;
		man3.weight = 60;
		
		
		System.out.print("第一個人：");
		man1.printBMI();
		
		System.out.print("第二個人：");
		man2.printBMI();
		
		System.out.print("第三個人：");
		man3.printBMI();
		
	}
	
}
