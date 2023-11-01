package Week9_Problems;

public class FindnonRepeatingElement {
	
	static int firstnonRepeatingInteger(int[] Array, int x) {
		int d;
		for (int i = 0; i < x; i++) { // check each element that exists
			for (d = 0; d < x; d++) {
				if (i != d && Array[i] == Array[d]) {
					break;
				}
			}
			if (d == x) {
				return Array[i];
			}
		}
		return -1;
	}
			
	

	public static void main(String[] args) {
		
		int Array[] = {1,2,3,1,3,};
		int x = Array.length;
		
		System.out.print("First non repeating integer is: ");
		
		System.out.print(firstnonRepeatingInteger(Array, x));

	}

}
