package callExample;

class Balloon {
	private String color = "";
	private int len = 0;
	public int p = 0; 

	public String getColor() {
		return color;
	}
	public Balloon(String color, int len) {
		super();
		this.color = color;
		this.len = len;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	
	public static void incLength(Balloon b) {
		b.len++;		
	}
	
	/*
	public static void swap(Object o1, Object o2){
		Object temp = o1;
		o1=o2;
		o2=temp;
	}
	*/
	
	public static void swap(Balloon o1, Balloon o2){
		/*
		Balloon temp = o1;
		o1=o2;
		o2=temp;
		*/
		
		Balloon temp1 = o1, temp2 = o2;
		o1=temp2;
		o2=temp1;
		
	}
	
	public static void alter(Balloon o1){
//		o1.setLen(0);
//		o2.setColor("White");
		
		Balloon t1 = o1;
		t1.setLen(0);
		t1.setColor("White");
		t1.p = 9;		
	}		
} 


public class CallExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Balloon balRed = new Balloon("Red", 1);
		Balloon balBlue = new Balloon("Blue", 3);
		
		System.out.println("balRed length is: " + balRed.getLen());
		Balloon.incLength(balRed);
		System.out.println("balRed length is: " + balRed.getLen());
		
		Balloon tmp = balRed;
//		tmp.incLength(balRed);
		System.out.println("balRed length is: " + balRed.getLen());
		System.out.println("balRed length is: " + tmp.getLen());

		Balloon.swap(balRed, balBlue);
		System.out.println("balRed color is: " + balRed.getColor());
		System.out.println("balBlue color is: " + balBlue.getColor());		
		
		Balloon.alter(balRed);
		System.out.println("balRed length -" + balRed.getLen() + "- & color is -" + balRed.getColor() + "-");
		System.out.println("balRed p : " + balRed.p);
	

	}

}
