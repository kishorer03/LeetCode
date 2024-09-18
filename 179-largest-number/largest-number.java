class Solution {
    public String largestNumber(int[] nums) {
        String[] str_arr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str_arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(str_arr,(a,b)->(b+a).compareTo(a+b));
        StringBuilder out=new StringBuilder();
        if(str_arr[0].equals("0")){
            return "0";
        }
        for(String str:str_arr){
            out.append(str);
        }
        System.out.println(out);
        return out.toString();
    }
}