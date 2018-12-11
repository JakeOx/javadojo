package my.nested;

import java.util.function.DoubleBinaryOperator;


/*
 * We do not need to implment the DoubleBinaryOperator here and can have our own method 
 * say apply() which calls 'applyAsDouble()'
 * however implementing it give hint and maybe considtered as
 * a better coding practice that we are using the DoubleBinaryOperator
 * interface for the implementation of functional method 'applyAsDouble()'
 */
public enum Operation  implements DoubleBinaryOperator{
	
	PLUS ( "+", (x,y) -> x+y),
	MINUS ("-", (x,y) -> x-y );
	
	private final String symbol;
	private final DoubleBinaryOperator op; 
	
	Operation(String symbol, DoubleBinaryOperator op){
		this.symbol = symbol;
		this.op = op;
	}
	
	@Override
	public double applyAsDouble(double x, double y){
		return op.applyAsDouble(x, y);
	}
	

	
	public static void main(String[] args) {
		 
	    double x = 2.0;
	    double y = 3.0;
	    
	    System.out.println("Output for Add 6+ 4 = "+  Operation.PLUS.applyAsDouble(4, 6));
	    
	 
	    for (Operation op : Operation.values()) {
	      System.out.print(x + " ");
	      System.out.print(op.toString() + " ");
	      System.out.print(y + " = ");
	      System.out.println(op.applyAsDouble(x, y));
	      
	 
	    }
	  }

}


