package ds.sorting

class RadixSorting {
    fun sort(array: Array<Int>): Array<Int> {
        val n = array.size
        val m = array.maxOrNull() ?: 0
        val exp = 1
        val radix = 10
        val bucket = Array(radix) { IntArray(n) }
        for (i in 0 until n) {
            val digit = (array[i] / exp) % radix
            bucket[digit][i] = array[i]
        }
        var i = 0
        for (j in 0 until radix) {
            for (k in 0 until n) {
                if (bucket[j][k] != 0) {
                    array[i] = bucket[j][k]
                    i++
                }
            }
        }
        return array
    }
}
