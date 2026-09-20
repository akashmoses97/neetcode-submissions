class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        return !(numsSet.size() == nums.length);
    }
}