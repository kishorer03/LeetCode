class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> mp1=new HashMap<>();
        Map<Character,Character> mp2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch1=mp1.getOrDefault(s.charAt(i),'Q');
            if(ch1=='Q'){
                mp1.put(s.charAt(i),t.charAt(i));
            }else{
                if(ch1!=t.charAt(i)){
                    return false;
                }
            }
            char ch2=mp2.getOrDefault(t.charAt(i),'Q');
            if(ch2=='Q'){
                mp2.put(t.charAt(i),s.charAt(i));
            }else{
               if(ch2!=s.charAt(i)){
                    return false;
                }
            }
            
        }

        return true;
    }
}