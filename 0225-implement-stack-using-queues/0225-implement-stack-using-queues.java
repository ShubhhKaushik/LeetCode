class MyStack {
    Queue<Integer> ans;
    public MyStack() {
        ans = new LinkedList();
    }
    
    public void push(int x) {
        int n = ans.size();
        ans.add(x);
        while(n>0){
            ans.add(ans.poll());
            n--;
        }
    }
    
    public int pop() {
       return ans.poll();
    }
    
    public int top() {
      return ans.peek();
    }
    
    public boolean empty() {
       return ans.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */