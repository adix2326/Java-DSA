

//Time Complexity of Binary Search : O(log n)




public class BinarySearch {

    static int steps1=0;

    public static void main(String[] args) {
        int nums[] = {2,6,8,9,12,45,67,90,123,456,999};
        int target = 999;

        int result = binarySearchUsingLoop(nums, target);
        int result1 = binarySearchUsingRecursion(nums, target, 0, nums.length-1);

        if(result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
            
        if(result1 != -1)
            System.out.println("(Using Recursion)Element found at index: " + result1);
        else
            System.out.println("Element not found");
    }

    public static int binarySearchUsingLoop(int[] nums, int target){
        int steps = 0;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            steps++;
            int mid = (left + right) / 2;

            if(nums[mid] == target){
                System.out.println("Steps taken by binary: " + steps);
                return mid;
            }
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        System.out.println("Steps taken by binary: " + steps);
        return -1;
    }
    
    public static int binarySearchUsingRecursion(int[] nums, int target, int left, int right){
        
        if(left <= right){
            steps1++;
            int mid = (left + right) / 2;

            if(nums[mid] == target){
                System.out.println("(recursion)Steps taken by binary: " + steps1);
                return mid;
            }
            else if(nums[mid] < target)
                return binarySearchUsingRecursion(nums, target, mid+1, right);
            else
                return binarySearchUsingRecursion(nums, target, left, mid-1);
        }
        System.out.println("(recursion)Steps taken by binary: " + steps1);
        return -1;
    }
}
