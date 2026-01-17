class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < score.length ; i++){
            maxHeap.add(score[i]);
            map.put(score[i],i);
        }

        String ans[] = new String[score.length];
        int rank = 1;
        for(int i = 0; i < score.length; i++){
            int curr = maxHeap.poll();
            int ind = map.get(curr);
            if(rank == 1){
                ans[ind] = "Gold Medal";
            }
            else if(rank == 2){
                ans[ind] = "Silver Medal";
            }
            else if(rank == 3){
                ans[ind] = "Bronze Medal";
            }
            else{
                ans[ind] = rank + "";
            }
            rank++;
        }
        return ans;
    }
}