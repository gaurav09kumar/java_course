class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i = 0 ; i<nums.length ; i++){
            int j = i+1;
            while(j<nums.length){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
                j++;
            }
        }
        return arr;
    }
}