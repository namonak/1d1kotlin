package boj.problems

import java.io.BufferedReader
import java.util.PriorityQueue
import java.util.StringTokenizer

class No4809 {
    private data class Stock(val day: Int, val price: Int)

    private data class StockCase(
        val stockCount: Int,
        val lowPriceCount: Int,
        val highPriceCount: Int
    ) {
        fun isTerminated(): Boolean = stockCount == 0 && lowPriceCount == 0 && highPriceCount == 0
    }

    private data class StockResult(
        val lowPriceDays: List<Int>,
        val highPriceDays: List<Int>
    )

    private val lowPriceWorstFirst = compareByDescending<Stock> { it.price }.thenByDescending { it.day }
    private val highPriceWorstFirst = compareBy<Stock> { it.price }.thenBy { it.day }
    private val lowPriceBestFirst = compareBy<Stock> { it.price }.thenBy { it.day }
    private val highPriceBestFirst = compareByDescending<Stock> { it.price }.thenByDescending { it.day }

    fun solve(input: BufferedReader): String {
        val output = StringBuilder()
        var caseNum = 1

        while (true) {
            val stockCase = readStockCase(input) ?: break
            appendResult(output, caseNum, findPriceDays(input, stockCase))
            caseNum++
        }

        return output.toString().trimEnd()
    }

    private fun readStockCase(input: BufferedReader): StockCase? {
        while (true) {
            val line = input.readLine() ?: return null
            val tokenizer = StringTokenizer(line)
            if (!tokenizer.hasMoreTokens()) continue

            val stockCase = StockCase(
                stockCount = tokenizer.nextToken().toInt(),
                lowPriceCount = tokenizer.nextToken().toInt(),
                highPriceCount = tokenizer.nextToken().toInt()
            )
            return stockCase.takeUnless { it.isTerminated() }
        }
    }

    private fun findPriceDays(
        input: BufferedReader,
        stockCase: StockCase
    ): StockResult {
        val lowPrices = PriorityQueue(lowPriceWorstFirst)
        val highPrices = PriorityQueue(highPriceWorstFirst)

        readStocks(input, stockCase.stockCount) { stock ->
            updateHeap(lowPrices, stock, stockCase.lowPriceCount, lowPriceBestFirst)
            updateHeap(highPrices, stock, stockCase.highPriceCount, highPriceBestFirst)
        }

        return StockResult(
            lowPriceDays = lowPrices.map { it.day }.sorted(),
            highPriceDays = highPrices.map { it.day }.sortedDescending()
        )
    }

    private fun readStocks(
        input: BufferedReader,
        stockCount: Int,
        onStock: (Stock) -> Unit
    ) {
        var day = 0
        while (day < stockCount) {
            val priceLine = StringTokenizer(input.readLine())
            while (priceLine.hasMoreTokens()) {
                day++
                onStock(Stock(day, priceLine.nextToken().toInt()))
            }
        }
    }

    private fun appendResult(
        output: StringBuilder,
        caseNum: Int,
        result: StockResult
    ) {
        output.append("Case $caseNum\n")
        output.append(result.lowPriceDays.joinToString(" ")).append("\n")
        output.append(result.highPriceDays.joinToString(" ")).append("\n")
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
            if (isBetter.compare(candidate, worstInBest) < 0) {
                heap.poll()
                heap.offer(candidate)
            }
        }
    }
}
