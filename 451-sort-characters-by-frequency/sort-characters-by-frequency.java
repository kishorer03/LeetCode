class Pair{
    char value;
    int count;
    Pair(char value,int count){
        this.value=value;
        this.count=count;
    }
}
class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>((a,b)->b.count-a.count);
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        Set<Character> set=mp.keySet();
        for(Character ch:set){
            pq.add(new Pair(ch,mp.get(ch)));
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<set.size();i++){
            Pair pair=pq.poll();
            sb.append(String.valueOf(pair.value).repeat(pair.count));
        }
        return sb.toString();
    }
}