package boj.problems

import java.io.BufferedReader

class No6841 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        while (true) {
            val line = input.readLine() ?: break
            sb.appendLine(
                when (line) {
                    "CU" -> "see you"
                    ":-)" -> "I’m happy"
                    ":-(" -> "I’m unhappy"
                    ";-)" -> "wink"
                    ":-P" -> "stick out my tongue"
                    "(~.~)" -> "sleepy"
                    "TA" -> "totally awesome"
                    "CCC" -> "Canadian Computing Competition"
                    "CUZ" -> "because"
                    "TY" -> "thank-you"
                    "YW" -> "you’re welcome"
                    "TTYL" -> "talk to you later"
                    else -> line
                }
            )
        }
        return sb.toString().trim()
    }
}
