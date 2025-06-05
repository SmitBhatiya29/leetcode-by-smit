class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int l = nums1.length;
        int m = nums2.length;
        for(int i = 0; i < l;i++){
            set.add(nums1[i]);
        }
        for(int i = 0; i < m;i++){
            if(set.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        int ans[] = new int[set2.size()];
        int i = 0;
        for(int val : set2){
            ans[i] = val;
            i++;
        }

    return ans; 
    }
}