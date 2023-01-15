package leetcode.problems.lv0easy

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            val find = target - nums[i]
            if (map.containsKey(find)) {
                return intArrayOf(map[find]!!, i)
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}
