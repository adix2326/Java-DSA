public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {6,5,2,8,9,4};

        System.out.println("before sorting . . .");
        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println("\n");

        for(int i=0; i<nums.length-1;i++){
            for(int j = i+1; j<nums.length; j++)
                if(nums[i] > nums[j]){
                    nums[i] ^= nums[j];
                    nums[j] ^= nums[i];
                    nums[i] ^= nums[j];
                }
            for(int num : nums)
                System.out.print(num + " ");
            System.out.println();
        }

        System.out.println();
        System.out.println("after sorting . . .");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
