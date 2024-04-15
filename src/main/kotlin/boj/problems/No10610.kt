package boj.problems

import java.io.BufferedReader

class No10610 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine()
        val numbers = n.toCharArray().sortedArrayDescending()
        val len = numbers.size
        var sum = 0
        val result = StringBuilder()

        for (i in 0 until len) {
            sum += numbers[i] - '0'
            result.append(numbers[i])
        }

        return if (sum % 3 == 0 && numbers[len - 1] == '0') result.toString() else "-1"
    }
}
