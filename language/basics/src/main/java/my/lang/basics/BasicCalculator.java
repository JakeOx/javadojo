package my.lang.basics;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BasicCalculator {
	
	public static void main(String[] args) {

        BinaryOperator<Integer> getSum = (a,b)->{
            System.out.println("Adding "+a+" and "+b+" ...");
            Integer sum = a+b;
            System.out.println("Sum : "+sum);
            return sum;
        };

        Function<Integer,Integer> getSquare = a->{
            System.out.println("Squaring "+a+" ...");
            Integer square = a*a;
            System.out.println("Square : "+square);
            return square;
        };
        
        BiFunction<Integer,Integer,Integer> performCalculation = getSum.andThen(getSquare);

        //Alternatively
         BiFunction<Integer, Integer, Integer> andThen = getSum.andThen(getSquare);


        System.out.println("Final Result : "+ performCalculation.apply(2, 3));
    }
}
