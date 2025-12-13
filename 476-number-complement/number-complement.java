class Solution {
    public int findComplement(int num) {
        int mask = 1;
        int n = num;
        
       
        while (n > 0) {
            mask = mask << 1;
            n = n >> 1;
        }
        
        
        mask = mask - 1;
        
       
        return num ^ mask;
    }
}
