class mac {
	private int SerialNumber;	// 產品序號
	private int Year;			// 年份
	private String Month;		// 月份
				
	public int getSerialNumber() { return SerialNumber; }
	public int getYear() { return Year; }
	public String getMonth() { return Month; }
	
	public void setProduct(int SN, int Y, String M) {
		SerialNumber = SN;	// 設定產品序號
		Year = Y;			// 設定年份
		Month = M;			// 設定月份
	}
}

class MAC {
	public static void main(String[] args) {	
		mac student = new mac();
		student.setProduct(10009453, 2016, "二月");
		
		System.out.println("Macbook Air: ");
		System.out.println("產品序號: " + student.getSerialNumber());
		System.out.println("保固期: " + (student.getYear() + 2) + " " + student.getMonth());		// 印出保固期
	}
}
