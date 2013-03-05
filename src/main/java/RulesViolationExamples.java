public class RulesViolationExamples {

	public void thereShouldNotBeTrailingSpaces() {
		new Long(5L);
	}

//	SUPPRESS CHECKSTYLE ParameterNumber
	public void methodShouldHaveLessThan7Parameters(int p1, int p2, int p3, int p4, int p5, int p6, int p7) {
	}

	private void shouldNotAllowLeadingSpaces() {
//		SUPPRESS CHECKSTYLE RegexpSinglelineJava
        new Integer(5);
	}
}
