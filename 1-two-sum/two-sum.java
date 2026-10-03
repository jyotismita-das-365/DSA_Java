class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            indexMap.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            int numB = target - nums[i];
            int indexNumB = indexMap.getOrDefault(numB, -1);
            if(indexNumB != -1 && indexNumB != i) {
                return new int[]{i, indexNumB};
            }
        }
        throw new IllegalArgumentException("Invalid Input");
    }
}