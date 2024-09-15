package boj.problems

import java.io.BufferedReader

class No2628 {
    fun solve(input: BufferedReader): String {
        val (width, height) = input.readLine().split(" ").map { it.toInt() }
        val cutCount = input.readLine().toInt()

        val horizontalCuts = mutableListOf(0, height)
        val verticalCuts = mutableListOf(0, width)

        for (i in 0 until cutCount) {
            val (direction, line) = input.readLine().split(" ").map { it.toInt() }
            if (direction == 0) {
                horizontalCuts.add(line)
            } else {
                verticalCuts.add(line)
            }
        }

        horizontalCuts.sort()
        verticalCuts.sort()

        var maxHorizontalGap = 0
        for (i in 1 until horizontalCuts.size) {
            maxHorizontalGap = maxOf(maxHorizontalGap, horizontalCuts[i] - horizontalCuts[i - 1])
        }

        var maxVerticalGap = 0
        for (i in 1 until verticalCuts.size) {
            maxVerticalGap = maxOf(maxVerticalGap, verticalCuts[i] - verticalCuts[i - 1])
        }

        val maxArea = maxHorizontalGap * maxVerticalGap

        return maxArea.toString()
    }
}
