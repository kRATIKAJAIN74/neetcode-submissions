class Solution {
    public int maxArea(int[] h) {
       int i=0, j=h.length-1;
       int cap = Integer.MIN_VALUE;
       while(i<j){
        cap = Math.max(cap,(j-i) * Math.min(h[i],h[j]));
        if(h[i]<h[j]) i++;
        else j--;
       } 
       return cap;
    }
}
