class MyLinkedList {
    public class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        } 
    }
    public Node head;
    public int size;
    
    public MyLinkedList() {
        head = new Node(0);
        size = 0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size) return -1;
        Node temp = head.next;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {
        Node temp = new Node(val);
        Node iter = head;
        if(index>size) return;
        if(index<0) index = 0;
        size++;
        for(int i=0;i<index;i++) iter = iter.next;
        temp.next = iter.next;
        iter.next = temp;   
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0|| index >= size) return;
        size--;
        Node temp = head;
        for(int i=0;i<index;i++) temp = temp.next;
        temp.next = temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */