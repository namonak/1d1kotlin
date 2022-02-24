package ds.array.moveZeros

class MoveZeros {
    fun MoveZeros(nums: IntArray) : IntArray {
        var mIdx = 0

        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[mIdx] = nums[i]
                mIdx++
            }
        }

        for (i in mIdx until nums.size) {
            nums[i] = 0
        }

        return nums
    }
}