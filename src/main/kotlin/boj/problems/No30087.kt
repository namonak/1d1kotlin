package boj.problems

import java.io.BufferedReader

class No30087 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()
        repeat(n) {
            val seminar = input.readLine()
            when (seminar) {
                "Algorithm" -> result.append("204\n")
                "DataAnalysis" -> result.append("207\n")
                "ArtificialIntelligence" -> result.append("302\n")
                "CyberSecurity" -> result.append("B101\n")
                "Network" -> result.append("303\n")
                "Startup" -> result.append("501\n")
                "TestStrategy" -> result.append("105\n")
            }
        }
        return result.toString().trimEnd()
    }
}
