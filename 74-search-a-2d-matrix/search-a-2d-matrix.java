class Solution {
    public boolean searchMatrix(int[][] a, int target) {

        for (int i = 0; i < a.length; i++) {       
            for (int j = 0; j < a[0].length; j++) { 


                
                if (a[i][j] == target)
                    return true;
            }
        }
        return false;
    }
}
