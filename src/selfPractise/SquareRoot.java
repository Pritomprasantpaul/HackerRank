package selfPractise;

public class SquareRoot {

	 public static void main(String[] args) {
		
		int num = 1024;
		int low = 1;
		int high = num/2 + 1;
		int mid = (low+high)/2;
		
		for(int i=0; i<high; i++) {
			int ans = mid * mid;
			if(ans == num) {
				System.out.println(mid);
				System.out.println(i);
				break;
			}
			else if(ans > num) {
				high = mid;
				mid = high/2 + 1;
			}
			else if (ans < num) {
				low = mid;
				mid = (low+high)/2;
			}	
		}
	}
}
