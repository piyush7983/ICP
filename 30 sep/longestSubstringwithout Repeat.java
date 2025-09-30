class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st=0;
        int e=0;
        int max = 0;
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            
            while(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(st));
                st++;
            }
            hs.add(s.charAt(i));
            e++;
            max = Math.max(max,e-st);
        }
        return max;

    }
}
