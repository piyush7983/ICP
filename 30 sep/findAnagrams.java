class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         List<Integer> sol =new ArrayList<>();
        if (p.length() > s.length()) return sol;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < p.length(); i++) {
            freq1[p.charAt(i) - 'a']++;
            freq2[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(freq1, freq2)) sol.add(0);

        
        for (int i = p.length(); i < s.length(); i++) {
            freq2[s.charAt(i) - 'a']++;                 
            freq2[s.charAt(i - p.length()) - 'a']--;  
            if (Arrays.equals(freq1, freq2)) sol.add(i-p.length()+1);
        }

        return sol;
        
    }
}
