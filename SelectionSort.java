public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = {6,5,2,8,9,4};
        int len = nums.length;
        int temp = 0;
        int minIndex = -1;

        System.out.println("before sorting . . .");
        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println("\n");

        for(int i=0; i<len-1;i++){
            minIndex = i;
            for(int j = i+1; j<len; j++)
                if(nums[minIndex] > nums[j])
                    minIndex = j;
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            for(int num : nums){
                System.out.print(num + " ");
            System.out.println();
        }
        }      

        System.out.println();
        System.out.println("after sorting . . .");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
