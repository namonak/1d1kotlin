package ds.sorting

class BubbleSorting {
    // O(N^2), stable
    fun sort(array: Array<Int>): Array<Int> {
        for (i in array.indices) {
            for (j in 1 until array.size - i) {
                if (array[j - 1] > array[j]) {
                    val temp = array[j]
                    array[j] = array[j - 1]
                    array[j - 1] = temp
                }
            }
        }
        return array
    }
}
