class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        StringBuilder sb = new StringBuilder(ans);
        int i = 0, j = 0;
        //common part
        while(i < word1.length() && j < word2.length()){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }
        //if word1.length() > word2.length()
        while(i < word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }
        //if word2.length() > word1.length()
        while(j < word2.length()){
            sb.append(word2.charAt(j));
            j++;
        }
        ans = sb.toString();
        return ans;
        
    }
}
