package my.nested;

public class Problem {
	static String s;
	
    static class Inner {
		void testMethod() {
			Problem.s= "set from Inner";
		}
	}

}
