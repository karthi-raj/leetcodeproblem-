class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = false;
        boolean heavy = false;

     
        if (length >= 10000 || width >= 10000 || height >= 10000) {
            bulky = true;
        }

        long volume = (long) length * width * height;
        if (volume >= 1_000_000_000L) {
            bulky = true;
        }

        
        if (mass >= 100) {
            heavy = true;
        }

      
        if (bulky && heavy) return "Both";
        if (bulky) return "Bulky";
        if (heavy) return "Heavy";
        return "Neither";
    }
}
