class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int start = 0, end = clean.length() - 1;
        while(start < end){
            if(clean.charAt(start) == clean.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
