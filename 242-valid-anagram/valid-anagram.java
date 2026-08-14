class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] ans=new int[26];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char mh=t.charAt(i);
            ans[ch-'a']++;
            ans[mh-'a']--;
        }
        for(int val:ans){
            if(val !=0){
                return false;
            }
        }
        return true;
    }
}