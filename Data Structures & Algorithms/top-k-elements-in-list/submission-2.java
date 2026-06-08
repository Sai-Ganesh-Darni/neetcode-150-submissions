class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        List<Integer>[] freqArr = new List[n+1];
        for(int i=0;i<=n;i++){
            freqArr[i] = new ArrayList<Integer>();
        }
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            freqArr[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for(int i=n;i>=0;i--){
            if(freqArr[i].size() > 0){
                for(int value: freqArr[i]){
                    res[index++] = value;
                    if(index == k)
                        return res;
                }
            }
        }
        return res;
    }
}
