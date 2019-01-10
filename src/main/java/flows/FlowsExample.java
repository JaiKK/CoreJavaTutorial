package flows;

public class FlowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// switch case
		callSwitch();
		// if else
//		callIfElse();
		// break
		// continue
		// return (only for functions)
		
	}
	
	public static void callIfElse() {
		
		int i = 1;
		
		if (i == 1) {
			System.out.println("Condition is true");
		} else {
			System.out.println("Condition is false");
		}
	}
	
	
	public static void callSwitch() {
		char c = 'c';
		
		switch(c) {
		case 'a': 
			System.out.println("Char is a");
			break;
		case 'b':
			System.out.println("Char is b");
			break;
		case 'c':
			System.out.println("Char is c");
		default:
			System.out.println("This is default");
		}
	}

}
