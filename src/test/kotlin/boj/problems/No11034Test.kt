package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11034Test : StringSpec({
    "캥거루 세마리2 : https://www.acmicpc.net/problem/11034" {
        val given = """
            2 3 5
            3 5 9
        """.trimIndent()
        val expected = """
            1
            3
        """.trimIndent()

        No11034().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
