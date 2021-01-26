package algorithms.advancedProblems;
import java.util.*;
public class PartitionInArrayInTwoEqualSum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements you want in the array : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		boolean isPossible = sum % 2 == 0 && partition(a, sum/2, 0, ans);
		
		if(isPossible) {
			
			for(int e : ans) {
				System.out.print(e + " ");
			}
		}else System.out.println("Not Possible");
		
		sc.close();
	}
	
	static boolean partition(int a[], int sum, int i, ArrayList<Integer> ans) {
		
		if(i >= a.length || sum < 0) return false;
		
		if(sum == 0) return true;
		
		ans.add(a[i]);
		
		boolean leftPossible = partition(a, sum - a[i], i + 1, ans);
		
		if(leftPossible) return true;
		
		ans.remove(ans.size()-1);
		
		return partition(a, sum, i + 1, ans);
	}

}
