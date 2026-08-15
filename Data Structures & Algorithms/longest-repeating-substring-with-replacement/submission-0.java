class Solution {
    public int characterReplacement(String s, int k) {
      int l=0, maxfreq = 0, maxlen = 0;
      int[] freq = new int[26];
      for(int r=0;r<s.length();r++){
       freq[s.charAt(r)-'A']++;
       maxfreq = Math.max(maxfreq,freq[s.charAt(r)-'A']);
       int size = r-l+1;
       if(size-maxfreq>k){
        freq[s.charAt(l)-'A']--;
        l++;
       }
        size = r-l+1;
       maxlen = Math.max(maxlen,size);
      }
      return maxlen;
    }
}
