class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0, end = 0;
        for(int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]); //max element 
            end = end + nums[i]; //array sum
        }

        //binary search 
        while(start<end){
            int mid = start + (end - start)/2;

            //calculate number of pieces to divide array into with this MaxSum(mid)
            int sum = 0;
            int pieces = 1; //min k = 1 i.e whole array 
            for(int num: nums){
                if(sum + num > mid){
                    //create new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else{
                    sum = sum + num;
                }
            }

            if(pieces > k){
                //more pieces i.e less maxSum
                //so we need to decrease pieces or increase maxsum
                start = mid + 1;
            } else{
                end = mid;
            }
        }

        return end; //here start == end
    }
}
