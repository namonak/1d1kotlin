package ds.sorting

class InsertionSorting {
    // O(N^2), stable
    fun sort(array: IntArray) : IntArray {
        for (j in 1 until array.size) {
            var key = array[j]
            var i = j - 1

            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i]
                i--
            }
            array[i + 1] = key
        }
        return array
    }
}