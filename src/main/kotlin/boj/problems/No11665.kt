package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.max
import kotlin.math.min

class No11665 {
    fun solve(input: BufferedReader): String {
        val fs = FastScanner(input)
        val n = fs.nextInt()

        // 첫 직육면체로 교집합 구간 초기화
        var xL = fs.nextInt()
        var yL = fs.nextInt()
        var zL = fs.nextInt()
        var xR = fs.nextInt()
        var yR = fs.nextInt()
        var zR = fs.nextInt()

        // 나머지 직육면체와 축별로 교집합 갱신
        repeat(n - 1) {
            val nx1 = fs.nextInt()
            val ny1 = fs.nextInt()
            val nz1 = fs.nextInt()
            val nx2 = fs.nextInt()
            val ny2 = fs.nextInt()
            val nz2 = fs.nextInt()

            xL = max(xL, nx1)
            yL = max(yL, ny1)
            zL = max(zL, nz1)
            xR = min(xR, nx2)
            yR = min(yR, ny2)
            zR = min(zR, nz2)
        }

        val dx = (xR - xL).coerceAtLeast(0)
        val dy = (yR - yL).coerceAtLeast(0)
        val dz = (zR - zL).coerceAtLeast(0)
        val volume = 1L * dx * dy * dz

        return volume.toString()
    }

    private class FastScanner(private val br: BufferedReader) {
        private var st: StringTokenizer? = null

        fun nextInt(): Int {
            while (st == null || !st!!.hasMoreTokens()) {
                st = StringTokenizer(br.readLine())
            }
            return st!!.nextToken().toInt()
        }
    }
}
