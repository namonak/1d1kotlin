package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No16486Test : StringSpec({
    "운동장 한 바퀴 : https://www.acmicpc.net/problem/16486" {
        val given = """
            13
            8
        """.trimIndent()
        val expected = "76.265472"

        No16486().solve(given.reader().buffered()) shouldBe expected
    }
})
