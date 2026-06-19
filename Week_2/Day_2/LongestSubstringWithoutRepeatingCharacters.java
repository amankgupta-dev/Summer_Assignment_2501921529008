class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int[] index = new int[128];
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // agar character pehle aaya hai
            left = Math.max(left, index[ch]);

            // max length update
            maxLength = Math.max(maxLength, right - left + 1);

            // next position store karo
            index[ch] = right + 1;
        }

        return maxLength;
    }
}
