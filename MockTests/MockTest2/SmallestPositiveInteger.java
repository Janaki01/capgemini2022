package MockTest2;
import java.util.*;


public class SmallestPositiveInteger {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		
		SmallestPositiveInteger r = new SmallestPositiveInteger();
		int result = r.solution(arr);
		System.out.println(result);
		
		s.close();
		
	}	
	public int solution(int[] arr) {
		int n = arr.length;
		HashSet<Integer> set = new HashSet<>();
		for(int a: arr) {
			set.add(a);
		}
		
		for(int i=1;i<=n+1;i++) {
			if(!set.contains(i)) {
				return i;
			}
		}
		return 0;
	}


}