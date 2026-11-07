class Solution {
    static int findPivot(int[] nums){

        int n = nums.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        if(nums[s] < nums[e])
            return -1;

        while(e>=s){

            int mid = s + (e-s)/2;

            if(nums[mid] <= nums[n-1]) 
                //move to left
                e = mid - 1;
        
            else {
                //store potentiol answer
                ans = mid;

                //move to right
                s = mid + 1;
            }
            
           

        }
         return ans;
    }


    static int binarySearch(int[] nums, int s, int e, int target){
        int n = nums.length;

        while(e>=s) {
            int mid = s + (e-s)/2;

            if(nums[mid] == target){
                return mid;
            }

            //move to right if nums[mid] < target 
            else if(nums[mid] < target){
                s = mid + 1;
            }
            //move to left if nums[mid] > target 
            else{
                e = mid - 1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivot = findPivot(nums);

        //if pivot is -1,the array rotation is not effective, search whole array 
        if(pivot == -1) {
            return binarySearch(nums, 0, n-1, target);
        }

        else {
            
            int s1 = 0;
            int e1 = pivot;
            //if target is in left part
            if(target >= nums[s1] && target <= nums[e1]){
                int ans = binarySearch(nums, s1, e1, target);
                return ans;
            }

            int s2 = pivot + 1;
            int e2 = n - 1;
            // if target is in right part
            if(target >= nums[s2] && target <= nums[e2]){
                int ans = binarySearch(nums, s2, e2, target);
                return ans;
            }
        }
        return -1;
    }
}
