import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		Double height, weight, bmi;
		
		System.out.println("Please Key in your name：");
		name = sc.next();
		
		System.out.println("Please Key in your age：");
		age = sc.nextInt();
		
		System.out.println("Please Key in height(meters)：");
		height = sc.nextDouble();
		
		System.out.println("Please Key in weight(kilogram)：");
		weight = sc.nextDouble();
		
		bmi = weight / (height * height);
		
		System.out.println("姓名：" + name);
		System.out.println("年齡：" + age);
		System.out.println("身高：" + height);
		System.out.println("體重：" + weight);
		System.out.println("BMI：" + bmi);
		
		sc.close();
	}
}
