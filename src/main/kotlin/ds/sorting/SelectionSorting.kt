package ds.sorting

class SelectionSorting {
    // O(N^2), unstable
    fun sort(array: IntArray) : IntArray {
        for (i in array.indices) {
            for (min in i + 1 until array.size) {
                if (array[min] < array[i]) {
                    val tmp = array[i]
                    array[i] = array[min]
                    array[min] = tmp
                }
            }
        }
        return array
    }
}