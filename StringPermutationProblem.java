package algorithms.advancedProblems;
import java.util.*;
public class StringPermutationProblem {
	
	static Set<String> set = new HashSet<>();
	static int n;
	
	public static void main(String[] args) {
		
		Permutations("ABCA", 0, 3);
		System.out.println("Number of Permutations : " + n);
	}
	
	static void Permutations(String s, int l, int r) {
		
		if(l == r) {
			if(set.contains(s)) return;
			set.add(s);
			System.out.println(s);
			n++;
			return;
		}
		
		for(int i = l; i <= r; i++) {
			
			s = InterChangeChar(s, l, i);
			Permutations(s, l+1, r);
			s = InterChangeChar(s, l, i);
		}
	}
	
	static String InterChangeChar(String s, int a, int b) {
		
		char arr[] = s.toCharArray();
		 char temp = arr[a];
		 arr[a] = arr[b];
		 arr[b] = temp;
		 
		 return String.valueOf(arr);
	}
	
}


