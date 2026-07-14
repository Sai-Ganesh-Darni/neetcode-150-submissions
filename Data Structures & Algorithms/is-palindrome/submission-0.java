class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\s+", "");
        s = s.toLowerCase();
        int n = s.length();
        int i=0;
        int j=n-1;
        while(i<=j){
            if(!isAlphaNumeric(s.charAt(i))){
                i++;
            }else if(!isAlphaNumeric(s.charAt(j))){
                j--;
            }else{
                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    public boolean isAlphaNumeric(char ch){
        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9'){
            return true;
        }
        return false;
    }
}