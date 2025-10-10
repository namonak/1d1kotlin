package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No6980 {
    fun solve(input: BufferedReader): String {
        val fs = FastScanner(input)
        val t = fs.nextInt()
        val out = StringBuilder()

        repeat(t) { tc ->
            val l = fs.nextInt()
            val arr = IntArray(l) { if (l == 0) 0 else fs.nextInt() }
            val swaps = countInversions(arr)
            out.append("Optimal train swapping takes $swaps swaps.")
            if (tc != t - 1) out.append('\n')
        }

        return out.toString()
    }

    /** 합병정렬로 역전 개수(=최소 인접 스왑 수) 계산 */
    private fun countInversions(a: IntArray): Long {
        if (a.isEmpty()) return 0
        val tmp = IntArray(a.size)

        fun sort(
            lo: Int,
            hi: Int
        ): Long {
            if (hi - lo <= 1) return 0
            val mid = (lo + hi) / 2
            var inv = sort(lo, mid) + sort(mid, hi)

            var i = lo
            var j = mid
            var k = lo
            while (i < mid || j < hi) {
                if (j == hi || (i < mid && a[i] <= a[j])) {
                    tmp[k++] = a[i++]
                } else {
                    tmp[k++] = a[j++]
                    inv += (mid - i) // 오른쪽 원소가 앞설 때, 왼쪽에 남은 개수만큼 역전
                }
            }
            for (p in lo until hi) a[p] = tmp[p]
            return inv
        }

        return sort(0, a.size)
    }

    /** 간단 토크나이저 */
    private class FastScanner(private val br: BufferedReader) {
        private var st: StringTokenizer? = null

        fun next(): String {
            while (st == null || !st!!.hasMoreTokens()) {
                val line = br.readLine() ?: return ""
                st = StringTokenizer(line)
            }
            return st!!.nextToken()
        }

        fun nextInt(): Int = next().toInt()
    }
}
