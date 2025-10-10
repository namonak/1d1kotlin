package ds.binarySearch

class BinarySearch {
    fun binarySearch(
        nums: IntArray,
        target: Int
    ): Int {
        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            var pivot = (left + right) / 2

            if (nums[pivot] == target) {
                return pivot
            } else if (nums[pivot] < target) {
                left = pivot + 1
            } else {
                right = pivot - 1
            }
        }
        return -1
    }
}
