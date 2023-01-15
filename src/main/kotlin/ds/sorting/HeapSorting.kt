package ds.sorting

class HeapSorting {
    fun sort(array: IntArray): IntArray {
        val heap = Heap(array)
        for (i in array.size - 1 downTo 0) {
            array[i] = heap.extractMax()
        }
        return array
    }

    class Heap(private val array: IntArray) {
        private val heap = array.copyOf()
        private val size = array.size
        private val maxIndex = size - 1

        init {
            for (i in (size / 2) downTo 0) {
                heapify(i)
            }
        }

        fun extractMax(): Int {
            val max = heap[0]
            heap[0] = heap[maxIndex]
            heap[maxIndex] = 0
            heapify(0)
            return max
        }

        private fun heapify(index: Int) {
            val left = 2 * index + 1
            val right = 2 * index + 2
            var largest = index

            if (left <= maxIndex && heap[left] > heap[largest]) {
                largest = left
            }

            if (right <= maxIndex && heap[right] > heap[largest]) {
                largest = right
            }

            if (largest != index) {
                val temp = heap[index]
                heap[index] = heap[largest]
                heap[largest] = temp
                heapify(largest)
            }
        }
    }
}
