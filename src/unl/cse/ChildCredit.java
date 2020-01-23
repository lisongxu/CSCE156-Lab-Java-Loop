package unl.cse;

import java.util.ArrayList;
import java.util.List;

public class ChildCredit {

	public static void main(String args[]) {
		
		Child tom = new Child("Tommy", 14);
		Child dick = new Child("Richard", 12);
		Child harry = new Child("Harold", 21);
		
		//A list of children above:
		List<Child> kids = new ArrayList<>();
		kids.add(tom);
		kids.add(dick);
		kids.add(harry);

		//TODO: write a loop to iterate over the elements in the child array 
		//      and output a table as specified
		
	}
}
