class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i:nums){
            set.add(i);
        }

        int currCount = 0;
        Integer currElm = null;
        int maxCount = 0;
        for(int i:set){
            if(currElm == null){
                currElm = i;
                currCount = 1;
            }
            else if(currElm == i-1){
                currElm = i;
                currCount++;
            }
            else{
                maxCount = Math.max(maxCount,currCount);
                currElm = i;
                currCount = 1;
            }
        }
        maxCount = Math.max(maxCount,currCount);
        return maxCount;
    }
}
