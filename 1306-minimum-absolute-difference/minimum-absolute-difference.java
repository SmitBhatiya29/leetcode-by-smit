class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int min = arr[1] - arr[0];
        for(int i = 1; i < arr.length;i++){
            if(arr[i] - arr[i-1] < min){
                min = arr[i] - arr[i-1];
            }
        }
        for(int i = 1; i < arr.length;i++){
            if(arr[i] - arr[i-1] == min){
                List<Integer> a = new ArrayList<>();
                a.add(arr[i-1]);
                a.add(arr[i]);
                ans.add(a);
            }
        }
        return ans;

    }
}