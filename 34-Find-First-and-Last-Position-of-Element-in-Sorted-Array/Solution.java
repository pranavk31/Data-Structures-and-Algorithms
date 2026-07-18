class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fi = first(nums, target);
        int li = last(nums, target);
        return new int[]{fi,li};
    }
    
    static int first(int[] arr, int x){
        int s = 0, e = arr.length - 1;
        int fi = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            
            if(x == arr[mid]){
                fi = mid;
                e = mid - 1;
            }

            else if(x < arr[mid]){
                e = mid - 1;
            } 

            else
                s = mid + 1;
        }
        return fi;
    }

    static int last(int[] arr, int x){
        int s = 0, e = arr.length - 1;
        int li = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            
            if(x == arr[mid]){
                li = mid;
                s = mid + 1;
            }

            else if(x < arr[mid]){
                e = mid - 1;
            }

            else
                s = mid + 1;
        }
        return li;
    }
}
