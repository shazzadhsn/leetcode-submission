public class majorityElement_Problem {
    public static int majorityElement(int[] nums) {
        int largeCount = 0, count = 0, majorElement = nums[0];

        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j >= 0; j--) {
                if(nums[j] == nums[i]) {
                    count++;
                }
            }
            if(count > largeCount) {
                majorElement = nums[i];
                largeCount = count;
                
            }
            count = 0;
        }

        return majorElement;
        
    }

    public static void main(String[] args) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        int majorElement = majorityElement(nums);

        System.out.println("Major element: " + majorElement);
    }
}
