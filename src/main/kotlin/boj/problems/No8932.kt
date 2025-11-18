package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.pow

class No8932 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().trim().toInt()
        val result = StringBuilder()

        repeat(t) {
            val records = IntArray(EVENT_COUNT)
            readRecords(input, records)

            var totalScore = 0
            for (i in 0 until EVENT_COUNT) {
                val event = EVENTS[i]
                val p = records[i]
                totalScore += event.score(p)
            }

            result.append(totalScore).append('\n')
        }

        return result.toString().trimEnd()
    }

    private fun readRecords(
        input: BufferedReader,
        records: IntArray
    ) {
        var index = 0
        while (index < EVENT_COUNT) {
            val st = StringTokenizer(input.readLine())
            while (st.hasMoreTokens() && index < EVENT_COUNT) {
                records[index++] = st.nextToken().toInt()
            }
        }
    }

    private fun Event.score(p: Int): Int =
        when (type) {
            EventType.TRACK -> (a * (b - p).pow(c)).toInt()
            EventType.FIELD -> (a * (p - b).pow(c)).toInt()
        }

    private enum class EventType {
        TRACK,
        FIELD
    }

    private data class Event(
        val a: Double,
        val b: Double,
        val c: Double,
        val type: EventType
    )

    companion object {
        private const val EVENT_COUNT = 7

        // 종목 순서: 100m 허들, 높이뛰기, 포환던지기, 200m, 멀리뛰기, 창던지기, 800m
        private val EVENTS = arrayOf(
            Event(9.23076, 26.7, 1.835, EventType.TRACK), // 100m 허들
            Event(1.84523, 75.0, 1.348, EventType.FIELD), // 높이뛰기
            Event(56.0211, 1.5, 1.05, EventType.FIELD), // 포환던지기
            Event(4.99087, 42.5, 1.81, EventType.TRACK), // 200m
            Event(0.188807, 210.0, 1.41, EventType.FIELD), // 멀리뛰기
            Event(15.9803, 3.8, 1.04, EventType.FIELD), // 창던지기
            Event(0.11193, 254.0, 1.88, EventType.TRACK) // 800m
        )
    }
}
