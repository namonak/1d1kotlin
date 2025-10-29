package boj.problems

import java.io.BufferedReader

class No10812 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val baskets = IntArray(n) { it + 1 }

        repeat(m) {
            val (i, j, k) = input.readLine().split(" ").map { it.toInt() }
            rotateRange(baskets, i, j, k)
        }
        return baskets.joinToString(" ")
    }

    private fun rotateRange(
        a: IntArray,
        i: Int,
        j: Int,
        k: Int
    ) {
        val start = i - 1
        val mid = k - 1
        val endEx = j // copyOfRange의 end는 exclusive이므로 그대로 사용

        // 앞부분(i..k-1), 뒷부분(k..j)을 잘라낸 뒤 뒷부분 + 앞부분 순으로 덮어쓰기
        val left = a.copyOfRange(start, mid)
        val right = a.copyOfRange(mid, endEx)

        // 뒷부분을 먼저
        for (idx in right.indices) {
            a[start + idx] = right[idx]
        }
        // 그 다음 앞부분
        for (idx in left.indices) {
            a[start + right.size + idx] = left[idx]
        }
    }
}
