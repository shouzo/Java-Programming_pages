abstract class Test {
	abstract int Jscore();
	abstract void print();
}
	
class MidTerm extends Test {
	private int java;
	public int Jscore() { return java; }
	public MidTerm(int java){this.java = java;}
		
	public void print() {
		System.out.println("=====期中考=====");
		System.out.println("Java分數： " + java);
	}
}
		
class Final extends Test{
	private int java;
	public int Jscore() { return java; }
	public Final(int java){this.java = java;}
		
	public void print() {
		System.out.println("=====期末考=====");
		System.out.println("Java分數： " + java);
	}
}
	
class Quiz extends Test{
	private int java;
	public int Jscore() { return java; }
	public Quiz(int java){this.java = java;}
		
	public void print() {
		System.out.println("=====平時考=====");
		System.out.println("Java分數： " + java);
	}
}

public class TestScore {	
	public static void main(String[] args) {
		Test t;
		MidTerm m = new MidTerm(95);
		Final f = new Final(98);
		Quiz q = new Quiz(90);
	
		for (int i = 1; i <= 3; i++) {
			if (i == 1)			t = m;
			else if (i == 2)	t = f;
			else				t = q;
			t.print();
		}
		
		if (m.Jscore() > f.Jscore() && m.Jscore() > q.Jscore())
			System.out.println("Java期中考最高分！！");
		if (f.Jscore() > m.Jscore() && f.Jscore() > q.Jscore())
			System.out.println("Java期末考最高分！！");
		if (q.Jscore() > f.Jscore() && q.Jscore() > m.Jscore())
			System.out.println("Java平時考最高分！！");
	}
}
