package algorithms.advancedProblems;
import java.util.*;
public class MinXORValue {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> q = new ArrayList<>();
		
		q.add(15);
		q.add(14);
		q.add(13);
		q.add(12);
		q.add(11);
		q.add(10);
		
		System.out.println(minxorvalue(q));
		
	}
	
	static int minxorvalue(ArrayList<Integer> q) {
		
		Collections.sort(q);
		
		int minxor = Integer.MAX_VALUE;
		
		for(int i =0; i < q.size()-1; i++) {
			
			minxor = Math.min(minxor, q.get(i) ^ q.get(i+1));
			
		}
		
		return minxor;
		
	}

}
