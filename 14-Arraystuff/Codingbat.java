public class Codingbat {
    public int sum67(int[] nums) {
	int count = 0;
  
	for(int i=0;i<nums.length;i++){
	    if (nums[i] == 6) {
		while (nums[i] != 7) {
		    i++;
		}
		if (nums[i] == 7) {
		    i++;
		}
      
	    } 
	    if (i < nums.length){ 
		count += nums[i];
	    }
	}
	return count;
    }

    public boolean more14(int[] nums) {
	int countFour = 0;
	int countOne = 0;
  
	for(int i = 0;i<nums.length;i++){
	    if (nums[i] == 1) {
		countOne++;
	    }
	}
   
	for (int z = 0;z<nums.length;z++){
	    if (nums[z] == 4) {
		countFour++;
	    }
	}
   
	return (countOne > countFour);
    }

   public  
}
