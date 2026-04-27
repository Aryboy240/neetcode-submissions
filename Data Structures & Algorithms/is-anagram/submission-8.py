class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        my_map = {}
        for char in s:
            if char in my_map:
                my_map[char] += 1
            else:
                my_map[char] = 1
                
        my_map2 = {}
        for char in t:
            if char in my_map2:
                my_map2[char] += 1
            else:
                my_map2[char] = 1

        return my_map == my_map2