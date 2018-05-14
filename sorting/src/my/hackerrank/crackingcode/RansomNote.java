package my.hackerrank.crackingcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNote {

    Map<String, Integer> magiMap = new HashMap<>();
    Map<String, Integer> noteMap = new HashMap<>();
    static int m=0;
    static int n=0;
    String[] noteSplits;
    
    public RansomNote(String magazine, String note) {
    	
    	//read the magazine words into a map
    	String[] magSplits = magazine.split(" ");
    	
    	for (int i=0; i<magSplits.length; i++){
    		if (magiMap.get(magSplits[i]) == null){
    			magiMap.put(magSplits[i].toLowerCase(), 1);
    		}else{
    			magiMap.put(magSplits[i].toLowerCase(), magiMap.get(magSplits[i].toLowerCase()) + 1);
    		}
    	}
        
    	//Read the note words into a map
    	noteSplits = note.split(" ");
    	for (int i=0; i<noteSplits.length; i++){
       		if (noteMap.get(noteSplits[i].toLowerCase()) == null){
       			noteMap.put(noteSplits[i].toLowerCase(), 1);
       		}else{
       			noteMap.put(noteSplits[i].toLowerCase(), noteMap.get(noteSplits[i].toLowerCase())+1);
       		}
    	}    	
    }
    
    public boolean solve() {
        for (int i=0; i<noteSplits.length; i++){
        	int magCount = ( magiMap.get(noteSplits[i].toLowerCase()) == null ? 0: magiMap.get(noteSplits[i].toLowerCase()));
        	int count = magCount - noteMap.get(noteSplits[i].toLowerCase());
        	if (count<0) 
        	 return false; 
        }
        return true;
    }
    

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        m = scanner.nextInt();
//        n = scanner.nextInt();
//        
//        
//        // Eat whitespace to beginning of next line
//        scanner.nextLine();
//        
//        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
//        scanner.close();
    	
    	RansomNote s = new RansomNote("two times three is not four", "two times two is four");
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
	
}
