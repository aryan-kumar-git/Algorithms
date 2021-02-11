package algorithms.advancedProblems;

public class TwoNonRepeatingElementsTwice {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,6,14,4,3,2,1};
		
		int result = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			result = result ^ arr[i];
		}
		
		result = (result)&(-result);
		
		int a = 0, b = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if((arr[i] & result) > 0) a = a ^ arr[i];
			else b = b ^ arr[i];
			
		}
		
		System.out.println(a + " " + b);
		
		
	}
	
}
