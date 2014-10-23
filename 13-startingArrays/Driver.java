public class Driver {
    public static void main(String args[]) {

	//frontPiece ---> 5 minutes
	public int[] frontPiece(int[] nums) {
	    int[] intArray = new int[2];
	    if (nums.length > 1) {
  
		intArray[0] = nums[0];
		intArray[1] = nums[1];
		return intArray;
	    }
	    return nums;
	}

	//sum13 --> 5 minutes
	public int sum13(int[] nums) {
	    int i;
	    int z = 0;
	    for(i=0;i<nums.length;i++){
		if (nums[i] == 13) {
		    i++; 
		}
		else {
		    z += nums[i];
		}
	    }
	    return z;
	}
    }
}
