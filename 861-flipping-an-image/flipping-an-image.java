class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i = 0; i < n; i++)
        {
                int low = 0;
                int high = n-1;
                while(low <= high)
                {
                    int temp1 = image[i][low];
                    int temp2 = image[i][high];

                    if(image[i][low] == 0){
                        image[i][high] = 1;
                    }else{
                        image[i][high] = 0;
                    }

                    if(temp2 == 0){
                        image[i][low] = 1;
                    }else{
                        image[i][low] = 0;
                    }
                    low++;
                    high--;
                }
            
        }
        return image;
    }
}