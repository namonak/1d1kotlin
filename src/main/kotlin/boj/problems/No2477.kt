package boj.problems

import java.io.BufferedReader

class No2477 {
    enum class Direction(val code: Int) {
        EAST(1), WEST(2), SOUTH(3), NORTH(4);

        companion object {
            fun from(code: Int): Direction =
                values().firstOrNull { it.code == code }
                    ?: throw IllegalArgumentException("Invalid direction code: $code")

            val Horizontal = setOf(EAST, WEST)
            val Vertical = setOf(SOUTH, NORTH)
        }
    }

    @JvmInline
    value class Length private constructor(val value: Int) : Comparable<Length> {

        init {
            require(value in 1..500) { "Length must be between 1 and 500 (got $value)" }
        }

        override operator fun compareTo(other: Length): Int =
            this.value.compareTo(other.value)

        operator fun times(k: Int): Int = this.value * k
        operator fun plus(other: Length): Length = of(this.value + other.value)
        operator fun minus(other: Length): Length = of(this.value - other.value)

        companion object {
            fun of(value: Int): Length = Length(value)
        }
    }

    // 변 클래스
    data class Edge(val direction: Direction, val length: Length)

    fun solve(input: BufferedReader): String {
        val k = input.readLine().toInt()
        val edges = List(EDGE_COUNT) {
            val (dirCode, len) = input.readLine().split(" ").map { it.toInt() }
            Edge(Direction.from(dirCode), Length.of(len))
        }

        var maxWidth = Length.of(1)
        var maxHeight = Length.of(1)
        var maxWidthIdx = 0
        var maxHeightIdx = 0

        for (i in 0 until EDGE_COUNT) {
            val edge = edges[i]
            when (edge.direction) {
                in Direction.Horizontal -> {
                    if (edge.length > maxWidth) {
                        maxWidth = edge.length
                        maxWidthIdx = i
                    }
                }
                in Direction.Vertical -> {
                    if (edge.length > maxHeight) {
                        maxHeight = edge.length
                        maxHeightIdx = i
                    }
                }
                else -> throw IllegalArgumentException("Invalid direction: ${edge.direction}")
            }
        }

        val cutoutWidth = edges[(maxWidthIdx + 3) % EDGE_COUNT].length
        val cutoutHeight = edges[(maxHeightIdx + 3) % EDGE_COUNT].length

        val totalArea = maxWidth * maxHeight.value - cutoutWidth * cutoutHeight.value
        return (totalArea * k).toString()
    }

    companion object {
        private const val EDGE_COUNT = 6
    }
}
