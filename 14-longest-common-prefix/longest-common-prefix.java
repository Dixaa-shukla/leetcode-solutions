class Solution {
    public String longestCommonPrefix(String[] str) {
     int n = str.length;
     if(n==0) return "";
     String first = str[0];
     for(int i=0;i<first.length();i++){
        char ch = first.charAt(i);
        for(int j=1;j<n;j++){
            String ch1 = str[j];
            if(i >= str[j].length() || ch!=ch1.charAt(i)) return first.substring(0, i); // rtrn when char started unmatching
        }
    }
    return first; // if all char matched
    }
}