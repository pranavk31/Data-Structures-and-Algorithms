/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int peak = peakIndexInMountainArray(mountainArr);

        //we do binary search between start and peak index (ascending), s = 0, e = peak
        //then the same from peak to end index (descending), s = peak, end = last

        int asc = binarySearchAscending(mountainArr, target, 0, peak);
        if(asc == -1){
            int dsc = binarySearchDescending(mountainArr, target, peak, mountainArr.length() - 1);
            return dsc;
        }
        return asc;
    }

    public static int peakIndexInMountainArray(MountainArray mountainArr) {
        int s = 0, e = mountainArr.length() - 1;
        while(s < e){
            int mid = s + (e - s)/2;
            int midVal = mountainArr.get(mid);
            int nextVal = mountainArr.get(mid + 1);

            if(midVal < nextVal){
                s = mid + 1; 
            } else {
                e = mid;
            }
        }
        return s;
    }

    static int binarySearchAscending(MountainArray mountainArr, int target, int s, int e){
        while(s <= e){
            int mid = s + (e - s)/2;
            int midVal = mountainArr.get(mid);
            if(target == midVal){return mid;}
            else if(target < midVal){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearchDescending(MountainArray mountainArr, int target, int s, int e){
        while(s <= e){
            int mid = s + (e - s)/2;
            int midVal = mountainArr.get(mid);
            if(target == midVal){return mid;}
            else if(target < midVal){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return -1;
    }
}
