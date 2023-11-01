package Week9_Problems;

public class FindRepeatingElement {
	
	public static int firstRepeatElement(int[] Array, int b) {
		for (int i = 0; i < b; i++) {
			
			for (int x = i +1; x < b; x++) {
				
				if (Array[i] == Array[x]) {
					
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] Array = {5,3,3,9,};
		
		int length = Array.length;
		
		int index = firstRepeatElement(Array, length);
		
		if (index == -1) {
			System.out.println("There is no repeat element found.");
			
		} else {
			System.out.println("The first repeated element is: "+ Array[index]);
		}

	}

}
