package abstractExample;

abstract class ab1 {
	public abstract void msg();
	public abstract void abEx1();
	
	public void abEx2() {
		/* This method shows that that empty concrete methods can be used to include new methods
		 * without breaking code   
		 * */  
	}
	
}

abstract class ab2 {
	public abstract void msg();
	public abstract void abEx2();
} 

// Below line will result in error as extends allowed only with one abstract class
//public class AbstractExample extends ab1, ab2
public class AbstractExample extends ab1
{

	@Override
	public void msg() {
		// TODO Auto-generated method stub
	}
	@Override
	public void abEx1() {
		// TODO Auto-generated method stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
