class Solution {
    public void setZeroes(int[][] a) {
        int m = a.length, n = a[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

      
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (a[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }

       
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (row[i] || col[j])
                    a[i][j] = 0;
    }
}

