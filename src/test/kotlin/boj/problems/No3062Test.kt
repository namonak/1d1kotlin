package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3062Test : StringSpec({
    "수 뒤집기 : https://www.acmicpc.net/problem/3062" {
        val given = """
            4
            13
            58
            120
            5056
        """.trimIndent()
        val expected = """
            YES
            NO
            YES
            NO
        """.trimIndent()

        No3062().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
