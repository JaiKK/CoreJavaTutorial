package loops;

import java.util.ArrayList;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * for loop
		 * while
		 * do while
		 * for-in
		 * for-each (with lambda and functional reference )
		 */
		
		int i = 0;
		
		// for loop
		/*
		for (i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		*/
		
		
		
		// while loop
		/*
		i = 0;
		while(i <= 10)
		{
			System.out.println(i);
			i++;
		}
		*/
		
		
		
		// do-while loop
		/*
		i = 0;
		do {
			System.out.println(i);
			i++;
		} while(i <= 10);
		*/


		
		// for-in loop
		/*
		char[] letters = {'a','b','c'};

		for(char letter: letters) {
			System.out.println(letter);
		}
		*/
		
		
		
		// for-each loop
		ArrayList<String> names = new ArrayList<String>();
		names.add("one");
		names.add("two");
		names.add("three");
		names.add("four");
		names.add("five");

		// for-each using lambda
		names.forEach( n -> System.out.println("using lambda: " + n) );
		
		// for-each using function reference (this is only for functions with single arguments signature )
		// one way
		names.stream().forEach( System.out::println );
		// another way
		names.forEach( System.out::println );

	}

}
