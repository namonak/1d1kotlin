package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No29881 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().trim().toInt()

        val lastNameByFirstName = mutableMapOf<String, String>()
        repeat(n) {
            val st = StringTokenizer(input.readLine())
            val firstName = st.nextToken()
            val lastName = st.nextToken()
            lastNameByFirstName[firstName] = lastName
        }

        val accountNameByFirstName = mutableMapOf<String, String>()
        repeat(n) {
            val st = StringTokenizer(input.readLine())
            val firstName = st.nextToken()
            val accountName = st.nextToken()
            accountNameByFirstName[firstName] = accountName
        }

        return buildString {
            for ((firstName, lastName) in lastNameByFirstName) {
                val accountName = accountNameByFirstName[firstName]!!
                appendLine("$lastName $accountName")
            }
        }.trimEnd()
    }
}
