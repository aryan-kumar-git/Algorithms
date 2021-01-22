package algorithms.advancedProblems;

import java.util.*;

public class StringPermutationProblem {
	
	static int n;
	
	static Set<String> hs = new HashSet<>();
	
	public static void main(String[] args) {
		
		Permutations("abcc", 0, 3);
		System.out.println("Number of Permutations :  " + n);
	}
	
	static void Permutations(String s,int l, int r) {
		
		if(l == r) {
			if(hs.contains(s)) return;
			hs.add(s);
			System.out.println(s);
			n++;
			return;
		}
		
		for(int i = l; i <= r; i++) {
			
			s = InterChangeCharacter(s, l, i);
			Permutations(s, l+1, r);
			s = InterChangeCharacter(s, l, i);
		}
	}
	
	static String InterChangeCharacter(String s, int a, int b) {
		
		char arr[] = s.toCharArray();
		char temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
		return String.valueOf(arr);
 	}
	
}


