class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        if(people.length == 1){
            return 1;
        }

        Arrays.sort(people);
        int l = 0, r = people.length - 1;
        while(l < r){
            if((people[l] + people[r]) <= limit){
                boats++;
                l++;
                r--;
            }else{
                boats++;
                r--;
            }
        }

        if(l == r){
            boats++;
        }
        
        return boats;
    }
}
