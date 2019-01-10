package interfaceExample;

/*
 * 
 * */
interface I1{
	default void def() {};
	default void def1() {};
	default void sameName() {};
}

interface I2{
	default void sameName() {};
	void absMethod1();
}

abstract class ab1 implements I2
{
	abstract void absMethod2();
	abstract protected void absMethod3();
}

class child extends ab1
{
	@Override
	public void absMethod1() {
		// TODO Auto-generated method stub
	}

	@Override
	void absMethod2() {
		// TODO Auto-generated method stub
	}

	@Override
	protected void absMethod3() {
		// TODO Auto-generated method stub
		
	}
}



public class InterfaceExample implements I1, I2 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sameName() {
		// TODO Auto-generated method stub
//		I1.super.sameName();
//		I2.super.sameName();
	}

	@Override
	public void absMethod1() {
		// TODO Auto-generated method stub
		
	}

}
