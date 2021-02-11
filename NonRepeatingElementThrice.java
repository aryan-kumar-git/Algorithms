package algorithms.advancedProblems;

public class NonRepeatingElementThrice {
	
	public static void main(String[] args) {
		
		int arr[] = {1,1,1,2,2,2,3,4,4,4,5,5,5};
		
		int n = 32;
		
		int count[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < arr.length; j++) {
				
				if((arr[j] & 1 << i) != 0) count[i]++;	
			}	
		}
		
		int result = 0;
		for(int i = 0; i < n; i++) {
			result += (count[i] % 3) * (1 << i);
		}
		
		System.out.println(result);
	}
	
	
}
