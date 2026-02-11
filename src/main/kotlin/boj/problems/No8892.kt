package boj.problems

import java.io.BufferedReader

class No8892 {
    fun solve(input: BufferedReader): String {
        val testCaseCount = input.readLine()?.toInt() ?: 0
        val result = StringBuilder()

        repeat(testCaseCount) {
            val k = input.readLine()?.toInt() ?: 0
            val words = Array(k) { input.readLine() ?: "" }

            result.append(findPalindrome(words)).append("\n")
        }

        return result.toString().trim()
    }

    private fun findPalindrome(words: Array<String>): String {
        for (i in words.indices) {
            for (j in words.indices) {
                if (i == j) continue // 자기 자신과는 합칠 수 없음

                val combined = words[i] + words[j]
                if (isPalindrome(combined)) {
                    return combined
                }
            }
        }
        return "0"
    }

    /**
     * 문자열이 팰린드롬(앞뒤가 똑같은 단어)인지 확인합니다.
     */
    private fun isPalindrome(word: String): Boolean {
        var left = 0
        var right = word.length - 1

        while (left < right) {
            if (word[left] != word[right]) return false
            left++
            right--
        }
        return true
    }
}
