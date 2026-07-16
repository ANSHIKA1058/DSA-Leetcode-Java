class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        seta = set(nums1)
        setb = set(nums2)
        return list(seta.intersection(setb))