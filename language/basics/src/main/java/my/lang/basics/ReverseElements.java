package my.lang.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Inspired from site: https://www.leveluplunch.com/java/tutorials/028-reverse-order-stream-elements-java8/
 */
public class ReverseElements {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("One", "Two", "Three", "Four");
		reverse_stream_print(names);
		
	}
	
	public static void  reverse_stream_print(List<String> elements) {

	    Stream.of(elements)
	            .collect(Collectors.toCollection(LinkedList::new))
	            .descendingIterator().forEachRemaining(System.out::println);
	}
	
	public void sorting_reverse(List<String> elements) {

	    Stream.of(elements)
	            .sorted(Collections.reverseOrder())
	            .forEach(System.out::println);

	}
	
	
	public void sorting_basic(List<String> elements){
		
		Collections.reverse(elements);
		elements.forEach(System.out::println);
	}
	
	public void sorting_veryBasic(List<String> elements){
		
		Object[] arrayElems = elements.toArray();
		
		for (int i=arrayElems.length-1; i>=0; i--){
			System.out.println(arrayElems[i]);
		}
	}
	
	

}