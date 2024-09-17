class Solution {
    public int findMinDifference(List<String> timePoints) {
        int time1=0,time2=0,temp=0,min=Integer.MAX_VALUE;
        int[] temp_arr=new int[timePoints.size()];
        for(int i=0;i<temp_arr.length;i++){
            temp_arr[i]=Integer.valueOf(timePoints.get(i).substring(0,2))*60+Integer.valueOf(timePoints.get(i).substring(3));
        }
        Arrays.sort(temp_arr);
        for(int i=0;i<=temp_arr.length-1;i++){
                temp=Math.abs(temp_arr[i]-temp_arr[i+1==timePoints.size()?0:i+1]);
                temp=temp>720?1440-temp:temp;
                min=temp<min?temp:min;
        }
        return min;
    }
}