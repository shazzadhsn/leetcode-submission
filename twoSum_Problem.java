public class twoSum_Problem {
    public int[] twoSum(int[] nums, int target) {
        int indeces[] = new int[2];
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if((nums[i] + nums[j]) == target) {
                    indeces[0] = i;
                    indeces[1] = j;
                    return indeces;
                }
            }
        }
        return indeces;
    }

    public static void main(String[] args) {    
        twoSum_Problem obj = new twoSum_Problem();
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int result[] = obj.twoSum(nums, target);
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
