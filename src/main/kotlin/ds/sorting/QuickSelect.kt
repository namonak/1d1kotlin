package ds.sorting

class QuickSelect {
    fun select(array: IntArray, k: Int): Int {
        val n = array.size
        if (n == 0) return -1
        if (k < 0 || k >= n) return -1
        return select(array, 0, n - 1, k)
    }

    private fun select(array: IntArray, left: Int, right: Int, k: Int): Int {
        if (left == right) return array[left]
        val pivot = partition(array, left, right)
        if (pivot == k) return array[pivot]
        else if (pivot > k) return select(array, left, pivot - 1, k)
        else return select(array, pivot + 1, right, k)
    }

    private fun partition(array: IntArray, left: Int, right: Int): Int {
        val pivot = array[right]
        var i = left
        for (j in left until right) {
            if (array[j] < pivot) {
                swap(array, i, j)
                i++
            }
        }
        swap(array, i, right)
        return i
    }

    private fun swap(array: IntArray, i: Int, j: Int) {
        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }
}