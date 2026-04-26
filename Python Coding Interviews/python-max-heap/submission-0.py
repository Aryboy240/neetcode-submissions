import heapq
from typing import List


def get_reverse_sorted(nums: List[int]) -> List[int]:
    heapq.heapify(nums)
    new = []
    for num in nums:
        heapq.heappush(new, -num)

    return [-heapq.heappop(new) for _ in range(len(new))]


# do not modify below this line
print(get_reverse_sorted([1, 2, 3]))
print(get_reverse_sorted([5, 6, 4, 2, 7, 3, 1]))
print(get_reverse_sorted([5, 6, -4, 2, 4, 7, -3, -1]))
