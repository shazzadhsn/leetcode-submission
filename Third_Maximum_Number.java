import java.util.*;
public class Third_Maximum_Number {
    public static int thirdMaxNumber(int nums[]) {
        // sorting array
        Arrays.sort(nums);
        int length = nums.length;
        int flag = nums[length - 1];
        int count = 1;

        for(int i = nums.length-1; i >= 0; i--) {
            if(nums[i] != flag) {
                count++;
                flag = nums[i];
            }
            if(count == 3) {
                return flag;
            }
        }
        return nums[length - 1];
    }
    public static void main(String[] args) {
        int nums[] = {2, 2, 3, 1};
        int result = thirdMaxNumber(nums);

        System.out.println(result);
    }
}
