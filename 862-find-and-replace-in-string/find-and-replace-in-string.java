class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int n = s.length();
        int[] match = new int[n];
        
       
        for (int i = 0; i < n; i++) {
            match[i] = -1;
        }

    
        for (int i = 0; i < indices.length; i++) {
            int idx = indices[i];
            String src = sources[i];

           
            if (s.startsWith(src, idx)) {
                match[idx] = i;
            }
        }

     
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < n) {
            if (match[i] != -1) {
                
                result.append(targets[match[i]]);
                i += sources[match[i]].length();
            } else {
               
                result.append(s.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}
