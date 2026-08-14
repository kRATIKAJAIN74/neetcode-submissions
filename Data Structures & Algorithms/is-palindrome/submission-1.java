class Solution {
    public boolean isPalindrome(String s1) {
    //      s1 = s1.toLowerCase().replaceAll("[^a-z0-9]", "");
    //   String s2  = new StringBuilder(s1).reverse().toString();
    //   for(int i=0;i<s1.length();i++){
    //     if(s1.charAt(i) != s2.charAt(i)) return false;
    //   } 
    //   return true;
    s1 = s1.toLowerCase().replaceAll("[^a-z0-9]","");
    int i=0, j=s1.length()-1;
    while(i<=j){
        if(s1.charAt(i)!=s1.charAt(j)){
            return false;
    }
    i++;
    j--;
    }
    return true;
}
    }
