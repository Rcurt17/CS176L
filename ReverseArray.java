package Week9_Problems;

public class ReverseArray {
	

	public static void main(String[] args) {
		
		int[] rightArray = {1,2,3,4,5};
		
		System.out.println("Original Array: ");
		
		for (int i = 0; i < rightArray.length; i++) {
			System.out.println(rightArray[i]+ " ");
		}
		
		rArray(rightArray);
		
		System.out.println();
		System.out.println("Reversed Array: ");
		
		for (int i = 0; i < rightArray.length; i++) {
			System.out.println(rightArray[i]+ " ");
		}

	}
	
	
	public static void rArray(int[] Array) {
		int start = 0;
		int end = Array.length - 1;
		
		while(start < end) { 
			int temp = Array[start];
			
			Array[start] = Array[end];
			Array[end] = temp;
			
			start++;
			end--;
		}
	}

}
