class MinStack {
    int min;
    LinkedList<Integer> q;
    public MinStack() {
        min = Integer.MAX_VALUE;
        q = new LinkedList<>();
    }
    
    public void push(int val) {
        if(val <= min){
            q.push(min);
            min = val;
        }
        q.push(val);
    }
    
    public void pop() {
        if(q.pop() == min){
            min = q.pop();
        }
    }
    
    public int top() {
        return q.getFirst();
    }
    
    public int getMin() {
        return min;
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