class Solution {
    public String minWindow(String s, String t) {
        int m=s.length();
        if(m<t.length()) return "";
        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch : t.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        int count = t.length(); 
        int minlen = Integer.MAX_VALUE;
        int startidx = 0; 

        int i = 0;
        for(int j=0;j<m;j++){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                if(map.get(ch) >0){
                    count--;
                }
                map.put(ch,map.get(ch)-1);

            }
            while(count==0){
                if(j-i+1 < minlen){
                    minlen=j-i+1;
                    startidx=i;
                }
            
                char leftchar=s.charAt(i);

                if(map.containsKey(leftchar)){
                    map.put(leftchar, map.get(leftchar) + 1);
                    if (map.get(leftchar) > 0) {
                        count++;
                    }
                }
                i++;
            }
        }
        if(minlen==Integer.MAX_VALUE){
            return "";
        }else{
            return s.substring(startidx,startidx + minlen);
        }
        
    }
}