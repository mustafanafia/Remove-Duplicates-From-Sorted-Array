import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1,1,2};

        System.out.print(removeDuplicates(arr));

    }


    public static int removeDuplicates(int[] nums) {



        int i = 1;

        for(int curr=1; curr<nums.length; curr++){
            if (nums[curr] != nums[curr - 1]) {
                nums[i] = nums[curr];
                i++;
            }
        }
        return i;
    }



}