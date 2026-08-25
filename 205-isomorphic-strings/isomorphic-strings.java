class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character,Character> mapst=new HashMap<>();
        HashMap<Character,Character> mapts=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char chs=s.charAt(i);
            char cht=t.charAt(i);

            //check s->t mapping
            if(mapst.containsKey(chs)){
                if(mapst.get(chs) != cht){
                    return false;
                }
            }
            else{
                mapst.put(chs,cht);
            }
            //check t->s mapping
            if (mapts.containsKey(cht)) {
                if (mapts.get(cht) != chs) {
                    return false;
                }
            } else {
                mapts.put(cht, chs);
            } 
       
        }
        return true;
    }
}