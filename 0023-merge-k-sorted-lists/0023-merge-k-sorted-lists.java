class Solution {
    public ListNode merge(ListNode h1, ListNode h2){
        ListNode d1 = new ListNode(-1);
        ListNode t1 = d1;
        ListNode i = h1;
        ListNode j = h2;
        while(i!=null && j!=null){
            if(i.val<j.val){
                t1.next = i;
                i = i.next;
            }else{
                t1.next = j;
                j = j.next;
            }
            t1 = t1.next;
        }
        if(i==null){
            t1.next = j;
        }else {
            t1.next = i;  
        }
        return d1.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ArrayList<ListNode> arr = new ArrayList<>();
        ArrayList<ListNode> arr1 = new ArrayList<>();
        for(ListNode n : lists) arr.add(n);
        while(arr.size()+arr1.size()>1){
            while(arr.size()>1){
                ListNode a = arr.get(arr.size()-1);
                arr.remove(arr.size()-1);
                ListNode b = arr.get(arr.size()-1);
                arr.remove(arr.size()-1);
                ListNode c = merge(a,b);
                arr1.add(c);
            }
            if (arr.size() == 1) {
                arr1.add(arr.get(0));
                arr.clear();
            }
            while(arr1.size()!=0){
                arr.add(arr1.remove(arr1.size() - 1));
            }
        }
        return arr.get(0);

    }
}