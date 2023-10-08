class LinearSearch{
    public static void main(String args[])
    {
        int nums[] = {4,5,8,11,19};
        int target = 11;
        int result = linearSearch(nums, target);

        if(result!=-1)
            System.out.println("Element found at Index: " + result);
        else
            System.out.println("Element not found");
    }

    public static int linearSearch(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target)
                return i;
        }        
        return -1;
    }
}