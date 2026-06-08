class Solution {

    public String encode(List<String> strs) {
        String res = new String();
        for(String each: strs){
            res += "" + each.length() + "_" + each;
        }
        return res;
    }

    public List<String> decode(String str) {
        String len = new String();
        int strLen = str.length();
        List<String> res = new ArrayList<>();
        if(strLen == 0){
            return res;
        }
        for(int i=0;i<strLen;){
            char ch = str.charAt(i);
            if(ch == '_'){
                int length = Integer.parseInt(len);
                String newString = new String();
                for(int j=i+1;j<i+length+1;j++){
                    newString += "" + str.charAt(j);
                }
                res.add(newString);
                len = new String();
                i = i+length+1;
            }else{
                len += "" +ch;
                i++;
            }
        }
        return res;
    }
}
