package algorithms.advancedProblems;

public class NonRepeatingElementTwice {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,4,3,2,1};
		
		int result = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			result = result ^ a[i];
		}
		
		System.out.println(result);
	}

}
