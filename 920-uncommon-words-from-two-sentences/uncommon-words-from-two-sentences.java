class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map=new HashMap<>();
        String[] set1=s1.split(" ");
        String[] set2=s2.split(" ");
        for(String temp:set1){
            map.put(temp,map.get(temp)==null?1:map.get(temp)+1);
        }
        for(String temp:set2){
            map.put(temp,map.get(temp)==null?1:map.get(temp)+1);
        }
        ArrayList<String> out=new ArrayList<>();
        for(String key:map.keySet()){
            if(map.get(key)==1){
                out.add(key);
            }
        }
        String[] res=new String[out.size()];
        for(int i=0;i<out.size();i++){
            res[i]=out.get(i);
        }
        return res;
    }
}