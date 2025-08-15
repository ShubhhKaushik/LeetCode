class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int i = 1;
        int j = 0;

        while (ans.size() < k) {
            if (j < n && arr[j] == i) {
                j++;
            } else {
                ans.add(i);
            }
            i++;
        }
        return ans.get(k - 1);
    }
}
