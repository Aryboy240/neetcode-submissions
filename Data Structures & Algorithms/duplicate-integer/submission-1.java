class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> hash = new HashSet<>();

        for (int elem : nums){
            if (!hash.add(elem)){
                return true;
            }
        }

        return false;

    }
}
