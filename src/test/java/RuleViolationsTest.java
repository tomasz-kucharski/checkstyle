/**
 * You can play with this class disabling supressions by removing comments started with SUPRESS
 */
public class RuleViolationsTest {

	public void thereShouldNotBeTrailingSpaces() {
		//SUPPRESS CHECKSTYLE EmptyStatement
		;
	}

	//SUPPRESS CHECKSTYLE ParameterNumber
	public void methodShouldHaveLessThan7Parameters(int p1, int p2, int p3, int p4, int p5, int p6, int p7) {
	}

	private void shouldNotAllowLeadingSpaces() {
		//SUPPRESS CHECKSTYLE RegexpSinglelineJava
        new Integer(5);
	}
}
