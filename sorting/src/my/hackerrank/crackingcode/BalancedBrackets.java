package my.hackerrank.crackingcode;


import java.util.Stack;

/*A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].
 * Given  strings of brackets, determine whether each sequence of brackets is balanced. 
 * If a string is balanced, print YES on a new line; otherwise, print NO on a new line.
 * 
 * 	
 */
public class BalancedBrackets {

  
    public static boolean isBalanced(String expr) {
    	
    	Stack<String> stack = new Stack<>();
    	
    	
    	//Read contents of stack
    	for (int i=0; i<expr.length(); i++){
    		
    		if ((expr.charAt(i) == '(') || (expr.charAt(i) == '{') || (expr.charAt(i) == '[')){
    			stack.push(Character.toString(expr.charAt(i)));    			
    		}
    		
    		if ((expr.charAt(i) == ')') || (expr.charAt(i) == '}') || (expr.charAt(i) == ']')){

    			//should never be empty for a balanced brackets case
    			if (stack.isEmpty()){
    				return false;
    			}
    			
    			String pop = stack.pop();
    			
    			if (getClosing(pop) != expr.charAt(i)){
    				return false;
    			}
    			
    		}
    	}
    	
    	//Check stack is empty of all open brackets
    	if (stack.size()==0){
    		return true;
    	}
    	
    	return false;
    }
    
  
    private static char  getClosing(String out) {
    	if (out.equals("("))
    		return ')';
    	
    	if (out.equals("["))
    		return ']';
    		
    	if (out.equals("{"))
    		return '}';
    	
    	return 'x';
	}
    

	public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        for (int a0 = 0; a0 < t; a0++) {
//            String expression = in.next();
//            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
//        }
        
        System.out.println( (isBalanced("[[()]{}]")) ? "YES" : "NO" );
		
    }

	
}
