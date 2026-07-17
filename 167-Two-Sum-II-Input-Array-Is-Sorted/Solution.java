class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length == 2){
            return new int[] {1, 2}; 
        }
        int l = 0, r = numbers.length - 1;
        int sum = numbers[l] + numbers[r];
        while(sum != target){
            if(sum < target){
                l++;
            }else{
                r--;
            }
            sum = numbers[l] + numbers[r];
        }
        return new int[] {l+1, r+1};
    }
}
