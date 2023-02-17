package ds.sorting

class QuickSorting {
    // Time
    // - Best : O(n log n)
    // - Worst : O(N^2),
    // - Average : O(n log n)
    // Stability : unstable
    fun sort(array: Array<Int>): Array<Int> {
        quicksort(array, 0, array.size - 1)

        return array
    }

    private fun quicksort(array: Array<Int>, left: Int, right: Int) {
        val index = partition(array, left, right)
        if (left < index - 1) { // 2) Sorting left half
            quicksort(array, left, index - 1)
        }
        if (index < right) { // 3) Sorting right half
            quicksort(array, index, right)
        }
    }

    private fun partition(array: Array<Int>, l: Int, r: Int): Int {
        var left = l
        var right = r
        val pivot = array[(left + right) / 2] // 4) Pivot Point
        while (left <= right) {
            while (array[left] < pivot) left++ // 5) Find the elements on left that should be on right

            while (array[right] > pivot) right-- // 6) Find the elements on right that should be on left

            // 7) Swap elements, and move left and right indices
            if (left <= right) {
                swapArray(array, left, right)
                left++
                right--
            }
        }
        return left
    }

    private fun swapArray(a: Array<Int>, b: Int, c: Int) {
        val temp = a[b]
        a[b] = a[c]
        a[c] = temp
    }
}
