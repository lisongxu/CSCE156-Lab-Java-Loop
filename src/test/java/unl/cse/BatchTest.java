package unl.cse;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class BatchTest {

	public static void main(String[] args) {
		
		String login = args.length > 1 ? args[0] : "nologin";
		JUnitCore jUnitCore = new JUnitCore();
		Result r = jUnitCore.run(NaturalTests.class, ChildCreditTests.class);

		System.out.printf("%s,%d,%d\n", 
				login,
				r.getFailureCount(),
				r.getRunCount());
	}

}
