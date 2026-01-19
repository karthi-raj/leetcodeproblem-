import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]", " ");

        String[] words = paragraph.split("\\s+");

        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();

        String ans = "";
        int max = 0;

        for (String w : words) {
            if (w.isEmpty() || ban.contains(w)) continue;

            int count = map.getOrDefault(w, 0) + 1;
            map.put(w, count);

            if (count > max) {
                max = count;
                ans = w;
            }
        }
        return ans;
    }
}
