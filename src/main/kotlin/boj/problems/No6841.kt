package boj.problems

import java.io.BufferedReader

class No6841 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        while (true) {
            val line = input.readLine() ?: break
            val words = line.split(" ")
            for (word in words) {
                sb.append(
                    when (word) {
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
                        else -> word
                    }
                )
                sb.append(" ")
            }
            sb.append("\n")
        }
        return sb.toString().trim()
    }
}
