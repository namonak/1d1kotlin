package boj.problems

import java.io.BufferedReader
import java.util.PriorityQueue
import java.util.StringTokenizer

class No4809 {
    private data class Stock(val day: Int, val price: Int)

    fun solve(input: BufferedReader): String {
        val output = StringBuilder()
        var caseNum = 1

        while (true) {
            val line = input.readLine() ?: break
            val st = StringTokenizer(line)
            if (!st.hasMoreTokens()) continue

            val n = st.nextToken().toInt()
            val k1 = st.nextToken().toInt()
            val k2 = st.nextToken().toInt()

            if (n == 0 && k1 == 0 && k2 == 0) break

            // 최저가 k1개를 추적하기 위한 Max-Heap (가장 '나쁜' 후보를 위에 둠)
            // 나쁜 후보 기준: 가격이 높거나, 가격이 같을 때 날짜가 늦음
            val lowPrices = PriorityQueue<Stock> { a, b ->
                if (a.price != b.price) {
                    b.price - a.price
                } else {
                    b.day - a.day
                }
            }

            // 최고가 k2개를 추적하기 위한 Min-Heap (가장 '나쁜' 후보를 위에 둠)
            // 나쁜 후보 기준: 가격이 낮거나, 가격이 같을 때 날짜가 빠름
            val highPrices = PriorityQueue<Stock> { a, b ->
                if (a.price != b.price) {
                    a.price - b.price
                } else {
                    a.day - b.day
                }
            }

            // 대량의 입력을 처리하기 위해 StringTokenizer 재사용
            var count = 0
            while (count < n) {
                val priceLine = StringTokenizer(input.readLine())
                while (priceLine.hasMoreTokens()) {
                    count++
                    val currentPrice = priceLine.nextToken().toInt()
                    val currentStock = Stock(count, currentPrice)

                    // k1 최저가 업데이트
                    updateHeap(lowPrices, currentStock, k1) { a, b ->
                        if (a.price != b.price) {
                            a.price - b.price
                        } else {
                            a.day - b.day
                        }
                    }

                    // k2 최고가 업데이트
                    updateHeap(highPrices, currentStock, k2) { a, b ->
                        if (a.price != b.price) {
                            b.price - a.price
                        } else {
                            b.day - a.day
                        }
                    }
                }
            }

            // 결과 조립
            output.append("Case $caseNum\n")

            val lowDays = lowPrices.map { it.day }.sorted()
            output.append(lowDays.joinToString(" ")).append("\n")

            val highDays = highPrices.map { it.day }.sortedDescending()
            output.append(highDays.joinToString(" ")).append("\n")

            caseNum++
        }

        return output.toString().trimEnd()
    }

    private fun updateHeap(
        heap: PriorityQueue<Stock>,
        candidate: Stock,
        k: Int,
        isBetter: Comparator<Stock>
    ) {
        if (heap.size < k) {
            heap.offer(candidate)
        } else {
            val worstInBest = heap.peek()
            // 새 후보가 현재 힙 안의 가장 안 좋은 놈보다 더 좋다면 교체
            if (isBetter.compare(candidate, worstInBest) < 0) {
                heap.poll()
                heap.offer(candidate)
            }
        }
    }
}
