package boj.problems

import java.io.BufferedReader

private const val NUMBER_OF_CHANGE_TYPE = 4
private const val QUARTER = 25
private const val DIME = 10
private const val NICKEL = 5

class No2720 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val arr = IntArray(t)

        repeat(t) {
            val c = input.readLine().toInt()
            arr[it] = c
        }

        val result = Array(t) { IntArray(NUMBER_OF_CHANGE_TYPE) }

        for (i in arr.indices) {
            result[i][0] = arr[i] / QUARTER
            result[i][1] = (arr[i] % QUARTER) / DIME
            result[i][2] = ((arr[i] % QUARTER) % DIME) / NICKEL
            result[i][3] = ((arr[i] % QUARTER) % DIME) % NICKEL
        }

        return result.joinToString("\n") { it.joinToString(" ") }
    }
}
