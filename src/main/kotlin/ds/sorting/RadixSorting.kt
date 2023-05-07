package ds.sorting

class RadixSorting {
    fun sort(array: Array<Int>): Array<Int> {
        val radix = 10 // 10진수 기준
        var maxLength = false
        var placement = 1

        while (!maxLength) {
            maxLength = true
            val buckets = Array(radix) { mutableListOf<Int>() }

            // 현재 자리수를 기준으로 버킷에 추가
            for (i in array) {
                val tmp = i / placement
                buckets[tmp % radix].add(i)
                if (maxLength && tmp > 0) {
                    maxLength = false
                }
            }

            // 버킷에 있는 요소들을 다시 배열에 추가
            var j = 0
            for (b in 0 until radix) {
                for (i in buckets[b]) {
                    array[j++] = i
                }
                buckets[b].clear()
            }
            placement *= radix
        }

        return array
    }
}
