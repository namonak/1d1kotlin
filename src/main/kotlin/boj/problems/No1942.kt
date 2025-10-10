package boj.problems

import java.io.BufferedReader
import java.lang.StringBuilder

class No1942 {
    companion object {
        private const val TEST_CASES = 3
    }

    fun solve(input: BufferedReader): String {
        val counter = ClockIntegerCounter()
        val out = StringBuilder()

        repeat(TEST_CASES) {
            val line = input.readLine().trim()
            val (lhs, rhs) = line.split(' ')
            val start = ClockTime.parse(lhs).toSecondOfDay()
            val end = ClockTime.parse(rhs).toSecondOfDay()

            val count = counter.countInclusive(start, end)
            out.append(count).append('\n')
        }
        return out.toString().trimEnd()
    }
}

/**
 * 시각 표현 전용 (파싱/초 변환만 책임)
 */
data class ClockTime(val h: Int, val m: Int, val s: Int) {
    init {
        require(h in 0..23 && m in 0..59 && s in 0..59) {
            "Invalid time: %02d:%02d:%02d".format(h, m, s)
        }
    }

    fun toSecondOfDay(): Int = h * 3600 + m * 60 + s

    companion object {
        fun parse(token: String): ClockTime {
            val (hh, mm, ss) = token.split(':')
            return ClockTime(hh.toInt(), mm.toInt(), ss.toInt())
        }
    }
}

/**
 * 규칙 전담: 시계 정수의 3의 배수 여부
 */
object ClockInteger {
    fun isMultipleOf3(
        h: Int,
        m: Int,
        s: Int
    ): Boolean = ((h + m + s) % 3) == 0
}

/**
 * 하루(0..86399초)에 대해 조건을 미리 표로 만들고 prefix sum으로
 * 임의 구간(자정 교차 포함)에서의 포함 카운트를 O(1)에 제공.
 */
class ClockIntegerCounter {
    private val ok: BooleanArray = BooleanArray(SECONDS_PER_DAY)
    private val prefix: IntArray = IntArray(SECONDS_PER_DAY + 1)

    init {
        for (sec in 0 until SECONDS_PER_DAY) {
            val h = sec / 3600
            val m = (sec / 60) % 60
            val s = sec % 60
            ok[sec] = ClockInteger.isMultipleOf3(h, m, s)
        }
        for (i in 0 until SECONDS_PER_DAY) {
            prefix[i + 1] = prefix[i] + if (ok[i]) 1 else 0
        }
    }

    fun countInclusive(
        startSec: Int,
        endSec: Int
    ): Int {
        return if (startSec <= endSec) {
            rangeCount(startSec, endSec)
        } else {
            rangeCount(startSec, SECONDS_PER_DAY - 1) + rangeCount(0, endSec)
        }
    }

    private fun rangeCount(
        l: Int,
        r: Int
    ): Int = prefix[r + 1] - prefix[l]

    companion object {
        private const val SECONDS_PER_DAY = 24 * 60 * 60 // 86400
    }
}
