package ds.array.findPivotIndex

class PivotIndex {
    fun pivotIndex(nums: IntArray): Int {
        var sum = 0
        for (i in nums.indices) {
            sum += nums[i]
        }
        var leftSum = 0
        for (i in nums.indices) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i
            }
            leftSum += nums[i]
        }
        return -1
    }
}
