class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] solution;
        for (int i = 0; i<n; i++) {
            for(int j=i+1; j<n; j++) {

                if (nums[i] + nums[j] == target)
                return new int[]{i,j};
                 
            }
        }

        return new int[]{};

    }

    public void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        twoSum(nums,target);
    }
}
