class Solution {
    public int singleNumber(int[] num) {
       int result =0;
       for(int n:num){
       result ^=n;

    }
    return result;
}
}