package week1;
import java.util.Arrays;

public class MissingElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);

		// Sort the array
		int i;
		for(i=1;i<arr.length;i++) {
			if(i!=arr[i-1])
			{
				System.out.println("Missing element is "+i);
				break;
		}
	}

		System.out.println("iteration stopped: "+i);

	}
}
