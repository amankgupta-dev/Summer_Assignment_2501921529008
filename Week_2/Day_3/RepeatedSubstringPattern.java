class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        String doubled = s + s;

        // first aur last character hata ke check karte hain
        String newString = doubled.substring(1, doubled.length() - 1);

        return newString.contains(s);
    }
}
