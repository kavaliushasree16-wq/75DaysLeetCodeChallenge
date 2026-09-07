class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
       
        
        for(int i=0;i<t.length();i++){
            need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
           
        }
        int formed=0;
        int required=need.size();
        int left=0;
        int windowLength=0;
        int minLength=Integer.MAX_VALUE;
        int start=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);

            if(need.containsKey(c)&&need.get(c).equals(window.get(c))){
                formed++;
            }
            while(formed==required){
                
              
                windowLength=right-left+1;
                if(windowLength<minLength){
                    minLength=windowLength;
                     start=left;
                }
                char leftChar=s.charAt(left);
                window.put(leftChar,window.get(leftChar)-1);
                 if (need.containsKey(leftChar) &&
                    window.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }

                left++;
               

               }
            

           
        }

        if(minLength==Integer.MAX_VALUE){
            return "";
        }

        return s.substring(start,start+minLength);
    }
}