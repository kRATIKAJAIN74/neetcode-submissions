class MinStack {
    class pair{
        int first;
        int second;
        pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    Stack<pair> s;

    public MinStack() {
         s = new Stack<>();
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            s.push(new pair(val,val));
        } else {
            int min = Math.min(val,s.peek().second);
            s.push(new pair(val,min));
        }
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek().first;
    }
    
    public int getMin() {
        return s.peek().second;
    }
}
