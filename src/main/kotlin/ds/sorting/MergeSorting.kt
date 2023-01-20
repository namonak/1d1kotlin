package ds.sorting

class MergeSorting {
    // Time: O(n log n), stable
    fun sort(array: Array<Int>): Array<Int> {
        if (array.size <= 1) return array

        val mid = array.size / 2
        val left = sort(array.copyOfRange(0, mid))
        val right = sort(array.copyOfRange(mid, array.size))

        return merge(left, right)
    }

    private fun merge(left: Array<Int>, right: Array<Int>): Array<Int> {
        val result = Array(left.size + right.size) { 0 }
        var i = 0
        var j = 0
        var k = 0

        while (i < left.size && j < right.size) {
            if (left[i] < right[j]) {
                result[k++] = left[i++]
            } else {
                result[k++] = right[j++]
            }
        }

        while (i < left.size) {
            result[k++] = left[i++]
        }

        while (j < right.size) {
            result[k++] = right[j++]
        }

        return result
    }
}
