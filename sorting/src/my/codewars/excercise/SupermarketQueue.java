package my.codewars.excercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SupermarketQueue {
	
	
	public static void main(String[] args){
	
		//int[] customers = {5,3,4};
		int[] customers = {2,3,10};
		
		System.out.println(solveSuperMarketQueue(customers , 2));
	}

	public static int solveSuperMarketQueue(int[] customers, int n) {
		Map<Integer, Integer> tellerMap = new HashMap<>();

		for (int t = 1; t <= n; t++) {
			tellerMap.put(t, 0);
		}

		for (int j = 0; j <customers.length; j++) {
			Entry<Integer, Integer> tellerEntry = getNextLeastTeller(tellerMap);
			tellerMap.put(tellerEntry.getKey(), tellerEntry.getValue() + customers[j]);
		}
		return getTellerWithMaxTime(tellerMap);
	}

	private static int getTellerWithMaxTime(Map<Integer, Integer> tellerMap) {
		Entry<Integer, Integer> max = null;
		for (Entry<Integer, Integer> entry : tellerMap.entrySet()) {
			if (max == null || max.getValue() < entry.getValue()) {
				max = entry;
			}
		}
		return max.getValue();
	}

	private static Entry<Integer, Integer> getNextLeastTeller(Map<Integer, Integer> tellerMap) {
		Entry<Integer, Integer> min = null;
		for (Entry<Integer, Integer> entry : tellerMap.entrySet()) {
			if (min == null || min.getValue() > entry.getValue()) {
				min = entry;
			}
		}
		return min;
	}
}
