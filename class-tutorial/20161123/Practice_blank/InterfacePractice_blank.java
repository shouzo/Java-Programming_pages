package week7;

/*....*/ Shape{
	public double Shape_PI = 3.1416;
	//perimeter();
	//area();
	//printInfo();
}
class Circle /*....*/{
	private double r;
	public Circle (double r){this.r = r;}
	public double area(){return Math.PI*r*r;}
	public double perimeter(){/*....*/}
	public void printInfo(){
		//.....
	}
}
class Rectangle /*....*/{
	private double width, height;
	public Rectangle(double width,double height){
		this.width = width;this.height=height;} 
	public double area(){/*....*/}
	public double perimeter(){/*....*/}
	public void printInfo(){	
		//....
	}
}

public class InterfacePractice_blank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape a = null;
		Circle c = new Circle(6.0);
		Rectangle r = new Rectangle(10.0, 15.0);
		//實現多形....
		//....
		//....
			a.printInfo();
	}
}
