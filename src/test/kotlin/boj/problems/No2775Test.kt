package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2775Test : StringSpec({
    "부녀회장이 될테야 : https://www.acmicpc.net/problem/2775" {
        val given = """
            2
            1
            3
            2
            3
        """.trimIndent()
        val expected = """
            6
            10
        """.trimIndent()

        No2775().solve(given.reader().buffered()) shouldBe expected
    }
})
