import java.util.Scanner;
public class Main {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            int temp = target - nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (temp == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.printf("n= :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.printf("input array :");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.printf("single number :");
        System.out.println(singleNumber(nums));
        //test for two Sum problem
        System.out.printf("target :");
        int target = scanner.nextInt();
        System.out.printf("n= :");
        int n2=scanner.nextInt();
        int nums2[] = new int[n2];
        System.out.printf("input array :");
        for (int i = 0; i < n2; i++) {
            nums2[i] = scanner.nextInt();
        }
        int [] result = new int[2];
         result = twoSum(nums2, target);
        System.out.printf("result :");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d ", result[i]);
        }

    }

}