class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        l = 0
        r = len(nums) - 1
        while nums[l] + nums[r] !=  target:
            if r > l+1:
                r -= 1
            else:
                l += 1
                r = len(nums) - 1
        return [l, r]
