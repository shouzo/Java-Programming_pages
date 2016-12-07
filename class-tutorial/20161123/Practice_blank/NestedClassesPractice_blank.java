package week7;

class Employee {
	....; 	//宣告name型態為String
	....;		//宣告name型態為內類別的Phone
	class Phone {			//宣告Phone
		....;		//宣告home,cell
		public Phone (long phone1, long phone2){	//Phone建構子
			....;		
		}
		public void printPhone(){		//印出電話
			System.out.println("電話(住家): 0"....);	//
			System.out.println("電話(手機): 0"....);	//
		}
	}
	public Employee(String name, long home, long cell){	//Employee建構子
		....;	//name
		....;	//home&cell
	}
	public void printEmployee(){	//印出員工資訊
		System.out.println("=====員工=====");	
		....;	//name
		....;		//printPhone()
	}
	
}

public class NestedClassesPractice_blank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		....;//宣告Employee便new出一個新物件
		....;//呼叫printEmployee()
	}

}
