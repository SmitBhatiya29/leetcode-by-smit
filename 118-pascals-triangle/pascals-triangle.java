class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            result.add(new ArrayList<>());
        }
        result.get(0).add(1);
        if(numRows == 1){
           return result;
        }
        result.get(1).add(1);
        result.get(1).add(1);
        if(numRows == 2){
            return result;
        }

        for(int i = 3 ; i <= numRows; i++){
            result.get(i-1).add(1);
            int k = 1;

            for(int j = 2; j < i; j++){
                int val = result.get(i-2).get(k-1) + result.get(i-2).get(k);
                k++;
                result.get(i-1).add(val);
            }
            result.get(i-1).add(1);

        }

        return result;
    }
}