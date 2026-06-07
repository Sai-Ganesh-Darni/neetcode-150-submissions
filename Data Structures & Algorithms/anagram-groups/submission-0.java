class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String formattedString = new String(strArr);
            if(!map.containsKey(formattedString)){
                map.put(formattedString, new ArrayList<String>());
            }
            map.get(formattedString).add(str);
        }
        for(Map.Entry<String, List<String>> entry: map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}
