import java.util.*;

public class Contains_Duplicate {
    public static boolean containsDuplicate(int nums[]) {
        Arrays.sort(nums);
        int flag = nums[0];
        int count = 1;  
        int length = nums.length;
        for(int i = 0; i < length; i++) {
            if(flag != nums[i]) {
                count++;
                flag = nums[i];
            }
        }

        if(count != length) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = {1, 2, 3, 4};
        boolean result = containsDuplicate(nums);

        System.out.println(result);

        sc.close();
    }
}
