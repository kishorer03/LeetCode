class MinStack {
    private int i;
    private int[] arr,min;
    public MinStack() {
        min=new int[30000];
        i=-1;
        arr=new int[30000];
    }
    
    public void push(int val) {
        if(i==arr.length-1) return;
        arr[++i]=val;
        if(i==0){
            min[i]=val;
            return;
        }
        min[i]=val<min[i-1]?val:min[i-1];
        
    }
    
    public void pop() {
        if(i==-1) return;
        i--;
    }
    
    public int top() {
        if(i==-1) return -1;
        return arr[i];
    }
    
    public int getMin() {
        return i==-1?i:min[i];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */