/**
 * Do not know why this comment do not raise author format violation
 * @author T443dwepdok
 */
public class Rules {

	public void thereShouldNotBeTrailingSpaces() {
		new Integer(5);
	}

	//SUPPRESS CHECKSTYLE ParameterNumber
	public void methodShouldHaveLessThan5Parameters(int p1, int p2, int p3, int p4, int p5) {
	}

	private void shouldNotAllowLeadingSpaces() {
		//SUPPRESS CHECKSTYLE RegexpSinglelineJava
        new Integer(5);
	}
}
