package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.max
import kotlin.math.min

class No15973 {
    fun solve(input: BufferedReader): String {
        val first = readBox(input)
        val second = readBox(input)

        val xOverlap = min(first.right, second.right) - max(first.left, second.left)
        val yOverlap = min(first.top, second.top) - max(first.bottom, second.bottom)

        return when {
            xOverlap < 0 || yOverlap < 0 -> "NULL"
            xOverlap == 0 && yOverlap == 0 -> "POINT"
            xOverlap == 0 || yOverlap == 0 -> "LINE"
            else -> "FACE"
        }
    }

    private fun readBox(input: BufferedReader): Box {
        val st = StringTokenizer(input.readLine())
        val x1 = st.nextToken().toInt()
        val y1 = st.nextToken().toInt()
        val x2 = st.nextToken().toInt()
        val y2 = st.nextToken().toInt()
        return Box(
            left = min(x1, x2),
            right = max(x1, x2),
            bottom = min(y1, y2),
            top = max(y1, y2)
        )
    }

    private data class Box(
        val left: Int,
        val bottom: Int,
        val right: Int,
        val top: Int
    )
}
