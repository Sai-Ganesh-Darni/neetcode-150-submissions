class Solution {
    class FreqNode{
        int value;
        int freq;
        public FreqNode(int value, int freq){
            this.value = value;
            this.freq = freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<FreqNode> pq = new PriorityQueue<>((a, b) -> a.freq - b.freq);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            pq.add(new FreqNode(entry.getKey(), entry.getValue()));
            if(pq.size() > k){
                pq.poll();
            }
            
        }
        return pq.stream().mapToInt(node -> node.value).toArray();
        
    }
}
