import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> result = new ArrayList<>();
        
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // p aur first window ka count
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        // first window check
        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }

        // sliding window
        for (int i = p.length(); i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++; // new char add
            sCount[s.charAt(i - p.length()) - 'a']--; // old char remove

            if (Arrays.equals(pCount, sCount)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }
}
