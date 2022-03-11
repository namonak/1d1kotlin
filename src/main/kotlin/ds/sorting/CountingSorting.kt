package ds.sorting

class CountingSorting {
    // time complexity: O(n + k)
    // space complexity: O(k)
    fun sort(array: IntArray) : IntArray {
        val n = array.size
        val count = IntArray(n)
        for (i in 0 until n) {
            count[i] = 0
        }
        for (i in 0 until n) {
            count[array[i]]++
        }
        for (i in 1 until n) {
            count[i] += count[i - 1]
        }
        val sorted = IntArray(n)
        for (i in n - 1 downTo 0) {
            sorted[count[array[i]] - 1] = array[i]
            count[array[i]]--
        }
        return sorted
    }
}