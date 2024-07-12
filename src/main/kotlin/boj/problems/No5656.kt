package boj.problems

import java.io.BufferedReader

class No5656 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        var case = 0
        while (true) {
            val inputStr = input.readLine().split(" ")
            val a = inputStr[0].toInt()
            val op = inputStr[1]
            val b = inputStr[2].toInt()

            if (op == "E") break

            case++
            sb.append("Case $case: ")
            when (op) {
                ">" -> sb.append(a > b)
                ">=" -> sb.append(a >= b)
                "<" -> sb.append(a < b)
                "<=" -> sb.append(a <= b)
                "==" -> sb.append(a == b)
                "!=" -> sb.append(a != b)
            }
            sb.append("\n")
        }
        return sb.toString().trimEnd()
    }
}
