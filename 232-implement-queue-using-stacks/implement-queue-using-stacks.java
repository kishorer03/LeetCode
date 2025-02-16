class MyQueue {
    Stack<Integer> s1,s2;
    public MyQueue() {
        s1=new Stack<Integer>();
        s2=new Stack<Integer>();
    }
    
    public void push(int x) {
        s1.push(x);
        // System.out.println(s1);
    }
    
    public int pop() {
        if(s2.size()==0){
            while(s1.size()!=0){
                s2.push(s1.pop());
            }
        }
        int ret=s2.peek();
        s2.pop();
        return ret;
    }
    
    public int peek() {
        if(s2.size()==0){
            System.out.println(s1.size());
            while(s1.size()!=0){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    
    public boolean empty() {
        if(s1.size()!=0 || s2.size()!=0) return false;
        return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */