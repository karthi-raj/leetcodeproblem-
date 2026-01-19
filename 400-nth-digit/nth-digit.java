class Solution {
    public int findNthDigit(int n) {
        long len = 1;        
        long count = 9;     
        long start = 1;      

        
        while (n > len * count) {
            n -= len * count;
            len++;
            count *= 10;
            start *= 10;
        }

       
        start += (n - 1) / len;

      
        String num = String.valueOf(start);
        return num.charAt((int)((n - 1) % len)) - '0';
    }
}
